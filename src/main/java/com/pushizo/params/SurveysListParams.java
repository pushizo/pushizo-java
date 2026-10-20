// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SurveysResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class SurveysListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "draft", "active", "closed".
     */
    private String status;

    public Long getLimit() {
        return limit;
    }

    public SurveysListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SurveysListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SurveysListParams status(String status) {
        this.status = status;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SurveysListParams copy() {
        SurveysListParams c = new SurveysListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.status = status;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("status", status);
    }
}
