// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataSource şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataSource {
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
     * Zorunlu. Değerler: "webhook", "http_pull".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu. Değerler: "event", "person".
     */
    @JsonProperty("target")
    private String target;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "signature", "token".
     */
    @JsonProperty("auth_mode")
    private String authMode;

    /**
     * Zorunlu.
     */
    @JsonProperty("mapping")
    private DataSourceMapping mapping;

    /**
     * Zorunlu.
     */
    @JsonProperty("config")
    private DataSourceConfig config;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_secret")
    private Boolean hasSecret;

    /**
     * Zorunlu.
     */
    @JsonProperty("webhook_url")
    private String webhookUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_run_at")
    private String nextRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_run_at")
    private String lastRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_status")
    private String lastStatus;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_stats")
    private java.util.Map<String, Double> lastStats;

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

    public DataSource id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public DataSource appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DataSource name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public DataSource kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public DataSource target(String target) {
        this.target = target;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public DataSource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getAuthMode() {
        return authMode;
    }

    public DataSource authMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    public DataSourceMapping getMapping() {
        return mapping;
    }

    public DataSource mapping(DataSourceMapping mapping) {
        this.mapping = mapping;
        return this;
    }

    public DataSourceConfig getConfig() {
        return config;
    }

    public DataSource config(DataSourceConfig config) {
        this.config = config;
        return this;
    }

    public Boolean getHasSecret() {
        return hasSecret;
    }

    public DataSource hasSecret(Boolean hasSecret) {
        this.hasSecret = hasSecret;
        return this;
    }

    public String getWebhookUrl() {
        return webhookUrl;
    }

    public DataSource webhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    public String getNextRunAt() {
        return nextRunAt;
    }

    public DataSource nextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }

    public String getLastRunAt() {
        return lastRunAt;
    }

    public DataSource lastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public DataSource lastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public DataSource lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public java.util.Map<String, Double> getLastStats() {
        return lastStats;
    }

    public DataSource lastStats(java.util.Map<String, Double> lastStats) {
        this.lastStats = lastStats;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DataSource createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DataSource updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
