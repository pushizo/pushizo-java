// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.ApiKey;
import io.herosignal.models.ApiKeyList;
import io.herosignal.models.App;
import io.herosignal.models.CreateAppApiKeyDto;
import io.herosignal.models.CreatedApiKey;
import io.herosignal.models.Ok;
import io.herosignal.models.UpdateApiKeyDto;
/** apiKeys kaynağı. */
public final class ApiKeysResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public ApiKeysResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * App'e bağlı API anahtarları
     *
     * <p>{@code GET /v1/apps/{appId}/api-keys}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ApiKeyList list(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/api-keys");
        request.appIdInPath();
        return executor.execute(request, options, new TypeReference<ApiKeyList>() {});
    }

    /**
     * App'e bağlı API anahtarları
     *
     * <p>{@code GET /v1/apps/{appId}/api-keys}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ApiKeyList list() {
        return list(null);
    }

    /**
     * App'e bağlı API anahtarı oluştur (ham anahtar yalnızca bu yanıtta)
     *
     * <p>{@code POST /v1/apps/{appId}/api-keys}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CreatedApiKey create(CreateAppApiKeyDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/api-keys");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<CreatedApiKey>() {});
    }

    /**
     * App'e bağlı API anahtarı oluştur (ham anahtar yalnızca bu yanıtta)
     *
     * <p>{@code POST /v1/apps/{appId}/api-keys}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CreatedApiKey create(CreateAppApiKeyDto body) {
        return create(body, null);
    }

    /**
     * Anahtarı güncelle (ad, kapsam, IP izin listesi, bitiş)
     *
     * <p>{@code PATCH /v1/apps/{appId}/api-keys/{keyId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param keyId {keyId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ApiKey update(String keyId, UpdateApiKeyDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/api-keys/{keyId}");
        request.appIdInPath();
        request.pathParam("keyId", keyId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<ApiKey>() {});
    }

    /**
     * Anahtarı güncelle (ad, kapsam, IP izin listesi, bitiş)
     *
     * <p>{@code PATCH /v1/apps/{appId}/api-keys/{keyId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param keyId {keyId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ApiKey update(String keyId, UpdateApiKeyDto body) {
        return update(keyId, body, null);
    }

    /**
     * Anahtarı iptal et
     *
     * <p>{@code DELETE /v1/apps/{appId}/api-keys/{keyId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param keyId {keyId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok revoke(String keyId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/api-keys/{keyId}");
        request.appIdInPath();
        request.pathParam("keyId", keyId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Anahtarı iptal et
     *
     * <p>{@code DELETE /v1/apps/{appId}/api-keys/{keyId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param keyId {keyId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok revoke(String keyId) {
        return revoke(keyId, null);
    }

    /**
     * Anahtarı döndür (eski değer anında geçersiz)
     *
     * <p>{@code POST /v1/apps/{appId}/api-keys/{keyId}/rotate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param keyId {keyId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CreatedApiKey rotate(String keyId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/api-keys/{keyId}/rotate");
        request.appIdInPath();
        request.pathParam("keyId", keyId);
        return executor.execute(request, options, new TypeReference<CreatedApiKey>() {});
    }

    /**
     * Anahtarı döndür (eski değer anında geçersiz)
     *
     * <p>{@code POST /v1/apps/{appId}/api-keys/{keyId}/rotate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param keyId {keyId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CreatedApiKey rotate(String keyId) {
        return rotate(keyId, null);
    }
}
