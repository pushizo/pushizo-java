// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyRunDetail şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyRunDetail {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("journey_id")
    private String journeyId;

    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu. Değerler: "active", "waiting", "completed", "exited", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("current_node_id")
    private String currentNodeId;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_action_at")
    private String nextActionAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("entered_at")
    private String enteredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("exit_reason")
    private String exitReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("goal_id")
    private String goalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("goal_reached_at")
    private String goalReachedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("context")
    private java.util.Map<String, Object> context;

    /**
     * Zorunlu.
     */
    @JsonProperty("journey_name")
    private String journeyName;

    /**
     * Zorunlu.
     */
    @JsonProperty("steps")
    private java.util.List<JourneyRunDetailStepsItem> steps;

    public String getId() {
        return id;
    }

    public JourneyRunDetail id(String id) {
        this.id = id;
        return this;
    }

    public String getJourneyId() {
        return journeyId;
    }

    public JourneyRunDetail journeyId(String journeyId) {
        this.journeyId = journeyId;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public JourneyRunDetail version(Long version) {
        this.version = version;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public JourneyRunDetail userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public JourneyRunDetail externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public JourneyRunDetail status(String status) {
        this.status = status;
        return this;
    }

    public String getCurrentNodeId() {
        return currentNodeId;
    }

    public JourneyRunDetail currentNodeId(String currentNodeId) {
        this.currentNodeId = currentNodeId;
        return this;
    }

    public String getNextActionAt() {
        return nextActionAt;
    }

    public JourneyRunDetail nextActionAt(String nextActionAt) {
        this.nextActionAt = nextActionAt;
        return this;
    }

    public String getEnteredAt() {
        return enteredAt;
    }

    public JourneyRunDetail enteredAt(String enteredAt) {
        this.enteredAt = enteredAt;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public JourneyRunDetail completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public String getExitReason() {
        return exitReason;
    }

    public JourneyRunDetail exitReason(String exitReason) {
        this.exitReason = exitReason;
        return this;
    }

    public String getGoalId() {
        return goalId;
    }

    public JourneyRunDetail goalId(String goalId) {
        this.goalId = goalId;
        return this;
    }

    public String getGoalReachedAt() {
        return goalReachedAt;
    }

    public JourneyRunDetail goalReachedAt(String goalReachedAt) {
        this.goalReachedAt = goalReachedAt;
        return this;
    }

    public java.util.Map<String, Object> getContext() {
        return context;
    }

    public JourneyRunDetail context(java.util.Map<String, Object> context) {
        this.context = context;
        return this;
    }

    public String getJourneyName() {
        return journeyName;
    }

    public JourneyRunDetail journeyName(String journeyName) {
        this.journeyName = journeyName;
        return this;
    }

    public java.util.List<JourneyRunDetailStepsItem> getSteps() {
        return steps;
    }

    public JourneyRunDetail steps(java.util.List<JourneyRunDetailStepsItem> steps) {
        this.steps = steps;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
