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
 * Kullanıcı bildirim kutusu (inbox): listeleme, okundu işaretleme ve arşivleme.
 */
public final class InboxResource {
    private final Pushizo client;

    public InboxResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<InboxTeamList> TYPE_0 = new TypeReference<InboxTeamList>() {};

    /**
     * Takımlar
     *
     * {@code GET /v1/apps/{appId}/inbox/teams}
     */
    public InboxTeamList teams() {
        return teams(null);
    }

    /**
     * Takımlar
     *
     * {@code GET /v1/apps/{appId}/inbox/teams}
     */
    public InboxTeamList teams(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/inbox/teams");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<InboxAgentList> TYPE_1 = new TypeReference<InboxAgentList>() {};

    /**
     * Temsilciler ve varlık durumu
     *
     * {@code GET /v1/apps/{appId}/inbox/agents}
     */
    public InboxAgentList agents() {
        return agents(null);
    }

    /**
     * Temsilciler ve varlık durumu
     *
     * {@code GET /v1/apps/{appId}/inbox/agents}
     */
    public InboxAgentList agents(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/inbox/agents");
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<InboxSettings> TYPE_2 = new TypeReference<InboxSettings>() {};

    /**
     * Gelen kutusu ayarları
     *
     * {@code GET /v1/apps/{appId}/inbox/settings}
     */
    public InboxSettings settings() {
        return settings(null);
    }

    /**
     * Gelen kutusu ayarları
     *
     * {@code GET /v1/apps/{appId}/inbox/settings}
     */
    public InboxSettings settings(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/inbox/settings");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<InboxSettings> TYPE_3 = new TypeReference<InboxSettings>() {};

    /**
     * Gelen kutusu ayarlarını güncelle
     *
     * {@code PUT /v1/apps/{appId}/inbox/settings}
     */
    public InboxSettings updateSettings(InboxSettingsUpdateDto body) {
        return updateSettings(body, null);
    }

    /**
     * Gelen kutusu ayarlarını güncelle
     *
     * {@code PUT /v1/apps/{appId}/inbox/settings}
     */
    public InboxSettings updateSettings(InboxSettingsUpdateDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/inbox/settings");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<InboxMetrics> TYPE_4 = new TypeReference<InboxMetrics>() {};

    /**
     * Gelen kutusu metrikleri (ilk yanıt/çözüm ort. ve p90, SLA, temsilci tablosu)
     *
     * {@code GET /v1/apps/{appId}/inbox/metrics}
     */
    public InboxMetrics metrics() {
        return metrics(null, null);
    }

    /**
     * Gelen kutusu metrikleri (ilk yanıt/çözüm ort. ve p90, SLA, temsilci tablosu)
     *
     * {@code GET /v1/apps/{appId}/inbox/metrics}
     */
    public InboxMetrics metrics(InboxMetricsParams params) {
        return metrics(params, null);
    }

    /**
     * Gelen kutusu metrikleri (ilk yanıt/çözüm ort. ve p90, SLA, temsilci tablosu)
     *
     * {@code GET /v1/apps/{appId}/inbox/metrics}
     *
     * Parametreler: channel — Değerler: "sms", "whatsapp", "rcs", "telegram", "viber", "email", "chat".
     */
    public InboxMetrics metrics(InboxMetricsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/inbox/metrics");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<InboxPage> TYPE_5 = new TypeReference<InboxPage>() {};

    /**
     * Kullanıcının bildirim kutusu (okunmamış sayısı dahil)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/inbox}
     */
    public InboxPage list(String label, String value) {
        return list(label, value, null, null);
    }

    /**
     * Kullanıcının bildirim kutusu (okunmamış sayısı dahil)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/inbox}
     */
    public InboxPage list(String label, String value, InboxListParams params) {
        return list(label, value, params, null);
    }

    /**
     * Kullanıcının bildirim kutusu (okunmamış sayısı dahil)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/inbox}
     *
     * Parametreler: include_archived — Değerler: "true", "false".
     */
    public InboxPage list(String label, String value, InboxListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/users/by/{label}/{value}/inbox");
        op.pathParam("label", label);
        op.pathParam("value", value);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<InboxItem> listAll(String label, String value) {
        return listAll(label, value, null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<InboxItem> listAll(String label, String value, InboxListParams params) {
        return listAll(label, value, params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<InboxItem> listAll(String label, String value, InboxListParams params, RequestOptions options) {
        InboxListParams base = params == null ? new InboxListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            InboxListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            InboxPage page = list(label, value, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<InboxReadAllResult> TYPE_6 = new TypeReference<InboxReadAllResult>() {};

    /**
     * Tümünü okundu işaretle
     *
     * {@code POST /v1/apps/{appId}/users/by/{label}/{value}/inbox/read-all}
     */
    public InboxReadAllResult readAll(String label, String value) {
        return readAll(label, value, null);
    }

    /**
     * Tümünü okundu işaretle
     *
     * {@code POST /v1/apps/{appId}/users/by/{label}/{value}/inbox/read-all}
     */
    public InboxReadAllResult readAll(String label, String value, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/users/by/{label}/{value}/inbox/read-all");
        op.pathParam("label", label);
        op.pathParam("value", value);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<InboxItem> TYPE_7 = new TypeReference<InboxItem>() {};

    /**
     * Okundu işaretle
     *
     * {@code POST /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}/read}
     */
    public InboxItem read(String label, String value, String itemId) {
        return read(label, value, itemId, null);
    }

    /**
     * Okundu işaretle
     *
     * {@code POST /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}/read}
     */
    public InboxItem read(String label, String value, String itemId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}/read");
        op.pathParam("label", label);
        op.pathParam("value", value);
        op.pathParam("itemId", itemId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<Ok> TYPE_8 = new TypeReference<Ok>() {};

    /**
     * Kutudan kaldır (arşivle)
     *
     * {@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}}
     */
    public Ok archive(String label, String value, String itemId) {
        return archive(label, value, itemId, null);
    }

    /**
     * Kutudan kaldır (arşivle)
     *
     * {@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}}
     */
    public Ok archive(String label, String value, String itemId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}");
        op.pathParam("label", label);
        op.pathParam("value", value);
        op.pathParam("itemId", itemId);
        return client.execute(op, options, TYPE_8);
    }
}
