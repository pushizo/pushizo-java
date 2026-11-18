// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomAgentRun şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CustomAgentRun {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("agent_id")
    private String agentId;

    /**
     * Zorunlu. Değerler: "schedule", "manual".
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Zorunlu. Değerler: "pending", "running", "succeeded", "failed", "skipped".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("steps")
    private java.util.List<CustomAgentRunStepsItem> steps;

    /**
     * Zorunlu.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * Zorunlu.
     */
    @JsonProperty("input_tokens")
    private Long inputTokens;

    /**
     * Zorunlu.
     */
    @JsonProperty("output_tokens")
    private Long outputTokens;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("drafts")
    private Long drafts;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("started_at")
    private String startedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("finished_at")
    private String finishedAt;

    public String getId() {
        return id;
    }

    public CustomAgentRun id(String id) {
        this.id = id;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public CustomAgentRun agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public CustomAgentRun trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CustomAgentRun status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<CustomAgentRunStepsItem> getSteps() {
        return steps;
    }

    public CustomAgentRun steps(java.util.List<CustomAgentRunStepsItem> steps) {
        this.steps = steps;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public CustomAgentRun summary(String summary) {
        this.summary = summary;
        return this;
    }

    public Long getInputTokens() {
        return inputTokens;
    }

    public CustomAgentRun inputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    public Long getOutputTokens() {
        return outputTokens;
    }

    public CustomAgentRun outputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    public String getError() {
        return error;
    }

    public CustomAgentRun error(String error) {
        this.error = error;
        return this;
    }

    public Long getDrafts() {
        return drafts;
    }

    public CustomAgentRun drafts(Long drafts) {
        this.drafts = drafts;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CustomAgentRun createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public CustomAgentRun startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public CustomAgentRun finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
