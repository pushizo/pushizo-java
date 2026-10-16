// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.pushizo.Pushizo;
import io.pushizo.RequestOptions;
import io.pushizo.core.Operation;
import io.pushizo.core.PageIterable;
import io.pushizo.models.*;
import io.pushizo.params.*;

/**
 * Bildirim gönderme, durum, iptal, teslimatlar ve geçmiş dışa aktarımı.
 */
public final class NotificationsResource {
    private final Pushizo client;

    public NotificationsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<CreateNotificationResult> TYPE_0 = new TypeReference<CreateNotificationResult>() {};

    /**
     * Bildirim oluştur (202, asenkron teslimat)
     *
     * {@code POST /v1/notifications}
     *
     * Idempotency-Key başlığı: RequestOptions.idempotencyKey, gövdedeki idempotency_key veya otomatik UUID.
     */
    public CreateNotificationResult create(CreateNotificationDto body) {
        return create(body, null);
    }

    /**
     * Bildirim oluştur (202, asenkron teslimat)
     *
     * {@code POST /v1/notifications}
     *
     * Idempotency-Key başlığı: RequestOptions.idempotencyKey, gövdedeki idempotency_key veya otomatik UUID.
     */
    public CreateNotificationResult create(CreateNotificationDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/notifications");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        op.bodyAppId(true);
        op.idempotent(true);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<MessageList> TYPE_1 = new TypeReference<MessageList>() {};

    /**
     * Mesaj listesi (app_id zorunlu)
     *
     * {@code GET /v1/notifications}
     */
    public MessageList list() {
        return list(null, null);
    }

    /**
     * Mesaj listesi (app_id zorunlu)
     *
     * {@code GET /v1/notifications}
     */
    public MessageList list(NotificationsListParams params) {
        return list(params, null);
    }

    /**
     * Mesaj listesi (app_id zorunlu)
     *
     * {@code GET /v1/notifications}
     *
     * Parametreler: source — Değerler: "campaign", "api", "journey", "test".; kind — Değerler: "campaign", "api", "journey", "test".; status — Değerler: "queued", "processing", "completed", "cancelled", "failed".; sort — Değerler: "created_at", "-created_at".
     */
    public MessageList list(NotificationsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/notifications");
        op.queryAppId(true);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_1);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Message> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Message> listAll(NotificationsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Message> listAll(NotificationsListParams params, RequestOptions options) {
        NotificationsListParams base = params == null ? new NotificationsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            NotificationsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            MessageList page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<EstimateAudienceResult> TYPE_2 = new TypeReference<EstimateAudienceResult>() {};

    /**
     * Kaydedilmemiş hedef için alıcı sayısı (gönderim yapmaz)
     *
     * {@code POST /v1/notifications/estimate}
     */
    public EstimateAudienceResult estimate(EstimateAudienceDto body) {
        return estimate(body, null);
    }

    /**
     * Kaydedilmemiş hedef için alıcı sayısı (gönderim yapmaz)
     *
     * {@code POST /v1/notifications/estimate}
     */
    public EstimateAudienceResult estimate(EstimateAudienceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/notifications/estimate");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        op.bodyAppId(true);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Message> TYPE_3 = new TypeReference<Message>() {};

    /**
     * Mesaj durumu ve sayaçları
     *
     * {@code GET /v1/notifications/{messageId}}
     */
    public Message get(String messageId) {
        return get(messageId, null);
    }

    /**
     * Mesaj durumu ve sayaçları
     *
     * {@code GET /v1/notifications/{messageId}}
     */
    public Message get(String messageId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/notifications/{messageId}");
        op.pathParam("messageId", messageId);
        op.queryAppId(true);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Message> TYPE_4 = new TypeReference<Message>() {};

    /**
     * Zamanlanmış/kuyruktaki mesajı iptal et
     *
     * {@code DELETE /v1/notifications/{messageId}}
     */
    public Message cancel(String messageId) {
        return cancel(messageId, null);
    }

    /**
     * Zamanlanmış/kuyruktaki mesajı iptal et
     *
     * {@code DELETE /v1/notifications/{messageId}}
     */
    public Message cancel(String messageId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/notifications/{messageId}");
        op.pathParam("messageId", messageId);
        op.queryAppId(true);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<DeliveryList> TYPE_5 = new TypeReference<DeliveryList>() {};

    /**
     * Abone bazlı teslimat sonuçları (cursor)
     *
     * {@code GET /v1/notifications/{messageId}/deliveries}
     */
    public DeliveryList deliveries(String messageId) {
        return deliveries(messageId, null, null);
    }

    /**
     * Abone bazlı teslimat sonuçları (cursor)
     *
     * {@code GET /v1/notifications/{messageId}/deliveries}
     */
    public DeliveryList deliveries(String messageId, NotificationsDeliveriesParams params) {
        return deliveries(messageId, params, null);
    }

    /**
     * Abone bazlı teslimat sonuçları (cursor)
     *
     * {@code GET /v1/notifications/{messageId}/deliveries}
     *
     * Parametreler: status — Değerler: "pending", "sent", "delivered", "failed", "bounced", "suppressed", "expired", "cancelled".
     */
    public DeliveryList deliveries(String messageId, NotificationsDeliveriesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/notifications/{messageId}/deliveries");
        op.pathParam("messageId", messageId);
        op.queryAppId(true);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Delivery> deliveriesAll(String messageId) {
        return deliveriesAll(messageId, null, null);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Delivery> deliveriesAll(String messageId, NotificationsDeliveriesParams params) {
        return deliveriesAll(messageId, params, null);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Delivery> deliveriesAll(String messageId, NotificationsDeliveriesParams params, RequestOptions options) {
        NotificationsDeliveriesParams base = params == null ? new NotificationsDeliveriesParams() : params.copy();
        return new PageIterable<>(cursor -> {
            NotificationsDeliveriesParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            DeliveryList page = deliveries(messageId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Export> TYPE_6 = new TypeReference<Export>() {};

    /**
     * Bildirim geçmişi CSV işi (teslimatlar; tamamlanınca download_url)
     *
     * {@code GET /v1/notifications/{messageId}/history}
     */
    public Export history(String messageId) {
        return history(messageId, null);
    }

    /**
     * Bildirim geçmişi CSV işi (teslimatlar; tamamlanınca download_url)
     *
     * {@code GET /v1/notifications/{messageId}/history}
     */
    public Export history(String messageId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/notifications/{messageId}/history");
        op.pathParam("messageId", messageId);
        op.queryAppId(true);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<Export> TYPE_7 = new TypeReference<Export>() {};

    /**
     * Mesaj olay CSV işi (gönderildi/teslim/açıldı/tıklandı/bounce…; tamamlanınca download_url)
     *
     * {@code POST /v1/notifications/{messageId}/export_events}
     */
    public Export exportEvents(String messageId) {
        return exportEvents(messageId, null);
    }

    /**
     * Mesaj olay CSV işi (gönderildi/teslim/açıldı/tıklandı/bounce…; tamamlanınca download_url)
     *
     * {@code POST /v1/notifications/{messageId}/export_events}
     */
    public Export exportEvents(String messageId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/notifications/{messageId}/export_events");
        op.pathParam("messageId", messageId);
        op.queryAppId(true);
        return client.execute(op, options, TYPE_7);
    }
}
