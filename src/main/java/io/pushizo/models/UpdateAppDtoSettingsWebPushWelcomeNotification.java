// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushWelcomeNotification şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushWelcomeNotification {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("url")
    private String url;

    @JsonProperty("texts")
    private java.util.Map<String, UpdateAppDtoSettingsWebPushWelcomeNotificationTextsValue> texts;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateAppDtoSettingsWebPushWelcomeNotification enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public UpdateAppDtoSettingsWebPushWelcomeNotification url(String url) {
        this.url = url;
        return this;
    }

    public java.util.Map<String, UpdateAppDtoSettingsWebPushWelcomeNotificationTextsValue> getTexts() {
        return texts;
    }

    public UpdateAppDtoSettingsWebPushWelcomeNotification texts(java.util.Map<String, UpdateAppDtoSettingsWebPushWelcomeNotificationTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
