// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyQuestionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyQuestionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "nps", "csat", "single_choice", "multiple_choice", "text".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("text")
    private java.util.Map<String, String> text;

    @JsonProperty("required")
    private Boolean required;

    @JsonProperty("options")
    private java.util.List<SurveyQuestionsItemOptionsItem> options;

    @JsonProperty("low_label")
    private java.util.Map<String, String> lowLabel;

    @JsonProperty("high_label")
    private java.util.Map<String, String> highLabel;

    @JsonProperty("placeholder")
    private java.util.Map<String, String> placeholder;

    public String getId() {
        return id;
    }

    public SurveyQuestionsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public SurveyQuestionsItem type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, String> getText() {
        return text;
    }

    public SurveyQuestionsItem text(java.util.Map<String, String> text) {
        this.text = text;
        return this;
    }

    public Boolean getRequired() {
        return required;
    }

    public SurveyQuestionsItem required(Boolean required) {
        this.required = required;
        return this;
    }

    public java.util.List<SurveyQuestionsItemOptionsItem> getOptions() {
        return options;
    }

    public SurveyQuestionsItem options(java.util.List<SurveyQuestionsItemOptionsItem> options) {
        this.options = options;
        return this;
    }

    public java.util.Map<String, String> getLowLabel() {
        return lowLabel;
    }

    public SurveyQuestionsItem lowLabel(java.util.Map<String, String> lowLabel) {
        this.lowLabel = lowLabel;
        return this;
    }

    public java.util.Map<String, String> getHighLabel() {
        return highLabel;
    }

    public SurveyQuestionsItem highLabel(java.util.Map<String, String> highLabel) {
        this.highLabel = highLabel;
        return this;
    }

    public java.util.Map<String, String> getPlaceholder() {
        return placeholder;
    }

    public SurveyQuestionsItem placeholder(java.util.Map<String, String> placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
