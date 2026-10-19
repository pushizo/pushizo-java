// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversionsReportRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversionsReportRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Long conversions;

    /**
     * Zorunlu.
     */
    @JsonProperty("revenue")
    private Double revenue;

    public String getDate() {
        return date;
    }

    public ConversionsReportRowsItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getConversions() {
        return conversions;
    }

    public ConversionsReportRowsItem conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public ConversionsReportRowsItem revenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
