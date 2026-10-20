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
 * landingPages kaynağı.
 */
public final class LandingPagesResource {
    private final Pushizo client;

    public LandingPagesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<LandingPageList> TYPE_0 = new TypeReference<LandingPageList>() {};

    /**
     * Landing sayfaları
     *
     * {@code GET /v1/apps/{appId}/landing-pages}
     */
    public LandingPageList list() {
        return list(null, null);
    }

    /**
     * Landing sayfaları
     *
     * {@code GET /v1/apps/{appId}/landing-pages}
     */
    public LandingPageList list(LandingPagesListParams params) {
        return list(params, null);
    }

    /**
     * Landing sayfaları
     *
     * {@code GET /v1/apps/{appId}/landing-pages}
     *
     * Parametreler: status — Değerler: "draft", "published", "archived".
     */
    public LandingPageList list(LandingPagesListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/landing-pages");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<LandingPageListDataItem> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<LandingPageListDataItem> listAll(LandingPagesListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<LandingPageListDataItem> listAll(LandingPagesListParams params, RequestOptions options) {
        LandingPagesListParams base = params == null ? new LandingPagesListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            LandingPagesListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            LandingPageList page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<LandingPage> TYPE_1 = new TypeReference<LandingPage>() {};

    /**
     * Landing sayfası detayı
     *
     * {@code GET /v1/apps/{appId}/landing-pages/{pageId}}
     */
    public LandingPage get(String pageId) {
        return get(pageId, null);
    }

    /**
     * Landing sayfası detayı
     *
     * {@code GET /v1/apps/{appId}/landing-pages/{pageId}}
     */
    public LandingPage get(String pageId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/landing-pages/{pageId}");
        op.pathParam("pageId", pageId);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<LandingPage> TYPE_2 = new TypeReference<LandingPage>() {};

    /**
     * Taslağı yayınla
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/publish}
     */
    public LandingPage publish(String pageId) {
        return publish(pageId, null);
    }

    /**
     * Taslağı yayınla
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/publish}
     */
    public LandingPage publish(String pageId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/landing-pages/{pageId}/publish");
        op.pathParam("pageId", pageId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<LandingPage> TYPE_3 = new TypeReference<LandingPage>() {};

    /**
     * Yayından kaldır
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/unpublish}
     */
    public LandingPage unpublish(String pageId) {
        return unpublish(pageId, null);
    }

    /**
     * Yayından kaldır
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/unpublish}
     */
    public LandingPage unpublish(String pageId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/landing-pages/{pageId}/unpublish");
        op.pathParam("pageId", pageId);
        return client.execute(op, options, TYPE_3);
    }
}
