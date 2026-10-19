// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZapierSubscribeDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ZapierSubscribeDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("target_url")
    private String targetUrl;

    /**
     * Zorunlu. Değerler: "subscription.created", "subscription.unsubscribed", "event.received", "delivery.delivered", "delivery.opened", "delivery.clicked", "user.created", "user.updated", "conversion.created", "campaign.completed".
     */
    @JsonProperty("event")
    private String event;

    @JsonProperty("event_name")
    private String eventName;

    public String getTargetUrl() {
        return targetUrl;
    }

    public ZapierSubscribeDto targetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public ZapierSubscribeDto event(String event) {
        this.event = event;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public ZapierSubscribeDto eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
