// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsCreateBodyAbTestWinner şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsCreateBodyAbTestWinner {
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

    public CampaignsCreateBodyAbTestWinner mode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getMetric() {
        return metric;
    }

    public CampaignsCreateBodyAbTestWinner metric(String metric) {
        this.metric = metric;
        return this;
    }

    public Long getEvaluateAfterMinutes() {
        return evaluateAfterMinutes;
    }

    public CampaignsCreateBodyAbTestWinner evaluateAfterMinutes(Long evaluateAfterMinutes) {
        this.evaluateAfterMinutes = evaluateAfterMinutes;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
