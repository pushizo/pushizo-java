// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.Ok;
import io.herosignal.models.Segment;
import io.herosignal.models.SegmentCampaigns;
import io.herosignal.models.SegmentEstimate;
import io.herosignal.models.SegmentPage;
import io.herosignal.models.SegmentPreview;
import io.herosignal.models.SegmentsCreateBody;
import io.herosignal.models.SegmentsPreviewBody;
import io.herosignal.models.SegmentsUpdateBody;
/** Segment yönetimi, önizleme ve kitle tahmini. */
public final class SegmentsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public SegmentsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Segment listesi
     *
     * <p>{@code GET /v1/apps/{appId}/segments}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentPage list(SegmentsListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/segments");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("q", params.getQ());
        }
        return executor.execute(request, options, new TypeReference<SegmentPage>() {});
    }

    /**
     * Segment listesi
     *
     * <p>{@code GET /v1/apps/{appId}/segments}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentPage list(SegmentsListParams params) {
        return list(params, null);
    }

    /**
     * Segment listesi
     *
     * <p>{@code GET /v1/apps/{appId}/segments}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentPage list() {
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
    public Iterable<Segment> listAutoPaging(SegmentsListParams params, RequestOptions options) {
        final SegmentsListParams base = params == null ? new SegmentsListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            SegmentPage page = list(base.copy().setCursor(cursor), options);
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
    public Iterable<Segment> listAutoPaging(SegmentsListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Segment oluştur
     *
     * <p>{@code POST /v1/apps/{appId}/segments}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Segment create(SegmentsCreateBody body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/segments");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<Segment>() {});
    }

    /**
     * Segment oluştur
     *
     * <p>{@code POST /v1/apps/{appId}/segments}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Segment create(SegmentsCreateBody body) {
        return create(body, null);
    }

    /**
     * Tanım ile sayım ve örnek kullanıcılar
     *
     * <p>{@code POST /v1/apps/{appId}/segments/preview}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentPreview preview(SegmentsPreviewBody body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/segments/preview");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<SegmentPreview>() {});
    }

    /**
     * Tanım ile sayım ve örnek kullanıcılar
     *
     * <p>{@code POST /v1/apps/{appId}/segments/preview}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentPreview preview(SegmentsPreviewBody body) {
        return preview(body, null);
    }

    /**
     * Segment detayı
     *
     * <p>{@code GET /v1/apps/{appId}/segments/{segmentId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Segment get(String segmentId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/segments/{segmentId}");
        request.appIdInPath();
        request.pathParam("segmentId", segmentId);
        return executor.execute(request, options, new TypeReference<Segment>() {});
    }

    /**
     * Segment detayı
     *
     * <p>{@code GET /v1/apps/{appId}/segments/{segmentId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Segment get(String segmentId) {
        return get(segmentId, null);
    }

    /**
     * Segment güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/segments/{segmentId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Segment update(String segmentId, SegmentsUpdateBody body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/segments/{segmentId}");
        request.appIdInPath();
        request.pathParam("segmentId", segmentId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Segment>() {});
    }

    /**
     * Segment güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/segments/{segmentId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Segment update(String segmentId, SegmentsUpdateBody body) {
        return update(segmentId, body, null);
    }

    /**
     * Segment sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/segments/{segmentId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String segmentId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/segments/{segmentId}");
        request.appIdInPath();
        request.pathParam("segmentId", segmentId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Segment sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/segments/{segmentId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String segmentId) {
        return delete(segmentId, null);
    }

    /**
     * Segmenti kullanan kampanyalar
     *
     * <p>{@code GET /v1/apps/{appId}/segments/{segmentId}/campaigns}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentCampaigns usedBy(String segmentId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/segments/{segmentId}/campaigns");
        request.appIdInPath();
        request.pathParam("segmentId", segmentId);
        return executor.execute(request, options, new TypeReference<SegmentCampaigns>() {});
    }

    /**
     * Segmenti kullanan kampanyalar
     *
     * <p>{@code GET /v1/apps/{appId}/segments/{segmentId}/campaigns}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentCampaigns usedBy(String segmentId) {
        return usedBy(segmentId, null);
    }

    /**
     * Tahmini sayım
     *
     * <p>{@code POST /v1/apps/{appId}/segments/{segmentId}/estimate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @param force "force" sorgu parametresi.
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentEstimate estimate(String segmentId, String force, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/segments/{segmentId}/estimate");
        request.appIdInPath();
        request.pathParam("segmentId", segmentId);
        request.query("force", force);
        return executor.execute(request, options, new TypeReference<SegmentEstimate>() {});
    }

    /**
     * Tahmini sayım
     *
     * <p>{@code POST /v1/apps/{appId}/segments/{segmentId}/estimate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param segmentId {segmentId} yol parametresi
     * @param force "force" sorgu parametresi.
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SegmentEstimate estimate(String segmentId, String force) {
        return estimate(segmentId, force, null);
    }
}
