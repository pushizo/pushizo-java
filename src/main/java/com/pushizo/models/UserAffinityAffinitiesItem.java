// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserAffinityAffinitiesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserAffinityAffinitiesItem {
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
    private Long rank;

    public String getAttribute() {
        return attribute;
    }

    public UserAffinityAffinitiesItem attribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UserAffinityAffinitiesItem value(String value) {
        this.value = value;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public UserAffinityAffinitiesItem score(Double score) {
        this.score = score;
        return this;
    }

    public Long getRank() {
        return rank;
    }

    public UserAffinityAffinitiesItem rank(Long rank) {
        this.rank = rank;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
