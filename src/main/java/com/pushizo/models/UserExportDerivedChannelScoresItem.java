// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedChannelScoresItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedChannelScoresItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("sends")
    private Double sends;

    /**
     * Zorunlu.
     */
    @JsonProperty("engaged")
    private Double engaged;

    /**
     * Zorunlu.
     */
    @JsonProperty("score")
    private Double score;

    /**
     * Zorunlu.
     */
    @JsonProperty("is_best")
    private Boolean isBest;

    /**
     * Zorunlu.
     */
    @JsonProperty("computed_at")
    private String computedAt;

    public String getChannel() {
        return channel;
    }

    public UserExportDerivedChannelScoresItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Double getSends() {
        return sends;
    }

    public UserExportDerivedChannelScoresItem sends(Double sends) {
        this.sends = sends;
        return this;
    }

    public Double getEngaged() {
        return engaged;
    }

    public UserExportDerivedChannelScoresItem engaged(Double engaged) {
        this.engaged = engaged;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public UserExportDerivedChannelScoresItem score(Double score) {
        this.score = score;
        return this;
    }

    public Boolean getIsBest() {
        return isBest;
    }

    public UserExportDerivedChannelScoresItem isBest(Boolean isBest) {
        this.isBest = isBest;
        return this;
    }

    public String getComputedAt() {
        return computedAt;
    }

    public UserExportDerivedChannelScoresItem computedAt(String computedAt) {
        this.computedAt = computedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
