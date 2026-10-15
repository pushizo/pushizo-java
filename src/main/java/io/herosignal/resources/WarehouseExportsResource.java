// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.HeroSignal;
import io.herosignal.RequestOptions;
import io.herosignal.core.Operation;
import io.herosignal.core.PageIterable;
import io.herosignal.models.*;
import io.herosignal.params.*;

/**
 * warehouseExports kaynağı.
 */
public final class WarehouseExportsResource {
    private final HeroSignal client;

    public WarehouseExportsResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<WarehouseTables> TYPE_0 = new TypeReference<WarehouseTables>() {};

    /**
     * Dışa aktarılabilir tablolar, kolonlar ve şema sürümleri
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports/tables}
     */
    public WarehouseTables tables() {
        return tables(null);
    }

    /**
     * Dışa aktarılabilir tablolar, kolonlar ve şema sürümleri
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports/tables}
     */
    public WarehouseTables tables(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-exports/tables");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<WarehouseConnectionResult> TYPE_1 = new TypeReference<WarehouseConnectionResult>() {};

    /**
     * Kaydetmeden bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports/test-connection}
     */
    public WarehouseConnectionResult test(Object body) {
        return test(body, null);
    }

    /**
     * Kaydetmeden bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports/test-connection}
     */
    public WarehouseConnectionResult test(Object body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-exports/test-connection");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<WarehouseExportList> TYPE_2 = new TypeReference<WarehouseExportList>() {};

    /**
     * Veri ambarı dışa aktarımları
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports}
     */
    public WarehouseExportList list() {
        return list(null);
    }

    /**
     * Veri ambarı dışa aktarımları
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports}
     */
    public WarehouseExportList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-exports");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<WarehouseExport> TYPE_3 = new TypeReference<WarehouseExport>() {};

    /**
     * Dışa aktarım oluştur (kimlik bilgisi şifreli saklanır, yanıtta dönmez)
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports}
     */
    public WarehouseExport create(Object body) {
        return create(body, null);
    }

    /**
     * Dışa aktarım oluştur (kimlik bilgisi şifreli saklanır, yanıtta dönmez)
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports}
     */
    public WarehouseExport create(Object body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-exports");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<WarehouseExport> TYPE_4 = new TypeReference<WarehouseExport>() {};

    /**
     * Dışa aktarım detayı
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports/{exportId}}
     */
    public WarehouseExport get(String exportId) {
        return get(exportId, null);
    }

    /**
     * Dışa aktarım detayı
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports/{exportId}}
     */
    public WarehouseExport get(String exportId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-exports/{exportId}");
        op.pathParam("exportId", exportId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<WarehouseExport> TYPE_5 = new TypeReference<WarehouseExport>() {};

    /**
     * Dışa aktarımı güncelle (ad, tablolar, zamanlama, etkin/duraklat, hedef ayarı, kimlik bilgisi)
     *
     * {@code PATCH /v1/apps/{appId}/warehouse-exports/{exportId}}
     */
    public WarehouseExport update(String exportId, UpdateWarehouseExportDto body) {
        return update(exportId, body, null);
    }

    /**
     * Dışa aktarımı güncelle (ad, tablolar, zamanlama, etkin/duraklat, hedef ayarı, kimlik bilgisi)
     *
     * {@code PATCH /v1/apps/{appId}/warehouse-exports/{exportId}}
     */
    public WarehouseExport update(String exportId, UpdateWarehouseExportDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/warehouse-exports/{exportId}");
        op.pathParam("exportId", exportId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<Ok> TYPE_6 = new TypeReference<Ok>() {};

    /**
     * Dışa aktarımı sil (hedefteki veriler silinmez)
     *
     * {@code DELETE /v1/apps/{appId}/warehouse-exports/{exportId}}
     */
    public Ok delete(String exportId) {
        return delete(exportId, null);
    }

    /**
     * Dışa aktarımı sil (hedefteki veriler silinmez)
     *
     * {@code DELETE /v1/apps/{appId}/warehouse-exports/{exportId}}
     */
    public Ok delete(String exportId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/warehouse-exports/{exportId}");
        op.pathParam("exportId", exportId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<WarehouseConnectionResult> TYPE_7 = new TypeReference<WarehouseConnectionResult>() {};

    /**
     * Kayıtlı dışa aktarımın bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports/{exportId}/test}
     */
    public WarehouseConnectionResult testSaved(String exportId) {
        return testSaved(exportId, null);
    }

    /**
     * Kayıtlı dışa aktarımın bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports/{exportId}/test}
     */
    public WarehouseConnectionResult testSaved(String exportId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-exports/{exportId}/test");
        op.pathParam("exportId", exportId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<WarehouseExportRun> TYPE_8 = new TypeReference<WarehouseExportRun>() {};

    /**
     * Şimdi çalıştır (son başarılı imleçten itibaren)
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports/{exportId}/run}
     */
    public WarehouseExportRun run(String exportId) {
        return run(exportId, null);
    }

    /**
     * Şimdi çalıştır (son başarılı imleçten itibaren)
     *
     * {@code POST /v1/apps/{appId}/warehouse-exports/{exportId}/run}
     */
    public WarehouseExportRun run(String exportId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-exports/{exportId}/run");
        op.pathParam("exportId", exportId);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<WarehouseExportRunPage> TYPE_9 = new TypeReference<WarehouseExportRunPage>() {};

    /**
     * Çalıştırma geçmişi (cursor)
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports/{exportId}/runs}
     */
    public WarehouseExportRunPage runs(String exportId) {
        return runs(exportId, null, null);
    }

    /**
     * Çalıştırma geçmişi (cursor)
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports/{exportId}/runs}
     */
    public WarehouseExportRunPage runs(String exportId, WarehouseExportsRunsParams params) {
        return runs(exportId, params, null);
    }

    /**
     * Çalıştırma geçmişi (cursor)
     *
     * {@code GET /v1/apps/{appId}/warehouse-exports/{exportId}/runs}
     */
    public WarehouseExportRunPage runs(String exportId, WarehouseExportsRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-exports/{exportId}/runs");
        op.pathParam("exportId", exportId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_9);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WarehouseExportRun> runsAll(String exportId) {
        return runsAll(exportId, null, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WarehouseExportRun> runsAll(String exportId, WarehouseExportsRunsParams params) {
        return runsAll(exportId, params, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WarehouseExportRun> runsAll(String exportId, WarehouseExportsRunsParams params, RequestOptions options) {
        WarehouseExportsRunsParams base = params == null ? new WarehouseExportsRunsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            WarehouseExportsRunsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            WarehouseExportRunPage page = runs(exportId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }
}
