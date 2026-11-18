// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedPredictionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedPredictionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("model")
    private String model;

    /**
     * Zorunlu.
     */
    @JsonProperty("score")
    private Double score;

    /**
     * Zorunlu.
     */
    @JsonProperty("computed_at")
    private String computedAt;

    public String getModel() {
        return model;
    }

    public UserExportDerivedPredictionsItem model(String model) {
        this.model = model;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public UserExportDerivedPredictionsItem score(Double score) {
        this.score = score;
        return this;
    }

    public String getComputedAt() {
        return computedAt;
    }

    public UserExportDerivedPredictionsItem computedAt(String computedAt) {
        this.computedAt = computedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
