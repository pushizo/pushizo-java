// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RfmConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RfmConfig {
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
    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    /**
     * Zorunlu.
     */
    @JsonProperty("value_property")
    private String valueProperty;

    /**
     * Zorunlu.
     */
    @JsonProperty("use_monetary")
    private Boolean useMonetary;

    /**
     * Zorunlu.
     */
    @JsonProperty("window_days")
    private Long windowDays;

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
    @JsonProperty("first_computed_at")
    private String firstComputedAt;

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

    public RfmConfig configured(Boolean configured) {
        this.configured = configured;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public RfmConfig enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public RfmConfig eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    public String getValueProperty() {
        return valueProperty;
    }

    public RfmConfig valueProperty(String valueProperty) {
        this.valueProperty = valueProperty;
        return this;
    }

    public Boolean getUseMonetary() {
        return useMonetary;
    }

    public RfmConfig useMonetary(Boolean useMonetary) {
        this.useMonetary = useMonetary;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public RfmConfig windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public RfmConfig status(String status) {
        this.status = status;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public RfmConfig lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getFirstComputedAt() {
        return firstComputedAt;
    }

    public RfmConfig firstComputedAt(String firstComputedAt) {
        this.firstComputedAt = firstComputedAt;
        return this;
    }

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public RfmConfig lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public Long getScoredUsers() {
        return scoredUsers;
    }

    public RfmConfig scoredUsers(Long scoredUsers) {
        this.scoredUsers = scoredUsers;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
