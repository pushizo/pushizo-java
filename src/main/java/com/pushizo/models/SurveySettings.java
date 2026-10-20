// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveySettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveySettings {
    @JsonProperty("thank_you")
    private java.util.Map<String, String> thankYou;

    @JsonProperty("submit_label")
    private java.util.Map<String, String> submitLabel;

    @JsonProperty("write_properties")
    private Boolean writeProperties;

    @JsonProperty("allow_multiple")
    private Boolean allowMultiple;

    @JsonProperty("default_language")
    private String defaultLanguage;

    public java.util.Map<String, String> getThankYou() {
        return thankYou;
    }

    public SurveySettings thankYou(java.util.Map<String, String> thankYou) {
        this.thankYou = thankYou;
        return this;
    }

    public java.util.Map<String, String> getSubmitLabel() {
        return submitLabel;
    }

    public SurveySettings submitLabel(java.util.Map<String, String> submitLabel) {
        this.submitLabel = submitLabel;
        return this;
    }

    public Boolean getWriteProperties() {
        return writeProperties;
    }

    public SurveySettings writeProperties(Boolean writeProperties) {
        this.writeProperties = writeProperties;
        return this;
    }

    public Boolean getAllowMultiple() {
        return allowMultiple;
    }

    public SurveySettings allowMultiple(Boolean allowMultiple) {
        this.allowMultiple = allowMultiple;
        return this;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public SurveySettings defaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
