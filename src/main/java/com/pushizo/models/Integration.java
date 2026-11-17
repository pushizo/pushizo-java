// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Integration şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Integration {
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
     * Zorunlu. Değerler: "segment", "amplitude", "mixpanel", "ga4", "posthog", "rudderstack", "hubspot", "appsflyer", "adjust", "revenuecat", "zapier", "slack", "activecampaign", "adobe_audience_manager", "salesforce".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "active", "paused", "error".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private java.util.Map<String, Object> settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.List<String> events;

    /**
     * Zorunlu.
     */
    @JsonProperty("credentials")
    private java.util.Map<String, String> credentials;

    /**
     * Zorunlu.
     */
    @JsonProperty("state")
    private java.util.Map<String, Object> state;

    /**
     * Zorunlu.
     */
    @JsonProperty("inbound_url")
    private String inboundUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("interactions_url")
    private String interactionsUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("pending_events")
    private Long pendingEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("dead_events")
    private Long deadEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("hooks")
    private Long hooks;

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
    @JsonProperty("last_error_at")
    private String lastErrorAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_success_at")
    private String lastSuccessAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_run_at")
    private String lastRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_sync_at")
    private String nextSyncAt;

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

    public Integration id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Integration appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getType() {
        return type;
    }

    public Integration type(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public Integration name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Integration status(String status) {
        this.status = status;
        return this;
    }

    public java.util.Map<String, Object> getSettings() {
        return settings;
    }

    public Integration settings(java.util.Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    public java.util.List<String> getEvents() {
        return events;
    }

    public Integration events(java.util.List<String> events) {
        this.events = events;
        return this;
    }

    public java.util.Map<String, String> getCredentials() {
        return credentials;
    }

    public Integration credentials(java.util.Map<String, String> credentials) {
        this.credentials = credentials;
        return this;
    }

    public java.util.Map<String, Object> getState() {
        return state;
    }

    public Integration state(java.util.Map<String, Object> state) {
        this.state = state;
        return this;
    }

    public String getInboundUrl() {
        return inboundUrl;
    }

    public Integration inboundUrl(String inboundUrl) {
        this.inboundUrl = inboundUrl;
        return this;
    }

    public String getInteractionsUrl() {
        return interactionsUrl;
    }

    public Integration interactionsUrl(String interactionsUrl) {
        this.interactionsUrl = interactionsUrl;
        return this;
    }

    public Long getPendingEvents() {
        return pendingEvents;
    }

    public Integration pendingEvents(Long pendingEvents) {
        this.pendingEvents = pendingEvents;
        return this;
    }

    public Long getDeadEvents() {
        return deadEvents;
    }

    public Integration deadEvents(Long deadEvents) {
        this.deadEvents = deadEvents;
        return this;
    }

    public Long getHooks() {
        return hooks;
    }

    public Integration hooks(Long hooks) {
        this.hooks = hooks;
        return this;
    }

    public Long getConsecutiveFailures() {
        return consecutiveFailures;
    }

    public Integration consecutiveFailures(Long consecutiveFailures) {
        this.consecutiveFailures = consecutiveFailures;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public Integration lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastErrorAt() {
        return lastErrorAt;
    }

    public Integration lastErrorAt(String lastErrorAt) {
        this.lastErrorAt = lastErrorAt;
        return this;
    }

    public String getLastSuccessAt() {
        return lastSuccessAt;
    }

    public Integration lastSuccessAt(String lastSuccessAt) {
        this.lastSuccessAt = lastSuccessAt;
        return this;
    }

    public String getLastRunAt() {
        return lastRunAt;
    }

    public Integration lastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    public String getNextSyncAt() {
        return nextSyncAt;
    }

    public Integration nextSyncAt(String nextSyncAt) {
        this.nextSyncAt = nextSyncAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Integration createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Integration updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
