// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSurveyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateSurveyDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("questions")
    private java.util.List<UpdateSurveyDtoQuestionsItem> questions;

    @JsonProperty("settings")
    private UpdateSurveyDtoSettings settings;

    public String getName() {
        return name;
    }

    public UpdateSurveyDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<UpdateSurveyDtoQuestionsItem> getQuestions() {
        return questions;
    }

    public UpdateSurveyDto questions(java.util.List<UpdateSurveyDtoQuestionsItem> questions) {
        this.questions = questions;
        return this;
    }

    public UpdateSurveyDtoSettings getSettings() {
        return settings;
    }

    public UpdateSurveyDto settings(UpdateSurveyDtoSettings settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
