// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgentRunListDataItemStepsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgentRunListDataItemStepsItem {
    /**
     * Zorunlu. Değerler: "reply", "tool", "handoff".
     */
    @JsonProperty("kind")
    private String kind;

    @JsonProperty("tool")
    private String tool;

    @JsonProperty("status")
    private Long status;

    @JsonProperty("ok")
    private Boolean ok;

    @JsonProperty("duration_ms")
    private Long durationMs;

    public String getKind() {
        return kind;
    }

    public AiAgentRunListDataItemStepsItem kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTool() {
        return tool;
    }

    public AiAgentRunListDataItemStepsItem tool(String tool) {
        this.tool = tool;
        return this;
    }

    public Long getStatus() {
        return status;
    }

    public AiAgentRunListDataItemStepsItem status(Long status) {
        this.status = status;
        return this;
    }

    public Boolean getOk() {
        return ok;
    }

    public AiAgentRunListDataItemStepsItem ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public AiAgentRunListDataItemStepsItem durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
