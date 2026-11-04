// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecisionReportLearned şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DecisionReportLearned {
    /**
     * Zorunlu.
     */
    @JsonProperty("assignments")
    private Long assignments;

    /**
     * Zorunlu.
     */
    @JsonProperty("settled")
    private Long settled;

    /**
     * Zorunlu.
     */
    @JsonProperty("rewards")
    private Long rewards;

    /**
     * Zorunlu.
     */
    @JsonProperty("rate")
    private Double rate;

    public Long getAssignments() {
        return assignments;
    }

    public DecisionReportLearned assignments(Long assignments) {
        this.assignments = assignments;
        return this;
    }

    public Long getSettled() {
        return settled;
    }

    public DecisionReportLearned settled(Long settled) {
        this.settled = settled;
        return this;
    }

    public Long getRewards() {
        return rewards;
    }

    public DecisionReportLearned rewards(Long rewards) {
        this.rewards = rewards;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public DecisionReportLearned rate(Double rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
