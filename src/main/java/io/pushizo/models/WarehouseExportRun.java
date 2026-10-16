// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseExportRun şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseExportRun {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("export_id")
    private String exportId;

    /**
     * Zorunlu. Değerler: "schedule", "manual".
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Zorunlu. Değerler: "queued", "running", "succeeded", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("tables")
    private java.util.Map<String, WarehouseExportRunTablesValue> tables;

    /**
     * Zorunlu.
     */
    @JsonProperty("row_count")
    private Long rowCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("attempt")
    private Long attempt;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("started_at")
    private String startedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("finished_at")
    private String finishedAt;

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

    public WarehouseExportRun id(String id) {
        this.id = id;
        return this;
    }

    public String getExportId() {
        return exportId;
    }

    public WarehouseExportRun exportId(String exportId) {
        this.exportId = exportId;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public WarehouseExportRun trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WarehouseExportRun status(String status) {
        this.status = status;
        return this;
    }

    public java.util.Map<String, WarehouseExportRunTablesValue> getTables() {
        return tables;
    }

    public WarehouseExportRun tables(java.util.Map<String, WarehouseExportRunTablesValue> tables) {
        this.tables = tables;
        return this;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public WarehouseExportRun rowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    public Long getAttempt() {
        return attempt;
    }

    public WarehouseExportRun attempt(Long attempt) {
        this.attempt = attempt;
        return this;
    }

    public String getError() {
        return error;
    }

    public WarehouseExportRun error(String error) {
        this.error = error;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public WarehouseExportRun startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public WarehouseExportRun finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public WarehouseExportRun durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WarehouseExportRun createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
