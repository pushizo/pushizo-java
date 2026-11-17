// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgent şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgent {
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
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "whatsapp", "sms", "rcs", "telegram", "viber", "chat".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    /**
     * Zorunlu.
     */
    @JsonProperty("instructions")
    private String instructions;

    /**
     * Zorunlu.
     */
    @JsonProperty("faq")
    private java.util.List<AiAgentFaqItem> faq;

    /**
     * Zorunlu.
     */
    @JsonProperty("tools")
    private java.util.List<AiAgentToolsItem> tools;

    /**
     * Zorunlu.
     */
    @JsonProperty("handoff")
    private AiAgentHandoff handoff;

    /**
     * Zorunlu.
     */
    @JsonProperty("limits")
    private AiAgentLimits limits;

    /**
     * Zorunlu.
     */
    @JsonProperty("ai_sentiment")
    private Boolean aiSentiment;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_tool_secret")
    private Boolean hasToolSecret;

    /**
     * Zorunlu.
     */
    @JsonProperty("usage")
    private AiAgentUsage usage;

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

    public AiAgent id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AiAgent appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AiAgent name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AiAgent enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public AiAgent channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public AiAgent instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public java.util.List<AiAgentFaqItem> getFaq() {
        return faq;
    }

    public AiAgent faq(java.util.List<AiAgentFaqItem> faq) {
        this.faq = faq;
        return this;
    }

    public java.util.List<AiAgentToolsItem> getTools() {
        return tools;
    }

    public AiAgent tools(java.util.List<AiAgentToolsItem> tools) {
        this.tools = tools;
        return this;
    }

    public AiAgentHandoff getHandoff() {
        return handoff;
    }

    public AiAgent handoff(AiAgentHandoff handoff) {
        this.handoff = handoff;
        return this;
    }

    public AiAgentLimits getLimits() {
        return limits;
    }

    public AiAgent limits(AiAgentLimits limits) {
        this.limits = limits;
        return this;
    }

    public Boolean getAiSentiment() {
        return aiSentiment;
    }

    public AiAgent aiSentiment(Boolean aiSentiment) {
        this.aiSentiment = aiSentiment;
        return this;
    }

    public Boolean getHasToolSecret() {
        return hasToolSecret;
    }

    public AiAgent hasToolSecret(Boolean hasToolSecret) {
        this.hasToolSecret = hasToolSecret;
        return this;
    }

    public AiAgentUsage getUsage() {
        return usage;
    }

    public AiAgent usage(AiAgentUsage usage) {
        this.usage = usage;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AiAgent createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AiAgent updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
