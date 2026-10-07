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
 * Veri dışa aktarma işleri.
 */
public final class ExportsResource {
    private final HeroSignal client;

    public ExportsResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<Export> TYPE_0 = new TypeReference<Export>() {};

    /**
     * Export işi başlat
     *
     * {@code POST /v1/apps/{appId}/exports}
     */
    public Export create(CreateExportDto body) {
        return create(body, null);
    }

    /**
     * Export işi başlat
     *
     * {@code POST /v1/apps/{appId}/exports}
     */
    public Export create(CreateExportDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/exports");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<ExportList> TYPE_1 = new TypeReference<ExportList>() {};

    /**
     * Export işleri
     *
     * {@code GET /v1/apps/{appId}/exports}
     */
    public ExportList list() {
        return list(null, null);
    }

    /**
     * Export işleri
     *
     * {@code GET /v1/apps/{appId}/exports}
     */
    public ExportList list(ExportsListParams params) {
        return list(params, null);
    }

    /**
     * Export işleri
     *
     * {@code GET /v1/apps/{appId}/exports}
     */
    public ExportList list(ExportsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/exports");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_1);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Export> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Export> listAll(ExportsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Export> listAll(ExportsListParams params, RequestOptions options) {
        ExportsListParams base = params == null ? new ExportsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            ExportsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            ExportList page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Export> TYPE_2 = new TypeReference<Export>() {};

    /**
     * Export durumu (download_url)
     *
     * {@code GET /v1/apps/{appId}/exports/{exportId}}
     */
    public Export get(String exportId) {
        return get(exportId, null);
    }

    /**
     * Export durumu (download_url)
     *
     * {@code GET /v1/apps/{appId}/exports/{exportId}}
     */
    public Export get(String exportId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/exports/{exportId}");
        op.pathParam("exportId", exportId);
        return client.execute(op, options, TYPE_2);
    }
}
