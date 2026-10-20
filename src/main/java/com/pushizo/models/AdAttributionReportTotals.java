// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdAttributionReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdAttributionReportTotals {
    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Double conversions;

    /**
     * Zorunlu.
     */
    @JsonProperty("revenue")
    private Double revenue;

    /**
     * Zorunlu.
     */
    @JsonProperty("spend")
    private Double spend;

    /**
     * Zorunlu.
     */
    @JsonProperty("new_customers")
    private Double newCustomers;

    /**
     * Zorunlu.
     */
    @JsonProperty("roas")
    private Double roas;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_roas")
    private Double platformRoas;

    /**
     * Zorunlu.
     */
    @JsonProperty("cac")
    private Double cac;

    /**
     * Zorunlu.
     */
    @JsonProperty("paid_cac")
    private Double paidCac;

    public Double getConversions() {
        return conversions;
    }

    public AdAttributionReportTotals conversions(Double conversions) {
        this.conversions = conversions;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public AdAttributionReportTotals revenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    public Double getSpend() {
        return spend;
    }

    public AdAttributionReportTotals spend(Double spend) {
        this.spend = spend;
        return this;
    }

    public Double getNewCustomers() {
        return newCustomers;
    }

    public AdAttributionReportTotals newCustomers(Double newCustomers) {
        this.newCustomers = newCustomers;
        return this;
    }

    public Double getRoas() {
        return roas;
    }

    public AdAttributionReportTotals roas(Double roas) {
        this.roas = roas;
        return this;
    }

    public Double getPlatformRoas() {
        return platformRoas;
    }

    public AdAttributionReportTotals platformRoas(Double platformRoas) {
        this.platformRoas = platformRoas;
        return this;
    }

    public Double getCac() {
        return cac;
    }

    public AdAttributionReportTotals cac(Double cac) {
        this.cac = cac;
        return this;
    }

    public Double getPaidCac() {
        return paidCac;
    }

    public AdAttributionReportTotals paidCac(Double paidCac) {
        this.paidCac = paidCac;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
