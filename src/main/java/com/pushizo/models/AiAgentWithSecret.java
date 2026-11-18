// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgentWithSecret şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgentWithSecret {
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
    private java.util.List<AiAgentWithSecretFaqItem> faq;

    /**
     * Zorunlu.
     */
    @JsonProperty("tools")
    private java.util.List<AiAgentWithSecretToolsItem> tools;

    /**
     * Zorunlu.
     */
    @JsonProperty("handoff")
    private AiAgentWithSecretHandoff handoff;

    /**
     * Zorunlu.
     */
    @JsonProperty("limits")
    private AiAgentWithSecretLimits limits;

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
    private AiAgentWithSecretUsage usage;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("tool_secret")
    private String toolSecret;

    public String getId() {
        return id;
    }

    public AiAgentWithSecret id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AiAgentWithSecret appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AiAgentWithSecret name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AiAgentWithSecret enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public AiAgentWithSecret channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public AiAgentWithSecret instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public java.util.List<AiAgentWithSecretFaqItem> getFaq() {
        return faq;
    }

    public AiAgentWithSecret faq(java.util.List<AiAgentWithSecretFaqItem> faq) {
        this.faq = faq;
        return this;
    }

    public java.util.List<AiAgentWithSecretToolsItem> getTools() {
        return tools;
    }

    public AiAgentWithSecret tools(java.util.List<AiAgentWithSecretToolsItem> tools) {
        this.tools = tools;
        return this;
    }

    public AiAgentWithSecretHandoff getHandoff() {
        return handoff;
    }

    public AiAgentWithSecret handoff(AiAgentWithSecretHandoff handoff) {
        this.handoff = handoff;
        return this;
    }

    public AiAgentWithSecretLimits getLimits() {
        return limits;
    }

    public AiAgentWithSecret limits(AiAgentWithSecretLimits limits) {
        this.limits = limits;
        return this;
    }

    public Boolean getAiSentiment() {
        return aiSentiment;
    }

    public AiAgentWithSecret aiSentiment(Boolean aiSentiment) {
        this.aiSentiment = aiSentiment;
        return this;
    }

    public Boolean getHasToolSecret() {
        return hasToolSecret;
    }

    public AiAgentWithSecret hasToolSecret(Boolean hasToolSecret) {
        this.hasToolSecret = hasToolSecret;
        return this;
    }

    public AiAgentWithSecretUsage getUsage() {
        return usage;
    }

    public AiAgentWithSecret usage(AiAgentWithSecretUsage usage) {
        this.usage = usage;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AiAgentWithSecret createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AiAgentWithSecret updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getToolSecret() {
        return toolSecret;
    }

    public AiAgentWithSecret toolSecret(String toolSecret) {
        this.toolSecret = toolSecret;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
