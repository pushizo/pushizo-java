// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AffinityOverview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AffinityOverview {
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

    /**
     * Zorunlu.
     */
    @JsonProperty("attributes")
    private java.util.List<AffinityOverviewAttributesItem> attributes;

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public AffinityOverview lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public Long getScoredUsers() {
        return scoredUsers;
    }

    public AffinityOverview scoredUsers(Long scoredUsers) {
        this.scoredUsers = scoredUsers;
        return this;
    }

    public java.util.List<AffinityOverviewAttributesItem> getAttributes() {
        return attributes;
    }

    public AffinityOverview attributes(java.util.List<AffinityOverviewAttributesItem> attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
