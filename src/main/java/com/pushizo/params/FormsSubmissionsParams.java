// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * FormsResource.submissions için isteğe bağlı sorgu parametreleri.
 */
public final class FormsSubmissionsParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "accepted", "pending_confirmation", "confirmed".
     */
    private String status;

    private String since;

    public Long getLimit() {
        return limit;
    }

    public FormsSubmissionsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public FormsSubmissionsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public FormsSubmissionsParams status(String status) {
        this.status = status;
        return this;
    }

    public String getSince() {
        return since;
    }

    public FormsSubmissionsParams since(String since) {
        this.since = since;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public FormsSubmissionsParams copy() {
        FormsSubmissionsParams c = new FormsSubmissionsParams();
        c.limit = limit;
        c.cursor = cursor;
        c.status = status;
        c.since = since;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("status", status);
        op.query("since", since);
    }
}
