// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.CreateExportDto;
import io.herosignal.models.Export;
import io.herosignal.models.ExportList;
/** Veri dışa aktarma işleri. */
public final class ExportsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public ExportsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Export işi başlat
     *
     * <p>{@code POST /v1/apps/{appId}/exports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export create(CreateExportDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/exports");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<Export>() {});
    }

    /**
     * Export işi başlat
     *
     * <p>{@code POST /v1/apps/{appId}/exports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export create(CreateExportDto body) {
        return create(body, null);
    }

    /**
     * Export işleri
     *
     * <p>{@code GET /v1/apps/{appId}/exports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ExportList list(ExportsListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/exports");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
        }
        return executor.execute(request, options, new TypeReference<ExportList>() {});
    }

    /**
     * Export işleri
     *
     * <p>{@code GET /v1/apps/{appId}/exports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ExportList list(ExportsListParams params) {
        return list(params, null);
    }

    /**
     * Export işleri
     *
     * <p>{@code GET /v1/apps/{appId}/exports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ExportList list() {
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
    public Iterable<Export> listAutoPaging(ExportsListParams params, RequestOptions options) {
        final ExportsListParams base = params == null ? new ExportsListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            ExportList page = list(base.copy().setCursor(cursor), options);
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
    public Iterable<Export> listAutoPaging(ExportsListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Export durumu (download_url)
     *
     * <p>{@code GET /v1/apps/{appId}/exports/{exportId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param exportId {exportId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export get(String exportId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/exports/{exportId}");
        request.appIdInPath();
        request.pathParam("exportId", exportId);
        return executor.execute(request, options, new TypeReference<Export>() {});
    }

    /**
     * Export durumu (download_url)
     *
     * <p>{@code GET /v1/apps/{appId}/exports/{exportId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param exportId {exportId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export get(String exportId) {
        return get(exportId, null);
    }
}
