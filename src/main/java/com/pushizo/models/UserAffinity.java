// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserAffinity şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserAffinity {
    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("affinities")
    private java.util.List<UserAffinityAffinitiesItem> affinities;

    /**
     * Zorunlu.
     */
    @JsonProperty("weekly_cap")
    private Long weeklyCap;

    /**
     * Zorunlu.
     */
    @JsonProperty("engagement")
    private Double engagement;

    /**
     * Zorunlu.
     */
    @JsonProperty("computed_at")
    private String computedAt;

    public String getUserId() {
        return userId;
    }

    public UserAffinity userId(String userId) {
        this.userId = userId;
        return this;
    }

    public java.util.List<UserAffinityAffinitiesItem> getAffinities() {
        return affinities;
    }

    public UserAffinity affinities(java.util.List<UserAffinityAffinitiesItem> affinities) {
        this.affinities = affinities;
        return this;
    }

    public Long getWeeklyCap() {
        return weeklyCap;
    }

    public UserAffinity weeklyCap(Long weeklyCap) {
        this.weeklyCap = weeklyCap;
        return this;
    }

    public Double getEngagement() {
        return engagement;
    }

    public UserAffinity engagement(Double engagement) {
        this.engagement = engagement;
        return this;
    }

    public String getComputedAt() {
        return computedAt;
    }

    public UserAffinity computedAt(String computedAt) {
        this.computedAt = computedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
