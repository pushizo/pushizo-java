package io.herosignal;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Tek bir çağrının istemci ayarlarını geçersiz kılar.
 *
 * <pre>{@code
 * hs.notifications().create(body, RequestOptions.builder().idempotencyKey("order-42").build());
 * }</pre>
 */
public final class RequestOptions {
    private final String appId;
    private final String idempotencyKey;
    private final Map<String, String> headers;
    private final Integer maxRetries;
    private final Duration timeout;

    private RequestOptions(Builder b) {
        this.appId = b.appId;
        this.idempotencyKey = b.idempotencyKey;
        this.headers = Collections.unmodifiableMap(new LinkedHashMap<>(b.headers));
        this.maxRetries = b.maxRetries;
        this.timeout = b.timeout;
    }

    /** @return yeni oluşturucu */
    public static Builder builder() {
        return new Builder();
    }

    /** @return app kimliği (null ise istemcinin varsayılanı) */
    public String getAppId() {
        return appId;
    }

    /** @return Idempotency-Key (null olabilir) */
    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    /** @return ek başlıklar */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /** @return en fazla yeniden deneme (null ise istemcinin değeri) */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    /** @return deneme başına zaman aşımı (null ise istemcinin değeri) */
    public Duration getTimeout() {
        return timeout;
    }

    /** {@link RequestOptions} oluşturucusu. */
    public static final class Builder {
        private String appId;
        private String idempotencyKey;
        private final Map<String, String> headers = new LinkedHashMap<>();
        private Integer maxRetries;
        private Duration timeout;

        private Builder() {}

        /**
         * @param appId bu çağrı için app kimliği
         * @return oluşturucu
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * @param key Idempotency-Key (ör. {@code order-42}); yeniden denemelerde aynı anahtar kullanılır
         * @return oluşturucu
         */
        public Builder idempotencyKey(String key) {
            this.idempotencyKey = key;
            return this;
        }

        /**
         * @param name başlık adı
         * @param value başlık değeri
         * @return oluşturucu
         */
        public Builder header(String name, String value) {
            this.headers.put(name, value);
            return this;
        }

        /**
         * @param maxRetries en fazla yeniden deneme
         * @return oluşturucu
         */
        public Builder maxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param timeout deneme başına zaman aşımı
         * @return oluşturucu
         */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /** @return seçenekler */
        public RequestOptions build() {
            return new RequestOptions(this);
        }
    }
}
