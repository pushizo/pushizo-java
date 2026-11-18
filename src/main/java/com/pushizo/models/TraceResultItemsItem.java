// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TraceResultItemsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TraceResultItemsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("delivery")
    private Delivery delivery;

    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.List<TraceResultItemsItemEventsItem> events;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscription")
    private TraceResultItemsItemSubscription subscription;

    /**
     * Zorunlu.
     */
    @JsonProperty("user")
    private TraceResultItemsItemUser user;

    /**
     * Zorunlu.
     */
    @JsonProperty("render")
    private TraceResultItemsItemRender render;

    /**
     * Zorunlu.
     */
    @JsonProperty("webhooks")
    private java.util.List<TraceResultItemsItemWebhooksItem> webhooks;

    /**
     * Zorunlu.
     */
    @JsonProperty("message")
    private TraceResultItemsItemMessage message;

    public Delivery getDelivery() {
        return delivery;
    }

    public TraceResultItemsItem delivery(Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public java.util.List<TraceResultItemsItemEventsItem> getEvents() {
        return events;
    }

    public TraceResultItemsItem events(java.util.List<TraceResultItemsItemEventsItem> events) {
        this.events = events;
        return this;
    }

    public TraceResultItemsItemSubscription getSubscription() {
        return subscription;
    }

    public TraceResultItemsItem subscription(TraceResultItemsItemSubscription subscription) {
        this.subscription = subscription;
        return this;
    }

    public TraceResultItemsItemUser getUser() {
        return user;
    }

    public TraceResultItemsItem user(TraceResultItemsItemUser user) {
        this.user = user;
        return this;
    }

    public TraceResultItemsItemRender getRender() {
        return render;
    }

    public TraceResultItemsItem render(TraceResultItemsItemRender render) {
        this.render = render;
        return this;
    }

    public java.util.List<TraceResultItemsItemWebhooksItem> getWebhooks() {
        return webhooks;
    }

    public TraceResultItemsItem webhooks(java.util.List<TraceResultItemsItemWebhooksItem> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

    public TraceResultItemsItemMessage getMessage() {
        return message;
    }

    public TraceResultItemsItem message(TraceResultItemsItemMessage message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
