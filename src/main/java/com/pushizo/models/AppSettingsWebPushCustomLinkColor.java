// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPushCustomLinkColor şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPushCustomLinkColor {
    @JsonProperty("button")
    private String button;

    @JsonProperty("text")
    private String text;

    public String getButton() {
        return button;
    }

    public AppSettingsWebPushCustomLinkColor button(String button) {
        this.button = button;
        return this;
    }

    public String getText() {
        return text;
    }

    public AppSettingsWebPushCustomLinkColor text(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
