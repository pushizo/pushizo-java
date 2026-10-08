package io.herosignal.webhooks;

import com.fasterxml.jackson.databind.JsonNode;
import io.herosignal.HeroSignal;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Giden webhook imza doğrulaması (alıcı tarafı).
 *
 * <p>Başlık: {@code HeroSignal-Signature: t=<unix>,v1=<hex>}; {@code v1 = HMAC-SHA256(secret, t + "." + ham gövde)}.
 * Secret rotasyonunda başlıkta iki {@code v1} bulunabilir; herhangi biri eşleşirse imza geçerlidir. Karşılaştırma
 * sabit zamanlıdır.
 *
 * <pre>{@code
 * byte[] payload = request.getInputStream().readAllBytes(); // HAM gövde
 * List<WebhookEvent> events = Webhooks.constructEvents(payload, request.getHeader(Webhooks.SIGNATURE_HEADER), List.of(secret));
 * }</pre>
 */
public final class Webhooks {
    /** İmza başlığı. */
    public static final String SIGNATURE_HEADER = "HeroSignal-Signature";
    /** Olay kimliği başlığı; tekrar gönderimleri ayıklamak için kullanın. */
    public static final String EVENT_ID_HEADER = "HeroSignal-Event-Id";
    /** Varsayılan zaman damgası toleransı; daha eski {@code t} tekrar (replay) sayılır. */
    public static final Duration DEFAULT_TOLERANCE = Duration.ofSeconds(300);

    private Webhooks() {}

    /**
     * İmzayı varsayılan tolerans ve şimdiki zamanla doğrular.
     *
     * @param payload HAM istek gövdesi (JSON'u ayrıştırıp yeniden serileştirmeyin)
     * @param header {@code HeroSignal-Signature} değeri (null olabilir)
     * @param secrets endpoint secret'ları (rotasyonda eski ve yeni)
     * @return sonuç
     */
    public static WebhookVerifyResult verifySignature(byte[] payload, String header, List<String> secrets) {
        return verifySignature(payload, header, secrets, DEFAULT_TOLERANCE, Instant.now());
    }

    /**
     * İmzayı doğrular.
     *
     * @param payload HAM istek gövdesi
     * @param header {@code HeroSignal-Signature} değeri (null olabilir)
     * @param secrets endpoint secret'ları
     * @param tolerance zaman damgası toleransı (null ise varsayılan)
     * @param now şimdiki zaman (null ise {@link Instant#now()})
     * @return sonuç
     */
    public static WebhookVerifyResult verifySignature(byte[] payload, String header, List<String> secrets, Duration tolerance, Instant now) {
        if (header == null || header.isEmpty()) return WebhookVerifyResult.failure(WebhookVerifyFailure.MISSING_HEADER);
        Long timestamp = null;
        List<byte[]> signatures = new ArrayList<>();
        for (String part : header.split(",", -1)) {
            int idx = part.indexOf('=');
            if (idx <= 0) continue;
            String key = part.substring(0, idx).trim();
            String value = part.substring(idx + 1).trim();
            if (key.equals("t") && value.matches("[0-9]+")) {
                try {
                    timestamp = Long.parseLong(value);
                } catch (NumberFormatException ignored) {
                    // Aşırı büyük sayı: geçersiz zaman damgası sayılır.
                }
            } else if (key.equals("v1") && value.matches("[0-9a-f]{64}")) {
                signatures.add(hexToBytes(value));
            }
        }
        if (timestamp == null || signatures.isEmpty()) return WebhookVerifyResult.failure(WebhookVerifyFailure.MALFORMED_HEADER);
        long nowSec = (now != null ? now : Instant.now()).getEpochSecond();
        long tol = (tolerance != null ? tolerance : DEFAULT_TOLERANCE).getSeconds();
        if (Math.abs(nowSec - timestamp) > tol) return WebhookVerifyResult.failure(WebhookVerifyFailure.TIMESTAMP_OUT_OF_TOLERANCE);
        byte[] prefix = (timestamp + ".").getBytes(StandardCharsets.US_ASCII);
        for (String secret : secrets == null ? Collections.<String>emptyList() : secrets) {
            byte[] expected = hmac(secret, prefix, payload);
            for (byte[] sig : signatures) {
                if (MessageDigest.isEqual(sig, expected)) return WebhookVerifyResult.success(timestamp);
            }
        }
        return WebhookVerifyResult.failure(WebhookVerifyFailure.SIGNATURE_MISMATCH);
    }

    /**
     * {@link String} gövde için kolaylık (UTF-8 baytları imzalanır).
     *
     * @param payload HAM gövde metni
     * @param header başlık
     * @param secrets secret'lar
     * @param tolerance tolerans (null ise varsayılan)
     * @param now şimdiki zaman (null ise şimdi)
     * @return sonuç
     */
    public static WebhookVerifyResult verifySignature(String payload, String header, List<String> secrets, Duration tolerance, Instant now) {
        return verifySignature(payload.getBytes(StandardCharsets.UTF_8), header, secrets, tolerance, now);
    }

    /**
     * İmzayı doğrular ve gövdeyi olay listesine çevirir (tekil gövde veya {@code {"events": [...]}} batch).
     *
     * @param payload HAM gövde
     * @param header başlık
     * @param secrets secret'lar
     * @return olaylar
     * @throws WebhookSignatureException imza veya gövde geçersizse
     */
    public static List<WebhookEvent> constructEvents(byte[] payload, String header, List<String> secrets) {
        return constructEvents(payload, header, secrets, DEFAULT_TOLERANCE, Instant.now());
    }

    /**
     * İmzayı doğrular ve gövdeyi olay listesine çevirir.
     *
     * @param payload HAM gövde
     * @param header başlık
     * @param secrets secret'lar
     * @param tolerance tolerans (null ise varsayılan)
     * @param now şimdiki zaman (null ise şimdi)
     * @return olaylar
     * @throws WebhookSignatureException imza veya gövde geçersizse
     */
    public static List<WebhookEvent> constructEvents(byte[] payload, String header, List<String> secrets, Duration tolerance, Instant now) {
        WebhookVerifyResult result = verifySignature(payload, header, secrets, tolerance, now);
        if (!result.isOk()) throw new WebhookSignatureException(result.getReason());
        JsonNode root;
        try {
            root = HeroSignal.objectMapper().readTree(payload);
        } catch (IOException e) {
            throw new WebhookSignatureException(WebhookVerifyFailure.MALFORMED_BODY);
        }
        if (root == null || !root.isObject()) throw new WebhookSignatureException(WebhookVerifyFailure.MALFORMED_BODY);
        List<WebhookEvent> events = new ArrayList<>();
        JsonNode batch = root.get("events");
        if (batch != null && batch.isArray()) {
            for (JsonNode e : batch) events.add(WebhookEvent.from(e));
        } else {
            events.add(WebhookEvent.from(root));
        }
        return Collections.unmodifiableList(events);
    }

    private static byte[] hmac(String secret, byte[] prefix, byte[] payload) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            mac.update(prefix);
            return mac.doFinal(payload);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("HmacSHA256 kullanılamıyor", e);
        }
    }

    private static byte[] hexToBytes(String hex) {
        byte[] out = new byte[hex.length() / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }
}
