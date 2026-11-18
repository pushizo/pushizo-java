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
 * sdkErrors kaynağı.
 */
public final class SdkErrorsResource {
    private final Pushizo client;

    public SdkErrorsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SdkErrorPage> TYPE_0 = new TypeReference<SdkErrorPage>() {};

    /**
     * SDK hata raporları (son 7 gün, cursor)
     *
     * {@code GET /v1/apps/{appId}/sdk-errors}
     */
    public SdkErrorPage list() {
        return list(null, null);
    }

    /**
     * SDK hata raporları (son 7 gün, cursor)
     *
     * {@code GET /v1/apps/{appId}/sdk-errors}
     */
    public SdkErrorPage list(SdkErrorsListParams params) {
        return list(params, null);
    }

    /**
     * SDK hata raporları (son 7 gün, cursor)
     *
     * {@code GET /v1/apps/{appId}/sdk-errors}
     *
     * Parametreler: level — Değerler: "error", "warning".
     */
    public SdkErrorPage list(SdkErrorsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/sdk-errors");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SdkErrorPageDataItem> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SdkErrorPageDataItem> listAll(SdkErrorsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SdkErrorPageDataItem> listAll(SdkErrorsListParams params, RequestOptions options) {
        SdkErrorsListParams base = params == null ? new SdkErrorsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SdkErrorsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SdkErrorPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }
}
