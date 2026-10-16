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
 * contentTables kaynağı.
 */
public final class ContentTablesResource {
    private final Pushizo client;

    public ContentTablesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<ContentTableList> TYPE_0 = new TypeReference<ContentTableList>() {};

    /**
     * İçerik tabloları
     *
     * {@code GET /v1/apps/{appId}/content-tables}
     */
    public ContentTableList listTables() {
        return listTables(null);
    }

    /**
     * İçerik tabloları
     *
     * {@code GET /v1/apps/{appId}/content-tables}
     */
    public ContentTableList listTables(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/content-tables");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<ContentTable> TYPE_1 = new TypeReference<ContentTable>() {};

    /**
     * CSV ile içerik tablosu oluştur
     *
     * {@code POST /v1/apps/{appId}/content-tables}
     *
     * Şablonda `{% lookup '&lt;ad&gt;' key: user.tags.&lt;etiket&gt; as satir %}{{ satir.&lt;sütun&gt; }}`.
     */
    public ContentTable createTableUpload(ContentTablesCreateTableUploadForm form) {
        return createTableUpload(form, null);
    }

    /**
     * CSV ile içerik tablosu oluştur
     *
     * {@code POST /v1/apps/{appId}/content-tables}
     *
     * Şablonda `{% lookup '&lt;ad&gt;' key: user.tags.&lt;etiket&gt; as satir %}{{ satir.&lt;sütun&gt; }}`.
     */
    public ContentTable createTableUpload(ContentTablesCreateTableUploadForm form, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/content-tables");
        if (form == null) {
            throw new IllegalArgumentException("Pushizo: form null olamaz.");
        }
        form.applyTo(op);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<ContentTable> TYPE_2 = new TypeReference<ContentTable>() {};

    /**
     * İçerik tablosu ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/content-tables/{tableId}}
     */
    public ContentTable getTable(String tableId) {
        return getTable(tableId, null);
    }

    /**
     * İçerik tablosu ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/content-tables/{tableId}}
     */
    public ContentTable getTable(String tableId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/content-tables/{tableId}");
        op.pathParam("tableId", tableId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<ContentTable> TYPE_3 = new TypeReference<ContentTable>() {};

    /**
     * İçerik tablosu açıklamasını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/content-tables/{tableId}}
     */
    public ContentTable updateTable(String tableId, UpdateContentTableDto body) {
        return updateTable(tableId, body, null);
    }

    /**
     * İçerik tablosu açıklamasını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/content-tables/{tableId}}
     */
    public ContentTable updateTable(String tableId, UpdateContentTableDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/content-tables/{tableId}");
        op.pathParam("tableId", tableId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * İçerik tablosunu sil
     *
     * {@code DELETE /v1/apps/{appId}/content-tables/{tableId}}
     */
    public Ok deleteTable(String tableId) {
        return deleteTable(tableId, null);
    }

    /**
     * İçerik tablosunu sil
     *
     * {@code DELETE /v1/apps/{appId}/content-tables/{tableId}}
     */
    public Ok deleteTable(String tableId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/content-tables/{tableId}");
        op.pathParam("tableId", tableId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<ContentTable> TYPE_5 = new TypeReference<ContentTable>() {};

    /**
     * İçerik tablosunu yeniden yükle (sürüm artar)
     *
     * {@code PUT /v1/apps/{appId}/content-tables/{tableId}/rows}
     */
    public ContentTable replaceTableUpload(String tableId, ContentTablesReplaceTableUploadForm form) {
        return replaceTableUpload(tableId, form, null);
    }

    /**
     * İçerik tablosunu yeniden yükle (sürüm artar)
     *
     * {@code PUT /v1/apps/{appId}/content-tables/{tableId}/rows}
     */
    public ContentTable replaceTableUpload(String tableId, ContentTablesReplaceTableUploadForm form, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/content-tables/{tableId}/rows");
        op.pathParam("tableId", tableId);
        if (form == null) {
            throw new IllegalArgumentException("Pushizo: form null olamaz.");
        }
        form.applyTo(op);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<ContentTableRows> TYPE_6 = new TypeReference<ContentTableRows>() {};

    /**
     * İçerik tablosu satırları
     *
     * {@code GET /v1/apps/{appId}/content-tables/{tableId}/rows}
     */
    public ContentTableRows tableRows(String tableId) {
        return tableRows(tableId, null, null);
    }

    /**
     * İçerik tablosu satırları
     *
     * {@code GET /v1/apps/{appId}/content-tables/{tableId}/rows}
     */
    public ContentTableRows tableRows(String tableId, ContentTablesTableRowsParams params) {
        return tableRows(tableId, params, null);
    }

    /**
     * İçerik tablosu satırları
     *
     * {@code GET /v1/apps/{appId}/content-tables/{tableId}/rows}
     */
    public ContentTableRows tableRows(String tableId, ContentTablesTableRowsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/content-tables/{tableId}/rows");
        op.pathParam("tableId", tableId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_6);
    }
}
