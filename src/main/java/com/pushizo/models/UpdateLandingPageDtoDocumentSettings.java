// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDtoDocumentSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDtoDocumentSettings {
    @JsonProperty("width")
    private Long width;

    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("content_background_color")
    private String contentBackgroundColor;

    @JsonProperty("text_color")
    private String textColor;

    @JsonProperty("link_color")
    private String linkColor;

    /**
     * Değerler: "system", "arial", "georgia", "verdana", "trebuchet", "courier".
     */
    @JsonProperty("font_family")
    private String fontFamily;

    @JsonProperty("dark_mode")
    private UpdateLandingPageDtoDocumentSettingsDarkMode darkMode;

    public Long getWidth() {
        return width;
    }

    public UpdateLandingPageDtoDocumentSettings width(Long width) {
        this.width = width;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public UpdateLandingPageDtoDocumentSettings backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getContentBackgroundColor() {
        return contentBackgroundColor;
    }

    public UpdateLandingPageDtoDocumentSettings contentBackgroundColor(String contentBackgroundColor) {
        this.contentBackgroundColor = contentBackgroundColor;
        return this;
    }

    public String getTextColor() {
        return textColor;
    }

    public UpdateLandingPageDtoDocumentSettings textColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    public String getLinkColor() {
        return linkColor;
    }

    public UpdateLandingPageDtoDocumentSettings linkColor(String linkColor) {
        this.linkColor = linkColor;
        return this;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public UpdateLandingPageDtoDocumentSettings fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public UpdateLandingPageDtoDocumentSettingsDarkMode getDarkMode() {
        return darkMode;
    }

    public UpdateLandingPageDtoDocumentSettings darkMode(UpdateLandingPageDtoDocumentSettingsDarkMode darkMode) {
        this.darkMode = darkMode;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
