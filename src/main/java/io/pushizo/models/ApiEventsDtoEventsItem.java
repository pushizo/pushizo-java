// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiEventsDtoEventsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ApiEventsDtoEventsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    @JsonProperty("value")
    private Double value;

    @JsonProperty("occurred_at")
    private String occurredAt;

    @JsonProperty("event_id")
    private String eventId;

    @JsonProperty("subscription_id")
    private String subscriptionId;

    @JsonProperty("external_id")
    private String externalId;

    public String getName() {
        return name;
    }

    public ApiEventsDtoEventsItem name(String name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public ApiEventsDtoEventsItem properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public ApiEventsDtoEventsItem value(Double value) {
        this.value = value;
        return this;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public ApiEventsDtoEventsItem occurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public ApiEventsDtoEventsItem eventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public ApiEventsDtoEventsItem subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public ApiEventsDtoEventsItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
