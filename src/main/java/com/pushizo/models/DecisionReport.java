// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecisionReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DecisionReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("agent_id")
    private String agentId;

    /**
     * Zorunlu.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Zorunlu.
     */
    @JsonProperty("learned")
    private DecisionReportLearned learned;

    /**
     * Zorunlu.
     */
    @JsonProperty("holdout")
    private DecisionReportHoldout holdout;

    /**
     * Zorunlu.
     */
    @JsonProperty("lift")
    private Double lift;

    /**
     * Zorunlu.
     */
    @JsonProperty("p_value")
    private Double pValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("significant")
    private Boolean significant;

    /**
     * Zorunlu.
     */
    @JsonProperty("arms")
    private java.util.List<DecisionReportArmsItem> arms;

    /**
     * Zorunlu.
     */
    @JsonProperty("contexts")
    private java.util.List<DecisionReportContextsItem> contexts;

    public String getAgentId() {
        return agentId;
    }

    public DecisionReport agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public Long getDays() {
        return days;
    }

    public DecisionReport days(Long days) {
        this.days = days;
        return this;
    }

    public DecisionReportLearned getLearned() {
        return learned;
    }

    public DecisionReport learned(DecisionReportLearned learned) {
        this.learned = learned;
        return this;
    }

    public DecisionReportHoldout getHoldout() {
        return holdout;
    }

    public DecisionReport holdout(DecisionReportHoldout holdout) {
        this.holdout = holdout;
        return this;
    }

    public Double getLift() {
        return lift;
    }

    public DecisionReport lift(Double lift) {
        this.lift = lift;
        return this;
    }

    public Double getPValue() {
        return pValue;
    }

    public DecisionReport pValue(Double pValue) {
        this.pValue = pValue;
        return this;
    }

    public Boolean getSignificant() {
        return significant;
    }

    public DecisionReport significant(Boolean significant) {
        this.significant = significant;
        return this;
    }

    public java.util.List<DecisionReportArmsItem> getArms() {
        return arms;
    }

    public DecisionReport arms(java.util.List<DecisionReportArmsItem> arms) {
        this.arms = arms;
        return this;
    }

    public java.util.List<DecisionReportContextsItem> getContexts() {
        return contexts;
    }

    public DecisionReport contexts(java.util.List<DecisionReportContextsItem> contexts) {
        this.contexts = contexts;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
