// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateCustomAgentDtoLimits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateCustomAgentDtoLimits {
    @JsonProperty("max_steps")
    private Long maxSteps;

    @JsonProperty("monthly_token_cap")
    private Long monthlyTokenCap;

    public Long getMaxSteps() {
        return maxSteps;
    }

    public UpdateCustomAgentDtoLimits maxSteps(Long maxSteps) {
        this.maxSteps = maxSteps;
        return this;
    }

    public Long getMonthlyTokenCap() {
        return monthlyTokenCap;
    }

    public UpdateCustomAgentDtoLimits monthlyTokenCap(Long monthlyTokenCap) {
        this.monthlyTokenCap = monthlyTokenCap;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
