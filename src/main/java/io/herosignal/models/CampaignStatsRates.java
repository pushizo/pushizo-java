// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CampaignStatsRates şeması (api/openapi.yaml). */
public final class CampaignStatsRates {

    /** "delivery_rate" alanı. Zorunlu. */
    @JsonProperty("delivery_rate")
    private Double deliveryRate;

    /** "open_rate" alanı. Zorunlu. */
    @JsonProperty("open_rate")
    private Double openRate;

    /** "click_rate" alanı. Zorunlu. */
    @JsonProperty("click_rate")
    private Double clickRate;

    /** "failure_rate" alanı. Zorunlu. */
    @JsonProperty("failure_rate")
    private Double failureRate;

    /** "conversion_rate" alanı. Zorunlu. */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    /** @return "delivery_rate" alanı */
    public Double getDeliveryRate() {
        return deliveryRate;
    }

    /**
     * "delivery_rate" alanını ayarlar.
     *
     * @param deliveryRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStatsRates setDeliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    /** @return "open_rate" alanı */
    public Double getOpenRate() {
        return openRate;
    }

    /**
     * "open_rate" alanını ayarlar.
     *
     * @param openRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStatsRates setOpenRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    /** @return "click_rate" alanı */
    public Double getClickRate() {
        return clickRate;
    }

    /**
     * "click_rate" alanını ayarlar.
     *
     * @param clickRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStatsRates setClickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    /** @return "failure_rate" alanı */
    public Double getFailureRate() {
        return failureRate;
    }

    /**
     * "failure_rate" alanını ayarlar.
     *
     * @param failureRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStatsRates setFailureRate(Double failureRate) {
        this.failureRate = failureRate;
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
    public CampaignStatsRates setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }
}
