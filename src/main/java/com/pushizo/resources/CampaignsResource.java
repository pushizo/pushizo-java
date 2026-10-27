// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pushizo.Pushizo;
import com.pushizo.RequestOptions;
import com.pushizo.core.Operation;
import com.pushizo.core.PageIterable;
import com.pushizo.models.*;
import com.pushizo.params.*;

/**
 * Kampanya yaşam döngüsü (zamanlama, gönderim, duraklatma, onay) ve istatistikler.
 */
public final class CampaignsResource {
    private final Pushizo client;

    public CampaignsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<CampaignPage> TYPE_0 = new TypeReference<CampaignPage>() {};

    /**
     * Kampanya listesi
     *
     * {@code GET /v1/apps/{appId}/campaigns}
     */
    public CampaignPage list() {
        return list(null, null);
    }

    /**
     * Kampanya listesi
     *
     * {@code GET /v1/apps/{appId}/campaigns}
     */
    public CampaignPage list(CampaignsListParams params) {
        return list(params, null);
    }

    /**
     * Kampanya listesi
     *
     * {@code GET /v1/apps/{appId}/campaigns}
     *
     * Parametreler: status — Değerler: "draft", "scheduled", "running", "paused", "completed", "cancelled", "failed".; type — Değerler: "one_time", "scheduled", "recurring", "automated", "transactional".; channel — Değerler: "ios_push", "android_push", "hms_push", "adm_push", "wns_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    public CampaignPage list(CampaignsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/campaigns");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Campaign> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Campaign> listAll(CampaignsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Campaign> listAll(CampaignsListParams params, RequestOptions options) {
        CampaignsListParams base = params == null ? new CampaignsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            CampaignsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            CampaignPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Campaign> TYPE_1 = new TypeReference<Campaign>() {};

    /**
     * Kampanya oluştur
     *
     * {@code POST /v1/apps/{appId}/campaigns}
     */
    public Campaign create(CampaignsCreateBody body) {
        return create(body, null);
    }

    /**
     * Kampanya oluştur
     *
     * {@code POST /v1/apps/{appId}/campaigns}
     */
    public Campaign create(CampaignsCreateBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Campaign> TYPE_2 = new TypeReference<Campaign>() {};

    /**
     * Kampanya detayı
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}}
     */
    public Campaign get(String campaignId) {
        return get(campaignId, null);
    }

    /**
     * Kampanya detayı
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}}
     */
    public Campaign get(String campaignId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/campaigns/{campaignId}");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Campaign> TYPE_3 = new TypeReference<Campaign>() {};

    /**
     * Kampanya güncelle
     *
     * {@code PATCH /v1/apps/{appId}/campaigns/{campaignId}}
     */
    public Campaign update(String campaignId, CampaignsUpdateBody body) {
        return update(campaignId, body, null);
    }

    /**
     * Kampanya güncelle
     *
     * {@code PATCH /v1/apps/{appId}/campaigns/{campaignId}}
     */
    public Campaign update(String campaignId, CampaignsUpdateBody body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/campaigns/{campaignId}");
        op.pathParam("campaignId", campaignId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Kampanya sil
     *
     * {@code DELETE /v1/apps/{appId}/campaigns/{campaignId}}
     */
    public Ok delete(String campaignId) {
        return delete(campaignId, null);
    }

    /**
     * Kampanya sil
     *
     * {@code DELETE /v1/apps/{appId}/campaigns/{campaignId}}
     */
    public Ok delete(String campaignId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/campaigns/{campaignId}");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Campaign> TYPE_5 = new TypeReference<Campaign>() {};

    /**
     * Zamanla
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/schedule}
     */
    public Campaign schedule(String campaignId, ScheduleCampaignDto body) {
        return schedule(campaignId, body, null);
    }

    /**
     * Zamanla
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/schedule}
     */
    public Campaign schedule(String campaignId, ScheduleCampaignDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/schedule");
        op.pathParam("campaignId", campaignId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<Campaign> TYPE_6 = new TypeReference<Campaign>() {};

    /**
     * Hemen gönder
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/send}
     */
    public Campaign send(String campaignId) {
        return send(campaignId, null);
    }

    /**
     * Hemen gönder
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/send}
     */
    public Campaign send(String campaignId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/send");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<Campaign> TYPE_7 = new TypeReference<Campaign>() {};

    /**
     * Duraklat
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/pause}
     */
    public Campaign pause(String campaignId) {
        return pause(campaignId, null);
    }

    /**
     * Duraklat
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/pause}
     */
    public Campaign pause(String campaignId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/pause");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<Campaign> TYPE_8 = new TypeReference<Campaign>() {};

    /**
     * Sürdür
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/resume}
     */
    public Campaign resume(String campaignId) {
        return resume(campaignId, null);
    }

    /**
     * Sürdür
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/resume}
     */
    public Campaign resume(String campaignId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/resume");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<Campaign> TYPE_9 = new TypeReference<Campaign>() {};

    /**
     * İptal
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/cancel}
     */
    public Campaign cancel(String campaignId) {
        return cancel(campaignId, null);
    }

    /**
     * İptal
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/cancel}
     */
    public Campaign cancel(String campaignId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/cancel");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<Campaign> TYPE_10 = new TypeReference<Campaign>() {};

    /**
     * Çoğalt
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/duplicate}
     */
    public Campaign duplicate(String campaignId) {
        return duplicate(campaignId, null);
    }

    /**
     * Çoğalt
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/duplicate}
     */
    public Campaign duplicate(String campaignId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/duplicate");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<Campaign> TYPE_11 = new TypeReference<Campaign>() {};

    /**
     * Onayla
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/approve}
     */
    public Campaign approve(String campaignId) {
        return approve(campaignId, null);
    }

    /**
     * Onayla
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/approve}
     */
    public Campaign approve(String campaignId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/approve");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_11);
    }

    private static final TypeReference<CampaignStats> TYPE_12 = new TypeReference<CampaignStats>() {};

    /**
     * İstatistikler
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/stats}
     */
    public CampaignStats stats(String campaignId) {
        return stats(campaignId, null);
    }

    /**
     * İstatistikler
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/stats}
     */
    public CampaignStats stats(String campaignId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/campaigns/{campaignId}/stats");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_12);
    }

    private static final TypeReference<CampaignVariantStats> TYPE_13 = new TypeReference<CampaignVariantStats>() {};

    /**
     * A/B varyant karşılaştırması
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/variants/stats}
     */
    public CampaignVariantStats variantStats(String campaignId) {
        return variantStats(campaignId, null);
    }

    /**
     * A/B varyant karşılaştırması
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/variants/stats}
     */
    public CampaignVariantStats variantStats(String campaignId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/campaigns/{campaignId}/variants/stats");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_13);
    }

    private static final TypeReference<Campaign> TYPE_14 = new TypeReference<Campaign>() {};

    /**
     * A/B kazananını seç
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/winner}
     */
    public Campaign selectWinner(String campaignId, SelectWinnerDto body) {
        return selectWinner(campaignId, body, null);
    }

    /**
     * A/B kazananını seç
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/winner}
     */
    public Campaign selectWinner(String campaignId, SelectWinnerDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/winner");
        op.pathParam("campaignId", campaignId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_14);
    }

    private static final TypeReference<DeliveryList> TYPE_15 = new TypeReference<DeliveryList>() {};

    /**
     * Abone bazlı teslimatlar
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/deliveries}
     */
    public DeliveryList deliveries(String campaignId) {
        return deliveries(campaignId, null, null);
    }

    /**
     * Abone bazlı teslimatlar
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/deliveries}
     */
    public DeliveryList deliveries(String campaignId, CampaignsDeliveriesParams params) {
        return deliveries(campaignId, params, null);
    }

    /**
     * Abone bazlı teslimatlar
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/deliveries}
     *
     * Parametreler: status — Değerler: "pending", "sent", "delivered", "failed", "bounced", "suppressed", "expired", "cancelled".
     */
    public DeliveryList deliveries(String campaignId, CampaignsDeliveriesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/campaigns/{campaignId}/deliveries");
        op.pathParam("campaignId", campaignId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_15);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Delivery> deliveriesAll(String campaignId) {
        return deliveriesAll(campaignId, null, null);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Delivery> deliveriesAll(String campaignId, CampaignsDeliveriesParams params) {
        return deliveriesAll(campaignId, params, null);
    }

    /**
     * deliveries sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Delivery> deliveriesAll(String campaignId, CampaignsDeliveriesParams params, RequestOptions options) {
        CampaignsDeliveriesParams base = params == null ? new CampaignsDeliveriesParams() : params.copy();
        return new PageIterable<>(cursor -> {
            CampaignsDeliveriesParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            DeliveryList page = deliveries(campaignId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Campaign> TYPE_16 = new TypeReference<Campaign>() {};

    /**
     * Başarısız teslimatlara yeniden gönder
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/resend-failed}
     */
    public Campaign resendFailed(String campaignId) {
        return resendFailed(campaignId, null);
    }

    /**
     * Başarısız teslimatlara yeniden gönder
     *
     * {@code POST /v1/apps/{appId}/campaigns/{campaignId}/resend-failed}
     */
    public Campaign resendFailed(String campaignId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/campaigns/{campaignId}/resend-failed");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_16);
    }

    private static final TypeReference<MessageList> TYPE_17 = new TypeReference<MessageList>() {};

    /**
     * Kampanya çalıştırmaları
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/messages}
     */
    public MessageList messages(String campaignId) {
        return messages(campaignId, null);
    }

    /**
     * Kampanya çalıştırmaları
     *
     * {@code GET /v1/apps/{appId}/campaigns/{campaignId}/messages}
     */
    public MessageList messages(String campaignId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/campaigns/{campaignId}/messages");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_17);
    }
}
