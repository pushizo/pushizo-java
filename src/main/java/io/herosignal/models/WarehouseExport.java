// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseExport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseExport {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "bigquery", "snowflake", "s3_parquet".
     */
    @JsonProperty("destination")
    private String destination;

    /**
     * Zorunlu.
     */
    @JsonProperty("config")
    private java.util.Map<String, Object> config;

    /**
     * Zorunlu.
     */
    @JsonProperty("credentials_hint")
    private String credentialsHint;

    /**
     * Zorunlu. Değerler: "deliveries", "delivery_events", "events", "conversions", "users", "subscriptions".
     */
    @JsonProperty("tables")
    private java.util.List<String> tables;

    /**
     * Zorunlu. Değerler: "hourly", "daily".
     */
    @JsonProperty("schedule")
    private String schedule;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "active", "paused", "failing".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("consecutive_failures")
    private Long consecutiveFailures;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("cursors")
    private java.util.Map<String, WarehouseExportCursorsValue> cursors;

    /**
     * Zorunlu.
     */
    @JsonProperty("schema_versions")
    private java.util.Map<String, Long> schemaVersions;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_run_at")
    private String lastRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_success_at")
    private String lastSuccessAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_run_at")
    private String nextRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public WarehouseExport id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public WarehouseExport appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public WarehouseExport name(String name) {
        this.name = name;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public WarehouseExport destination(String destination) {
        this.destination = destination;
        return this;
    }

    public java.util.Map<String, Object> getConfig() {
        return config;
    }

    public WarehouseExport config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public String getCredentialsHint() {
        return credentialsHint;
    }

    public WarehouseExport credentialsHint(String credentialsHint) {
        this.credentialsHint = credentialsHint;
        return this;
    }

    public java.util.List<String> getTables() {
        return tables;
    }

    public WarehouseExport tables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }

    public String getSchedule() {
        return schedule;
    }

    public WarehouseExport schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public WarehouseExport enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WarehouseExport status(String status) {
        this.status = status;
        return this;
    }

    public Long getConsecutiveFailures() {
        return consecutiveFailures;
    }

    public WarehouseExport consecutiveFailures(Long consecutiveFailures) {
        this.consecutiveFailures = consecutiveFailures;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public WarehouseExport lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public java.util.Map<String, WarehouseExportCursorsValue> getCursors() {
        return cursors;
    }

    public WarehouseExport cursors(java.util.Map<String, WarehouseExportCursorsValue> cursors) {
        this.cursors = cursors;
        return this;
    }

    public java.util.Map<String, Long> getSchemaVersions() {
        return schemaVersions;
    }

    public WarehouseExport schemaVersions(java.util.Map<String, Long> schemaVersions) {
        this.schemaVersions = schemaVersions;
        return this;
    }

    public String getLastRunAt() {
        return lastRunAt;
    }

    public WarehouseExport lastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    public String getLastSuccessAt() {
        return lastSuccessAt;
    }

    public WarehouseExport lastSuccessAt(String lastSuccessAt) {
        this.lastSuccessAt = lastSuccessAt;
        return this;
    }

    public String getNextRunAt() {
        return nextRunAt;
    }

    public WarehouseExport nextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WarehouseExport createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public WarehouseExport updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
