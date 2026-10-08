// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.CreateSuppressionDto;
import io.herosignal.models.Ok;
import io.herosignal.models.Suppression;
import io.herosignal.models.SuppressionPage;
/** E-posta/SMS gönderim engeli (suppression) listesi. */
public final class SuppressionsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public SuppressionsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Suppression list (e-posta/SMS gönderilmeyecek adresler; kanal/neden/değer filtresi)
     *
     * <p>{@code GET /v1/apps/{appId}/suppressions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SuppressionPage list(SuppressionsListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/suppressions");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("channel", params.getChannel());
            request.query("reason", params.getReason());
            request.query("value", params.getValue());
        }
        return executor.execute(request, options, new TypeReference<SuppressionPage>() {});
    }

    /**
     * Suppression list (e-posta/SMS gönderilmeyecek adresler; kanal/neden/değer filtresi)
     *
     * <p>{@code GET /v1/apps/{appId}/suppressions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SuppressionPage list(SuppressionsListParams params) {
        return list(params, null);
    }

    /**
     * Suppression list (e-posta/SMS gönderilmeyecek adresler; kanal/neden/değer filtresi)
     *
     * <p>{@code GET /v1/apps/{appId}/suppressions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SuppressionPage list() {
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
    public Iterable<Suppression> listAutoPaging(SuppressionsListParams params, RequestOptions options) {
        final SuppressionsListParams base = params == null ? new SuppressionsListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            SuppressionPage page = list(base.copy().setCursor(cursor), options);
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
    public Iterable<Suppression> listAutoPaging(SuppressionsListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Adres ekle (manuel engel; değer saklanmaz, özet + maskeli gösterim)
     *
     * <p>{@code POST /v1/apps/{appId}/suppressions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Suppression create(CreateSuppressionDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/suppressions");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<Suppression>() {});
    }

    /**
     * Adres ekle (manuel engel; değer saklanmaz, özet + maskeli gösterim)
     *
     * <p>{@code POST /v1/apps/{appId}/suppressions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Suppression create(CreateSuppressionDto body) {
        return create(body, null);
    }

    /**
     * Kaydı kaldır (adres yeniden gönderim alabilir)
     *
     * <p>{@code DELETE /v1/apps/{appId}/suppressions/{suppressionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param suppressionId {suppressionId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String suppressionId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/suppressions/{suppressionId}");
        request.appIdInPath();
        request.pathParam("suppressionId", suppressionId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Kaydı kaldır (adres yeniden gönderim alabilir)
     *
     * <p>{@code DELETE /v1/apps/{appId}/suppressions/{suppressionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param suppressionId {suppressionId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String suppressionId) {
        return delete(suppressionId, null);
    }
}
