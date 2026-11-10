// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebPersonalizationReportDailyItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebPersonalizationReportDailyItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("visitors")
    private Long visitors;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Long conversions;

    public String getDate() {
        return date;
    }

    public WebPersonalizationReportDailyItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getVisitors() {
        return visitors;
    }

    public WebPersonalizationReportDailyItem visitors(Long visitors) {
        this.visitors = visitors;
        return this;
    }

    public Long getConversions() {
        return conversions;
    }

    public WebPersonalizationReportDailyItem conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
