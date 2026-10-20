// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyQuestionsItemOptionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyQuestionsItemOptionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private java.util.Map<String, String> label;

    public String getValue() {
        return value;
    }

    public SurveyQuestionsItemOptionsItem value(String value) {
        this.value = value;
        return this;
    }

    public java.util.Map<String, String> getLabel() {
        return label;
    }

    public SurveyQuestionsItemOptionsItem label(java.util.Map<String, String> label) {
        this.label = label;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
