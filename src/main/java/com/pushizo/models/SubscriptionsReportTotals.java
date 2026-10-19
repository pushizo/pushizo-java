// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubscriptionsReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SubscriptionsReportTotals {
    /**
     * Zorunlu.
     */
    @JsonProperty("active")
    private Long active;

    /**
     * Zorunlu.
     */
    @JsonProperty("new")
    private Long new_;

    /**
     * Zorunlu.
     */
    @JsonProperty("unsubscribed")
    private Long unsubscribed;

    /**
     * Zorunlu.
     */
    @JsonProperty("opt_outs")
    private Long optOuts;

    /**
     * Zorunlu.
     */
    @JsonProperty("net")
    private Long net;

    public Long getActive() {
        return active;
    }

    public SubscriptionsReportTotals active(Long active) {
        this.active = active;
        return this;
    }

    public Long getNew_() {
        return new_;
    }

    public SubscriptionsReportTotals new_(Long new_) {
        this.new_ = new_;
        return this;
    }

    public Long getUnsubscribed() {
        return unsubscribed;
    }

    public SubscriptionsReportTotals unsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }

    public Long getOptOuts() {
        return optOuts;
    }

    public SubscriptionsReportTotals optOuts(Long optOuts) {
        this.optOuts = optOuts;
        return this;
    }

    public Long getNet() {
        return net;
    }

    public SubscriptionsReportTotals net(Long net) {
        this.net = net;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
