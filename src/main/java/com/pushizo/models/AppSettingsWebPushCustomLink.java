// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPushCustomLink şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPushCustomLink {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "button", "link".
     */
    @JsonProperty("style")
    private String style;

    /**
     * Zorunlu. Değerler: "small", "medium", "large".
     */
    @JsonProperty("size")
    private String size;

    @JsonProperty("color")
    private AppSettingsWebPushCustomLinkColor color;

    @JsonProperty("texts")
    private java.util.Map<String, AppSettingsWebPushCustomLinkTextsValue> texts;

    @JsonProperty("unsubscribeEnabled")
    private Boolean unsubscribeEnabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public AppSettingsWebPushCustomLink enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getStyle() {
        return style;
    }

    public AppSettingsWebPushCustomLink style(String style) {
        this.style = style;
        return this;
    }

    public String getSize() {
        return size;
    }

    public AppSettingsWebPushCustomLink size(String size) {
        this.size = size;
        return this;
    }

    public AppSettingsWebPushCustomLinkColor getColor() {
        return color;
    }

    public AppSettingsWebPushCustomLink color(AppSettingsWebPushCustomLinkColor color) {
        this.color = color;
        return this;
    }

    public java.util.Map<String, AppSettingsWebPushCustomLinkTextsValue> getTexts() {
        return texts;
    }

    public AppSettingsWebPushCustomLink texts(java.util.Map<String, AppSettingsWebPushCustomLinkTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    public Boolean getUnsubscribeEnabled() {
        return unsubscribeEnabled;
    }

    public AppSettingsWebPushCustomLink unsubscribeEnabled(Boolean unsubscribeEnabled) {
        this.unsubscribeEnabled = unsubscribeEnabled;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
