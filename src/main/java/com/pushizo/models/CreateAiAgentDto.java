// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAiAgentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAiAgentDto {
    /**
     * Zorunlu.
     */
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
    private java.util.List<CreateAiAgentDtoFaqItem> faq;

    @JsonProperty("tools")
    private java.util.List<CreateAiAgentDtoToolsItem> tools;

    @JsonProperty("handoff")
    private CreateAiAgentDtoHandoff handoff;

    @JsonProperty("limits")
    private CreateAiAgentDtoLimits limits;

    @JsonProperty("ai_sentiment")
    private Boolean aiSentiment;

    public String getName() {
        return name;
    }

    public CreateAiAgentDto name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateAiAgentDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public CreateAiAgentDto channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public CreateAiAgentDto instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public java.util.List<CreateAiAgentDtoFaqItem> getFaq() {
        return faq;
    }

    public CreateAiAgentDto faq(java.util.List<CreateAiAgentDtoFaqItem> faq) {
        this.faq = faq;
        return this;
    }

    public java.util.List<CreateAiAgentDtoToolsItem> getTools() {
        return tools;
    }

    public CreateAiAgentDto tools(java.util.List<CreateAiAgentDtoToolsItem> tools) {
        this.tools = tools;
        return this;
    }

    public CreateAiAgentDtoHandoff getHandoff() {
        return handoff;
    }

    public CreateAiAgentDto handoff(CreateAiAgentDtoHandoff handoff) {
        this.handoff = handoff;
        return this;
    }

    public CreateAiAgentDtoLimits getLimits() {
        return limits;
    }

    public CreateAiAgentDto limits(CreateAiAgentDtoLimits limits) {
        this.limits = limits;
        return this;
    }

    public Boolean getAiSentiment() {
        return aiSentiment;
    }

    public CreateAiAgentDto aiSentiment(Boolean aiSentiment) {
        this.aiSentiment = aiSentiment;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
