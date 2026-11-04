// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PredictionModelMetricsImportanceItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PredictionModelMetricsImportanceItem {
    /**
     * Zorunlu. Değerler: "recency_days", "events_7", "events_30", "active_days_30", "target_30", "days_since_target", "tenure_days", "sent_30", "engaged_30".
     */
    @JsonProperty("feature")
    private String feature;

    /**
     * Zorunlu.
     */
    @JsonProperty("weight")
    private Double weight;

    public String getFeature() {
        return feature;
    }

    public PredictionModelMetricsImportanceItem feature(String feature) {
        this.feature = feature;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public PredictionModelMetricsImportanceItem weight(Double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
