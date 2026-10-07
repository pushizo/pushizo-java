// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushWelcomeNotificationTextsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushWelcomeNotificationTextsValue {
    @JsonProperty("title")
    private String title;

    @JsonProperty("message")
    private String message;

    public String getTitle() {
        return title;
    }

    public UpdateAppDtoSettingsWebPushWelcomeNotificationTextsValue title(String title) {
        this.title = title;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public UpdateAppDtoSettingsWebPushWelcomeNotificationTextsValue message(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
