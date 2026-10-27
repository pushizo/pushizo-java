// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * ReverseEtlResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class ReverseEtlRunsParams {
    private Long limit;

    private String cursor;

    public Long getLimit() {
        return limit;
    }

    public ReverseEtlRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public ReverseEtlRunsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ReverseEtlRunsParams copy() {
        ReverseEtlRunsParams c = new ReverseEtlRunsParams();
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
