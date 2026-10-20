// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsBusinessHoursDaysItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsBusinessHoursDaysItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private Long day;

    /**
     * Zorunlu.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Zorunlu.
     */
    @JsonProperty("end")
    private String end;

    public Long getDay() {
        return day;
    }

    public InboxSettingsBusinessHoursDaysItem day(Long day) {
        this.day = day;
        return this;
    }

    public String getStart() {
        return start;
    }

    public InboxSettingsBusinessHoursDaysItem start(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public InboxSettingsBusinessHoursDaysItem end(String end) {
        this.end = end;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
