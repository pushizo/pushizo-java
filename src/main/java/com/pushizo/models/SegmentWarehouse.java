// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentWarehouse şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentWarehouse {
    /**
     * Zorunlu.
     */
    @JsonProperty("connection_id")
    private String connectionId;

    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Zorunlu.
     */
    @JsonProperty("id_column")
    private String idColumn;

    /**
     * Zorunlu. Değerler: "external_id", "user_id".
     */
    @JsonProperty("id_type")
    private String idType;

    /**
     * Zorunlu.
     */
    @JsonProperty("limits")
    private SegmentWarehouseLimits limits;

    /**
     * Zorunlu.
     */
    @JsonProperty("refresh_interval_minutes")
    private Long refreshIntervalMinutes;

    /**
     * Zorunlu. Değerler: "queued", "failed", "ok", "never".
     */
    @JsonProperty("refresh_state")
    private String refreshState;

    /**
     * Zorunlu.
     */
    @JsonProperty("refresh_requested_at")
    private String refreshRequestedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("refreshed_at")
    private String refreshedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("member_count")
    private Long memberCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("bytes_processed")
    private Double bytesProcessed;

    public String getConnectionId() {
        return connectionId;
    }

    public SegmentWarehouse connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public SegmentWarehouse query(String query) {
        this.query = query;
        return this;
    }

    public String getIdColumn() {
        return idColumn;
    }

    public SegmentWarehouse idColumn(String idColumn) {
        this.idColumn = idColumn;
        return this;
    }

    public String getIdType() {
        return idType;
    }

    public SegmentWarehouse idType(String idType) {
        this.idType = idType;
        return this;
    }

    public SegmentWarehouseLimits getLimits() {
        return limits;
    }

    public SegmentWarehouse limits(SegmentWarehouseLimits limits) {
        this.limits = limits;
        return this;
    }

    public Long getRefreshIntervalMinutes() {
        return refreshIntervalMinutes;
    }

    public SegmentWarehouse refreshIntervalMinutes(Long refreshIntervalMinutes) {
        this.refreshIntervalMinutes = refreshIntervalMinutes;
        return this;
    }

    public String getRefreshState() {
        return refreshState;
    }

    public SegmentWarehouse refreshState(String refreshState) {
        this.refreshState = refreshState;
        return this;
    }

    public String getRefreshRequestedAt() {
        return refreshRequestedAt;
    }

    public SegmentWarehouse refreshRequestedAt(String refreshRequestedAt) {
        this.refreshRequestedAt = refreshRequestedAt;
        return this;
    }

    public String getRefreshedAt() {
        return refreshedAt;
    }

    public SegmentWarehouse refreshedAt(String refreshedAt) {
        this.refreshedAt = refreshedAt;
        return this;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public SegmentWarehouse memberCount(Long memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public SegmentWarehouse lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public Double getBytesProcessed() {
        return bytesProcessed;
    }

    public SegmentWarehouse bytesProcessed(Double bytesProcessed) {
        this.bytesProcessed = bytesProcessed;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
