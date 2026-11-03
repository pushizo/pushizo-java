// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReverseEtlSync şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ReverseEtlSync {
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
     * Zorunlu. Değerler: "snowflake", "bigquery", "postgres", "mysql", "s3", "google_sheets", "clickhouse", "sqlserver", "trino", "athena", "elasticsearch", "kafka", "pubsub".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu. Değerler: "event", "user".
     */
    @JsonProperty("target")
    private String target;

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
     * Zorunlu. Değerler: "every_5_minutes", "hourly", "daily".
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
    @JsonProperty("cursor")
    private String cursor;

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

    public ReverseEtlSync id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public ReverseEtlSync appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ReverseEtlSync name(String name) {
        this.name = name;
        return this;
    }

    public String getSource() {
        return source;
    }

    public ReverseEtlSync source(String source) {
        this.source = source;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public ReverseEtlSync target(String target) {
        this.target = target;
        return this;
    }

    public java.util.Map<String, Object> getConfig() {
        return config;
    }

    public ReverseEtlSync config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public String getCredentialsHint() {
        return credentialsHint;
    }

    public ReverseEtlSync credentialsHint(String credentialsHint) {
        this.credentialsHint = credentialsHint;
        return this;
    }

    public String getSchedule() {
        return schedule;
    }

    public ReverseEtlSync schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public ReverseEtlSync enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ReverseEtlSync status(String status) {
        this.status = status;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public ReverseEtlSync cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Long getConsecutiveFailures() {
        return consecutiveFailures;
    }

    public ReverseEtlSync consecutiveFailures(Long consecutiveFailures) {
        this.consecutiveFailures = consecutiveFailures;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public ReverseEtlSync lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastRunAt() {
        return lastRunAt;
    }

    public ReverseEtlSync lastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    public String getLastSuccessAt() {
        return lastSuccessAt;
    }

    public ReverseEtlSync lastSuccessAt(String lastSuccessAt) {
        this.lastSuccessAt = lastSuccessAt;
        return this;
    }

    public String getNextRunAt() {
        return nextRunAt;
    }

    public ReverseEtlSync nextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ReverseEtlSync createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public ReverseEtlSync updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
