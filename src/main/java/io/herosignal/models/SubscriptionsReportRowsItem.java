// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubscriptionsReportRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SubscriptionsReportRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

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

    public String getDate() {
        return date;
    }

    public SubscriptionsReportRowsItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getNew_() {
        return new_;
    }

    public SubscriptionsReportRowsItem new_(Long new_) {
        this.new_ = new_;
        return this;
    }

    public Long getUnsubscribed() {
        return unsubscribed;
    }

    public SubscriptionsReportRowsItem unsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }

    public Long getOptOuts() {
        return optOuts;
    }

    public SubscriptionsReportRowsItem optOuts(Long optOuts) {
        this.optOuts = optOuts;
        return this;
    }

    public Long getNet() {
        return net;
    }

    public SubscriptionsReportRowsItem net(Long net) {
        this.net = net;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
