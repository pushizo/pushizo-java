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
 * webCampaigns kaynağı.
 */
public final class WebCampaignsResource {
    private final Pushizo client;

    public WebCampaignsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<WebCampaignPage> TYPE_0 = new TypeReference<WebCampaignPage>() {};

    /**
     * Web kampanyaları
     *
     * {@code GET /v1/apps/{appId}/web-campaigns}
     */
    public WebCampaignPage list() {
        return list(null, null);
    }

    /**
     * Web kampanyaları
     *
     * {@code GET /v1/apps/{appId}/web-campaigns}
     */
    public WebCampaignPage list(WebCampaignsListParams params) {
        return list(params, null);
    }

    /**
     * Web kampanyaları
     *
     * {@code GET /v1/apps/{appId}/web-campaigns}
     *
     * Parametreler: status — Değerler: "draft", "active", "paused", "archived".
     */
    public WebCampaignPage list(WebCampaignsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/web-campaigns");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebCampaign> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebCampaign> listAll(WebCampaignsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebCampaign> listAll(WebCampaignsListParams params, RequestOptions options) {
        WebCampaignsListParams base = params == null ? new WebCampaignsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            WebCampaignsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            WebCampaignPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<WebCampaign> TYPE_1 = new TypeReference<WebCampaign>() {};

    /**
     * Web kampanyası oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/web-campaigns}
     */
    public WebCampaign create(CreateWebCampaignDto body) {
        return create(body, null);
    }

    /**
     * Web kampanyası oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/web-campaigns}
     */
    public WebCampaign create(CreateWebCampaignDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/web-campaigns");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<WebCampaign> TYPE_2 = new TypeReference<WebCampaign>() {};

    /**
     * Web kampanyası detayı ve istatistikleri
     *
     * {@code GET /v1/apps/{appId}/web-campaigns/{campaignId}}
     */
    public WebCampaign get(String campaignId) {
        return get(campaignId, null);
    }

    /**
     * Web kampanyası detayı ve istatistikleri
     *
     * {@code GET /v1/apps/{appId}/web-campaigns/{campaignId}}
     */
    public WebCampaign get(String campaignId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/web-campaigns/{campaignId}");
        op.pathParam("campaignId", campaignId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<WebCampaign> TYPE_3 = new TypeReference<WebCampaign>() {};

    /**
     * Web kampanyasını düzenle
     *
     * {@code PATCH /v1/apps/{appId}/web-campaigns/{campaignId}}
     */
    public WebCampaign update(String campaignId, UpdateWebCampaignDto body) {
        return update(campaignId, body, null);
    }

    /**
     * Web kampanyasını düzenle
     *
     * {@code PATCH /v1/apps/{appId}/web-campaigns/{campaignId}}
     */
    public WebCampaign update(String campaignId, UpdateWebCampaignDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/web-campaigns/{campaignId}");
        op.pathParam("campaignId", campaignId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<WebCampaignReport> TYPE_4 = new TypeReference<WebCampaignReport>() {};

    /**
     * Günlük seri
     *
     * {@code GET /v1/apps/{appId}/web-campaigns/{campaignId}/report}
     */
    public WebCampaignReport report(String campaignId) {
        return report(campaignId, null, null);
    }

    /**
     * Günlük seri
     *
     * {@code GET /v1/apps/{appId}/web-campaigns/{campaignId}/report}
     */
    public WebCampaignReport report(String campaignId, WebCampaignsReportParams params) {
        return report(campaignId, params, null);
    }

    /**
     * Günlük seri
     *
     * {@code GET /v1/apps/{appId}/web-campaigns/{campaignId}/report}
     */
    public WebCampaignReport report(String campaignId, WebCampaignsReportParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/web-campaigns/{campaignId}/report");
        op.pathParam("campaignId", campaignId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<WebCampaign> TYPE_5 = new TypeReference<WebCampaign>() {};

    /**
     * Yayınla / duraklat / arşivle
     *
     * {@code POST /v1/apps/{appId}/web-campaigns/{campaignId}/status}
     */
    public WebCampaign status(String campaignId, WebCampaignStatusDto body) {
        return status(campaignId, body, null);
    }

    /**
     * Yayınla / duraklat / arşivle
     *
     * {@code POST /v1/apps/{appId}/web-campaigns/{campaignId}/status}
     */
    public WebCampaign status(String campaignId, WebCampaignStatusDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/web-campaigns/{campaignId}/status");
        op.pathParam("campaignId", campaignId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }
}
