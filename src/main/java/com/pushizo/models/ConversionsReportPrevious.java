// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversionsReportPrevious şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversionsReportPrevious {
    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Long conversions;

    /**
     * Zorunlu.
     */
    @JsonProperty("direct")
    private Long direct;

    /**
     * Zorunlu.
     */
    @JsonProperty("influenced")
    private Long influenced;

    /**
     * Zorunlu.
     */
    @JsonProperty("unattributed")
    private Long unattributed;

    /**
     * Zorunlu.
     */
    @JsonProperty("revenue")
    private Double revenue;

    public Long getConversions() {
        return conversions;
    }

    public ConversionsReportPrevious conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    public Long getDirect() {
        return direct;
    }

    public ConversionsReportPrevious direct(Long direct) {
        this.direct = direct;
        return this;
    }

    public Long getInfluenced() {
        return influenced;
    }

    public ConversionsReportPrevious influenced(Long influenced) {
        this.influenced = influenced;
        return this;
    }

    public Long getUnattributed() {
        return unattributed;
    }

    public ConversionsReportPrevious unattributed(Long unattributed) {
        this.unattributed = unattributed;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public ConversionsReportPrevious revenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
