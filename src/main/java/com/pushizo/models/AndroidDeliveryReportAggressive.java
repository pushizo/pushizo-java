// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AndroidDeliveryReportAggressive şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AndroidDeliveryReportAggressive {
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
    @JsonProperty("delivery_rate")
    private Double deliveryRate;

    public Long getSent() {
        return sent;
    }

    public AndroidDeliveryReportAggressive sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public AndroidDeliveryReportAggressive delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public AndroidDeliveryReportAggressive deliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
