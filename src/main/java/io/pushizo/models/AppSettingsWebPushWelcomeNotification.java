// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPushWelcomeNotification şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPushWelcomeNotification {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("url")
    private String url;

    @JsonProperty("texts")
    private java.util.Map<String, AppSettingsWebPushWelcomeNotificationTextsValue> texts;

    public Boolean getEnabled() {
        return enabled;
    }

    public AppSettingsWebPushWelcomeNotification enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AppSettingsWebPushWelcomeNotification url(String url) {
        this.url = url;
        return this;
    }

    public java.util.Map<String, AppSettingsWebPushWelcomeNotificationTextsValue> getTexts() {
        return texts;
    }

    public AppSettingsWebPushWelcomeNotification texts(java.util.Map<String, AppSettingsWebPushWelcomeNotificationTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
