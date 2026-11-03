// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * RfmResource.users için isteğe bağlı sorgu parametreleri.
 */
public final class RfmUsersParams {
    /**
     * Değerler: "champions", "loyal", "potential", "new", "promising", "need_attention", "about_to_sleep", "at_risk", "cant_lose", "hibernating", "lost".
     */
    private String segment;

    private Long limit;

    private String cursor;

    public String getSegment() {
        return segment;
    }

    public RfmUsersParams segment(String segment) {
        this.segment = segment;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public RfmUsersParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public RfmUsersParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public RfmUsersParams copy() {
        RfmUsersParams c = new RfmUsersParams();
        c.segment = segment;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("segment", segment);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
