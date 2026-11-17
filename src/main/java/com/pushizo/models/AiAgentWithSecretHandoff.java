// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgentWithSecretHandoff şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgentWithSecretHandoff {
    /**
     * Zorunlu.
     */
    @JsonProperty("keywords")
    private java.util.List<String> keywords;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_bot_replies")
    private Long maxBotReplies;

    /**
     * Zorunlu.
     */
    @JsonProperty("on_negative_sentiment")
    private Boolean onNegativeSentiment;

    /**
     * Zorunlu.
     */
    @JsonProperty("message")
    private String message;

    public java.util.List<String> getKeywords() {
        return keywords;
    }

    public AiAgentWithSecretHandoff keywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public Long getMaxBotReplies() {
        return maxBotReplies;
    }

    public AiAgentWithSecretHandoff maxBotReplies(Long maxBotReplies) {
        this.maxBotReplies = maxBotReplies;
        return this;
    }

    public Boolean getOnNegativeSentiment() {
        return onNegativeSentiment;
    }

    public AiAgentWithSecretHandoff onNegativeSentiment(Boolean onNegativeSentiment) {
        this.onNegativeSentiment = onNegativeSentiment;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AiAgentWithSecretHandoff message(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
