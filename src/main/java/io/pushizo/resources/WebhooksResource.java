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
 * Giden webhook uç noktaları, teslimatlar ve yeniden gönderim.
 */
public final class WebhooksResource {
    private final Pushizo client;

    public WebhooksResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<WebhookList> TYPE_0 = new TypeReference<WebhookList>() {};

    /**
     * Webhook endpoint'leri
     *
     * {@code GET /v1/apps/{appId}/webhooks}
     */
    public WebhookList list() {
        return list(null);
    }

    /**
     * Webhook endpoint'leri
     *
     * {@code GET /v1/apps/{appId}/webhooks}
     */
    public WebhookList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/webhooks");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<WebhookWithSecret> TYPE_1 = new TypeReference<WebhookWithSecret>() {};

    /**
     * Endpoint oluştur (secret yalnızca bu yanıtta döner)
     *
     * {@code POST /v1/apps/{appId}/webhooks}
     */
    public WebhookWithSecret create(CreateWebhookDto body) {
        return create(body, null);
    }

    /**
     * Endpoint oluştur (secret yalnızca bu yanıtta döner)
     *
     * {@code POST /v1/apps/{appId}/webhooks}
     */
    public WebhookWithSecret create(CreateWebhookDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/webhooks");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<WebhookPreviewResult> TYPE_2 = new TypeReference<WebhookPreviewResult>() {};

    /**
     * Event Streams önizlemesi: örnek olay + şablon + filtre → gövde/hata (gönderim yapmaz)
     *
     * {@code POST /v1/apps/{appId}/webhooks/preview}
     */
    public WebhookPreviewResult preview(WebhookPreviewDto body) {
        return preview(body, null);
    }

    /**
     * Event Streams önizlemesi: örnek olay + şablon + filtre → gövde/hata (gönderim yapmaz)
     *
     * {@code POST /v1/apps/{appId}/webhooks/preview}
     */
    public WebhookPreviewResult preview(WebhookPreviewDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/webhooks/preview");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Webhook> TYPE_3 = new TypeReference<Webhook>() {};

    /**
     * Endpoint detayı
     *
     * {@code GET /v1/apps/{appId}/webhooks/{webhookId}}
     */
    public Webhook get(String webhookId) {
        return get(webhookId, null);
    }

    /**
     * Endpoint detayı
     *
     * {@code GET /v1/apps/{appId}/webhooks/{webhookId}}
     */
    public Webhook get(String webhookId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/webhooks/{webhookId}");
        op.pathParam("webhookId", webhookId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Webhook> TYPE_4 = new TypeReference<Webhook>() {};

    /**
     * Endpoint güncelle (URL, olaylar, batch, başlıklar, etkinleştir/durdur)
     *
     * {@code PATCH /v1/apps/{appId}/webhooks/{webhookId}}
     */
    public Webhook update(String webhookId, UpdateWebhookDto body) {
        return update(webhookId, body, null);
    }

    /**
     * Endpoint güncelle (URL, olaylar, batch, başlıklar, etkinleştir/durdur)
     *
     * {@code PATCH /v1/apps/{appId}/webhooks/{webhookId}}
     */
    public Webhook update(String webhookId, UpdateWebhookDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/webhooks/{webhookId}");
        op.pathParam("webhookId", webhookId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * Endpoint sil
     *
     * {@code DELETE /v1/apps/{appId}/webhooks/{webhookId}}
     */
    public Ok delete(String webhookId) {
        return delete(webhookId, null);
    }

    /**
     * Endpoint sil
     *
     * {@code DELETE /v1/apps/{appId}/webhooks/{webhookId}}
     */
    public Ok delete(String webhookId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/webhooks/{webhookId}");
        op.pathParam("webhookId", webhookId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<WebhookWithSecret> TYPE_6 = new TypeReference<WebhookWithSecret>() {};

    /**
     * Secret rotasyonu (eski secret 24 saat ikinci imza olarak gönderilir)
     *
     * {@code POST /v1/apps/{appId}/webhooks/{webhookId}/rotate-secret}
     */
    public WebhookWithSecret rotateSecret(String webhookId) {
        return rotateSecret(webhookId, null);
    }

    /**
     * Secret rotasyonu (eski secret 24 saat ikinci imza olarak gönderilir)
     *
     * {@code POST /v1/apps/{appId}/webhooks/{webhookId}/rotate-secret}
     */
    public WebhookWithSecret rotateSecret(String webhookId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/webhooks/{webhookId}/rotate-secret");
        op.pathParam("webhookId", webhookId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<WebhookDeliveryDetail> TYPE_7 = new TypeReference<WebhookDeliveryDetail>() {};

    /**
     * Test olayı gönder (anında, sonuç döner)
     *
     * {@code POST /v1/apps/{appId}/webhooks/{webhookId}/test}
     */
    public WebhookDeliveryDetail test(String webhookId) {
        return test(webhookId, null);
    }

    /**
     * Test olayı gönder (anında, sonuç döner)
     *
     * {@code POST /v1/apps/{appId}/webhooks/{webhookId}/test}
     */
    public WebhookDeliveryDetail test(String webhookId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/webhooks/{webhookId}/test");
        op.pathParam("webhookId", webhookId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<WebhookDeliveryPage> TYPE_8 = new TypeReference<WebhookDeliveryPage>() {};

    /**
     * Teslim geçmişi (cursor; durum/olay türü filtresi)
     *
     * {@code GET /v1/apps/{appId}/webhooks/{webhookId}/deliveries}
     */
    public WebhookDeliveryPage deliveries(String webhookId) {
        return deliveries(webhookId, null, null);
    }

    /**
     * Teslim geçmişi (cursor; durum/olay türü filtresi)
     *
     * {@code GET /v1/apps/{appId}/webhooks/{webhookId}/deliveries}
     */
    public WebhookDeliveryPage deliveries(String webhookId, WebhooksDeliveriesParams params) {
        return deliveries(webhookId, params, null);
    }

    /**
     * Teslim geçmişi (cursor; durum/olay türü filtresi)
     *
     * {@code GET /v1/apps/{appId}/webhooks/{webhookId}/deliveries}
     *
     * Parametreler: status — Değerler: "pending", "success", "failed", "dead".
     */
    public WebhookDeliveryPage deliveries(String webhookId, WebhooksDeliveriesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/webhooks/{webhookId}/deliveries");
        op.pathParam("webhookId", webhookId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_8);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebhookDeliveryPageDataItem> deliveriesAll(String webhookId) {
        return deliveriesAll(webhookId, null, null);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebhookDeliveryPageDataItem> deliveriesAll(String webhookId, WebhooksDeliveriesParams params) {
        return deliveriesAll(webhookId, params, null);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebhookDeliveryPageDataItem> deliveriesAll(String webhookId, WebhooksDeliveriesParams params, RequestOptions options) {
        WebhooksDeliveriesParams base = params == null ? new WebhooksDeliveriesParams() : params.copy();
        return new PageIterable<>(cursor -> {
            WebhooksDeliveriesParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            WebhookDeliveryPage page = deliveries(webhookId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<WebhookDeliveryDetail> TYPE_9 = new TypeReference<WebhookDeliveryDetail>() {};

    /**
     * Teslimi yeniden gönder (aynı olay kimliğiyle)
     *
     * {@code POST /v1/apps/{appId}/webhooks/deliveries/{deliveryId}/replay}
     */
    public WebhookDeliveryDetail replay(String deliveryId) {
        return replay(deliveryId, null);
    }

    /**
     * Teslimi yeniden gönder (aynı olay kimliğiyle)
     *
     * {@code POST /v1/apps/{appId}/webhooks/deliveries/{deliveryId}/replay}
     */
    public WebhookDeliveryDetail replay(String deliveryId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/webhooks/deliveries/{deliveryId}/replay");
        op.pathParam("deliveryId", deliveryId);
        return client.execute(op, options, TYPE_9);
    }
}
