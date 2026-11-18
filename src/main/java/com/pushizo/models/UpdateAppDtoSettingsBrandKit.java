// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsBrandKit şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsBrandKit {
    @JsonProperty("website_url")
    private String websiteUrl;

    @JsonProperty("name")
    private String name;

    @JsonProperty("primary_color")
    private String primaryColor;

    @JsonProperty("accent_color")
    private String accentColor;

    @JsonProperty("font")
    private String font;

    @JsonProperty("logo_url")
    private String logoUrl;

    @JsonProperty("tone")
    private String tone;

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public UpdateAppDtoSettingsBrandKit websiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAppDtoSettingsBrandKit name(String name) {
        this.name = name;
        return this;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public UpdateAppDtoSettingsBrandKit primaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
        return this;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public UpdateAppDtoSettingsBrandKit accentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }

    public String getFont() {
        return font;
    }

    public UpdateAppDtoSettingsBrandKit font(String font) {
        this.font = font;
        return this;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public UpdateAppDtoSettingsBrandKit logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public String getTone() {
        return tone;
    }

    public UpdateAppDtoSettingsBrandKit tone(String tone) {
        this.tone = tone;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
