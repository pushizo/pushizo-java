// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.CreateNotificationDto;
import io.herosignal.models.CreateNotificationResult;
import io.herosignal.models.Delivery;
import io.herosignal.models.DeliveryList;
import io.herosignal.models.EstimateRecipientsDto;
import io.herosignal.models.Export;
import io.herosignal.models.Message;
import io.herosignal.models.MessageList;
import io.herosignal.models.RecipientEstimate;
/** Bildirim gönderme, durum, iptal, teslimatlar ve geçmiş dışa aktarımı. */
public final class NotificationsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public NotificationsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Bildirim oluştur (202, asenkron teslimat)
     *
     * <p>{@code POST /v1/notifications}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CreateNotificationResult create(CreateNotificationDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/notifications");
        request.bodyAppId();
        request.idempotent();
        request.body(body);
        return executor.execute(request, options, new TypeReference<CreateNotificationResult>() {});
    }

    /**
     * Bildirim oluştur (202, asenkron teslimat)
     *
     * <p>{@code POST /v1/notifications}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public CreateNotificationResult create(CreateNotificationDto body) {
        return create(body, null);
    }

    /**
     * Mesaj listesi (app_id zorunlu)
     *
     * <p>{@code GET /v1/notifications}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessageList list(NotificationsListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/notifications");
        request.queryAppId();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("source", params.getSource());
            request.query("kind", params.getKind());
            request.query("status", params.getStatus());
            request.query("sort", params.getSort());
        }
        return executor.execute(request, options, new TypeReference<MessageList>() {});
    }

    /**
     * Mesaj listesi (app_id zorunlu)
     *
     * <p>{@code GET /v1/notifications}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessageList list(NotificationsListParams params) {
        return list(params, null);
    }

    /**
     * Mesaj listesi (app_id zorunlu)
     *
     * <p>{@code GET /v1/notifications}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessageList list() {
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
    public Iterable<Message> listAutoPaging(NotificationsListParams params, RequestOptions options) {
        final NotificationsListParams base = params == null ? new NotificationsListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            MessageList page = list(base.copy().setCursor(cursor), options);
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
    public Iterable<Message> listAutoPaging(NotificationsListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Kaydedilmemiş hedef için alıcı sayımı (kanal kırılımıyla; gönderim yapmaz)
     *
     * <p>{@code POST /v1/notifications/estimate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public RecipientEstimate estimate(EstimateRecipientsDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/notifications/estimate");
        request.bodyAppId();
        request.body(body);
        return executor.execute(request, options, new TypeReference<RecipientEstimate>() {});
    }

    /**
     * Kaydedilmemiş hedef için alıcı sayımı (kanal kırılımıyla; gönderim yapmaz)
     *
     * <p>{@code POST /v1/notifications/estimate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public RecipientEstimate estimate(EstimateRecipientsDto body) {
        return estimate(body, null);
    }

    /**
     * Mesaj durumu ve sayaçları
     *
     * <p>{@code GET /v1/notifications/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Message get(String messageId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/notifications/{messageId}");
        request.queryAppId();
        request.pathParam("messageId", messageId);
        return executor.execute(request, options, new TypeReference<Message>() {});
    }

    /**
     * Mesaj durumu ve sayaçları
     *
     * <p>{@code GET /v1/notifications/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Message get(String messageId) {
        return get(messageId, null);
    }

    /**
     * Zamanlanmış/kuyruktaki mesajı iptal et
     *
     * <p>{@code DELETE /v1/notifications/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Message cancel(String messageId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/notifications/{messageId}");
        request.queryAppId();
        request.pathParam("messageId", messageId);
        return executor.execute(request, options, new TypeReference<Message>() {});
    }

    /**
     * Zamanlanmış/kuyruktaki mesajı iptal et
     *
     * <p>{@code DELETE /v1/notifications/{messageId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Message cancel(String messageId) {
        return cancel(messageId, null);
    }

    /**
     * Abone bazlı teslimat sonuçları (cursor)
     *
     * <p>{@code GET /v1/notifications/{messageId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public DeliveryList deliveries(String messageId, NotificationsDeliveriesParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/notifications/{messageId}/deliveries");
        request.queryAppId();
        request.pathParam("messageId", messageId);
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("status", params.getStatus());
        }
        return executor.execute(request, options, new TypeReference<DeliveryList>() {});
    }

    /**
     * Abone bazlı teslimat sonuçları (cursor)
     *
     * <p>{@code GET /v1/notifications/{messageId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public DeliveryList deliveries(String messageId, NotificationsDeliveriesParams params) {
        return deliveries(messageId, params, null);
    }

    /**
     * Abone bazlı teslimat sonuçları (cursor)
     *
     * <p>{@code GET /v1/notifications/{messageId}/deliveries}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param messageId {messageId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public DeliveryList deliveries(String messageId) {
        return deliveries(messageId, null, null);
    }

    /**
     * {@link #deliveries} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param messageId {messageId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<Delivery> deliveriesAutoPaging(String messageId, NotificationsDeliveriesParams params, RequestOptions options) {
        final NotificationsDeliveriesParams base = params == null ? new NotificationsDeliveriesParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            DeliveryList page = deliveries(messageId, base.copy().setCursor(cursor), options);
            return new AutoPagingIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    /**
     * {@link #deliveries} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param messageId {messageId} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<Delivery> deliveriesAutoPaging(String messageId, NotificationsDeliveriesParams params) {
        return deliveriesAutoPaging(messageId, params, null);
    }

    /**
     * Bildirim geçmişi CSV işi (teslimatlar; tamamlanınca download_url)
     *
     * <p>{@code GET /v1/notifications/{messageId}/history}
     *
     * @param messageId {messageId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export history(String messageId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/notifications/{messageId}/history");
        request.pathParam("messageId", messageId);
        return executor.execute(request, options, new TypeReference<Export>() {});
    }

    /**
     * Bildirim geçmişi CSV işi (teslimatlar; tamamlanınca download_url)
     *
     * <p>{@code GET /v1/notifications/{messageId}/history}
     *
     * @param messageId {messageId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export history(String messageId) {
        return history(messageId, null);
    }

    /**
     * Mesaj olayları CSV işi (teslim, açılma, tıklama, bounce…; tamamlanınca download_url)
     *
     * <p>{@code POST /v1/notifications/{messageId}/export-events}
     *
     * @param messageId {messageId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export exportEvents(String messageId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/notifications/{messageId}/export-events");
        request.pathParam("messageId", messageId);
        return executor.execute(request, options, new TypeReference<Export>() {});
    }

    /**
     * Mesaj olayları CSV işi (teslim, açılma, tıklama, bounce…; tamamlanınca download_url)
     *
     * <p>{@code POST /v1/notifications/{messageId}/export-events}
     *
     * @param messageId {messageId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Export exportEvents(String messageId) {
        return exportEvents(messageId, null);
    }
}
