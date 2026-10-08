// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ConversionsReportByCampaignItem şeması (api/openapi.yaml). */
public final class ConversionsReportByCampaignItem {

    /** "campaign_id" alanı. Zorunlu. */
    @JsonProperty("campaign_id")
    private String campaignId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "conversions" alanı. Zorunlu. */
    @JsonProperty("conversions")
    private Long conversions;

    /** "direct" alanı. Zorunlu. */
    @JsonProperty("direct")
    private Long direct;

    /** "influenced" alanı. Zorunlu. */
    @JsonProperty("influenced")
    private Long influenced;

    /** "revenue" alanı. Zorunlu. */
    @JsonProperty("revenue")
    private Double revenue;

    /** "sent" alanı. Zorunlu. */
    @JsonProperty("sent")
    private Long sent;

    /** "conversion_rate" alanı. Zorunlu. */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    /** @return "campaign_id" alanı */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * "campaign_id" alanını ayarlar.
     *
     * @param campaignId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "conversions" alanı */
    public Long getConversions() {
        return conversions;
    }

    /**
     * "conversions" alanını ayarlar.
     *
     * @param conversions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setConversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    /** @return "direct" alanı */
    public Long getDirect() {
        return direct;
    }

    /**
     * "direct" alanını ayarlar.
     *
     * @param direct yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setDirect(Long direct) {
        this.direct = direct;
        return this;
    }

    /** @return "influenced" alanı */
    public Long getInfluenced() {
        return influenced;
    }

    /**
     * "influenced" alanını ayarlar.
     *
     * @param influenced yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setInfluenced(Long influenced) {
        this.influenced = influenced;
        return this;
    }

    /** @return "revenue" alanı */
    public Double getRevenue() {
        return revenue;
    }

    /**
     * "revenue" alanını ayarlar.
     *
     * @param revenue yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setRevenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }

    /** @return "sent" alanı */
    public Long getSent() {
        return sent;
    }

    /**
     * "sent" alanını ayarlar.
     *
     * @param sent yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setSent(Long sent) {
        this.sent = sent;
        return this;
    }

    /** @return "conversion_rate" alanı */
    public Double getConversionRate() {
        return conversionRate;
    }

    /**
     * "conversion_rate" alanını ayarlar.
     *
     * @param conversionRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportByCampaignItem setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }
}
