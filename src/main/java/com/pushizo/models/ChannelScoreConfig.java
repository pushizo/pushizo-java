// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelScoreConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelScoreConfig {
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
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("min_sends")
    private Long minSends;

    /**
     * Zorunlu.
     */
    @JsonProperty("count_email_opens")
    private Boolean countEmailOpens;

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

    public ChannelScoreConfig configured(Boolean configured) {
        this.configured = configured;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public ChannelScoreConfig enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public ChannelScoreConfig windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getMinSends() {
        return minSends;
    }

    public ChannelScoreConfig minSends(Long minSends) {
        this.minSends = minSends;
        return this;
    }

    public Boolean getCountEmailOpens() {
        return countEmailOpens;
    }

    public ChannelScoreConfig countEmailOpens(Boolean countEmailOpens) {
        this.countEmailOpens = countEmailOpens;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ChannelScoreConfig status(String status) {
        this.status = status;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public ChannelScoreConfig lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public ChannelScoreConfig lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public Long getScoredUsers() {
        return scoredUsers;
    }

    public ChannelScoreConfig scoredUsers(Long scoredUsers) {
        this.scoredUsers = scoredUsers;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
