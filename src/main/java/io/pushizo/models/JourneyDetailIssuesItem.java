// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyDetailIssuesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyDetailIssuesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("code")
    private String code;

    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("edge_id")
    private String edgeId;

    /**
     * Zorunlu.
     */
    @JsonProperty("message")
    private String message;

    public String getCode() {
        return code;
    }

    public JourneyDetailIssuesItem code(String code) {
        this.code = code;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public JourneyDetailIssuesItem nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getEdgeId() {
        return edgeId;
    }

    public JourneyDetailIssuesItem edgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public JourneyDetailIssuesItem message(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
