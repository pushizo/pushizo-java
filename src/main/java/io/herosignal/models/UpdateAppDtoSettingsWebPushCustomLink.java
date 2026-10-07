// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushCustomLink şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushCustomLink {
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
    private UpdateAppDtoSettingsWebPushCustomLinkColor color;

    @JsonProperty("texts")
    private java.util.Map<String, UpdateAppDtoSettingsWebPushCustomLinkTextsValue> texts;

    @JsonProperty("unsubscribeEnabled")
    private Boolean unsubscribeEnabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateAppDtoSettingsWebPushCustomLink enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getStyle() {
        return style;
    }

    public UpdateAppDtoSettingsWebPushCustomLink style(String style) {
        this.style = style;
        return this;
    }

    public String getSize() {
        return size;
    }

    public UpdateAppDtoSettingsWebPushCustomLink size(String size) {
        this.size = size;
        return this;
    }

    public UpdateAppDtoSettingsWebPushCustomLinkColor getColor() {
        return color;
    }

    public UpdateAppDtoSettingsWebPushCustomLink color(UpdateAppDtoSettingsWebPushCustomLinkColor color) {
        this.color = color;
        return this;
    }

    public java.util.Map<String, UpdateAppDtoSettingsWebPushCustomLinkTextsValue> getTexts() {
        return texts;
    }

    public UpdateAppDtoSettingsWebPushCustomLink texts(java.util.Map<String, UpdateAppDtoSettingsWebPushCustomLinkTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    public Boolean getUnsubscribeEnabled() {
        return unsubscribeEnabled;
    }

    public UpdateAppDtoSettingsWebPushCustomLink unsubscribeEnabled(Boolean unsubscribeEnabled) {
        this.unsubscribeEnabled = unsubscribeEnabled;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
