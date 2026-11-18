// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgentMetrics şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgentMetrics {
    /**
     * Zorunlu.
     */
    @JsonProperty("period_days")
    private Long periodDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("runs")
    private Long runs;

    /**
     * Zorunlu.
     */
    @JsonProperty("replied")
    private Long replied;

    /**
     * Zorunlu.
     */
    @JsonProperty("handed_off")
    private Long handedOff;

    /**
     * Zorunlu.
     */
    @JsonProperty("skipped_cap")
    private Long skippedCap;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversations")
    private Long conversations;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolution_rate")
    private Double resolutionRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("avg_steps")
    private Double avgSteps;

    /**
     * Zorunlu.
     */
    @JsonProperty("tool_calls")
    private Long toolCalls;

    /**
     * Zorunlu.
     */
    @JsonProperty("tool_error_rate")
    private Double toolErrorRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("tokens")
    private Long tokens;

    /**
     * Zorunlu.
     */
    @JsonProperty("handoff_reasons")
    private java.util.Map<String, Long> handoffReasons;

    public Long getPeriodDays() {
        return periodDays;
    }

    public AiAgentMetrics periodDays(Long periodDays) {
        this.periodDays = periodDays;
        return this;
    }

    public Long getRuns() {
        return runs;
    }

    public AiAgentMetrics runs(Long runs) {
        this.runs = runs;
        return this;
    }

    public Long getReplied() {
        return replied;
    }

    public AiAgentMetrics replied(Long replied) {
        this.replied = replied;
        return this;
    }

    public Long getHandedOff() {
        return handedOff;
    }

    public AiAgentMetrics handedOff(Long handedOff) {
        this.handedOff = handedOff;
        return this;
    }

    public Long getSkippedCap() {
        return skippedCap;
    }

    public AiAgentMetrics skippedCap(Long skippedCap) {
        this.skippedCap = skippedCap;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public AiAgentMetrics failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getConversations() {
        return conversations;
    }

    public AiAgentMetrics conversations(Long conversations) {
        this.conversations = conversations;
        return this;
    }

    public Double getResolutionRate() {
        return resolutionRate;
    }

    public AiAgentMetrics resolutionRate(Double resolutionRate) {
        this.resolutionRate = resolutionRate;
        return this;
    }

    public Double getAvgSteps() {
        return avgSteps;
    }

    public AiAgentMetrics avgSteps(Double avgSteps) {
        this.avgSteps = avgSteps;
        return this;
    }

    public Long getToolCalls() {
        return toolCalls;
    }

    public AiAgentMetrics toolCalls(Long toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    public Double getToolErrorRate() {
        return toolErrorRate;
    }

    public AiAgentMetrics toolErrorRate(Double toolErrorRate) {
        this.toolErrorRate = toolErrorRate;
        return this;
    }

    public Long getTokens() {
        return tokens;
    }

    public AiAgentMetrics tokens(Long tokens) {
        this.tokens = tokens;
        return this;
    }

    public java.util.Map<String, Long> getHandoffReasons() {
        return handoffReasons;
    }

    public AiAgentMetrics handoffReasons(java.util.Map<String, Long> handoffReasons) {
        this.handoffReasons = handoffReasons;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
