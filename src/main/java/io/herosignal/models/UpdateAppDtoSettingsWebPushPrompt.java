// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushPrompt şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushPrompt {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "slidedown", "native".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("delaySeconds")
    private Long delaySeconds;

    @JsonProperty("pageViews")
    private Long pageViews;

    @JsonProperty("scrollPercent")
    private Long scrollPercent;

    @JsonProperty("texts")
    private java.util.Map<String, UpdateAppDtoSettingsWebPushPromptTextsValue> texts;

    @JsonProperty("categories")
    private java.util.List<UpdateAppDtoSettingsWebPushPromptCategoriesItem> categories;

    @JsonProperty("accentColor")
    private String accentColor;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateAppDtoSettingsWebPushPrompt enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateAppDtoSettingsWebPushPrompt type(String type) {
        this.type = type;
        return this;
    }

    public Long getDelaySeconds() {
        return delaySeconds;
    }

    public UpdateAppDtoSettingsWebPushPrompt delaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }

    public Long getPageViews() {
        return pageViews;
    }

    public UpdateAppDtoSettingsWebPushPrompt pageViews(Long pageViews) {
        this.pageViews = pageViews;
        return this;
    }

    public Long getScrollPercent() {
        return scrollPercent;
    }

    public UpdateAppDtoSettingsWebPushPrompt scrollPercent(Long scrollPercent) {
        this.scrollPercent = scrollPercent;
        return this;
    }

    public java.util.Map<String, UpdateAppDtoSettingsWebPushPromptTextsValue> getTexts() {
        return texts;
    }

    public UpdateAppDtoSettingsWebPushPrompt texts(java.util.Map<String, UpdateAppDtoSettingsWebPushPromptTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    public java.util.List<UpdateAppDtoSettingsWebPushPromptCategoriesItem> getCategories() {
        return categories;
    }

    public UpdateAppDtoSettingsWebPushPrompt categories(java.util.List<UpdateAppDtoSettingsWebPushPromptCategoriesItem> categories) {
        this.categories = categories;
        return this;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public UpdateAppDtoSettingsWebPushPrompt accentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
