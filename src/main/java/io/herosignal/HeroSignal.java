package io.herosignal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.herosignal.core.HttpTransport;
import io.herosignal.core.JdkHttpTransport;
import io.herosignal.core.Json;
import io.herosignal.core.Operation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * HeroSignal Java sunucu SDK istemcisi (Java 17+, {@code java.net.http}). Eşzamanlı kullanım için güvenlidir.
 *
 * <pre>{@code
 * HeroSignal hs = HeroSignal.builder().apiKey(System.getenv("HS_API_KEY")).appId("app_…").build();
 * CreateNotificationResult res = hs.notifications().create(new CreateNotificationDto()
 *         .target(new CreateNotificationDtoTarget().includeAliases(Map.of("external_id", List.of(userId))))
 *         .contents(Map.of("en", "Shipped", "tr", "Kargoya verildi")),
 *     RequestOptions.builder().idempotencyKey("order-" + orderId).build());
 * }</pre>
 *
 * Kaynak erişimcileri ({@code notifications()}, {@code users()}, {@code segments()} …) {@code api/openapi.yaml}'dan
 * üretilen {@link HeroSignalResources} sınıfından gelir.
 */
public final class HeroSignal extends HeroSignalResources {
    public static final String VERSION = "0.1.0";
    public static final String DEFAULT_BASE_URL = "https://api.herosignal.dev";
    private static final long[] BACKOFF_MS = {300, 1000, 3000};

    /** Yeniden deneme beklemesi (testlerde değiştirilir). */
    @FunctionalInterface
    interface Sleeper {
        void sleep(long millis) throws InterruptedException;
    }

    private final String apiKey;
    private final String baseUrl;
    private final String appId;
    private final Duration timeout;
    private final int maxRetries;
    private final String userAgent;
    private final boolean autoIdempotencyKey;
    private final HttpTransport transport;
    private final Sleeper sleeper;

    private HeroSignal(Builder b) {
        super();
        if (b.apiKey == null || b.apiKey.isEmpty()) {
            throw new IllegalArgumentException("HeroSignal: apiKey gerekli.");
        }
        this.apiKey = b.apiKey;
        this.baseUrl = b.baseUrl.replaceAll("/+$", "");
        this.appId = b.appId;
        this.timeout = b.timeout;
        this.maxRetries = b.maxRetries;
        this.userAgent = b.userAgent != null ? b.userAgent : "herosignal-java/" + VERSION;
        this.autoIdempotencyKey = b.autoIdempotencyKey;
        this.transport = b.transport != null ? b.transport : new JdkHttpTransport();
        this.sleeper = b.sleeper != null ? b.sleeper : Thread::sleep;
    }

    public static Builder builder() {
        return new Builder();
    }

    /** SDK identity verification için {@code identity_hash = HMAC-SHA256(sdkSecret, externalId)} (hex). */
    public static String identityHash(String sdkSecret, String externalId) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(sdkSecret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return HexFormat.of().formatHex(mac.doFinal(externalId.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Düşük seviyeli istek: SDK'da metodu olmayan uçlar veya JSON dışı yanıtlar (ör. analitik {@code format=csv}) için.
     * {@code path} "/v1/…" biçimindedir; {@code {appId}} varsa app kimliğiyle doldurulur. Yanıt gövdesi metin olarak döner.
     */
    public String request(String method, String path, Map<String, ?> query, Object body, RequestOptions options) {
        Operation op = new Operation(method.toUpperCase(java.util.Locale.ROOT), path);
        if (query != null) {
            query.forEach(op::query);
        }
        op.body(body);
        byte[] raw = send(op, options);
        return raw == null ? null : new String(raw, StandardCharsets.UTF_8);
    }

    /** İç API: üretilmiş kaynakların çağırdığı yürütücü; yanıt JSON'u {@code type}'a çevrilir. */
    public <T> T execute(Operation op, RequestOptions options, TypeReference<T> type) {
        byte[] raw = send(op, options);
        if (type == null || raw == null || raw.length == 0) {
            return null;
        }
        try {
            return Json.mapper().readValue(raw, type);
        } catch (IOException e) {
            throw new HeroSignalException(200, "DECODE", "Yanıt ayrıştırılamadı: " + e.getMessage(), null, null, null, e);
        }
    }

    private String resolveAppId(RequestOptions options) {
        String id = options != null && options.appId() != null ? options.appId() : appId;
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("HeroSignal: appId verilmedi (builder.appId veya RequestOptions.appId).");
        }
        return id;
    }

    private byte[] send(Operation op, RequestOptions options) {
        String path = op.path();
        if (path.contains("{appId}")) {
            path = path.replace("{appId}", encodePath(resolveAppId(options)));
        }
        for (Map.Entry<String, String> p : op.pathParams().entrySet()) {
            path = path.replace("{" + p.getKey() + "}", encodePath(p.getValue()));
        }
        StringBuilder url = new StringBuilder(baseUrl).append(path);
        char sep = '?';
        if (op.isQueryAppId()) {
            url.append(sep).append("app_id=").append(encodeQuery(resolveAppId(options)));
            sep = '&';
        }
        for (Map.Entry<String, String> q : op.query()) {
            url.append(sep).append(encodeQuery(q.getKey())).append('=').append(encodeQuery(q.getValue()));
            sep = '&';
        }

        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Authorization", "Bearer " + apiKey);
        headers.put("Accept", "application/json");
        headers.put("User-Agent", userAgent);

        String key = options != null ? options.idempotencyKey() : null;
        byte[] body = null;
        if (op.isMultipart()) {
            String boundary = "----herosignal" + UUID.randomUUID().toString().replace("-", "");
            body = multipart(op.form(), boundary);
            headers.put("Content-Type", "multipart/form-data; boundary=" + boundary);
        } else if (op.body() != null) {
            JsonNode tree = Json.mapper().valueToTree(op.body());
            if (tree instanceof ObjectNode obj) {
                if (op.isBodyAppId() && (!obj.hasNonNull("app_id") || obj.get("app_id").asText().isEmpty())) {
                    obj.put("app_id", resolveAppId(options));
                }
                if (key == null && op.isIdempotent() && obj.hasNonNull("idempotency_key")) {
                    key = obj.get("idempotency_key").asText();
                }
            }
            try {
                body = Json.mapper().writeValueAsBytes(tree);
            } catch (IOException e) {
                throw new IllegalArgumentException("HeroSignal: gövde serileştirilemedi: " + e.getMessage(), e);
            }
            headers.put("Content-Type", "application/json");
        }
        if ((key == null || key.isEmpty()) && op.isIdempotent() && autoIdempotencyKey) {
            key = UUID.randomUUID().toString();
        }
        if (key != null && !key.isEmpty()) {
            headers.put("Idempotency-Key", key);
        }
        if (options != null) {
            headers.putAll(options.headers());
        }

        Duration attemptTimeout = options != null && options.timeout() != null ? options.timeout() : timeout;
        int retries = options != null && options.maxRetries() != null ? options.maxRetries() : maxRetries;
        HttpTransport.Request request = new HttpTransport.Request(op.method(), url.toString(), headers, body, attemptTimeout);
        for (int attempt = 0; ; attempt++) {
            HeroSignalException error;
            HttpTransport.Response response = null;
            try {
                response = transport.send(request);
            } catch (IOException e) {
                response = null;
                error = new NetworkException(e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName(), e);
                if (attempt >= retries) {
                    throw error;
                }
                pause(BACKOFF_MS[Math.min(attempt, BACKOFF_MS.length - 1)]);
                continue;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new NetworkException("İstek kesildi.", e);
            }
            if (response.status() >= 200 && response.status() < 300) {
                return response.body();
            }
            error = errorFrom(response);
            if (!error.isRetryable() || attempt >= retries) {
                throw error;
            }
            Duration retryAfter = error.getRetryAfter();
            pause(retryAfter != null && !retryAfter.isZero() ? retryAfter.toMillis() : BACKOFF_MS[Math.min(attempt, BACKOFF_MS.length - 1)]);
        }
    }

    private void pause(long millis) {
        try {
            sleeper.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new NetworkException("Yeniden deneme beklemesi kesildi.", e);
        }
    }

    @SuppressWarnings("unchecked")
    private static HeroSignalException errorFrom(HttpTransport.Response response) {
        String code = null;
        String message = null;
        String requestId = null;
        Map<String, Object> details = null;
        try {
            JsonNode root = response.body() == null || response.body().length == 0 ? null : Json.mapper().readTree(response.body());
            JsonNode err = root == null ? null : root.get("error");
            if (err != null && err.isObject()) {
                code = err.hasNonNull("code") ? err.get("code").asText() : null;
                message = err.hasNonNull("message") ? err.get("message").asText() : null;
                requestId = err.hasNonNull("request_id") ? err.get("request_id").asText() : null;
                if (err.has("details") && err.get("details").isObject()) {
                    details = Json.mapper().convertValue(err.get("details"), Map.class);
                }
            }
        } catch (IOException ignored) {
            // Zarf JSON değilse HTTP durumundan türetilir.
        }
        int status = response.status();
        if (requestId == null) {
            requestId = response.header("x-request-id");
        }
        return HeroSignalException.of(status, code != null ? code : "HTTP_" + status, message != null ? message : "HTTP " + status,
                requestId, details, parseRetryAfter(response.header("retry-after")));
    }

    /** Retry-After: saniye veya HTTP tarihi. */
    static Duration parseRetryAfter(String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        String v = value.trim();
        try {
            double secs = Double.parseDouble(v);
            return secs > 0 ? Duration.ofMillis((long) (secs * 1000)) : null;
        } catch (NumberFormatException ignored) {
            // HTTP tarihi olabilir.
        }
        try {
            Duration d = Duration.between(ZonedDateTime.now(), ZonedDateTime.parse(v, DateTimeFormatter.RFC_1123_DATE_TIME));
            return d.isNegative() || d.isZero() ? null : d;
        } catch (DateTimeParseException ignored) {
            return null;
        }
    }

    static String encodePath(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
    }

    static String encodeQuery(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
    }

    private static byte[] multipart(List<Operation.FormPart> parts, String boundary) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (Operation.FormPart p : parts) {
            write(out, "--" + boundary + "\r\n");
            if (p.file() == null) {
                write(out, "Content-Disposition: form-data; name=\"" + quote(p.name()) + "\"\r\n\r\n");
                write(out, p.value());
            } else {
                write(out, "Content-Disposition: form-data; name=\"" + quote(p.name()) + "\"; filename=\"" + quote(p.file().filename()) + "\"\r\n");
                write(out, "Content-Type: " + p.file().contentType() + "\r\n\r\n");
                out.writeBytes(p.file().content());
            }
            write(out, "\r\n");
        }
        write(out, "--" + boundary + "--\r\n");
        return out.toByteArray();
    }

    private static String quote(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\r", "").replace("\n", "");
    }

    private static void write(ByteArrayOutputStream out, String s) {
        out.writeBytes(s.getBytes(StandardCharsets.UTF_8));
    }

    /** {@link HeroSignal} kurucu. */
    public static final class Builder {
        private String apiKey;
        private String baseUrl = DEFAULT_BASE_URL;
        private String appId;
        private Duration timeout = Duration.ofSeconds(30);
        private int maxRetries = 3;
        private String userAgent;
        private boolean autoIdempotencyKey = true;
        private HttpTransport transport;
        private Sleeper sleeper;

        /** {@code hs_live_…} API anahtarı (Bearer). */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /** API adresi; yerel geliştirmede {@code http://localhost:4000}. */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /** Çağrılarda RequestOptions.appId verilmezse kullanılacak varsayılan app. */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /** Deneme başına zaman aşımı (varsayılan 30 sn). */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /** 429/5xx ve ağ hatalarında en fazla yeniden deneme (varsayılan 3). */
        public Builder maxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        /** Idempotency-Key destekleyen çağrılarda anahtar verilmezse UUID üret (varsayılan true). */
        public Builder autoIdempotencyKey(boolean enabled) {
            this.autoIdempotencyKey = enabled;
            return this;
        }

        /** Özel taşıma (proxy, TLS, test). Varsayılan {@link JdkHttpTransport}. */
        public Builder transport(HttpTransport transport) {
            this.transport = transport;
            return this;
        }

        Builder sleeper(Sleeper sleeper) {
            this.sleeper = sleeper;
            return this;
        }

        public HeroSignal build() {
            return new HeroSignal(this);
        }
    }
}
