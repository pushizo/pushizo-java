// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailProviderInsightsProvidersItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailProviderInsightsProvidersItem {
    /**
     * Zorunlu. Değerler: "gmail", "outlook", "yahoo", "other".
     */
    @JsonProperty("provider")
    private String provider;

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
    @JsonProperty("bounced")
    private Long bounced;

    /**
     * Zorunlu.
     */
    @JsonProperty("complained")
    private Long complained;

    public String getProvider() {
        return provider;
    }

    public EmailProviderInsightsProvidersItem provider(String provider) {
        this.provider = provider;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public EmailProviderInsightsProvidersItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public EmailProviderInsightsProvidersItem delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public EmailProviderInsightsProvidersItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public EmailProviderInsightsProvidersItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getBounced() {
        return bounced;
    }

    public EmailProviderInsightsProvidersItem bounced(Long bounced) {
        this.bounced = bounced;
        return this;
    }

    public Long getComplained() {
        return complained;
    }

    public EmailProviderInsightsProvidersItem complained(Long complained) {
        this.complained = complained;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
