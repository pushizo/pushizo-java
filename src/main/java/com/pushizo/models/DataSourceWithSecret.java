// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataSourceWithSecret şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataSourceWithSecret {
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
    private DataSourceWithSecretMapping mapping;

    /**
     * Zorunlu.
     */
    @JsonProperty("config")
    private DataSourceWithSecretConfig config;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("secret")
    private String secret;

    public String getId() {
        return id;
    }

    public DataSourceWithSecret id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public DataSourceWithSecret appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DataSourceWithSecret name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public DataSourceWithSecret kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public DataSourceWithSecret target(String target) {
        this.target = target;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public DataSourceWithSecret enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getAuthMode() {
        return authMode;
    }

    public DataSourceWithSecret authMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    public DataSourceWithSecretMapping getMapping() {
        return mapping;
    }

    public DataSourceWithSecret mapping(DataSourceWithSecretMapping mapping) {
        this.mapping = mapping;
        return this;
    }

    public DataSourceWithSecretConfig getConfig() {
        return config;
    }

    public DataSourceWithSecret config(DataSourceWithSecretConfig config) {
        this.config = config;
        return this;
    }

    public Boolean getHasSecret() {
        return hasSecret;
    }

    public DataSourceWithSecret hasSecret(Boolean hasSecret) {
        this.hasSecret = hasSecret;
        return this;
    }

    public String getWebhookUrl() {
        return webhookUrl;
    }

    public DataSourceWithSecret webhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    public String getNextRunAt() {
        return nextRunAt;
    }

    public DataSourceWithSecret nextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }

    public String getLastRunAt() {
        return lastRunAt;
    }

    public DataSourceWithSecret lastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public DataSourceWithSecret lastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public DataSourceWithSecret lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public java.util.Map<String, Double> getLastStats() {
        return lastStats;
    }

    public DataSourceWithSecret lastStats(java.util.Map<String, Double> lastStats) {
        this.lastStats = lastStats;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DataSourceWithSecret createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DataSourceWithSecret updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public DataSourceWithSecret secret(String secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
