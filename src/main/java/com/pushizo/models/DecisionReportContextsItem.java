// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecisionReportContextsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DecisionReportContextsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("context")
    private String context;

    /**
     * Zorunlu.
     */
    @JsonProperty("arm_id")
    private String armId;

    /**
     * Zorunlu.
     */
    @JsonProperty("settled")
    private Long settled;

    /**
     * Zorunlu.
     */
    @JsonProperty("rate")
    private Double rate;

    public String getContext() {
        return context;
    }

    public DecisionReportContextsItem context(String context) {
        this.context = context;
        return this;
    }

    public String getArmId() {
        return armId;
    }

    public DecisionReportContextsItem armId(String armId) {
        this.armId = armId;
        return this;
    }

    public Long getSettled() {
        return settled;
    }

    public DecisionReportContextsItem settled(Long settled) {
        this.settled = settled;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public DecisionReportContextsItem rate(Double rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
