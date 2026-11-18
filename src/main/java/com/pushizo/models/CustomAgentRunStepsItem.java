// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomAgentRunStepsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CustomAgentRunStepsItem {
    /**
     * Zorunlu. Değerler: "tool", "finish".
     */
    @JsonProperty("kind")
    private String kind;

    @JsonProperty("tool")
    private String tool;

    @JsonProperty("ok")
    private Boolean ok;

    @JsonProperty("error")
    private String error;

    @JsonProperty("duration_ms")
    private Long durationMs;

    public String getKind() {
        return kind;
    }

    public CustomAgentRunStepsItem kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTool() {
        return tool;
    }

    public CustomAgentRunStepsItem tool(String tool) {
        this.tool = tool;
        return this;
    }

    public Boolean getOk() {
        return ok;
    }

    public CustomAgentRunStepsItem ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getError() {
        return error;
    }

    public CustomAgentRunStepsItem error(String error) {
        this.error = error;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public CustomAgentRunStepsItem durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
