// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StartLiveActivityDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class StartLiveActivityDto {
    @JsonProperty("activity_id")
    private String activityId;

    @JsonProperty("attributes")
    private java.util.Map<String, Object> attributes;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private StartLiveActivityDtoTarget target;

    /**
     * Zorunlu.
     */
    @JsonProperty("content_state")
    private java.util.Map<String, Object> contentState;

    @JsonProperty("alert")
    private StartLiveActivityDtoAlert alert;

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

    public StartLiveActivityDto activityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    public java.util.Map<String, Object> getAttributes() {
        return attributes;
    }

    public StartLiveActivityDto attributes(java.util.Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    public StartLiveActivityDtoTarget getTarget() {
        return target;
    }

    public StartLiveActivityDto target(StartLiveActivityDtoTarget target) {
        this.target = target;
        return this;
    }

    public java.util.Map<String, Object> getContentState() {
        return contentState;
    }

    public StartLiveActivityDto contentState(java.util.Map<String, Object> contentState) {
        this.contentState = contentState;
        return this;
    }

    public StartLiveActivityDtoAlert getAlert() {
        return alert;
    }

    public StartLiveActivityDto alert(StartLiveActivityDtoAlert alert) {
        this.alert = alert;
        return this;
    }

    public Long getStaleDate() {
        return staleDate;
    }

    public StartLiveActivityDto staleDate(Long staleDate) {
        this.staleDate = staleDate;
        return this;
    }

    public Long getDismissalDate() {
        return dismissalDate;
    }

    public StartLiveActivityDto dismissalDate(Long dismissalDate) {
        this.dismissalDate = dismissalDate;
        return this;
    }

    public Double getRelevanceScore() {
        return relevanceScore;
    }

    public StartLiveActivityDto relevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public StartLiveActivityDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getName() {
        return name;
    }

    public StartLiveActivityDto name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
