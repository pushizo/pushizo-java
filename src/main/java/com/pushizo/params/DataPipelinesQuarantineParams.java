// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * DataPipelinesResource.quarantine için isteğe bağlı sorgu parametreleri.
 */
public final class DataPipelinesQuarantineParams {
    /**
     * Değerler: "pending", "reprocessed", "discarded".
     */
    private String status;

    /**
     * Değerler: "event", "person".
     */
    private String target;

    private String sourceId;

    private String transformId;

    private Long limit;

    private String cursor;

    public String getStatus() {
        return status;
    }

    public DataPipelinesQuarantineParams status(String status) {
        this.status = status;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public DataPipelinesQuarantineParams target(String target) {
        this.target = target;
        return this;
    }

    public String getSourceId() {
        return sourceId;
    }

    public DataPipelinesQuarantineParams sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getTransformId() {
        return transformId;
    }

    public DataPipelinesQuarantineParams transformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public DataPipelinesQuarantineParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public DataPipelinesQuarantineParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public DataPipelinesQuarantineParams copy() {
        DataPipelinesQuarantineParams c = new DataPipelinesQuarantineParams();
        c.status = status;
        c.target = target;
        c.sourceId = sourceId;
        c.transformId = transformId;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("status", status);
        op.query("target", target);
        op.query("source_id", sourceId);
        op.query("transform_id", transformId);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
