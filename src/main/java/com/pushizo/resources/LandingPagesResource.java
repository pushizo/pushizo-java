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
     * Landing sayfası oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/landing-pages}
     */
    public LandingPage create(CreateLandingPageDto body) {
        return create(body, null);
    }

    /**
     * Landing sayfası oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/landing-pages}
     */
    public LandingPage create(CreateLandingPageDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/landing-pages");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<LandingPage> TYPE_2 = new TypeReference<LandingPage>() {};

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
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<LandingPage> TYPE_3 = new TypeReference<LandingPage>() {};

    /**
     * Taslağı düzenle (yayındaki sürüm değişmez)
     *
     * {@code PATCH /v1/apps/{appId}/landing-pages/{pageId}}
     */
    public LandingPage update(String pageId, UpdateLandingPageDto body) {
        return update(pageId, body, null);
    }

    /**
     * Taslağı düzenle (yayındaki sürüm değişmez)
     *
     * {@code PATCH /v1/apps/{appId}/landing-pages/{pageId}}
     */
    public LandingPage update(String pageId, UpdateLandingPageDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/landing-pages/{pageId}");
        op.pathParam("pageId", pageId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Landing sayfasını sil
     *
     * {@code DELETE /v1/apps/{appId}/landing-pages/{pageId}}
     */
    public Ok delete(String pageId) {
        return delete(pageId, null);
    }

    /**
     * Landing sayfasını sil
     *
     * {@code DELETE /v1/apps/{appId}/landing-pages/{pageId}}
     */
    public Ok delete(String pageId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/landing-pages/{pageId}");
        op.pathParam("pageId", pageId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<LandingPage> TYPE_5 = new TypeReference<LandingPage>() {};

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
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<LandingPage> TYPE_6 = new TypeReference<LandingPage>() {};

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
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<LandingPage> TYPE_7 = new TypeReference<LandingPage>() {};

    /**
     * Arşivle (yayından kalkar, kotadan düşer)
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/archive}
     */
    public LandingPage archive(String pageId) {
        return archive(pageId, null);
    }

    /**
     * Arşivle (yayından kalkar, kotadan düşer)
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/archive}
     */
    public LandingPage archive(String pageId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/landing-pages/{pageId}/archive");
        op.pathParam("pageId", pageId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<LandingPageVersions> TYPE_8 = new TypeReference<LandingPageVersions>() {};

    /**
     * Yayın sürümleri
     *
     * {@code GET /v1/apps/{appId}/landing-pages/{pageId}/versions}
     */
    public LandingPageVersions versions(String pageId) {
        return versions(pageId, null);
    }

    /**
     * Yayın sürümleri
     *
     * {@code GET /v1/apps/{appId}/landing-pages/{pageId}/versions}
     */
    public LandingPageVersions versions(String pageId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/landing-pages/{pageId}/versions");
        op.pathParam("pageId", pageId);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<LandingPage> TYPE_9 = new TypeReference<LandingPage>() {};

    /**
     * Sürümü taslağa geri yükle
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/versions/{version}/restore}
     */
    public LandingPage restore(String pageId, String version) {
        return restore(pageId, version, null);
    }

    /**
     * Sürümü taslağa geri yükle
     *
     * {@code POST /v1/apps/{appId}/landing-pages/{pageId}/versions/{version}/restore}
     */
    public LandingPage restore(String pageId, String version, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/landing-pages/{pageId}/versions/{version}/restore");
        op.pathParam("pageId", pageId);
        op.pathParam("version", version);
        return client.execute(op, options, TYPE_9);
    }
}
