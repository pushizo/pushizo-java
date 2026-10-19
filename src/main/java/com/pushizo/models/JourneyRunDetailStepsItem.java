// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyRunDetailStepsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyRunDetailStepsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("node_id")
    private String nodeId;

    /**
     * Zorunlu.
     */
    @JsonProperty("node_type")
    private String nodeType;

    /**
     * Zorunlu. Değerler: "completed", "waiting", "failed", "skipped".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("branch")
    private String branch;

    /**
     * Zorunlu.
     */
    @JsonProperty("result")
    private java.util.Map<String, Object> result;

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

    public JourneyRunDetailStepsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public JourneyRunDetailStepsItem nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public JourneyRunDetailStepsItem nodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public JourneyRunDetailStepsItem status(String status) {
        this.status = status;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public JourneyRunDetailStepsItem branch(String branch) {
        this.branch = branch;
        return this;
    }

    public java.util.Map<String, Object> getResult() {
        return result;
    }

    public JourneyRunDetailStepsItem result(java.util.Map<String, Object> result) {
        this.result = result;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public JourneyRunDetailStepsItem startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public JourneyRunDetailStepsItem finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
