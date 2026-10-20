// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettings {
    /**
     * Zorunlu.
     */
    @JsonProperty("widget")
    private InboxSettingsWidget widget;

    /**
     * Zorunlu.
     */
    @JsonProperty("business_hours")
    private InboxSettingsBusinessHours businessHours;

    /**
     * Zorunlu.
     */
    @JsonProperty("routing")
    private InboxSettingsRouting routing;

    /**
     * Zorunlu.
     */
    @JsonProperty("email")
    private InboxSettingsEmail email;

    /**
     * Zorunlu.
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * Zorunlu.
     */
    @JsonProperty("within_business_hours")
    private Boolean withinBusinessHours;

    /**
     * Zorunlu.
     */
    @JsonProperty("install")
    private InboxSettingsInstall install;

    public InboxSettingsWidget getWidget() {
        return widget;
    }

    public InboxSettings widget(InboxSettingsWidget widget) {
        this.widget = widget;
        return this;
    }

    public InboxSettingsBusinessHours getBusinessHours() {
        return businessHours;
    }

    public InboxSettings businessHours(InboxSettingsBusinessHours businessHours) {
        this.businessHours = businessHours;
        return this;
    }

    public InboxSettingsRouting getRouting() {
        return routing;
    }

    public InboxSettings routing(InboxSettingsRouting routing) {
        this.routing = routing;
        return this;
    }

    public InboxSettingsEmail getEmail() {
        return email;
    }

    public InboxSettings email(InboxSettingsEmail email) {
        this.email = email;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public InboxSettings timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public Boolean getWithinBusinessHours() {
        return withinBusinessHours;
    }

    public InboxSettings withinBusinessHours(Boolean withinBusinessHours) {
        this.withinBusinessHours = withinBusinessHours;
        return this;
    }

    public InboxSettingsInstall getInstall() {
        return install;
    }

    public InboxSettings install(InboxSettingsInstall install) {
        this.install = install;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
