// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReportOverageLinesItemAmounts şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReportOverageLinesItemAmounts {
    /**
     * Zorunlu.
     */
    @JsonProperty("USD")
    private Double usd;

    /**
     * Zorunlu.
     */
    @JsonProperty("TRY")
    private Double try_;

    public Double getUsd() {
        return usd;
    }

    public UsageReportOverageLinesItemAmounts usd(Double usd) {
        this.usd = usd;
        return this;
    }

    public Double getTry_() {
        return try_;
    }

    public UsageReportOverageLinesItemAmounts try_(Double try_) {
        this.try_ = try_;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
