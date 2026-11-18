// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedAffinitiesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedAffinitiesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("attribute")
    private String attribute;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Zorunlu.
     */
    @JsonProperty("score")
    private Double score;

    /**
     * Zorunlu.
     */
    @JsonProperty("rank")
    private Double rank;

    /**
     * Zorunlu.
     */
    @JsonProperty("computed_at")
    private String computedAt;

    public String getAttribute() {
        return attribute;
    }

    public UserExportDerivedAffinitiesItem attribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UserExportDerivedAffinitiesItem value(String value) {
        this.value = value;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public UserExportDerivedAffinitiesItem score(Double score) {
        this.score = score;
        return this;
    }

    public Double getRank() {
        return rank;
    }

    public UserExportDerivedAffinitiesItem rank(Double rank) {
        this.rank = rank;
        return this;
    }

    public String getComputedAt() {
        return computedAt;
    }

    public UserExportDerivedAffinitiesItem computedAt(String computedAt) {
        this.computedAt = computedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
