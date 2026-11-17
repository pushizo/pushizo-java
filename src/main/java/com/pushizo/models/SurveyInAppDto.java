// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyInAppDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyInAppDto {
    @JsonProperty("triggers")
    private java.util.List<Object> triggers;

    @JsonProperty("audience")
    private SurveyInAppDtoAudience audience;

    @JsonProperty("frequency")
    private SurveyInAppDtoFrequency frequency;

    /**
     * Değerler: "modal", "banner_bottom", "fullscreen".
     */
    @JsonProperty("layout")
    private String layout;

    @JsonProperty("publish")
    private Boolean publish;

    public java.util.List<Object> getTriggers() {
        return triggers;
    }

    public SurveyInAppDto triggers(java.util.List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    public SurveyInAppDtoAudience getAudience() {
        return audience;
    }

    public SurveyInAppDto audience(SurveyInAppDtoAudience audience) {
        this.audience = audience;
        return this;
    }

    public SurveyInAppDtoFrequency getFrequency() {
        return frequency;
    }

    public SurveyInAppDto frequency(SurveyInAppDtoFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public String getLayout() {
        return layout;
    }

    public SurveyInAppDto layout(String layout) {
        this.layout = layout;
        return this;
    }

    public Boolean getPublish() {
        return publish;
    }

    public SurveyInAppDto publish(Boolean publish) {
        this.publish = publish;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
