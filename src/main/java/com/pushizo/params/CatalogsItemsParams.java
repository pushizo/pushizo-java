// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CatalogsResource.items için isteğe bağlı sorgu parametreleri.
 */
public final class CatalogsItemsParams {
    private Long limit;

    private Long offset;

    private String q;

    private String category;

    public Long getLimit() {
        return limit;
    }

    public CatalogsItemsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getOffset() {
        return offset;
    }

    public CatalogsItemsParams offset(Long offset) {
        this.offset = offset;
        return this;
    }

    public String getQ() {
        return q;
    }

    public CatalogsItemsParams q(String q) {
        this.q = q;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CatalogsItemsParams category(String category) {
        this.category = category;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CatalogsItemsParams copy() {
        CatalogsItemsParams c = new CatalogsItemsParams();
        c.limit = limit;
        c.offset = offset;
        c.q = q;
        c.category = category;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("offset", offset);
        op.query("q", q);
        op.query("category", category);
    }
}
