// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSurveyDtoQuestionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateSurveyDtoQuestionsItem {
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
    private java.util.List<UpdateSurveyDtoQuestionsItemOptionsItem> options;

    @JsonProperty("low_label")
    private java.util.Map<String, String> lowLabel;

    @JsonProperty("high_label")
    private java.util.Map<String, String> highLabel;

    @JsonProperty("placeholder")
    private java.util.Map<String, String> placeholder;

    public String getId() {
        return id;
    }

    public UpdateSurveyDtoQuestionsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateSurveyDtoQuestionsItem type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, String> getText() {
        return text;
    }

    public UpdateSurveyDtoQuestionsItem text(java.util.Map<String, String> text) {
        this.text = text;
        return this;
    }

    public Boolean getRequired() {
        return required;
    }

    public UpdateSurveyDtoQuestionsItem required(Boolean required) {
        this.required = required;
        return this;
    }

    public java.util.List<UpdateSurveyDtoQuestionsItemOptionsItem> getOptions() {
        return options;
    }

    public UpdateSurveyDtoQuestionsItem options(java.util.List<UpdateSurveyDtoQuestionsItemOptionsItem> options) {
        this.options = options;
        return this;
    }

    public java.util.Map<String, String> getLowLabel() {
        return lowLabel;
    }

    public UpdateSurveyDtoQuestionsItem lowLabel(java.util.Map<String, String> lowLabel) {
        this.lowLabel = lowLabel;
        return this;
    }

    public java.util.Map<String, String> getHighLabel() {
        return highLabel;
    }

    public UpdateSurveyDtoQuestionsItem highLabel(java.util.Map<String, String> highLabel) {
        this.highLabel = highLabel;
        return this;
    }

    public java.util.Map<String, String> getPlaceholder() {
        return placeholder;
    }

    public UpdateSurveyDtoQuestionsItem placeholder(java.util.Map<String, String> placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
