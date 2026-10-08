package io.herosignal;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.herosignal.core.ApiRequest;
import io.herosignal.resources.GeneratedResources;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.Duration;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * HeroSignal sunucu SDK istemcisi; iş parçacığı güvenlidir.
 *
 * <pre>{@code
 * HeroSignal hs = HeroSignal.builder().apiKey(System.getenv("HS_API_KEY")).appId("app_…").build();
 * CreateNotificationResult res = hs.notifications().create(
 *     new CreateNotificationDto()
 *         .setTarget(new CreateNotificationDtoTarget().setIncludeAliases(Map.of("external_id", List.of("u1"))))
 *         .setContents(Map.of("en", "Shipped")),
 *     RequestOptions.builder().idempotencyKey("order-42").build());
 * }</pre>
 *
 * <p>Kaynaklar ({@code notifications()}, {@code users()}, {@code segments()} …) ve modeller {@code api/openapi.yaml}'dan
 * üretilir; HTTP katmanı (kimlik doğrulama, yeniden deneme, idempotency, hata eşleme, sayfalama) el yazımıdır.
 */
public final class HeroSignal extends GeneratedResources {
    /** SDK sürümü. */
    public static final String VERSION = "0.1.0";
    /** Varsayılan API adresi. */
    public static final String DEFAULT_BASE_URL = "https://api.herosignal.dev";
    /** Deneme başına varsayılan zaman aşımı. */
    public static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(30);
    /** 429/5xx ve ağ hatalarında varsayılan en fazla yeniden deneme. */
    public static final int DEFAULT_MAX_RETRIES = 3;

    private final HttpExecutor executor;

    private HeroSignal(HttpExecutor executor) {
        super(executor);
        this.executor = executor;
    }

    /** @return yeni oluşturucu */
    public static Builder builder() {
        return new Builder();
    }

    /** @return istemcinin varsayılan app kimliği (null olabilir) */
    public String getAppId() {
        return executor.getAppId();
    }

    /** @return SDK'nın kullandığı Jackson eşleyicisi (modelleri JSON'a çevirmek veya olay verisini çözmek için) */
    public static ObjectMapper objectMapper() {
        return HttpExecutor.MAPPER;
    }

    /**
     * Düşük seviyeli istek (SDK'da henüz metodu olmayan uçlar veya {@code format=csv} gibi JSON dışı yanıtlar için).
     * JSON yanıtlar {@link JsonNode} olarak, diğer içerik tipleri metin düğümü olarak döner.
     *
     * @param method HTTP metodu
     * @param path {@code /v1/…} yolu
     * @param query sorgu parametreleri (null olabilir)
     * @param body JSON gövdesi (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return yanıt (gövde boşsa null)
     * @throws HeroSignalException API veya ağ hatasında
     */
    public JsonNode request(String method, String path, Map<String, ?> query, Object body, RequestOptions options) {
        ApiRequest request = new ApiRequest(method, path);
        if (query != null) query.forEach(request::query);
        request.body(body);
        return executor.execute(request, options, new TypeReference<JsonNode>() {});
    }

    /**
     * SDK identity verification için {@code identity_hash = HMAC-SHA256(sdkSecret, externalId)} (hex).
     *
     * @param sdkSecret app'in SDK secret'ı
     * @param externalId kullanıcının external_id'si
     * @return küçük harf hex özet
     */
    public static String identityHash(String sdkSecret, String externalId) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(sdkSecret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            byte[] digest = mac.doFinal(externalId.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("HmacSHA256 kullanılamıyor", e);
        }
    }

    /** {@link HeroSignal} oluşturucusu. */
    public static final class Builder {
        String apiKey;
        String appId;
        String baseUrl = DEFAULT_BASE_URL;
        Duration timeout = DEFAULT_TIMEOUT;
        int maxRetries = DEFAULT_MAX_RETRIES;
        boolean autoIdempotencyKey = true;
        String userAgent;
        HttpClient httpClient;
        HttpExecutor.Sleeper sleeper;
        Clock clock;

        private Builder() {}

        /**
         * @param apiKey {@code hs_live_…} API anahtarı (zorunlu)
         * @return oluşturucu
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * @param appId çağrılarda verilmezse kullanılacak varsayılan app
         * @return oluşturucu
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * @param baseUrl API adresi; yerel geliştirmede {@code http://localhost:4000}
         * @return oluşturucu
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
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

        /**
         * @param maxRetries 429/5xx ve ağ hatalarında en fazla yeniden deneme
         * @return oluşturucu
         */
        public Builder maxRetries(int maxRetries) {
            this.maxRetries = Math.max(0, maxRetries);
            return this;
        }

        /**
         * @param enabled Idempotency-Key destekleyen çağrılarda anahtar verilmezse UUID üretilsin mi
         * @return oluşturucu
         */
        public Builder autoIdempotencyKey(boolean enabled) {
            this.autoIdempotencyKey = enabled;
            return this;
        }

        /**
         * @param userAgent User-Agent başlığı
         * @return oluşturucu
         */
        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        /**
         * @param httpClient özel {@link HttpClient} (proxy, TLS, yürütücü)
         * @return oluşturucu
         */
        public Builder httpClient(HttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        Builder sleeper(HttpExecutor.Sleeper sleeper) {
            this.sleeper = sleeper;
            return this;
        }

        Builder clock(Clock clock) {
            this.clock = clock;
            return this;
        }

        /**
         * @return istemci
         * @throws IllegalArgumentException apiKey verilmediyse
         */
        public HeroSignal build() {
            return new HeroSignal(new HttpExecutor(this));
        }
    }
}
