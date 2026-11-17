// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SqlResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class SqlRunsParams {
    private String segmentId;

    /**
     * Değerler: "ok", "rejected", "timeout", "failed".
     */
    private String status;

    private Long limit;

    private String cursor;

    public String getSegmentId() {
        return segmentId;
    }

    public SqlRunsParams segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SqlRunsParams status(String status) {
        this.status = status;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public SqlRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SqlRunsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SqlRunsParams copy() {
        SqlRunsParams c = new SqlRunsParams();
        c.segmentId = segmentId;
        c.status = status;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("segment_id", segmentId);
        op.query("status", status);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
