// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunnelReportPrevious şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FunnelReportPrevious {
    /**
     * Zorunlu.
     */
    @JsonProperty("steps")
    private java.util.List<Long> steps;

    /**
     * Zorunlu.
     */
    @JsonProperty("overall_rate")
    private Double overallRate;

    public java.util.List<Long> getSteps() {
        return steps;
    }

    public FunnelReportPrevious steps(java.util.List<Long> steps) {
        this.steps = steps;
        return this;
    }

    public Double getOverallRate() {
        return overallRate;
    }

    public FunnelReportPrevious overallRate(Double overallRate) {
        this.overallRate = overallRate;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
