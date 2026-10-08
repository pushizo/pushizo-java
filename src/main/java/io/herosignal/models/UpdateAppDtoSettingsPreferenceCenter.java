// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsPreferenceCenter şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsPreferenceCenter {
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
    private java.util.Map<String, UpdateAppDtoSettingsPreferenceCenterTextsValue> texts;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateAppDtoSettingsPreferenceCenter enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public UpdateAppDtoSettingsPreferenceCenter brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public UpdateAppDtoSettingsPreferenceCenter logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public UpdateAppDtoSettingsPreferenceCenter accentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }

    public String getCustomUnsubscribeUrl() {
        return customUnsubscribeUrl;
    }

    public UpdateAppDtoSettingsPreferenceCenter customUnsubscribeUrl(String customUnsubscribeUrl) {
        this.customUnsubscribeUrl = customUnsubscribeUrl;
        return this;
    }

    public java.util.Map<String, UpdateAppDtoSettingsPreferenceCenterTextsValue> getTexts() {
        return texts;
    }

    public UpdateAppDtoSettingsPreferenceCenter texts(java.util.Map<String, UpdateAppDtoSettingsPreferenceCenterTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
