// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyStatsNodesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyStatsNodesItem {
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
     * Zorunlu.
     */
    @JsonProperty("entered")
    private Long entered;

    /**
     * Zorunlu.
     */
    @JsonProperty("completed")
    private Long completed;

    /**
     * Zorunlu.
     */
    @JsonProperty("waiting_now")
    private Long waitingNow;

    /**
     * Zorunlu.
     */
    @JsonProperty("skipped")
    private Long skipped;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("branches")
    private java.util.Map<String, Long> branches;

    @JsonProperty("messages")
    private java.util.Map<String, Long> messages;

    public String getNodeId() {
        return nodeId;
    }

    public JourneyStatsNodesItem nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public JourneyStatsNodesItem nodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public Long getEntered() {
        return entered;
    }

    public JourneyStatsNodesItem entered(Long entered) {
        this.entered = entered;
        return this;
    }

    public Long getCompleted() {
        return completed;
    }

    public JourneyStatsNodesItem completed(Long completed) {
        this.completed = completed;
        return this;
    }

    public Long getWaitingNow() {
        return waitingNow;
    }

    public JourneyStatsNodesItem waitingNow(Long waitingNow) {
        this.waitingNow = waitingNow;
        return this;
    }

    public Long getSkipped() {
        return skipped;
    }

    public JourneyStatsNodesItem skipped(Long skipped) {
        this.skipped = skipped;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public JourneyStatsNodesItem failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public java.util.Map<String, Long> getBranches() {
        return branches;
    }

    public JourneyStatsNodesItem branches(java.util.Map<String, Long> branches) {
        this.branches = branches;
        return this;
    }

    public java.util.Map<String, Long> getMessages() {
        return messages;
    }

    public JourneyStatsNodesItem messages(java.util.Map<String, Long> messages) {
        this.messages = messages;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
