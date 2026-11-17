// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomAgentLimits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CustomAgentLimits {
    /**
     * Zorunlu.
     */
    @JsonProperty("max_steps")
    private Long maxSteps;

    /**
     * Zorunlu.
     */
    @JsonProperty("monthly_token_cap")
    private Long monthlyTokenCap;

    public Long getMaxSteps() {
        return maxSteps;
    }

    public CustomAgentLimits maxSteps(Long maxSteps) {
        this.maxSteps = maxSteps;
        return this;
    }

    public Long getMonthlyTokenCap() {
        return monthlyTokenCap;
    }

    public CustomAgentLimits monthlyTokenCap(Long monthlyTokenCap) {
        this.monthlyTokenCap = monthlyTokenCap;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
