// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDtoDocumentSettingsDarkMode şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDtoDocumentSettingsDarkMode {
    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("content_background_color")
    private String contentBackgroundColor;

    @JsonProperty("text_color")
    private String textColor;

    @JsonProperty("link_color")
    private String linkColor;

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public UpdateLandingPageDtoDocumentSettingsDarkMode backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getContentBackgroundColor() {
        return contentBackgroundColor;
    }

    public UpdateLandingPageDtoDocumentSettingsDarkMode contentBackgroundColor(String contentBackgroundColor) {
        this.contentBackgroundColor = contentBackgroundColor;
        return this;
    }

    public String getTextColor() {
        return textColor;
    }

    public UpdateLandingPageDtoDocumentSettingsDarkMode textColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    public String getLinkColor() {
        return linkColor;
    }

    public UpdateLandingPageDtoDocumentSettingsDarkMode linkColor(String linkColor) {
        this.linkColor = linkColor;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
