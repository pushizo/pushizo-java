// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.CreateWebhookDto;
import io.herosignal.models.Ok;
import io.herosignal.models.UpdateWebhookDto;
import io.herosignal.models.Webhook;
import io.herosignal.models.WebhookDeliveryDetail;
import io.herosignal.models.WebhookDeliveryPage;
import io.herosignal.models.WebhookDeliveryPageDataItem;
import io.herosignal.models.WebhookList;
import io.herosignal.models.WebhookWithSecret;
/** Giden webhook uç noktaları, teslimatlar ve yeniden gönderim. */
public final class WebhooksResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public WebhooksResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Webhook endpoint'leri
     *
     * <p>{@code GET /v1/apps/{appId}/webhooks}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookList list(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/webhooks");
        request.appIdInPath();
        return executor.execute(request, options, new TypeReference<WebhookList>() {});
    }

    /**
     * Webhook endpoint'leri
     *
     * <p>{@code GET /v1/apps/{appId}/webhooks}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookList list() {
        return list(null);
    }

    /**
     * Endpoint oluştur (secret yalnızca bu yanıtta döner)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookWithSecret create(CreateWebhookDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/webhooks");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<WebhookWithSecret>() {});
    }

    /**
     * Endpoint oluştur (secret yalnızca bu yanıtta döner)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookWithSecret create(CreateWebhookDto body) {
        return create(body, null);
    }

    /**
     * Endpoint detayı
     *
     * <p>{@code GET /v1/apps/{appId}/webhooks/{webhookId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Webhook get(String webhookId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/webhooks/{webhookId}");
        request.appIdInPath();
        request.pathParam("webhookId", webhookId);
        return executor.execute(request, options, new TypeReference<Webhook>() {});
    }

    /**
     * Endpoint detayı
     *
     * <p>{@code GET /v1/apps/{appId}/webhooks/{webhookId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Webhook get(String webhookId) {
        return get(webhookId, null);
    }

    /**
     * Endpoint güncelle (URL, olaylar, batch, başlıklar, etkinleştir/durdur)
     *
     * <p>{@code PATCH /v1/apps/{appId}/webhooks/{webhookId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Webhook update(String webhookId, UpdateWebhookDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/webhooks/{webhookId}");
        request.appIdInPath();
        request.pathParam("webhookId", webhookId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Webhook>() {});
    }

    /**
     * Endpoint güncelle (URL, olaylar, batch, başlıklar, etkinleştir/durdur)
     *
     * <p>{@code PATCH /v1/apps/{appId}/webhooks/{webhookId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Webhook update(String webhookId, UpdateWebhookDto body) {
        return update(webhookId, body, null);
    }

    /**
     * Endpoint sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/webhooks/{webhookId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String webhookId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/webhooks/{webhookId}");
        request.appIdInPath();
        request.pathParam("webhookId", webhookId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Endpoint sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/webhooks/{webhookId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String webhookId) {
        return delete(webhookId, null);
    }

    /**
     * Secret rotasyonu (eski secret 24 saat ikinci imza olarak gönderilir)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks/{webhookId}/rotate-secret}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookWithSecret rotateSecret(String webhookId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/webhooks/{webhookId}/rotate-secret");
        request.appIdInPath();
        request.pathParam("webhookId", webhookId);
        return executor.execute(request, options, new TypeReference<WebhookWithSecret>() {});
    }

    /**
     * Secret rotasyonu (eski secret 24 saat ikinci imza olarak gönderilir)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks/{webhookId}/rotate-secret}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookWithSecret rotateSecret(String webhookId) {
        return rotateSecret(webhookId, null);
    }

    /**
     * Test olayı gönder (anında, sonuç döner)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks/{webhookId}/test}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookDeliveryDetail test(String webhookId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/webhooks/{webhookId}/test");
        request.appIdInPath();
        request.pathParam("webhookId", webhookId);
        return executor.execute(request, options, new TypeReference<WebhookDeliveryDetail>() {});
    }

    /**
     * Test olayı gönder (anında, sonuç döner)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks/{webhookId}/test}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookDeliveryDetail test(String webhookId) {
        return test(webhookId, null);
    }

    /**
     * Teslim geçmişi (cursor; durum/olay türü filtresi)
     *
     * <p>{@code GET /v1/apps/{appId}/webhooks/{webhookId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookDeliveryPage deliveries(String webhookId, WebhooksDeliveriesParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/webhooks/{webhookId}/deliveries");
        request.appIdInPath();
        request.pathParam("webhookId", webhookId);
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("status", params.getStatus());
            request.query("event_type", params.getEventType());
        }
        return executor.execute(request, options, new TypeReference<WebhookDeliveryPage>() {});
    }

    /**
     * Teslim geçmişi (cursor; durum/olay türü filtresi)
     *
     * <p>{@code GET /v1/apps/{appId}/webhooks/{webhookId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookDeliveryPage deliveries(String webhookId, WebhooksDeliveriesParams params) {
        return deliveries(webhookId, params, null);
    }

    /**
     * Teslim geçmişi (cursor; durum/olay türü filtresi)
     *
     * <p>{@code GET /v1/apps/{appId}/webhooks/{webhookId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookDeliveryPage deliveries(String webhookId) {
        return deliveries(webhookId, null, null);
    }

    /**
     * {@link #deliveries} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<WebhookDeliveryPageDataItem> deliveriesAutoPaging(String webhookId, WebhooksDeliveriesParams params, RequestOptions options) {
        final WebhooksDeliveriesParams base = params == null ? new WebhooksDeliveriesParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            WebhookDeliveryPage page = deliveries(webhookId, base.copy().setCursor(cursor), options);
            return new AutoPagingIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    /**
     * {@link #deliveries} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param webhookId {webhookId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<WebhookDeliveryPageDataItem> deliveriesAutoPaging(String webhookId, WebhooksDeliveriesParams params) {
        return deliveriesAutoPaging(webhookId, params, null);
    }

    /**
     * Teslimi yeniden gönder (aynı olay kimliğiyle)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks/deliveries/{deliveryId}/replay}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param deliveryId {deliveryId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookDeliveryDetail replay(String deliveryId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/webhooks/deliveries/{deliveryId}/replay");
        request.appIdInPath();
        request.pathParam("deliveryId", deliveryId);
        return executor.execute(request, options, new TypeReference<WebhookDeliveryDetail>() {});
    }

    /**
     * Teslimi yeniden gönder (aynı olay kimliğiyle)
     *
     * <p>{@code POST /v1/apps/{appId}/webhooks/deliveries/{deliveryId}/replay}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param deliveryId {deliveryId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public WebhookDeliveryDetail replay(String deliveryId) {
        return replay(deliveryId, null);
    }
}
