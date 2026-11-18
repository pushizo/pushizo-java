// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomAgentDraft şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CustomAgentDraft {
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
    @JsonProperty("run_id")
    private String runId;

    /**
     * Zorunlu. Değerler: "segment", "campaign".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu. Değerler: "pending", "applied", "dismissed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("payload")
    private java.util.Map<String, Object> payload;

    /**
     * Zorunlu.
     */
    @JsonProperty("result_id")
    private String resultId;

    /**
     * Zorunlu.
     */
    @JsonProperty("decided_at")
    private String decidedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public CustomAgentDraft id(String id) {
        this.id = id;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public CustomAgentDraft agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getRunId() {
        return runId;
    }

    public CustomAgentDraft runId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CustomAgentDraft kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CustomAgentDraft status(String status) {
        this.status = status;
        return this;
    }

    public java.util.Map<String, Object> getPayload() {
        return payload;
    }

    public CustomAgentDraft payload(java.util.Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }

    public String getResultId() {
        return resultId;
    }

    public CustomAgentDraft resultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    public String getDecidedAt() {
        return decidedAt;
    }

    public CustomAgentDraft decidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CustomAgentDraft createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
