// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * ContentTablesResource.tableRows için isteğe bağlı sorgu parametreleri.
 */
public final class ContentTablesTableRowsParams {
    private Long limit;

    private Long offset;

    private String q;

    public Long getLimit() {
        return limit;
    }

    public ContentTablesTableRowsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getOffset() {
        return offset;
    }

    public ContentTablesTableRowsParams offset(Long offset) {
        this.offset = offset;
        return this;
    }

    public String getQ() {
        return q;
    }

    public ContentTablesTableRowsParams q(String q) {
        this.q = q;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ContentTablesTableRowsParams copy() {
        ContentTablesTableRowsParams c = new ContentTablesTableRowsParams();
        c.limit = limit;
        c.offset = offset;
        c.q = q;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("offset", offset);
        op.query("q", q);
    }
}
