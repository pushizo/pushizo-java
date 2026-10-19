// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EndLiveActivityDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EndLiveActivityDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("activity_id")
    private String activityId;

    @JsonProperty("content_state")
    private java.util.Map<String, Object> contentState;

    @JsonProperty("alert")
    private EndLiveActivityDtoAlert alert;

    @JsonProperty("stale_date")
    private Long staleDate;

    @JsonProperty("dismissal_date")
    private Long dismissalDate;

    @JsonProperty("relevance_score")
    private Double relevanceScore;

    /**
     * Değerler: 5, 10.
     */
    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("name")
    private String name;

    public String getActivityId() {
        return activityId;
    }

    public EndLiveActivityDto activityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    public java.util.Map<String, Object> getContentState() {
        return contentState;
    }

    public EndLiveActivityDto contentState(java.util.Map<String, Object> contentState) {
        this.contentState = contentState;
        return this;
    }

    public EndLiveActivityDtoAlert getAlert() {
        return alert;
    }

    public EndLiveActivityDto alert(EndLiveActivityDtoAlert alert) {
        this.alert = alert;
        return this;
    }

    public Long getStaleDate() {
        return staleDate;
    }

    public EndLiveActivityDto staleDate(Long staleDate) {
        this.staleDate = staleDate;
        return this;
    }

    public Long getDismissalDate() {
        return dismissalDate;
    }

    public EndLiveActivityDto dismissalDate(Long dismissalDate) {
        this.dismissalDate = dismissalDate;
        return this;
    }

    public Double getRelevanceScore() {
        return relevanceScore;
    }

    public EndLiveActivityDto relevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public EndLiveActivityDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getName() {
        return name;
    }

    public EndLiveActivityDto name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
