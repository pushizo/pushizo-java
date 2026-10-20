// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebCampaignDtoDisplay şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebCampaignDtoDisplay {
    /**
     * Zorunlu. Değerler: "popup", "banner_top", "banner_bottom", "slide_in", "fullscreen".
     */
    @JsonProperty("layout")
    private String layout;

    /**
     * Değerler: "left", "right".
     */
    @JsonProperty("position")
    private String position;

    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("text_color")
    private String textColor;

    @JsonProperty("dismissible")
    private Boolean dismissible;

    @JsonProperty("auto_dismiss_seconds")
    private Long autoDismissSeconds;

    @JsonProperty("max_width")
    private Long maxWidth;

    /**
     * Zorunlu.
     */
    @JsonProperty("blocks")
    private java.util.List<Object> blocks;

    @JsonProperty("form_id")
    private String formId;

    @JsonProperty("survey_id")
    private String surveyId;

    public String getLayout() {
        return layout;
    }

    public UpdateWebCampaignDtoDisplay layout(String layout) {
        this.layout = layout;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public UpdateWebCampaignDtoDisplay position(String position) {
        this.position = position;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public UpdateWebCampaignDtoDisplay backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getTextColor() {
        return textColor;
    }

    public UpdateWebCampaignDtoDisplay textColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    public Boolean getDismissible() {
        return dismissible;
    }

    public UpdateWebCampaignDtoDisplay dismissible(Boolean dismissible) {
        this.dismissible = dismissible;
        return this;
    }

    public Long getAutoDismissSeconds() {
        return autoDismissSeconds;
    }

    public UpdateWebCampaignDtoDisplay autoDismissSeconds(Long autoDismissSeconds) {
        this.autoDismissSeconds = autoDismissSeconds;
        return this;
    }

    public Long getMaxWidth() {
        return maxWidth;
    }

    public UpdateWebCampaignDtoDisplay maxWidth(Long maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    public java.util.List<Object> getBlocks() {
        return blocks;
    }

    public UpdateWebCampaignDtoDisplay blocks(java.util.List<Object> blocks) {
        this.blocks = blocks;
        return this;
    }

    public String getFormId() {
        return formId;
    }

    public UpdateWebCampaignDtoDisplay formId(String formId) {
        this.formId = formId;
        return this;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public UpdateWebCampaignDtoDisplay surveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
