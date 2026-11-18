// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAiAgentDtoFaqItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAiAgentDtoFaqItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("question")
    private String question;

    /**
     * Zorunlu.
     */
    @JsonProperty("answer")
    private String answer;

    public String getQuestion() {
        return question;
    }

    public UpdateAiAgentDtoFaqItem question(String question) {
        this.question = question;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public UpdateAiAgentDtoFaqItem answer(String answer) {
        this.answer = answer;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
