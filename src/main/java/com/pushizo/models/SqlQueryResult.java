// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SqlQueryResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SqlQueryResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("run_id")
    private String runId;

    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<SqlQueryResultColumnsItem> columns;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<java.util.List<Object>> rows;

    /**
     * Zorunlu.
     */
    @JsonProperty("row_count")
    private Long rowCount;

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

    public String getRunId() {
        return runId;
    }

    public SqlQueryResult runId(String runId) {
        this.runId = runId;
        return this;
    }

    public java.util.List<SqlQueryResultColumnsItem> getColumns() {
        return columns;
    }

    public SqlQueryResult columns(java.util.List<SqlQueryResultColumnsItem> columns) {
        this.columns = columns;
        return this;
    }

    public java.util.List<java.util.List<Object>> getRows() {
        return rows;
    }

    public SqlQueryResult rows(java.util.List<java.util.List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public SqlQueryResult rowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public SqlQueryResult truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public SqlQueryResult durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
