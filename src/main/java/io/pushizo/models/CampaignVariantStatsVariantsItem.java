// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignVariantStatsVariantsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignVariantStatsVariantsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("variant_id")
    private String variantId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("weight_percent")
    private Long weightPercent;

    /**
     * Zorunlu.
     */
    @JsonProperty("is_control")
    private Boolean isControl;

    /**
     * Zorunlu.
     */
    @JsonProperty("targeted")
    private Long targeted;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivered")
    private Long delivered;

    /**
     * Zorunlu.
     */
    @JsonProperty("opened")
    private Long opened;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked")
    private Long clicked;

    /**
     * Zorunlu.
     */
    @JsonProperty("converted")
    private Long converted;

    /**
     * Zorunlu.
     */
    @JsonProperty("holdout")
    private Long holdout;

    /**
     * Zorunlu.
     */
    @JsonProperty("open_rate")
    private Double openRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("click_rate")
    private Double clickRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    public String getVariantId() {
        return variantId;
    }

    public CampaignVariantStatsVariantsItem variantId(String variantId) {
        this.variantId = variantId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CampaignVariantStatsVariantsItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getWeightPercent() {
        return weightPercent;
    }

    public CampaignVariantStatsVariantsItem weightPercent(Long weightPercent) {
        this.weightPercent = weightPercent;
        return this;
    }

    public Boolean getIsControl() {
        return isControl;
    }

    public CampaignVariantStatsVariantsItem isControl(Boolean isControl) {
        this.isControl = isControl;
        return this;
    }

    public Long getTargeted() {
        return targeted;
    }

    public CampaignVariantStatsVariantsItem targeted(Long targeted) {
        this.targeted = targeted;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public CampaignVariantStatsVariantsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public CampaignVariantStatsVariantsItem delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public CampaignVariantStatsVariantsItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public CampaignVariantStatsVariantsItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public CampaignVariantStatsVariantsItem converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Long getHoldout() {
        return holdout;
    }

    public CampaignVariantStatsVariantsItem holdout(Long holdout) {
        this.holdout = holdout;
        return this;
    }

    public Double getOpenRate() {
        return openRate;
    }

    public CampaignVariantStatsVariantsItem openRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public CampaignVariantStatsVariantsItem clickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public CampaignVariantStatsVariantsItem conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
