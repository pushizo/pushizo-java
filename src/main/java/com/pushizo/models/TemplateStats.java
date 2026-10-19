// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TemplateStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TemplateStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("template_id")
    private String templateId;

    /**
     * Zorunlu.
     */
    @JsonProperty("messages")
    private Long messages;

    /**
     * Zorunlu.
     */
    @JsonProperty("campaigns")
    private Long campaigns;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("last_used_at")
    private String lastUsedAt;

    public String getTemplateId() {
        return templateId;
    }

    public TemplateStats templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public Long getMessages() {
        return messages;
    }

    public TemplateStats messages(Long messages) {
        this.messages = messages;
        return this;
    }

    public Long getCampaigns() {
        return campaigns;
    }

    public TemplateStats campaigns(Long campaigns) {
        this.campaigns = campaigns;
        return this;
    }

    public Long getTargeted() {
        return targeted;
    }

    public TemplateStats targeted(Long targeted) {
        this.targeted = targeted;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public TemplateStats sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public TemplateStats delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public TemplateStats opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public TemplateStats clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public TemplateStats converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Double getOpenRate() {
        return openRate;
    }

    public TemplateStats openRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public TemplateStats clickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public TemplateStats conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    public String getLastUsedAt() {
        return lastUsedAt;
    }

    public TemplateStats lastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
