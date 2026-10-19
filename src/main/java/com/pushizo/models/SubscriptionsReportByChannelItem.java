// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubscriptionsReportByChannelItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SubscriptionsReportByChannelItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private String channel;

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

    public String getChannel() {
        return channel;
    }

    public SubscriptionsReportByChannelItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Long getActive() {
        return active;
    }

    public SubscriptionsReportByChannelItem active(Long active) {
        this.active = active;
        return this;
    }

    public Long getNew_() {
        return new_;
    }

    public SubscriptionsReportByChannelItem new_(Long new_) {
        this.new_ = new_;
        return this;
    }

    public Long getUnsubscribed() {
        return unsubscribed;
    }

    public SubscriptionsReportByChannelItem unsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
