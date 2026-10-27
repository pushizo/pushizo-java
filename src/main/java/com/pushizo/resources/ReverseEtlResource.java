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
 * reverseEtl kaynağı.
 */
public final class ReverseEtlResource {
    private final Pushizo client;

    public ReverseEtlResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<ReverseEtlSyncList> TYPE_0 = new TypeReference<ReverseEtlSyncList>() {};

    /**
     * Depodan içeri aktarımlar
     *
     * {@code GET /v1/apps/{appId}/reverse-etl}
     */
    public ReverseEtlSyncList list() {
        return list(null);
    }

    /**
     * Depodan içeri aktarımlar
     *
     * {@code GET /v1/apps/{appId}/reverse-etl}
     */
    public ReverseEtlSyncList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/reverse-etl");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<ReverseEtlSync> TYPE_1 = new TypeReference<ReverseEtlSync>() {};

    /**
     * İçeri aktarım oluştur
     *
     * {@code POST /v1/apps/{appId}/reverse-etl}
     */
    public ReverseEtlSync create(Object body) {
        return create(body, null);
    }

    /**
     * İçeri aktarım oluştur
     *
     * {@code POST /v1/apps/{appId}/reverse-etl}
     */
    public ReverseEtlSync create(Object body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/reverse-etl");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<WarehouseConnectionResult> TYPE_2 = new TypeReference<WarehouseConnectionResult>() {};

    /**
     * Kaydetmeden bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/reverse-etl/test-connection}
     */
    public WarehouseConnectionResult test(Object body) {
        return test(body, null);
    }

    /**
     * Kaydetmeden bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/reverse-etl/test-connection}
     */
    public WarehouseConnectionResult test(Object body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/reverse-etl/test-connection");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<ReverseEtlSync> TYPE_3 = new TypeReference<ReverseEtlSync>() {};

    /**
     * İçeri aktarım detayı
     *
     * {@code GET /v1/apps/{appId}/reverse-etl/{syncId}}
     */
    public ReverseEtlSync get(String syncId) {
        return get(syncId, null);
    }

    /**
     * İçeri aktarım detayı
     *
     * {@code GET /v1/apps/{appId}/reverse-etl/{syncId}}
     */
    public ReverseEtlSync get(String syncId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/reverse-etl/{syncId}");
        op.pathParam("syncId", syncId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<ReverseEtlSync> TYPE_4 = new TypeReference<ReverseEtlSync>() {};

    /**
     * İçeri aktarımı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/reverse-etl/{syncId}}
     */
    public ReverseEtlSync update(String syncId, UpdateReverseEtlDto body) {
        return update(syncId, body, null);
    }

    /**
     * İçeri aktarımı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/reverse-etl/{syncId}}
     */
    public ReverseEtlSync update(String syncId, UpdateReverseEtlDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/reverse-etl/{syncId}");
        op.pathParam("syncId", syncId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * İçeri aktarımı sil
     *
     * {@code DELETE /v1/apps/{appId}/reverse-etl/{syncId}}
     */
    public Ok delete(String syncId) {
        return delete(syncId, null);
    }

    /**
     * İçeri aktarımı sil
     *
     * {@code DELETE /v1/apps/{appId}/reverse-etl/{syncId}}
     */
    public Ok delete(String syncId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/reverse-etl/{syncId}");
        op.pathParam("syncId", syncId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<WarehouseConnectionResult> TYPE_6 = new TypeReference<WarehouseConnectionResult>() {};

    /**
     * Kayıtlı içeri aktarımın bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/reverse-etl/{syncId}/test}
     */
    public WarehouseConnectionResult testSaved(String syncId) {
        return testSaved(syncId, null);
    }

    /**
     * Kayıtlı içeri aktarımın bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/reverse-etl/{syncId}/test}
     */
    public WarehouseConnectionResult testSaved(String syncId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/reverse-etl/{syncId}/test");
        op.pathParam("syncId", syncId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<ReverseEtlRun> TYPE_7 = new TypeReference<ReverseEtlRun>() {};

    /**
     * Şimdi içeri aktar
     *
     * {@code POST /v1/apps/{appId}/reverse-etl/{syncId}/run}
     */
    public ReverseEtlRun run(String syncId) {
        return run(syncId, null);
    }

    /**
     * Şimdi içeri aktar
     *
     * {@code POST /v1/apps/{appId}/reverse-etl/{syncId}/run}
     */
    public ReverseEtlRun run(String syncId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/reverse-etl/{syncId}/run");
        op.pathParam("syncId", syncId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<ReverseEtlRunPage> TYPE_8 = new TypeReference<ReverseEtlRunPage>() {};

    /**
     * İçeri aktarım geçmişi
     *
     * {@code GET /v1/apps/{appId}/reverse-etl/{syncId}/runs}
     */
    public ReverseEtlRunPage runs(String syncId) {
        return runs(syncId, null, null);
    }

    /**
     * İçeri aktarım geçmişi
     *
     * {@code GET /v1/apps/{appId}/reverse-etl/{syncId}/runs}
     */
    public ReverseEtlRunPage runs(String syncId, ReverseEtlRunsParams params) {
        return runs(syncId, params, null);
    }

    /**
     * İçeri aktarım geçmişi
     *
     * {@code GET /v1/apps/{appId}/reverse-etl/{syncId}/runs}
     */
    public ReverseEtlRunPage runs(String syncId, ReverseEtlRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/reverse-etl/{syncId}/runs");
        op.pathParam("syncId", syncId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_8);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<ReverseEtlRun> runsAll(String syncId) {
        return runsAll(syncId, null, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<ReverseEtlRun> runsAll(String syncId, ReverseEtlRunsParams params) {
        return runsAll(syncId, params, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<ReverseEtlRun> runsAll(String syncId, ReverseEtlRunsParams params, RequestOptions options) {
        ReverseEtlRunsParams base = params == null ? new ReverseEtlRunsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            ReverseEtlRunsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            ReverseEtlRunPage page = runs(syncId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }
}
