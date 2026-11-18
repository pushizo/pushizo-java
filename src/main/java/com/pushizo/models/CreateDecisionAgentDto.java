// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateDecisionAgentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateDecisionAgentDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("arms")
    private java.util.List<CreateDecisionAgentDtoArmsItem> arms;

    /**
     * Zorunlu.
     */
    @JsonProperty("reward_events")
    private java.util.List<String> rewardEvents;

    @JsonProperty("reward_window_hours")
    private Long rewardWindowHours;

    @JsonProperty("holdout_percent")
    private Long holdoutPercent;

    @JsonProperty("context_prediction")
    private String contextPrediction;

    @JsonProperty("use_best_channel")
    private Boolean useBestChannel;

    public String getSlug() {
        return slug;
    }

    public CreateDecisionAgentDto slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateDecisionAgentDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<CreateDecisionAgentDtoArmsItem> getArms() {
        return arms;
    }

    public CreateDecisionAgentDto arms(java.util.List<CreateDecisionAgentDtoArmsItem> arms) {
        this.arms = arms;
        return this;
    }

    public java.util.List<String> getRewardEvents() {
        return rewardEvents;
    }

    public CreateDecisionAgentDto rewardEvents(java.util.List<String> rewardEvents) {
        this.rewardEvents = rewardEvents;
        return this;
    }

    public Long getRewardWindowHours() {
        return rewardWindowHours;
    }

    public CreateDecisionAgentDto rewardWindowHours(Long rewardWindowHours) {
        this.rewardWindowHours = rewardWindowHours;
        return this;
    }

    public Long getHoldoutPercent() {
        return holdoutPercent;
    }

    public CreateDecisionAgentDto holdoutPercent(Long holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
        return this;
    }

    public String getContextPrediction() {
        return contextPrediction;
    }

    public CreateDecisionAgentDto contextPrediction(String contextPrediction) {
        this.contextPrediction = contextPrediction;
        return this;
    }

    public Boolean getUseBestChannel() {
        return useBestChannel;
    }

    public CreateDecisionAgentDto useBestChannel(Boolean useBestChannel) {
        this.useBestChannel = useBestChannel;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
