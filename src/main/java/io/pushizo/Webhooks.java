package io.pushizo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import io.pushizo.core.Json;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Giden webhook imza doğrulaması (alıcı tarafı).
 *
 * <p>Başlık: {@code Pushizo-Signature: t=<unix>,v1=<hex>} — {@code v1 = HMAC-SHA256(secret, t + "." + ham_gövde)}.
 * Secret rotasyonunda başlıkta iki {@code v1} bulunabilir; herhangi biri eşleşirse geçerlidir.
 *
 * <pre>{@code
 * byte[] payload = request.getInputStream().readAllBytes(); // ham gövde
 * try {
 *     List<WebhookEvent> events = Webhooks.constructEvents(payload, request.getHeader(Webhooks.SIGNATURE_HEADER), List.of(secret));
 * } catch (WebhookSignatureException e) {
 *     response.setStatus(400);
 * }
 * }</pre>
 */
public final class Webhooks {
    public static final String SIGNATURE_HEADER = "Pushizo-Signature";
    public static final String EVENT_ID_HEADER = "Pushizo-Event-Id";
    public static final Duration DEFAULT_TOLERANCE = Duration.ofSeconds(300);

    private static final Pattern DIGITS = Pattern.compile("[0-9]+");
    private static final Pattern SIGNATURE = Pattern.compile("[0-9a-f]{64}");

    private Webhooks() {
    }

    /** Varsayılan tolerans (5 dk) ve şimdiki zamanla doğrular. */
    public static WebhookVerifyResult verifySignature(byte[] payload, String header, List<String> secrets) {
        return verifySignature(payload, header, secrets, DEFAULT_TOLERANCE, null);
    }

    /** Metin gövdeyi UTF-8 baytları üzerinden doğrular. */
    public static WebhookVerifyResult verifySignature(String payload, String header, List<String> secrets) {
        return verifySignature(payload.getBytes(StandardCharsets.UTF_8), header, secrets, DEFAULT_TOLERANCE, null);
    }

    /**
     * İmzayı doğrular. {@code payload} HAM istek gövdesidir (JSON'u ayrıştırıp yeniden serileştirmeyin).
     *
     * @param tolerance zaman damgası toleransı (null → 5 dk)
     * @param now       test için şimdiki zaman (null → {@link Instant#now()})
     */
    public static WebhookVerifyResult verifySignature(byte[] payload, String header, List<String> secrets, Duration tolerance, Instant now) {
        if (header == null || header.isEmpty()) {
            return new WebhookVerifyResult(false, 0, "missing_header");
        }
        Long timestamp = null;
        List<byte[]> signatures = new ArrayList<>();
        for (String part : header.split(",", -1)) {
            int idx = part.indexOf('=');
            if (idx <= 0) {
                continue;
            }
            String key = part.substring(0, idx).trim();
            String value = part.substring(idx + 1).trim();
            if (key.equals("t") && DIGITS.matcher(value).matches()) {
                try {
                    timestamp = Long.parseLong(value);
                } catch (NumberFormatException ignored) {
                    // Taşan değer geçersiz sayılır.
                }
            } else if (key.equals("v1") && SIGNATURE.matcher(value).matches()) {
                signatures.add(HexFormat.of().parseHex(value));
            }
        }
        if (timestamp == null || signatures.isEmpty()) {
            return new WebhookVerifyResult(false, 0, "malformed_header");
        }
        long nowSec = (now != null ? now : Instant.now()).getEpochSecond();
        long tol = (tolerance != null ? tolerance : DEFAULT_TOLERANCE).getSeconds();
        if (Math.abs(nowSec - timestamp) > tol) {
            return new WebhookVerifyResult(false, 0, "timestamp_out_of_tolerance");
        }
        byte[] prefix = (timestamp + ".").getBytes(StandardCharsets.US_ASCII);
        for (String secret : secrets) {
            byte[] expected = hmac(secret, prefix, payload);
            for (byte[] sig : signatures) {
                if (MessageDigest.isEqual(expected, sig)) {
                    return new WebhookVerifyResult(true, timestamp, null);
                }
            }
        }
        return new WebhookVerifyResult(false, 0, "signature_mismatch");
    }

    /** Doğrular ve olay listesini döner (tekil veya batch gövde). Geçersizse {@link WebhookSignatureException}. */
    public static List<WebhookEvent> constructEvents(byte[] payload, String header, List<String> secrets) {
        return constructEvents(payload, header, secrets, DEFAULT_TOLERANCE, null);
    }

    public static List<WebhookEvent> constructEvents(byte[] payload, String header, List<String> secrets, Duration tolerance, Instant now) {
        WebhookVerifyResult result = verifySignature(payload, header, secrets, tolerance, now);
        if (!result.ok()) {
            throw new WebhookSignatureException(result.reason());
        }
        try {
            JsonNode root = Json.mapper().readTree(payload);
            if (root == null || !root.isObject()) {
                throw new WebhookSignatureException("malformed_body");
            }
            if (root.has("events") && root.get("events").isArray()) {
                return Json.mapper().convertValue(root.get("events"), new TypeReference<List<WebhookEvent>>() {});
            }
            return List.of(Json.mapper().treeToValue(root, WebhookEvent.class));
        } catch (IOException | IllegalArgumentException e) {
            throw new WebhookSignatureException("malformed_body");
        }
    }

    private static byte[] hmac(String secret, byte[] prefix, byte[] payload) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            mac.update(prefix);
            return mac.doFinal(payload);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException(e);
        }
    }
}
