// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsUpdateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsUpdateDto {
    @JsonProperty("widget")
    private InboxSettingsUpdateDtoWidget widget;

    @JsonProperty("business_hours")
    private InboxSettingsUpdateDtoBusinessHours businessHours;

    @JsonProperty("routing")
    private InboxSettingsUpdateDtoRouting routing;

    @JsonProperty("email")
    private InboxSettingsUpdateDtoEmail email;

    public InboxSettingsUpdateDtoWidget getWidget() {
        return widget;
    }

    public InboxSettingsUpdateDto widget(InboxSettingsUpdateDtoWidget widget) {
        this.widget = widget;
        return this;
    }

    public InboxSettingsUpdateDtoBusinessHours getBusinessHours() {
        return businessHours;
    }

    public InboxSettingsUpdateDto businessHours(InboxSettingsUpdateDtoBusinessHours businessHours) {
        this.businessHours = businessHours;
        return this;
    }

    public InboxSettingsUpdateDtoRouting getRouting() {
        return routing;
    }

    public InboxSettingsUpdateDto routing(InboxSettingsUpdateDtoRouting routing) {
        this.routing = routing;
        return this;
    }

    public InboxSettingsUpdateDtoEmail getEmail() {
        return email;
    }

    public InboxSettingsUpdateDto email(InboxSettingsUpdateDtoEmail email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
