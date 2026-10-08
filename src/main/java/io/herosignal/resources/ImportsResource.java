// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.Import;
import io.herosignal.models.ImportList;
/** Veri içe aktarma işleri (CSV, multipart). */
public final class ImportsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public ImportsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Import işi başlat (multipart: type, file)
     *
     * <p>{@code POST /v1/apps/{appId}/imports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params multipart form alanları
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Import create(ImportsCreateParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/imports");
        request.appIdInPath();
        if (params != null) {
            request.multipartField("type", params.getType());
            request.multipartFile("file", params.getFile());
        }
        request.multipart();
        return executor.execute(request, options, new TypeReference<Import>() {});
    }

    /**
     * Import işi başlat (multipart: type, file)
     *
     * <p>{@code POST /v1/apps/{appId}/imports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params multipart form alanları
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Import create(ImportsCreateParams params) {
        return create(params, null);
    }

    /**
     * Import işi başlat (multipart: type, file)
     *
     * <p>{@code POST /v1/apps/{appId}/imports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Import create() {
        return create(null, null);
    }

    /**
     * Import işleri
     *
     * <p>{@code GET /v1/apps/{appId}/imports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ImportList list(ImportsListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/imports");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
        }
        return executor.execute(request, options, new TypeReference<ImportList>() {});
    }

    /**
     * Import işleri
     *
     * <p>{@code GET /v1/apps/{appId}/imports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ImportList list(ImportsListParams params) {
        return list(params, null);
    }

    /**
     * Import işleri
     *
     * <p>{@code GET /v1/apps/{appId}/imports}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ImportList list() {
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
    public Iterable<Import> listAutoPaging(ImportsListParams params, RequestOptions options) {
        final ImportsListParams base = params == null ? new ImportsListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            ImportList page = list(base.copy().setCursor(cursor), options);
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
    public Iterable<Import> listAutoPaging(ImportsListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Import durumu
     *
     * <p>{@code GET /v1/apps/{appId}/imports/{importId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param importId {importId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Import get(String importId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/imports/{importId}");
        request.appIdInPath();
        request.pathParam("importId", importId);
        return executor.execute(request, options, new TypeReference<Import>() {});
    }

    /**
     * Import durumu
     *
     * <p>{@code GET /v1/apps/{appId}/imports/{importId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param importId {importId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Import get(String importId) {
        return get(importId, null);
    }
}
