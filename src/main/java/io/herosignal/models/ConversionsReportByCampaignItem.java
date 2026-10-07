// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversionsReportByCampaignItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversionsReportByCampaignItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_id")
    private String campaignId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    public String getCampaignId() {
        return campaignId;
    }

    public ConversionsReportByCampaignItem campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ConversionsReportByCampaignItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getConversions() {
        return conversions;
    }

    public ConversionsReportByCampaignItem conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    public Long getDirect() {
        return direct;
    }

    public ConversionsReportByCampaignItem direct(Long direct) {
        this.direct = direct;
        return this;
    }

    public Long getInfluenced() {
        return influenced;
    }

    public ConversionsReportByCampaignItem influenced(Long influenced) {
        this.influenced = influenced;
        return this;
    }

    public Double getRevenue() {
        return revenue;
    }

    public ConversionsReportByCampaignItem revenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public ConversionsReportByCampaignItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public ConversionsReportByCampaignItem conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
