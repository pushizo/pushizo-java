// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPushPrompt şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPushPrompt {
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
    private java.util.Map<String, AppSettingsWebPushPromptTextsValue> texts;

    @JsonProperty("categories")
    private java.util.List<AppSettingsWebPushPromptCategoriesItem> categories;

    @JsonProperty("accentColor")
    private String accentColor;

    public Boolean getEnabled() {
        return enabled;
    }

    public AppSettingsWebPushPrompt enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getType() {
        return type;
    }

    public AppSettingsWebPushPrompt type(String type) {
        this.type = type;
        return this;
    }

    public Long getDelaySeconds() {
        return delaySeconds;
    }

    public AppSettingsWebPushPrompt delaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }

    public Long getPageViews() {
        return pageViews;
    }

    public AppSettingsWebPushPrompt pageViews(Long pageViews) {
        this.pageViews = pageViews;
        return this;
    }

    public Long getScrollPercent() {
        return scrollPercent;
    }

    public AppSettingsWebPushPrompt scrollPercent(Long scrollPercent) {
        this.scrollPercent = scrollPercent;
        return this;
    }

    public java.util.Map<String, AppSettingsWebPushPromptTextsValue> getTexts() {
        return texts;
    }

    public AppSettingsWebPushPrompt texts(java.util.Map<String, AppSettingsWebPushPromptTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    public java.util.List<AppSettingsWebPushPromptCategoriesItem> getCategories() {
        return categories;
    }

    public AppSettingsWebPushPrompt categories(java.util.List<AppSettingsWebPushPromptCategoriesItem> categories) {
        this.categories = categories;
        return this;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public AppSettingsWebPushPrompt accentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
