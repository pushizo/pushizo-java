package io.herosignal;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Tek bir çağrı için istemci ayarlarını değiştirir.
 *
 * <pre>{@code
 * hs.notifications().create(body, RequestOptions.builder().appId("app_2").idempotencyKey("order-42").build());
 * }</pre>
 */
public final class RequestOptions {
    private final String appId;
    private final String idempotencyKey;
    private final Duration timeout;
    private final Integer maxRetries;
    private final Map<String, String> headers;

    private RequestOptions(Builder b) {
        this.appId = b.appId;
        this.idempotencyKey = b.idempotencyKey;
        this.timeout = b.timeout;
        this.maxRetries = b.maxRetries;
        this.headers = Collections.unmodifiableMap(new LinkedHashMap<>(b.headers));
    }

    public static Builder builder() {
        return new Builder();
    }

    /** Yalnızca app kimliğini değiştiren kısayol. */
    public static RequestOptions forApp(String appId) {
        return builder().appId(appId).build();
    }

    public String appId() {
        return appId;
    }

    public String idempotencyKey() {
        return idempotencyKey;
    }

    public Duration timeout() {
        return timeout;
    }

    public Integer maxRetries() {
        return maxRetries;
    }

    public Map<String, String> headers() {
        return headers;
    }

    public static final class Builder {
        private String appId;
        private String idempotencyKey;
        private Duration timeout;
        private Integer maxRetries;
        private final Map<String, String> headers = new LinkedHashMap<>();

        /** Bu çağrının app kimliği (istemcinin varsayılan app'i yerine). */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /** {@code Idempotency-Key} başlığı: aynı anahtarla 24 saat içindeki tekrar aynı yanıtı döner. */
        public Builder idempotencyKey(String key) {
            this.idempotencyKey = key;
            return this;
        }

        /** Deneme başına zaman aşımı. */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /** 429/5xx ve ağ hatalarında en fazla yeniden deneme. */
        public Builder maxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder header(String name, String value) {
            headers.put(name, value);
            return this;
        }

        public RequestOptions build() {
            return new RequestOptions(this);
        }
    }
}
