// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecisionAgent şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DecisionAgent {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

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
    private java.util.List<DecisionAgentArmsItem> arms;

    /**
     * Zorunlu.
     */
    @JsonProperty("reward_events")
    private java.util.List<String> rewardEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("reward_window_hours")
    private Long rewardWindowHours;

    /**
     * Zorunlu.
     */
    @JsonProperty("holdout_percent")
    private Long holdoutPercent;

    /**
     * Zorunlu.
     */
    @JsonProperty("context_prediction")
    private String contextPrediction;

    /**
     * Zorunlu.
     */
    @JsonProperty("use_best_channel")
    private Boolean useBestChannel;

    /**
     * Zorunlu. Değerler: "active", "paused".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public DecisionAgent id(String id) {
        this.id = id;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public DecisionAgent slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getName() {
        return name;
    }

    public DecisionAgent name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<DecisionAgentArmsItem> getArms() {
        return arms;
    }

    public DecisionAgent arms(java.util.List<DecisionAgentArmsItem> arms) {
        this.arms = arms;
        return this;
    }

    public java.util.List<String> getRewardEvents() {
        return rewardEvents;
    }

    public DecisionAgent rewardEvents(java.util.List<String> rewardEvents) {
        this.rewardEvents = rewardEvents;
        return this;
    }

    public Long getRewardWindowHours() {
        return rewardWindowHours;
    }

    public DecisionAgent rewardWindowHours(Long rewardWindowHours) {
        this.rewardWindowHours = rewardWindowHours;
        return this;
    }

    public Long getHoldoutPercent() {
        return holdoutPercent;
    }

    public DecisionAgent holdoutPercent(Long holdoutPercent) {
        this.holdoutPercent = holdoutPercent;
        return this;
    }

    public String getContextPrediction() {
        return contextPrediction;
    }

    public DecisionAgent contextPrediction(String contextPrediction) {
        this.contextPrediction = contextPrediction;
        return this;
    }

    public Boolean getUseBestChannel() {
        return useBestChannel;
    }

    public DecisionAgent useBestChannel(Boolean useBestChannel) {
        this.useBestChannel = useBestChannel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DecisionAgent status(String status) {
        this.status = status;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DecisionAgent createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DecisionAgent updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
