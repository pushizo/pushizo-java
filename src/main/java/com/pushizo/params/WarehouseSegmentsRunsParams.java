// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * WarehouseSegmentsResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class WarehouseSegmentsRunsParams {
    private String segmentId;

    private String connectionId;

    /**
     * Değerler: "ok", "rejected", "timeout", "failed".
     */
    private String status;

    private Long limit;

    private String cursor;

    public String getSegmentId() {
        return segmentId;
    }

    public WarehouseSegmentsRunsParams segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public WarehouseSegmentsRunsParams connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WarehouseSegmentsRunsParams status(String status) {
        this.status = status;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public WarehouseSegmentsRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public WarehouseSegmentsRunsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public WarehouseSegmentsRunsParams copy() {
        WarehouseSegmentsRunsParams c = new WarehouseSegmentsRunsParams();
        c.segmentId = segmentId;
        c.connectionId = connectionId;
        c.status = status;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("segment_id", segmentId);
        op.query("connection_id", connectionId);
        op.query("status", status);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
