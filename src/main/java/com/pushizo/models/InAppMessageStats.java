// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InAppMessageStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InAppMessageStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("impressions")
    private Long impressions;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicks")
    private Long clicks;

    /**
     * Zorunlu.
     */
    @JsonProperty("dismissals")
    private Long dismissals;

    /**
     * Zorunlu.
     */
    @JsonProperty("unique_users")
    private Long uniqueUsers;

    /**
     * Zorunlu.
     */
    @JsonProperty("ctr")
    private Double ctr;

    public Long getImpressions() {
        return impressions;
    }

    public InAppMessageStats impressions(Long impressions) {
        this.impressions = impressions;
        return this;
    }

    public Long getClicks() {
        return clicks;
    }

    public InAppMessageStats clicks(Long clicks) {
        this.clicks = clicks;
        return this;
    }

    public Long getDismissals() {
        return dismissals;
    }

    public InAppMessageStats dismissals(Long dismissals) {
        this.dismissals = dismissals;
        return this;
    }

    public Long getUniqueUsers() {
        return uniqueUsers;
    }

    public InAppMessageStats uniqueUsers(Long uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
        return this;
    }

    public Double getCtr() {
        return ctr;
    }

    public InAppMessageStats ctr(Double ctr) {
        this.ctr = ctr;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
