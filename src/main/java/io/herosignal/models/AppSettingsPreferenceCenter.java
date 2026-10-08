// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsPreferenceCenter şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsPreferenceCenter {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("brandName")
    private String brandName;

    @JsonProperty("logoUrl")
    private String logoUrl;

    @JsonProperty("accentColor")
    private String accentColor;

    @JsonProperty("customUnsubscribeUrl")
    private String customUnsubscribeUrl;

    @JsonProperty("texts")
    private java.util.Map<String, AppSettingsPreferenceCenterTextsValue> texts;

    public Boolean getEnabled() {
        return enabled;
    }

    public AppSettingsPreferenceCenter enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public AppSettingsPreferenceCenter brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public AppSettingsPreferenceCenter logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public AppSettingsPreferenceCenter accentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }

    public String getCustomUnsubscribeUrl() {
        return customUnsubscribeUrl;
    }

    public AppSettingsPreferenceCenter customUnsubscribeUrl(String customUnsubscribeUrl) {
        this.customUnsubscribeUrl = customUnsubscribeUrl;
        return this;
    }

    public java.util.Map<String, AppSettingsPreferenceCenterTextsValue> getTexts() {
        return texts;
    }

    public AppSettingsPreferenceCenter texts(java.util.Map<String, AppSettingsPreferenceCenterTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
