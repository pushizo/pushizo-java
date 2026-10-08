// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.AppList;
import io.herosignal.models.CreateAppDto;
import io.herosignal.models.UpdateAppDto;
/** App listesi ve ayarları. */
public final class AppsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public AppsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * App listesi (org geneli admin anahtarı)
     *
     * <p>{@code GET /v1/apps}
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public AppList list(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps");
        return executor.execute(request, options, new TypeReference<AppList>() {});
    }

    /**
     * App listesi (org geneli admin anahtarı)
     *
     * <p>{@code GET /v1/apps}
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public AppList list() {
        return list(null);
    }

    /**
     * App oluştur (org geneli admin anahtarı)
     *
     * <p>{@code POST /v1/apps}
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public App create(CreateAppDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps");
        request.body(body);
        return executor.execute(request, options, new TypeReference<App>() {});
    }

    /**
     * App oluştur (org geneli admin anahtarı)
     *
     * <p>{@code POST /v1/apps}
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public App create(CreateAppDto body) {
        return create(body, null);
    }

    /**
     * App detayı
     *
     * <p>{@code GET /v1/apps/{appId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public App get(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}");
        request.appIdInPath();
        return executor.execute(request, options, new TypeReference<App>() {});
    }

    /**
     * App detayı
     *
     * <p>{@code GET /v1/apps/{appId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public App get() {
        return get(null);
    }

    /**
     * App ayarlarını güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public App update(UpdateAppDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<App>() {});
    }

    /**
     * App ayarlarını güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public App update(UpdateAppDto body) {
        return update(body, null);
    }
}
