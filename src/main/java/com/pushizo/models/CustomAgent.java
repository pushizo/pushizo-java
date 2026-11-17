// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomAgent şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CustomAgent {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("instructions")
    private String instructions;

    /**
     * Zorunlu. Değerler: "list_segments", "campaign_performance", "delivery_summary", "create_segment_draft", "create_campaign_draft".
     */
    @JsonProperty("tools")
    private java.util.List<String> tools;

    /**
     * Zorunlu.
     */
    @JsonProperty("schedule")
    private CustomAgentSchedule schedule;

    /**
     * Zorunlu.
     */
    @JsonProperty("limits")
    private CustomAgentLimits limits;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_run_at")
    private String nextRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_run_at")
    private String lastRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("usage")
    private CustomAgentUsage usage;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public CustomAgent id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public CustomAgent appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomAgent name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CustomAgent description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CustomAgent enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public CustomAgent instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public java.util.List<String> getTools() {
        return tools;
    }

    public CustomAgent tools(java.util.List<String> tools) {
        this.tools = tools;
        return this;
    }

    public CustomAgentSchedule getSchedule() {
        return schedule;
    }

    public CustomAgent schedule(CustomAgentSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CustomAgentLimits getLimits() {
        return limits;
    }

    public CustomAgent limits(CustomAgentLimits limits) {
        this.limits = limits;
        return this;
    }

    public String getNextRunAt() {
        return nextRunAt;
    }

    public CustomAgent nextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }

    public String getLastRunAt() {
        return lastRunAt;
    }

    public CustomAgent lastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    public CustomAgentUsage getUsage() {
        return usage;
    }

    public CustomAgent usage(CustomAgentUsage usage) {
        this.usage = usage;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CustomAgent createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public CustomAgent updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
