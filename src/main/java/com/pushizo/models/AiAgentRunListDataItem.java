// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgentRunListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgentRunListDataItem {
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
     * Zorunlu.
     */
    @JsonProperty("conversation_id")
    private String conversationId;

    /**
     * Zorunlu. Değerler: "pending", "replied", "handed_off", "skipped_cap", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("steps")
    private java.util.List<AiAgentRunListDataItemStepsItem> steps;

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
    @JsonProperty("handoff_reason")
    private String handoffReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("finished_at")
    private String finishedAt;

    public String getId() {
        return id;
    }

    public AiAgentRunListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public AiAgentRunListDataItem agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getConversationId() {
        return conversationId;
    }

    public AiAgentRunListDataItem conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AiAgentRunListDataItem status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<AiAgentRunListDataItemStepsItem> getSteps() {
        return steps;
    }

    public AiAgentRunListDataItem steps(java.util.List<AiAgentRunListDataItemStepsItem> steps) {
        this.steps = steps;
        return this;
    }

    public Long getInputTokens() {
        return inputTokens;
    }

    public AiAgentRunListDataItem inputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    public Long getOutputTokens() {
        return outputTokens;
    }

    public AiAgentRunListDataItem outputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    public String getHandoffReason() {
        return handoffReason;
    }

    public AiAgentRunListDataItem handoffReason(String handoffReason) {
        this.handoffReason = handoffReason;
        return this;
    }

    public String getError() {
        return error;
    }

    public AiAgentRunListDataItem error(String error) {
        this.error = error;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AiAgentRunListDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public AiAgentRunListDataItem finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
