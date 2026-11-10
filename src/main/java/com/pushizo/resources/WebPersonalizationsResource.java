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
 * webPersonalizations kaynağı.
 */
public final class WebPersonalizationsResource {
    private final Pushizo client;

    public WebPersonalizationsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<WebPersonalizationPage> TYPE_0 = new TypeReference<WebPersonalizationPage>() {};

    /**
     * Web kişiselleştirme deneyimleri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations}
     */
    public WebPersonalizationPage list() {
        return list(null, null);
    }

    /**
     * Web kişiselleştirme deneyimleri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations}
     */
    public WebPersonalizationPage list(WebPersonalizationsListParams params) {
        return list(params, null);
    }

    /**
     * Web kişiselleştirme deneyimleri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations}
     *
     * Parametreler: status — Değerler: "draft", "active", "paused", "archived".
     */
    public WebPersonalizationPage list(WebPersonalizationsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/web-personalizations");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebPersonalization> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebPersonalization> listAll(WebPersonalizationsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WebPersonalization> listAll(WebPersonalizationsListParams params, RequestOptions options) {
        WebPersonalizationsListParams base = params == null ? new WebPersonalizationsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            WebPersonalizationsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            WebPersonalizationPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<WebPersonalization> TYPE_1 = new TypeReference<WebPersonalization>() {};

    /**
     * Kişiselleştirme deneyimi oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/web-personalizations}
     */
    public WebPersonalization create(CreateWebPersonalizationDto body) {
        return create(body, null);
    }

    /**
     * Kişiselleştirme deneyimi oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/web-personalizations}
     */
    public WebPersonalization create(CreateWebPersonalizationDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/web-personalizations");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<WebPersonalization> TYPE_2 = new TypeReference<WebPersonalization>() {};

    /**
     * Kişiselleştirme deneyimi detayı ve istatistikleri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations/{personalizationId}}
     */
    public WebPersonalization get(String personalizationId) {
        return get(personalizationId, null);
    }

    /**
     * Kişiselleştirme deneyimi detayı ve istatistikleri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations/{personalizationId}}
     */
    public WebPersonalization get(String personalizationId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/web-personalizations/{personalizationId}");
        op.pathParam("personalizationId", personalizationId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<WebPersonalization> TYPE_3 = new TypeReference<WebPersonalization>() {};

    /**
     * Kişiselleştirme deneyimini düzenle
     *
     * {@code PATCH /v1/apps/{appId}/web-personalizations/{personalizationId}}
     */
    public WebPersonalization update(String personalizationId, UpdateWebPersonalizationDto body) {
        return update(personalizationId, body, null);
    }

    /**
     * Kişiselleştirme deneyimini düzenle
     *
     * {@code PATCH /v1/apps/{appId}/web-personalizations/{personalizationId}}
     */
    public WebPersonalization update(String personalizationId, UpdateWebPersonalizationDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/web-personalizations/{personalizationId}");
        op.pathParam("personalizationId", personalizationId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<WebPersonalizationReport> TYPE_4 = new TypeReference<WebPersonalizationReport>() {};

    /**
     * Günlük seri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations/{personalizationId}/report}
     */
    public WebPersonalizationReport report(String personalizationId) {
        return report(personalizationId, null, null);
    }

    /**
     * Günlük seri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations/{personalizationId}/report}
     */
    public WebPersonalizationReport report(String personalizationId, WebPersonalizationsReportParams params) {
        return report(personalizationId, params, null);
    }

    /**
     * Günlük seri
     *
     * {@code GET /v1/apps/{appId}/web-personalizations/{personalizationId}/report}
     */
    public WebPersonalizationReport report(String personalizationId, WebPersonalizationsReportParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/web-personalizations/{personalizationId}/report");
        op.pathParam("personalizationId", personalizationId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<WebPersonalization> TYPE_5 = new TypeReference<WebPersonalization>() {};

    /**
     * Yayınla / duraklat / arşivle
     *
     * {@code POST /v1/apps/{appId}/web-personalizations/{personalizationId}/status}
     */
    public WebPersonalization status(String personalizationId, WebPersonalizationStatusDto body) {
        return status(personalizationId, body, null);
    }

    /**
     * Yayınla / duraklat / arşivle
     *
     * {@code POST /v1/apps/{appId}/web-personalizations/{personalizationId}/status}
     */
    public WebPersonalization status(String personalizationId, WebPersonalizationStatusDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/web-personalizations/{personalizationId}/status");
        op.pathParam("personalizationId", personalizationId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }
}
