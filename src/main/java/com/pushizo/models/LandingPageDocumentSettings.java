// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageDocumentSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageDocumentSettings {
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
    private LandingPageDocumentSettingsDarkMode darkMode;

    public Long getWidth() {
        return width;
    }

    public LandingPageDocumentSettings width(Long width) {
        this.width = width;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public LandingPageDocumentSettings backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getContentBackgroundColor() {
        return contentBackgroundColor;
    }

    public LandingPageDocumentSettings contentBackgroundColor(String contentBackgroundColor) {
        this.contentBackgroundColor = contentBackgroundColor;
        return this;
    }

    public String getTextColor() {
        return textColor;
    }

    public LandingPageDocumentSettings textColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    public String getLinkColor() {
        return linkColor;
    }

    public LandingPageDocumentSettings linkColor(String linkColor) {
        this.linkColor = linkColor;
        return this;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public LandingPageDocumentSettings fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public LandingPageDocumentSettingsDarkMode getDarkMode() {
        return darkMode;
    }

    public LandingPageDocumentSettings darkMode(LandingPageDocumentSettingsDarkMode darkMode) {
        this.darkMode = darkMode;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
