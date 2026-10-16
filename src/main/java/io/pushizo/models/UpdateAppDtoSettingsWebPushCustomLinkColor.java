// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushCustomLinkColor şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushCustomLinkColor {
    @JsonProperty("button")
    private String button;

    @JsonProperty("text")
    private String text;

    public String getButton() {
        return button;
    }

    public UpdateAppDtoSettingsWebPushCustomLinkColor button(String button) {
        this.button = button;
        return this;
    }

    public String getText() {
        return text;
    }

    public UpdateAppDtoSettingsWebPushCustomLinkColor text(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
