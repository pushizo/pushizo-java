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

    private static final TypeReference<InboxPage> TYPE_0 = new TypeReference<InboxPage>() {};

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
        return client.execute(op, options, TYPE_0);
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

    private static final TypeReference<InboxReadAllResult> TYPE_1 = new TypeReference<InboxReadAllResult>() {};

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
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<InboxItem> TYPE_2 = new TypeReference<InboxItem>() {};

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
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Ok> TYPE_3 = new TypeReference<Ok>() {};

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
        return client.execute(op, options, TYPE_3);
    }
}
