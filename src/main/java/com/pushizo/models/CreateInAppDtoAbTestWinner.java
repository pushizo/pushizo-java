// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateInAppDtoAbTestWinner şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateInAppDtoAbTestWinner {
    /**
     * Zorunlu. Değerler: "manual", "auto".
     */
    @JsonProperty("mode")
    private String mode;

    @JsonProperty("min_impressions")
    private Long minImpressions;

    @JsonProperty("confidence")
    private Double confidence;

    public String getMode() {
        return mode;
    }

    public CreateInAppDtoAbTestWinner mode(String mode) {
        this.mode = mode;
        return this;
    }

    public Long getMinImpressions() {
        return minImpressions;
    }

    public CreateInAppDtoAbTestWinner minImpressions(Long minImpressions) {
        this.minImpressions = minImpressions;
        return this;
    }

    public Double getConfidence() {
        return confidence;
    }

    public CreateInAppDtoAbTestWinner confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
