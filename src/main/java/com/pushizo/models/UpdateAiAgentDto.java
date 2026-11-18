// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAiAgentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAiAgentDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Değerler: "whatsapp", "sms", "rcs", "telegram", "viber", "chat".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    @JsonProperty("instructions")
    private String instructions;

    @JsonProperty("faq")
    private java.util.List<UpdateAiAgentDtoFaqItem> faq;

    @JsonProperty("tools")
    private java.util.List<UpdateAiAgentDtoToolsItem> tools;

    @JsonProperty("handoff")
    private UpdateAiAgentDtoHandoff handoff;

    @JsonProperty("limits")
    private UpdateAiAgentDtoLimits limits;

    @JsonProperty("ai_sentiment")
    private Boolean aiSentiment;

    public String getName() {
        return name;
    }

    public UpdateAiAgentDto name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateAiAgentDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public UpdateAiAgentDto channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public UpdateAiAgentDto instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public java.util.List<UpdateAiAgentDtoFaqItem> getFaq() {
        return faq;
    }

    public UpdateAiAgentDto faq(java.util.List<UpdateAiAgentDtoFaqItem> faq) {
        this.faq = faq;
        return this;
    }

    public java.util.List<UpdateAiAgentDtoToolsItem> getTools() {
        return tools;
    }

    public UpdateAiAgentDto tools(java.util.List<UpdateAiAgentDtoToolsItem> tools) {
        this.tools = tools;
        return this;
    }

    public UpdateAiAgentDtoHandoff getHandoff() {
        return handoff;
    }

    public UpdateAiAgentDto handoff(UpdateAiAgentDtoHandoff handoff) {
        this.handoff = handoff;
        return this;
    }

    public UpdateAiAgentDtoLimits getLimits() {
        return limits;
    }

    public UpdateAiAgentDto limits(UpdateAiAgentDtoLimits limits) {
        this.limits = limits;
        return this;
    }

    public Boolean getAiSentiment() {
        return aiSentiment;
    }

    public UpdateAiAgentDto aiSentiment(Boolean aiSentiment) {
        this.aiSentiment = aiSentiment;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
