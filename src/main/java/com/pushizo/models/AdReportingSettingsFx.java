// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdReportingSettingsFx şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdReportingSettingsFx {
    /**
     * Zorunlu.
     */
    @JsonProperty("latest_day")
    private String latestDay;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    public String getLatestDay() {
        return latestDay;
    }

    public AdReportingSettingsFx latestDay(String latestDay) {
        this.latestDay = latestDay;
        return this;
    }

    public String getSource() {
        return source;
    }

    public AdReportingSettingsFx source(String source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
