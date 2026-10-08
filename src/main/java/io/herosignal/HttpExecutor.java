package io.herosignal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** java.net.http üzerinde kimlik doğrulama, yeniden deneme, idempotency ve hata eşleme. */
final class HttpExecutor implements ApiExecutor {
    /** Retry-After yoksa denemeler arası bekleme (Node/PHP/Python/Go SDK'larıyla aynı). */
    static final long[] BACKOFF_MILLIS = {300, 1000, 3000};

    /** Bekleme işlevi (testlerde değiştirilir). */
    interface Sleeper {
        void sleep(Duration duration) throws InterruptedException;
    }

    static final ObjectMapper MAPPER = new ObjectMapper()
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

    private final String apiKey;
    private final String appId;
    private final String baseUrl;
    private final String userAgent;
    private final Duration timeout;
    private final int maxRetries;
    private final boolean autoIdempotencyKey;
    private final HttpClient http;
    private final Sleeper sleeper;
    private final Clock clock;

    HttpExecutor(HeroSignal.Builder b) {
        if (b.apiKey == null || b.apiKey.isEmpty()) throw new IllegalArgumentException("HeroSignal: apiKey gerekli.");
        this.apiKey = b.apiKey;
        this.appId = b.appId;
        this.baseUrl = b.baseUrl.replaceAll("/+$", "");
        this.userAgent = b.userAgent != null ? b.userAgent : "herosignal-java/" + HeroSignal.VERSION;
        this.timeout = b.timeout;
        this.maxRetries = b.maxRetries;
        this.autoIdempotencyKey = b.autoIdempotencyKey;
        this.http = b.httpClient != null ? b.httpClient : HttpClient.newBuilder().connectTimeout(b.timeout).build();
        this.sleeper = b.sleeper != null ? b.sleeper : d -> Thread.sleep(d.toMillis());
        this.clock = b.clock != null ? b.clock : Clock.systemUTC();
    }

    String getAppId() {
        return appId;
    }

    private String resolveAppId(RequestOptions options) {
        String id = options != null && options.getAppId() != null && !options.getAppId().isEmpty() ? options.getAppId() : appId;
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("HeroSignal: app ID verilmedi (builder.appId veya RequestOptions.appId).");
        }
        return id;
    }

    @Override
    public <T> T execute(ApiRequest request, RequestOptions options, TypeReference<T> responseType) {
        String path = request.getPath();
        StringBuilder query = new StringBuilder();
        String resolvedAppId = null;
        if (request.isAppIdInPath() || request.isQueryAppId() || request.isBodyAppId()) {
            resolvedAppId = resolveAppId(options);
            if (request.isAppIdInPath()) path = path.replace("{appId}", encodePath(resolvedAppId));
            if (request.isQueryAppId()) appendQuery(query, "app_id", resolvedAppId);
        }
        for (Map.Entry<String, String> p : request.getPathParams().entrySet()) {
            path = path.replace("{" + p.getKey() + "}", encodePath(p.getValue()));
        }
        for (Map.Entry<String, Object> q : request.getQuery()) {
            for (String v : scalarValues(q.getValue())) appendQuery(query, q.getKey(), v);
        }

        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Authorization", "Bearer " + apiKey);
        headers.put("Accept", "application/json");
        headers.put("User-Agent", userAgent);

        String idempotencyKey = options != null ? options.getIdempotencyKey() : null;
        byte[] payload = null;
        if (request.isMultipart()) {
            String boundary = "----herosignal" + UUID.randomUUID().toString().replace("-", "");
            payload = encodeMultipart(request, boundary);
            headers.put("Content-Type", "multipart/form-data; boundary=" + boundary);
        } else if (request.getBody() != null) {
            JsonNode node = MAPPER.valueToTree(request.getBody());
            if (node instanceof ObjectNode) {
                ObjectNode obj = (ObjectNode) node;
                if (request.isBodyAppId()) {
                    JsonNode existing = obj.get("app_id");
                    if (existing == null || existing.isNull() || existing.asText().isEmpty()) obj.put("app_id", resolvedAppId);
                }
                JsonNode bodyKey = obj.get("idempotency_key");
                if ((idempotencyKey == null || idempotencyKey.isEmpty()) && bodyKey != null && bodyKey.isTextual()) {
                    idempotencyKey = bodyKey.asText();
                }
            }
            payload = writeJson(node);
            headers.put("Content-Type", "application/json");
        }
        if ((idempotencyKey == null || idempotencyKey.isEmpty()) && request.isIdempotent() && autoIdempotencyKey) {
            idempotencyKey = UUID.randomUUID().toString();
        }
        if (idempotencyKey != null && !idempotencyKey.isEmpty()) headers.put("Idempotency-Key", idempotencyKey);
        if (options != null) headers.putAll(options.getHeaders());

        URI uri = URI.create(baseUrl + path + (query.length() > 0 ? "?" + query : ""));
        int retries = options != null && options.getMaxRetries() != null ? options.getMaxRetries() : maxRetries;
        Duration attemptTimeout = options != null && options.getTimeout() != null ? options.getTimeout() : timeout;
        return send(request.getMethod(), uri, headers, payload, retries, attemptTimeout, responseType);
    }

    private <T> T send(String method, URI uri, Map<String, String> headers, byte[] payload, int retries, Duration attemptTimeout, TypeReference<T> responseType) {
        HttpRequest.Builder rb = HttpRequest.newBuilder(uri).timeout(attemptTimeout);
        headers.forEach(rb::header);
        rb.method(method, payload == null ? HttpRequest.BodyPublishers.noBody() : HttpRequest.BodyPublishers.ofByteArray(payload));
        HttpRequest httpRequest = rb.build();

        for (int attempt = 0; ; attempt++) {
            HttpResponse<byte[]> response = null;
            HeroSignalException error;
            try {
                response = http.send(httpRequest, HttpResponse.BodyHandlers.ofByteArray());
                int status = response.statusCode();
                if (status >= 200 && status < 300) return decode(response, responseType);
                error = errorFrom(response);
            } catch (IOException e) {
                error = new HeroSignalException(0, "NETWORK", e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName(), null, null, e);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new HeroSignalException(0, "NETWORK", "istek kesildi", null, null, e);
            }
            if (!error.isRetryable() || attempt >= retries) throw error;
            try {
                sleeper.sleep(retryDelay(response, attempt));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new HeroSignalException(0, "NETWORK", "yeniden deneme beklemesi kesildi", null, null, e);
            }
        }
    }

    private <T> T decode(HttpResponse<byte[]> response, TypeReference<T> responseType) {
        byte[] body = response.body();
        if (responseType == null || body == null || body.length == 0) return null;
        String contentType = response.headers().firstValue("content-type").orElse("");
        try {
            if (responseType.getType() == JsonNode.class && !contentType.isEmpty() && !contentType.contains("json")) {
                @SuppressWarnings("unchecked")
                T text = (T) TextNode.valueOf(new String(body, StandardCharsets.UTF_8));
                return text;
            }
            return MAPPER.readValue(body, responseType);
        } catch (IOException e) {
            throw new HeroSignalException(response.statusCode(), "INVALID_RESPONSE", "yanıt çözülemedi: " + e.getMessage(), requestIdHeader(response), null, e);
        }
    }

    private static String requestIdHeader(HttpResponse<?> response) {
        return response.headers().firstValue("x-request-id").orElse(null);
    }

    private static HeroSignalException errorFrom(HttpResponse<byte[]> response) {
        int status = response.statusCode();
        String code = null;
        String message = null;
        String requestId = null;
        Map<String, Object> details = null;
        try {
            JsonNode root = MAPPER.readTree(response.body());
            JsonNode err = root == null ? null : root.get("error");
            if (err != null && err.isObject()) {
                code = textOrNull(err.get("code"));
                message = textOrNull(err.get("message"));
                requestId = textOrNull(err.get("request_id"));
                JsonNode d = err.get("details");
                if (d != null && d.isObject()) details = MAPPER.convertValue(d, new TypeReference<Map<String, Object>>() {});
            }
        } catch (IOException | IllegalArgumentException ignored) {
            // Gövde JSON değilse durum kodundan türetilen hata kullanılır.
        }
        if (code == null || code.isEmpty()) code = "HTTP_" + status;
        if (message == null || message.isEmpty()) message = "HTTP " + status;
        if (requestId == null || requestId.isEmpty()) requestId = requestIdHeader(response);
        return new HeroSignalException(status, code, message, requestId, details, null);
    }

    private static String textOrNull(JsonNode n) {
        return n == null || n.isNull() ? null : n.asText();
    }

    /** Retry-After (saniye veya HTTP tarihi) varsa ona uyar; yoksa 300 ms / 1 sn / 3 sn. */
    Duration retryDelay(HttpResponse<?> response, int attempt) {
        if (response != null) {
            String header = response.headers().firstValue("retry-after").orElse("").trim();
            if (!header.isEmpty()) {
                try {
                    double seconds = Double.parseDouble(header);
                    if (seconds > 0) return Duration.ofMillis((long) (seconds * 1000));
                } catch (NumberFormatException notSeconds) {
                    try {
                        ZonedDateTime at = ZonedDateTime.parse(header, DateTimeFormatter.RFC_1123_DATE_TIME);
                        Duration d = Duration.between(clock.instant(), at.toInstant());
                        if (!d.isNegative() && !d.isZero()) return d;
                    } catch (DateTimeParseException ignored) {
                        // Geçersiz tarih: varsayılan geri çekilme kullanılır.
                    }
                }
            }
        }
        return Duration.ofMillis(BACKOFF_MILLIS[Math.min(attempt, BACKOFF_MILLIS.length - 1)]);
    }

    private static byte[] writeJson(Object value) {
        try {
            return MAPPER.writeValueAsBytes(value);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("HeroSignal: gövde JSON'a çevrilemedi: " + e.getOriginalMessage(), e);
        }
    }

    /** Sorgu/form değeri: koleksiyonlar tekrarlanan anahtar, bool küçük harf, karmaşık değerler JSON. */
    static List<String> scalarValues(Object value) {
        if (value == null) return List.of();
        if (value instanceof Collection<?>) {
            java.util.ArrayList<String> out = new java.util.ArrayList<>();
            for (Object v : (Collection<?>) value) out.addAll(scalarValues(v));
            return out;
        }
        if (value instanceof String || value instanceof Number || value instanceof Boolean) return List.of(String.valueOf(value));
        return List.of(new String(writeJson(value), StandardCharsets.UTF_8));
    }

    private static void appendQuery(StringBuilder sb, String key, String value) {
        if (sb.length() > 0) sb.append('&');
        sb.append(URLEncoder.encode(key, StandardCharsets.UTF_8)).append('=').append(URLEncoder.encode(value, StandardCharsets.UTF_8));
    }

    private static String encodePath(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
    }

    private static byte[] encodeMultipart(ApiRequest request, String boundary) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (Map.Entry<String, Object> f : request.getFormFields()) {
            for (String v : scalarValues(f.getValue())) {
                write(out, "--" + boundary + "\r\n");
                write(out, "Content-Disposition: form-data; name=\"" + escapeQuoted(f.getKey()) + "\"\r\n\r\n");
                write(out, v);
                write(out, "\r\n");
            }
        }
        for (Map.Entry<String, FileUpload> f : request.getFormFiles()) {
            FileUpload file = f.getValue();
            write(out, "--" + boundary + "\r\n");
            write(out, "Content-Disposition: form-data; name=\"" + escapeQuoted(f.getKey()) + "\"; filename=\"" + escapeQuoted(file.getFilename()) + "\"\r\n");
            write(out, "Content-Type: " + file.getContentType() + "\r\n\r\n");
            byte[] content = file.getContent();
            out.write(content, 0, content.length);
            write(out, "\r\n");
        }
        write(out, "--" + boundary + "--\r\n");
        return out.toByteArray();
    }

    private static String escapeQuoted(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\r", "").replace("\n", "");
    }

    private static void write(ByteArrayOutputStream out, String s) {
        byte[] b = s.getBytes(StandardCharsets.UTF_8);
        out.write(b, 0, b.length);
    }
}
