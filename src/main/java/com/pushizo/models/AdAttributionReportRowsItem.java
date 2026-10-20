// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdAttributionReportRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdAttributionReportRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu. Değerler: "meta", "google", "tiktok", "linkedin", "microsoft", "other_paid", "utm", "push", "email", "sms", "whatsapp", "rcs", "direct".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Zorunlu.
     */
    @JsonProperty("paid")
    private Boolean paid;

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
    @JsonProperty("new_customers")
    private Double newCustomers;

    /**
     * Zorunlu.
     */
    @JsonProperty("spend")
    private Double spend;

    /**
     * Zorunlu.
     */
    @JsonProperty("roas")
    private Double roas;

    /**
     * Zorunlu.
     */
    @JsonProperty("cac")
    private Double cac;

    public String getKey() {
        return key;
    }

    public AdAttributionReportRowsItem key(String key) {
        this.key = key;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public AdAttributionReportRowsItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public AdAttributionReportRowsItem label(String label) {
        this.label = label;
        return this;
    }

    public Boolean getPaid() {
        return paid;
    }

    public AdAttributionReportRowsItem paid(Boolean paid) {
        this.paid = paid;
        return this;
    }

    public Double getConversions() {
        return conversions;
    }

    public AdAttributionReportRowsItem conversions(Double conversions) {
        this.conversions = conversions;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public AdAttributionReportRowsItem revenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    public Double getNewCustomers() {
        return newCustomers;
    }

    public AdAttributionReportRowsItem newCustomers(Double newCustomers) {
        this.newCustomers = newCustomers;
        return this;
    }

    public Double getSpend() {
        return spend;
    }

    public AdAttributionReportRowsItem spend(Double spend) {
        this.spend = spend;
        return this;
    }

    public Double getRoas() {
        return roas;
    }

    public AdAttributionReportRowsItem roas(Double roas) {
        this.roas = roas;
        return this;
    }

    public Double getCac() {
        return cac;
    }

    public AdAttributionReportRowsItem cac(Double cac) {
        this.cac = cac;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
