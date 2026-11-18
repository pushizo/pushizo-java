// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailBounceStatsTrendItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailBounceStatsTrendItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private String day;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("bounced")
    private Long bounced;

    /**
     * Zorunlu.
     */
    @JsonProperty("soft_bounced")
    private Long softBounced;

    /**
     * Zorunlu.
     */
    @JsonProperty("rate")
    private Double rate;

    public String getDay() {
        return day;
    }

    public EmailBounceStatsTrendItem day(String day) {
        this.day = day;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public EmailBounceStatsTrendItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getBounced() {
        return bounced;
    }

    public EmailBounceStatsTrendItem bounced(Long bounced) {
        this.bounced = bounced;
        return this;
    }

    public Long getSoftBounced() {
        return softBounced;
    }

    public EmailBounceStatsTrendItem softBounced(Long softBounced) {
        this.softBounced = softBounced;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public EmailBounceStatsTrendItem rate(Double rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
