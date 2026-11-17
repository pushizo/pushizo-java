// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailBounceStatsRate7d şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailBounceStatsRate7d {
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
    @JsonProperty("rate")
    private Double rate;

    public Long getSent() {
        return sent;
    }

    public EmailBounceStatsRate7d sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getBounced() {
        return bounced;
    }

    public EmailBounceStatsRate7d bounced(Long bounced) {
        this.bounced = bounced;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public EmailBounceStatsRate7d rate(Double rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
