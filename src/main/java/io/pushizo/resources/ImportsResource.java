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
 * Veri içe aktarma işleri (CSV, multipart).
 */
public final class ImportsResource {
    private final Pushizo client;

    public ImportsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<Import> TYPE_0 = new TypeReference<Import>() {};

    /**
     * Import işi başlat (multipart: type, file)
     *
     * {@code POST /v1/apps/{appId}/imports}
     */
    public Import create(ImportsCreateForm form) {
        return create(form, null);
    }

    /**
     * Import işi başlat (multipart: type, file)
     *
     * {@code POST /v1/apps/{appId}/imports}
     */
    public Import create(ImportsCreateForm form, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/imports");
        if (form == null) {
            throw new IllegalArgumentException("Pushizo: form null olamaz.");
        }
        form.applyTo(op);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<ImportList> TYPE_1 = new TypeReference<ImportList>() {};

    /**
     * Import işleri
     *
     * {@code GET /v1/apps/{appId}/imports}
     */
    public ImportList list() {
        return list(null, null);
    }

    /**
     * Import işleri
     *
     * {@code GET /v1/apps/{appId}/imports}
     */
    public ImportList list(ImportsListParams params) {
        return list(params, null);
    }

    /**
     * Import işleri
     *
     * {@code GET /v1/apps/{appId}/imports}
     */
    public ImportList list(ImportsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/imports");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_1);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Import> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Import> listAll(ImportsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Import> listAll(ImportsListParams params, RequestOptions options) {
        ImportsListParams base = params == null ? new ImportsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            ImportsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            ImportList page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Import> TYPE_2 = new TypeReference<Import>() {};

    /**
     * Import durumu
     *
     * {@code GET /v1/apps/{appId}/imports/{importId}}
     */
    public Import get(String importId) {
        return get(importId, null);
    }

    /**
     * Import durumu
     *
     * {@code GET /v1/apps/{appId}/imports/{importId}}
     */
    public Import get(String importId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/imports/{importId}");
        op.pathParam("importId", importId);
        return client.execute(op, options, TYPE_2);
    }
}
