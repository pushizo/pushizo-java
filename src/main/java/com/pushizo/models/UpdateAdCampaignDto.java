// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAdCampaignDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAdCampaignDto {
    /**
     * Değerler: "active", "paused".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("daily_budget")
    private Object dailyBudget;

    public String getStatus() {
        return status;
    }

    public UpdateAdCampaignDto status(String status) {
        this.status = status;
        return this;
    }

    public Object getDailyBudget() {
        return dailyBudget;
    }

    public UpdateAdCampaignDto dailyBudget(Object dailyBudget) {
        this.dailyBudget = dailyBudget;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
