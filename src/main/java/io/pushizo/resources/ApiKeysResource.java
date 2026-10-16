// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.pushizo.Pushizo;
import io.pushizo.RequestOptions;
import io.pushizo.core.Operation;
import io.pushizo.core.PageIterable;
import io.pushizo.models.*;
import io.pushizo.params.*;

/**
 * App API anahtarları: oluşturma, kapsam/IP izin listesi güncelleme, rotasyon ve iptal.
 */
public final class ApiKeysResource {
    private final Pushizo client;

    public ApiKeysResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<ApiKeyList> TYPE_0 = new TypeReference<ApiKeyList>() {};

    /**
     * App'e bağlı API anahtarları
     *
     * {@code GET /v1/apps/{appId}/api-keys}
     */
    public ApiKeyList list() {
        return list(null);
    }

    /**
     * App'e bağlı API anahtarları
     *
     * {@code GET /v1/apps/{appId}/api-keys}
     */
    public ApiKeyList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/api-keys");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<CreatedApiKey> TYPE_1 = new TypeReference<CreatedApiKey>() {};

    /**
     * App'e bağlı API anahtarı oluştur (ham anahtar yalnızca bu yanıtta)
     *
     * {@code POST /v1/apps/{appId}/api-keys}
     */
    public CreatedApiKey create(CreateAppApiKeyDto body) {
        return create(body, null);
    }

    /**
     * App'e bağlı API anahtarı oluştur (ham anahtar yalnızca bu yanıtta)
     *
     * {@code POST /v1/apps/{appId}/api-keys}
     */
    public CreatedApiKey create(CreateAppApiKeyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/api-keys");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<ApiKey> TYPE_2 = new TypeReference<ApiKey>() {};

    /**
     * Anahtarı güncelle (ad, kapsam, IP izin listesi, bitiş)
     *
     * {@code PATCH /v1/apps/{appId}/api-keys/{keyId}}
     */
    public ApiKey update(String keyId, UpdateApiKeyDto body) {
        return update(keyId, body, null);
    }

    /**
     * Anahtarı güncelle (ad, kapsam, IP izin listesi, bitiş)
     *
     * {@code PATCH /v1/apps/{appId}/api-keys/{keyId}}
     */
    public ApiKey update(String keyId, UpdateApiKeyDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/api-keys/{keyId}");
        op.pathParam("keyId", keyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Ok> TYPE_3 = new TypeReference<Ok>() {};

    /**
     * Anahtarı iptal et
     *
     * {@code DELETE /v1/apps/{appId}/api-keys/{keyId}}
     */
    public Ok revoke(String keyId) {
        return revoke(keyId, null);
    }

    /**
     * Anahtarı iptal et
     *
     * {@code DELETE /v1/apps/{appId}/api-keys/{keyId}}
     */
    public Ok revoke(String keyId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/api-keys/{keyId}");
        op.pathParam("keyId", keyId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<CreatedApiKey> TYPE_4 = new TypeReference<CreatedApiKey>() {};

    /**
     * Anahtarı döndür (eski değer anında geçersiz)
     *
     * {@code POST /v1/apps/{appId}/api-keys/{keyId}/rotate}
     */
    public CreatedApiKey rotate(String keyId) {
        return rotate(keyId, null);
    }

    /**
     * Anahtarı döndür (eski değer anında geçersiz)
     *
     * {@code POST /v1/apps/{appId}/api-keys/{keyId}/rotate}
     */
    public CreatedApiKey rotate(String keyId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/api-keys/{keyId}/rotate");
        op.pathParam("keyId", keyId);
        return client.execute(op, options, TYPE_4);
    }
}
