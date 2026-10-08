// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsPreferenceCenterTextsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsPreferenceCenterTextsValue {
    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("unsubscribeAll")
    private String unsubscribeAll;

    @JsonProperty("saved")
    private String saved;

    public String getTitle() {
        return title;
    }

    public UpdateAppDtoSettingsPreferenceCenterTextsValue title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAppDtoSettingsPreferenceCenterTextsValue description(String description) {
        this.description = description;
        return this;
    }

    public String getUnsubscribeAll() {
        return unsubscribeAll;
    }

    public UpdateAppDtoSettingsPreferenceCenterTextsValue unsubscribeAll(String unsubscribeAll) {
        this.unsubscribeAll = unsubscribeAll;
        return this;
    }

    public String getSaved() {
        return saved;
    }

    public UpdateAppDtoSettingsPreferenceCenterTextsValue saved(String saved) {
        this.saved = saved;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
