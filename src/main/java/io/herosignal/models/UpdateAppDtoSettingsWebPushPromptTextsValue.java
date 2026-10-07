// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushPromptTextsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushPromptTextsValue {
    @JsonProperty("title")
    private String title;

    @JsonProperty("message")
    private String message;

    @JsonProperty("accept")
    private String accept;

    @JsonProperty("cancel")
    private String cancel;

    public String getTitle() {
        return title;
    }

    public UpdateAppDtoSettingsWebPushPromptTextsValue title(String title) {
        this.title = title;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public UpdateAppDtoSettingsWebPushPromptTextsValue message(String message) {
        this.message = message;
        return this;
    }

    public String getAccept() {
        return accept;
    }

    public UpdateAppDtoSettingsWebPushPromptTextsValue accept(String accept) {
        this.accept = accept;
        return this;
    }

    public String getCancel() {
        return cancel;
    }

    public UpdateAppDtoSettingsWebPushPromptTextsValue cancel(String cancel) {
        this.cancel = cancel;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
