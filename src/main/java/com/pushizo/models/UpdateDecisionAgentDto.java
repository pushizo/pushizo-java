// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateDecisionAgentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateDecisionAgentDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "active", "paused".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("reward_events")
    private java.util.List<String> rewardEvents;

    @JsonProperty("reward_window_hours")
    private Long rewardWindowHours;

    @JsonProperty("holdout_percent")
    private Long holdoutPercent;

    public String getName() {
        return name;
    }

    public UpdateDecisionAgentDto name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdateDecisionAgentDto status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<String> getRewardEvents() {
        return rewardEvents;
    }

    public UpdateDecisionAgentDto rewardEvents(java.util.List<String> rewardEvents) {
        this.rewardEvents = rewardEvents;
        return this;
    }

    public Long getRewardWindowHours() {
        return rewardWindowHours;
    }

    public UpdateDecisionAgentDto rewardWindowHours(Long rewardWindowHours) {
        this.rewardWindowHours = rewardWindowHours;
        return this;
    }

    public Long getHoldoutPercent() {
        return holdoutPercent;
    }

    public UpdateDecisionAgentDto holdoutPercent(Long holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
