// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsBusinessHours şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsBusinessHours {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("days")
    private java.util.List<InboxSettingsBusinessHoursDaysItem> days;

    @JsonProperty("holidays")
    private java.util.List<String> holidays;

    public Boolean getEnabled() {
        return enabled;
    }

    public InboxSettingsBusinessHours enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public InboxSettingsBusinessHours timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public java.util.List<InboxSettingsBusinessHoursDaysItem> getDays() {
        return days;
    }

    public InboxSettingsBusinessHours days(java.util.List<InboxSettingsBusinessHoursDaysItem> days) {
        this.days = days;
        return this;
    }

    public java.util.List<String> getHolidays() {
        return holidays;
    }

    public InboxSettingsBusinessHours holidays(java.util.List<String> holidays) {
        this.holidays = holidays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
