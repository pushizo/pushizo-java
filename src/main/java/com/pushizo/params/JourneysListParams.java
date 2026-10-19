// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * JourneysResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class JourneysListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "draft", "active", "paused", "archived".
     */
    private String status;

    private String q;

    public Long getLimit() {
        return limit;
    }

    public JourneysListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public JourneysListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public JourneysListParams status(String status) {
        this.status = status;
        return this;
    }

    public String getQ() {
        return q;
    }

    public JourneysListParams q(String q) {
        this.q = q;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public JourneysListParams copy() {
        JourneysListParams c = new JourneysListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.status = status;
        c.q = q;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("status", status);
        op.query("q", q);
    }
}
