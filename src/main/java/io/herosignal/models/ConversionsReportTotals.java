// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversionsReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversionsReportTotals {
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
    @JsonProperty("revenue")
    private Double revenue;

    public Long getConversions() {
        return conversions;
    }

    public ConversionsReportTotals conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    public Long getDirect() {
        return direct;
    }

    public ConversionsReportTotals direct(Long direct) {
        this.direct = direct;
        return this;
    }

    public Long getInfluenced() {
        return influenced;
    }

    public ConversionsReportTotals influenced(Long influenced) {
        this.influenced = influenced;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public ConversionsReportTotals revenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
