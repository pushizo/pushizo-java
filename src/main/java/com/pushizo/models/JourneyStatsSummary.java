// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyStatsSummary şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyStatsSummary {
    /**
     * Zorunlu.
     */
    @JsonProperty("runs_total")
    private Long runsTotal;

    /**
     * Zorunlu.
     */
    @JsonProperty("active")
    private Long active;

    /**
     * Zorunlu.
     */
    @JsonProperty("completed")
    private Long completed;

    /**
     * Zorunlu.
     */
    @JsonProperty("exited")
    private Long exited;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("goal_reached")
    private Long goalReached;

    /**
     * Zorunlu.
     */
    @JsonProperty("waiting")
    private Long waiting;

    /**
     * Zorunlu.
     */
    @JsonProperty("goal_conversion_rate")
    private Double goalConversionRate;

    public Long getRunsTotal() {
        return runsTotal;
    }

    public JourneyStatsSummary runsTotal(Long runsTotal) {
        this.runsTotal = runsTotal;
        return this;
    }

    public Long getActive() {
        return active;
    }

    public JourneyStatsSummary active(Long active) {
        this.active = active;
        return this;
    }

    public Long getCompleted() {
        return completed;
    }

    public JourneyStatsSummary completed(Long completed) {
        this.completed = completed;
        return this;
    }

    public Long getExited() {
        return exited;
    }

    public JourneyStatsSummary exited(Long exited) {
        this.exited = exited;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public JourneyStatsSummary failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getGoalReached() {
        return goalReached;
    }

    public JourneyStatsSummary goalReached(Long goalReached) {
        this.goalReached = goalReached;
        return this;
    }

    public Long getWaiting() {
        return waiting;
    }

    public JourneyStatsSummary waiting(Long waiting) {
        this.waiting = waiting;
        return this;
    }

    public Double getGoalConversionRate() {
        return goalConversionRate;
    }

    public JourneyStatsSummary goalConversionRate(Double goalConversionRate) {
        this.goalConversionRate = goalConversionRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
