// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AffinityConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AffinityConfig {
    /**
     * Zorunlu.
     */
    @JsonProperty("configured")
    private Boolean configured;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("attributes")
    private java.util.List<String> attributes;

    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.Map<String, Double> events;

    /**
     * Zorunlu.
     */
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("half_life_days")
    private Long halfLifeDays;

    /**
     * Zorunlu. Değerler: "idle", "queued", "running", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_computed_at")
    private String lastComputedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("scored_users")
    private Long scoredUsers;

    public Boolean getConfigured() {
        return configured;
    }

    public AffinityConfig configured(Boolean configured) {
        this.configured = configured;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AffinityConfig enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getAttributes() {
        return attributes;
    }

    public AffinityConfig attributes(java.util.List<String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public java.util.Map<String, Double> getEvents() {
        return events;
    }

    public AffinityConfig events(java.util.Map<String, Double> events) {
        this.events = events;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public AffinityConfig windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getHalfLifeDays() {
        return halfLifeDays;
    }

    public AffinityConfig halfLifeDays(Long halfLifeDays) {
        this.halfLifeDays = halfLifeDays;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AffinityConfig status(String status) {
        this.status = status;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public AffinityConfig lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public AffinityConfig lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public Long getScoredUsers() {
        return scoredUsers;
    }

    public AffinityConfig scoredUsers(Long scoredUsers) {
        this.scoredUsers = scoredUsers;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
