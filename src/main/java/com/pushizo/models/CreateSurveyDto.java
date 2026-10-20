// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSurveyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateSurveyDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("questions")
    private java.util.List<CreateSurveyDtoQuestionsItem> questions;

    @JsonProperty("settings")
    private CreateSurveyDtoSettings settings;

    public String getName() {
        return name;
    }

    public CreateSurveyDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<CreateSurveyDtoQuestionsItem> getQuestions() {
        return questions;
    }

    public CreateSurveyDto questions(java.util.List<CreateSurveyDtoQuestionsItem> questions) {
        this.questions = questions;
        return this;
    }

    public CreateSurveyDtoSettings getSettings() {
        return settings;
    }

    public CreateSurveyDto settings(CreateSurveyDtoSettings settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
