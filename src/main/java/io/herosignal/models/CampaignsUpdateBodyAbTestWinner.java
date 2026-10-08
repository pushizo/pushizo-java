// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsUpdateBodyAbTestWinner şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsUpdateBodyAbTestWinner {
    /**
     * Değerler: "manual", "auto".
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * Değerler: "open_rate", "click_rate", "conversion_rate".
     */
    @JsonProperty("metric")
    private String metric;

    @JsonProperty("evaluate_after_minutes")
    private Long evaluateAfterMinutes;

    public String getMode() {
        return mode;
    }

    public CampaignsUpdateBodyAbTestWinner mode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getMetric() {
        return metric;
    }

    public CampaignsUpdateBodyAbTestWinner metric(String metric) {
        this.metric = metric;
        return this;
    }

    public Long getEvaluateAfterMinutes() {
        return evaluateAfterMinutes;
    }

    public CampaignsUpdateBodyAbTestWinner evaluateAfterMinutes(Long evaluateAfterMinutes) {
        this.evaluateAfterMinutes = evaluateAfterMinutes;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
