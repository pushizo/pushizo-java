// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAiAgentDtoLimits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAiAgentDtoLimits {
    @JsonProperty("monthly_token_cap")
    private Long monthlyTokenCap;

    @JsonProperty("max_steps")
    private Long maxSteps;

    public Long getMonthlyTokenCap() {
        return monthlyTokenCap;
    }

    public UpdateAiAgentDtoLimits monthlyTokenCap(Long monthlyTokenCap) {
        this.monthlyTokenCap = monthlyTokenCap;
        return this;
    }

    public Long getMaxSteps() {
        return maxSteps;
    }

    public UpdateAiAgentDtoLimits maxSteps(Long maxSteps) {
        this.maxSteps = maxSteps;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
