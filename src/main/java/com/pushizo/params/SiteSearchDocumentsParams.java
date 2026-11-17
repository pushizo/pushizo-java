// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SiteSearchResource.documents için isteğe bağlı sorgu parametreleri.
 */
public final class SiteSearchDocumentsParams {
    private String sourceId;

    private String q;

    private Long limit;

    private String cursor;

    public String getSourceId() {
        return sourceId;
    }

    public SiteSearchDocumentsParams sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getQ() {
        return q;
    }

    public SiteSearchDocumentsParams q(String q) {
        this.q = q;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public SiteSearchDocumentsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SiteSearchDocumentsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SiteSearchDocumentsParams copy() {
        SiteSearchDocumentsParams c = new SiteSearchDocumentsParams();
        c.sourceId = sourceId;
        c.q = q;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("source_id", sourceId);
        op.query("q", q);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
