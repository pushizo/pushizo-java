// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.CreateInAppDto;
import io.herosignal.models.InAppMessage;
import io.herosignal.models.InAppMessagePage;
import io.herosignal.models.InAppStatusDto;
import io.herosignal.models.Ok;
import io.herosignal.models.UpdateInAppDto;
/** inAppMessages kaynağı. */
public final class InAppMessagesResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public InAppMessagesResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * In-app mesajlar (durum filtresi; istatistik dahil)
     *
     * <p>{@code GET /v1/apps/{appId}/in-app-messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessagePage list(InAppMessagesListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/in-app-messages");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("status", params.getStatus());
        }
        return executor.execute(request, options, new TypeReference<InAppMessagePage>() {});
    }

    /**
     * In-app mesajlar (durum filtresi; istatistik dahil)
     *
     * <p>{@code GET /v1/apps/{appId}/in-app-messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessagePage list(InAppMessagesListParams params) {
        return list(params, null);
    }

    /**
     * In-app mesajlar (durum filtresi; istatistik dahil)
     *
     * <p>{@code GET /v1/apps/{appId}/in-app-messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessagePage list() {
        return list(null, null);
    }

    /**
     * {@link #list} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<InAppMessage> listAutoPaging(InAppMessagesListParams params, RequestOptions options) {
        final InAppMessagesListParams base = params == null ? new InAppMessagesListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            InAppMessagePage page = list(base.copy().setCursor(cursor), options);
            return new AutoPagingIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    /**
     * {@link #list} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<InAppMessage> listAutoPaging(InAppMessagesListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * In-app mesaj oluştur (taslak)
     *
     * <p>{@code POST /v1/apps/{appId}/in-app-messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage create(CreateInAppDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/in-app-messages");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<InAppMessage>() {});
    }

    /**
     * In-app mesaj oluştur (taslak)
     *
     * <p>{@code POST /v1/apps/{appId}/in-app-messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage create(CreateInAppDto body) {
        return create(body, null);
    }

    /**
     * In-app mesaj detayı
     *
     * <p>{@code GET /v1/apps/{appId}/in-app-messages/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage get(String messageId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/in-app-messages/{messageId}");
        request.appIdInPath();
        request.pathParam("messageId", messageId);
        return executor.execute(request, options, new TypeReference<InAppMessage>() {});
    }

    /**
     * In-app mesaj detayı
     *
     * <p>{@code GET /v1/apps/{appId}/in-app-messages/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage get(String messageId) {
        return get(messageId, null);
    }

    /**
     * In-app mesajı düzenle
     *
     * <p>{@code PATCH /v1/apps/{appId}/in-app-messages/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage update(String messageId, UpdateInAppDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/in-app-messages/{messageId}");
        request.appIdInPath();
        request.pathParam("messageId", messageId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<InAppMessage>() {});
    }

    /**
     * In-app mesajı düzenle
     *
     * <p>{@code PATCH /v1/apps/{appId}/in-app-messages/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage update(String messageId, UpdateInAppDto body) {
        return update(messageId, body, null);
    }

    /**
     * In-app mesajı sil (gösterim kayıtlarıyla birlikte)
     *
     * <p>{@code DELETE /v1/apps/{appId}/in-app-messages/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String messageId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/in-app-messages/{messageId}");
        request.appIdInPath();
        request.pathParam("messageId", messageId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * In-app mesajı sil (gösterim kayıtlarıyla birlikte)
     *
     * <p>{@code DELETE /v1/apps/{appId}/in-app-messages/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String messageId) {
        return delete(messageId, null);
    }

    /**
     * Yayınla / duraklat / arşivle
     *
     * <p>{@code POST /v1/apps/{appId}/in-app-messages/{messageId}/status}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage status(String messageId, InAppStatusDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/in-app-messages/{messageId}/status");
        request.appIdInPath();
        request.pathParam("messageId", messageId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<InAppMessage>() {});
    }

    /**
     * Yayınla / duraklat / arşivle
     *
     * <p>{@code POST /v1/apps/{appId}/in-app-messages/{messageId}/status}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InAppMessage status(String messageId, InAppStatusDto body) {
        return status(messageId, body, null);
    }
}
