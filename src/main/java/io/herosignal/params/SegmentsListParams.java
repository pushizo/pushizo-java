// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * SegmentsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class SegmentsListParams {
    private Long limit;

    private String cursor;

    private String q;

    public Long getLimit() {
        return limit;
    }

    public SegmentsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SegmentsListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getQ() {
        return q;
    }

    public SegmentsListParams q(String q) {
        this.q = q;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SegmentsListParams copy() {
        SegmentsListParams c = new SegmentsListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.q = q;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("q", q);
    }
}
