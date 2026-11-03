// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GlobalControlReportTreatment şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class GlobalControlReportTreatment {
    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("converted")
    private Long converted;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    public Long getUsers() {
        return users;
    }

    public GlobalControlReportTreatment users(Long users) {
        this.users = users;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public GlobalControlReportTreatment converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public GlobalControlReportTreatment conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
