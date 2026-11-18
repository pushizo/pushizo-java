// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignEmailRisk şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignEmailRisk {
    /**
     * Zorunlu.
     */
    @JsonProperty("applies")
    private Boolean applies;

    /**
     * Zorunlu.
     */
    @JsonProperty("recipients")
    private Long recipients;

    /**
     * Zorunlu.
     */
    @JsonProperty("flagged_invalid")
    private Long flaggedInvalid;

    /**
     * Zorunlu.
     */
    @JsonProperty("sendable")
    private Long sendable;

    /**
     * Zorunlu.
     */
    @JsonProperty("valid")
    private Long valid;

    /**
     * Zorunlu.
     */
    @JsonProperty("unknown")
    private Long unknown;

    /**
     * Zorunlu.
     */
    @JsonProperty("unchecked")
    private Long unchecked;

    /**
     * Zorunlu.
     */
    @JsonProperty("estimated_invalid_ratio")
    private Double estimatedInvalidRatio;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_invalid_ratio")
    private Double maxInvalidRatio;

    /**
     * Zorunlu.
     */
    @JsonProperty("blocked")
    private Boolean blocked;

    /**
     * Zorunlu.
     */
    @JsonProperty("bounce_rate_7d")
    private Double bounceRate7d;

    /**
     * Zorunlu.
     */
    @JsonProperty("bounce_rate_30d")
    private Double bounceRate30d;

    public Boolean getApplies() {
        return applies;
    }

    public CampaignEmailRisk applies(Boolean applies) {
        this.applies = applies;
        return this;
    }

    public Long getRecipients() {
        return recipients;
    }

    public CampaignEmailRisk recipients(Long recipients) {
        this.recipients = recipients;
        return this;
    }

    public Long getFlaggedInvalid() {
        return flaggedInvalid;
    }

    public CampaignEmailRisk flaggedInvalid(Long flaggedInvalid) {
        this.flaggedInvalid = flaggedInvalid;
        return this;
    }

    public Long getSendable() {
        return sendable;
    }

    public CampaignEmailRisk sendable(Long sendable) {
        this.sendable = sendable;
        return this;
    }

    public Long getValid() {
        return valid;
    }

    public CampaignEmailRisk valid(Long valid) {
        this.valid = valid;
        return this;
    }

    public Long getUnknown() {
        return unknown;
    }

    public CampaignEmailRisk unknown(Long unknown) {
        this.unknown = unknown;
        return this;
    }

    public Long getUnchecked() {
        return unchecked;
    }

    public CampaignEmailRisk unchecked(Long unchecked) {
        this.unchecked = unchecked;
        return this;
    }

    public Double getEstimatedInvalidRatio() {
        return estimatedInvalidRatio;
    }

    public CampaignEmailRisk estimatedInvalidRatio(Double estimatedInvalidRatio) {
        this.estimatedInvalidRatio = estimatedInvalidRatio;
        return this;
    }

    public Double getMaxInvalidRatio() {
        return maxInvalidRatio;
    }

    public CampaignEmailRisk maxInvalidRatio(Double maxInvalidRatio) {
        this.maxInvalidRatio = maxInvalidRatio;
        return this;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public CampaignEmailRisk blocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    public Double getBounceRate7d() {
        return bounceRate7d;
    }

    public CampaignEmailRisk bounceRate7d(Double bounceRate7d) {
        this.bounceRate7d = bounceRate7d;
        return this;
    }

    public Double getBounceRate30d() {
        return bounceRate30d;
    }

    public CampaignEmailRisk bounceRate30d(Double bounceRate30d) {
        this.bounceRate30d = bounceRate30d;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
