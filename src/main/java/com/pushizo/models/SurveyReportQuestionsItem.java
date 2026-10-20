// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyReportQuestionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyReportQuestionsItem {
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
    @JsonProperty("counts")
    private java.util.Map<String, Long> counts;

    public String getId() {
        return id;
    }

    public SurveyReportQuestionsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public SurveyReportQuestionsItem type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, Long> getCounts() {
        return counts;
    }

    public SurveyReportQuestionsItem counts(java.util.Map<String, Long> counts) {
        this.counts = counts;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
