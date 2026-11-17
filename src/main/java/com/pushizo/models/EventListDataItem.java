// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscription_id")
    private String subscriptionId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private Double value;

    /**
     * Zorunlu. Değerler: "sdk", "api", "system", "import".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("occurred_at")
    private String occurredAt;

    public String getId() {
        return id;
    }

    public EventListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public EventListDataItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public EventListDataItem subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getName() {
        return name;
    }

    public EventListDataItem name(String name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public EventListDataItem properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public EventListDataItem value(Double value) {
        this.value = value;
        return this;
    }

    public String getSource() {
        return source;
    }

    public EventListDataItem source(String source) {
        this.source = source;
        return this;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public EventListDataItem occurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
