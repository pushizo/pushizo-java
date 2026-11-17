// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateCustomAgentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateCustomAgentDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("instructions")
    private String instructions;

    /**
     * Değerler: "list_segments", "campaign_performance", "delivery_summary", "create_segment_draft", "create_campaign_draft".
     */
    @JsonProperty("tools")
    private java.util.List<String> tools;

    @JsonProperty("schedule")
    private CreateCustomAgentDtoSchedule schedule;

    @JsonProperty("limits")
    private CreateCustomAgentDtoLimits limits;

    public String getName() {
        return name;
    }

    public CreateCustomAgentDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateCustomAgentDto description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateCustomAgentDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public CreateCustomAgentDto instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public java.util.List<String> getTools() {
        return tools;
    }

    public CreateCustomAgentDto tools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }

    public CreateCustomAgentDtoSchedule getSchedule() {
        return schedule;
    }

    public CreateCustomAgentDto schedule(CreateCustomAgentDtoSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CreateCustomAgentDtoLimits getLimits() {
        return limits;
    }

    public CreateCustomAgentDto limits(CreateCustomAgentDtoLimits limits) {
        this.limits = limits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
