// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.Campaign;
import io.herosignal.models.CampaignPage;
import io.herosignal.models.CampaignStats;
import io.herosignal.models.CampaignsCreateBody;
import io.herosignal.models.CampaignsUpdateBody;
import io.herosignal.models.Delivery;
import io.herosignal.models.DeliveryList;
import io.herosignal.models.MessageList;
import io.herosignal.models.Ok;
import io.herosignal.models.ScheduleCampaignDto;
/** Kampanya yaşam döngüsü (zamanlama, gönderim, duraklatma, onay) ve istatistikler. */
public final class CampaignsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public CampaignsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Kampanya listesi
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CampaignPage list(CampaignsListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/campaigns");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("q", params.getQ());
            request.query("status", params.getStatus());
            request.query("type", params.getType());
            request.query("channel", params.getChannel());
        }
        return executor.execute(request, options, new TypeReference<CampaignPage>() {});
    }

    /**
     * Kampanya listesi
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CampaignPage list(CampaignsListParams params) {
        return list(params, null);
    }

    /**
     * Kampanya listesi
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CampaignPage list() {
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
    public Iterable<Campaign> listAutoPaging(CampaignsListParams params, RequestOptions options) {
        final CampaignsListParams base = params == null ? new CampaignsListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            CampaignPage page = list(base.copy().setCursor(cursor), options);
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
    public Iterable<Campaign> listAutoPaging(CampaignsListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Kampanya oluştur
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign create(CampaignsCreateBody body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Kampanya oluştur
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign create(CampaignsCreateBody body) {
        return create(body, null);
    }

    /**
     * Kampanya detayı
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign get(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/campaigns/{campaignId}");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Kampanya detayı
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign get(String campaignId) {
        return get(campaignId, null);
    }

    /**
     * Kampanya güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/campaigns/{campaignId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign update(String campaignId, CampaignsUpdateBody body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/campaigns/{campaignId}");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Kampanya güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/campaigns/{campaignId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign update(String campaignId, CampaignsUpdateBody body) {
        return update(campaignId, body, null);
    }

    /**
     * Kampanya sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/campaigns/{campaignId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/campaigns/{campaignId}");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Kampanya sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/campaigns/{campaignId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String campaignId) {
        return delete(campaignId, null);
    }

    /**
     * Zamanla
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/schedule}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign schedule(String campaignId, ScheduleCampaignDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/schedule");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Zamanla
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/schedule}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign schedule(String campaignId, ScheduleCampaignDto body) {
        return schedule(campaignId, body, null);
    }

    /**
     * Hemen gönder
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/send}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign send(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/send");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Hemen gönder
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/send}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign send(String campaignId) {
        return send(campaignId, null);
    }

    /**
     * Duraklat
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/pause}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign pause(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/pause");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Duraklat
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/pause}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign pause(String campaignId) {
        return pause(campaignId, null);
    }

    /**
     * Sürdür
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/resume}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign resume(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/resume");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Sürdür
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/resume}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign resume(String campaignId) {
        return resume(campaignId, null);
    }

    /**
     * İptal
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/cancel}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign cancel(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/cancel");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * İptal
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/cancel}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign cancel(String campaignId) {
        return cancel(campaignId, null);
    }

    /**
     * Çoğalt
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/duplicate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign duplicate(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/duplicate");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Çoğalt
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/duplicate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign duplicate(String campaignId) {
        return duplicate(campaignId, null);
    }

    /**
     * Onayla
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/approve}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign approve(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/approve");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Onayla
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/approve}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign approve(String campaignId) {
        return approve(campaignId, null);
    }

    /**
     * İstatistikler
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}/stats}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CampaignStats stats(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/campaigns/{campaignId}/stats");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<CampaignStats>() {});
    }

    /**
     * İstatistikler
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}/stats}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CampaignStats stats(String campaignId) {
        return stats(campaignId, null);
    }

    /**
     * Abone bazlı teslimatlar
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public DeliveryList deliveries(String campaignId, CampaignsDeliveriesParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/campaigns/{campaignId}/deliveries");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("status", params.getStatus());
        }
        return executor.execute(request, options, new TypeReference<DeliveryList>() {});
    }

    /**
     * Abone bazlı teslimatlar
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public DeliveryList deliveries(String campaignId, CampaignsDeliveriesParams params) {
        return deliveries(campaignId, params, null);
    }

    /**
     * Abone bazlı teslimatlar
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public DeliveryList deliveries(String campaignId) {
        return deliveries(campaignId, null, null);
    }

    /**
     * {@link #deliveries} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<Delivery> deliveriesAutoPaging(String campaignId, CampaignsDeliveriesParams params, RequestOptions options) {
        final CampaignsDeliveriesParams base = params == null ? new CampaignsDeliveriesParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            DeliveryList page = deliveries(campaignId, base.copy().setCursor(cursor), options);
            return new AutoPagingIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    /**
     * {@link #deliveries} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<Delivery> deliveriesAutoPaging(String campaignId, CampaignsDeliveriesParams params) {
        return deliveriesAutoPaging(campaignId, params, null);
    }

    /**
     * Başarısız teslimatlara yeniden gönder
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/resend-failed}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign resendFailed(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/campaigns/{campaignId}/resend-failed");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<Campaign>() {});
    }

    /**
     * Başarısız teslimatlara yeniden gönder
     *
     * <p>{@code POST /v1/apps/{appId}/campaigns/{campaignId}/resend-failed}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Campaign resendFailed(String campaignId) {
        return resendFailed(campaignId, null);
    }

    /**
     * Kampanya çalıştırmaları
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}/messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessageList messages(String campaignId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/campaigns/{campaignId}/messages");
        request.appIdInPath();
        request.pathParam("campaignId", campaignId);
        return executor.execute(request, options, new TypeReference<MessageList>() {});
    }

    /**
     * Kampanya çalıştırmaları
     *
     * <p>{@code GET /v1/apps/{appId}/campaigns/{campaignId}/messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param campaignId {campaignId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessageList messages(String campaignId) {
        return messages(campaignId, null);
    }
}
