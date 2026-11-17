// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailProviderInsightsTrendItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailProviderInsightsTrendItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private String day;

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
    @JsonProperty("bounced")
    private Long bounced;

    public String getDay() {
        return day;
    }

    public EmailProviderInsightsTrendItem day(String day) {
        this.day = day;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public EmailProviderInsightsTrendItem provider(String provider) {
        this.provider = provider;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public EmailProviderInsightsTrendItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public EmailProviderInsightsTrendItem delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getBounced() {
        return bounced;
    }

    public EmailProviderInsightsTrendItem bounced(Long bounced) {
        this.bounced = bounced;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
