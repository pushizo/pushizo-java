// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecisionReportArmsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DecisionReportArmsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Zorunlu.
     */
    @JsonProperty("share")
    private Double share;

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

    public String getId() {
        return id;
    }

    public DecisionReportArmsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public DecisionReportArmsItem label(String label) {
        this.label = label;
        return this;
    }

    public Double getShare() {
        return share;
    }

    public DecisionReportArmsItem share(Double share) {
        this.share = share;
        return this;
    }

    public Long getAssignments() {
        return assignments;
    }

    public DecisionReportArmsItem assignments(Long assignments) {
        this.assignments = assignments;
        return this;
    }

    public Long getSettled() {
        return settled;
    }

    public DecisionReportArmsItem settled(Long settled) {
        this.settled = settled;
        return this;
    }

    public Long getRewards() {
        return rewards;
    }

    public DecisionReportArmsItem rewards(Long rewards) {
        this.rewards = rewards;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public DecisionReportArmsItem rate(Double rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
