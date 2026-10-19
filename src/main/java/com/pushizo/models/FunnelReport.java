// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunnelReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FunnelReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Zorunlu.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Zorunlu.
     */
    @JsonProperty("window_hours")
    private Long windowHours;

    /**
     * Zorunlu.
     */
    @JsonProperty("steps")
    private java.util.List<FunnelReportStepsItem> steps;

    /**
     * Zorunlu.
     */
    @JsonProperty("overall_rate")
    private Double overallRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private FunnelReportPrevious previous;

    public String getFrom() {
        return from;
    }

    public FunnelReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public FunnelReport to(String to) {
        this.to = to;
        return this;
    }

    public Long getWindowHours() {
        return windowHours;
    }

    public FunnelReport windowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    public java.util.List<FunnelReportStepsItem> getSteps() {
        return steps;
    }

    public FunnelReport steps(java.util.List<FunnelReportStepsItem> steps) {
        this.steps = steps;
        return this;
    }

    public Double getOverallRate() {
        return overallRate;
    }

    public FunnelReport overallRate(Double overallRate) {
        this.overallRate = overallRate;
        return this;
    }

    public FunnelReportPrevious getPrevious() {
        return previous;
    }

    public FunnelReport previous(FunnelReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
