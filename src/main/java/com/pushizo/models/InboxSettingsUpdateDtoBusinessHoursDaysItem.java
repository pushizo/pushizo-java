// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsUpdateDtoBusinessHoursDaysItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsUpdateDtoBusinessHoursDaysItem {
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

    public InboxSettingsUpdateDtoBusinessHoursDaysItem day(Long day) {
        this.day = day;
        return this;
    }

    public String getStart() {
        return start;
    }

    public InboxSettingsUpdateDtoBusinessHoursDaysItem start(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public InboxSettingsUpdateDtoBusinessHoursDaysItem end(String end) {
        this.end = end;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
