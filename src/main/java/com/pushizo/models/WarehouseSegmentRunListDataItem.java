// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseSegmentRunListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseSegmentRunListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_id")
    private String segmentId;

    /**
     * Zorunlu.
     */
    @JsonProperty("connection_id")
    private String connectionId;

    /**
     * Zorunlu. Değerler: "bigquery", "snowflake", "databricks".
     */
    @JsonProperty("warehouse_type")
    private String warehouseType;

    /**
     * Zorunlu. Değerler: "panel", "api", "schedule".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("actor_id")
    private String actorId;

    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Zorunlu.
     */
    @JsonProperty("query_hash")
    private String queryHash;

    /**
     * Zorunlu. Değerler: "ok", "rejected", "timeout", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu. Değerler: "empty", "too_long", "syntax", "multiple_statements", "not_select", "forbidden_relation", "forbidden_function", "forbidden_construct", "forbidden_type".
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("row_count")
    private Long rowCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("matched_count")
    private Long matchedCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("bytes_processed")
    private Double bytesProcessed;

    /**
     * Zorunlu.
     */
    @JsonProperty("truncated")
    private Boolean truncated;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public WarehouseSegmentRunListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public WarehouseSegmentRunListDataItem segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public WarehouseSegmentRunListDataItem connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public WarehouseSegmentRunListDataItem warehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
        return this;
    }

    public String getSource() {
        return source;
    }

    public WarehouseSegmentRunListDataItem source(String source) {
        this.source = source;
        return this;
    }

    public String getActorId() {
        return actorId;
    }

    public WarehouseSegmentRunListDataItem actorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public WarehouseSegmentRunListDataItem query(String query) {
        this.query = query;
        return this;
    }

    public String getQueryHash() {
        return queryHash;
    }

    public WarehouseSegmentRunListDataItem queryHash(String queryHash) {
        this.queryHash = queryHash;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WarehouseSegmentRunListDataItem status(String status) {
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public WarehouseSegmentRunListDataItem reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getError() {
        return error;
    }

    public WarehouseSegmentRunListDataItem error(String error) {
        this.error = error;
        return this;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public WarehouseSegmentRunListDataItem rowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    public Long getMatchedCount() {
        return matchedCount;
    }

    public WarehouseSegmentRunListDataItem matchedCount(Long matchedCount) {
        this.matchedCount = matchedCount;
        return this;
    }

    public Double getBytesProcessed() {
        return bytesProcessed;
    }

    public WarehouseSegmentRunListDataItem bytesProcessed(Double bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public WarehouseSegmentRunListDataItem truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public WarehouseSegmentRunListDataItem durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WarehouseSegmentRunListDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
