// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportEventsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportEventsItem {
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

    public UserExportEventsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserExportEventsItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public UserExportEventsItem subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserExportEventsItem name(String name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public UserExportEventsItem properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public UserExportEventsItem value(Double value) {
        this.value = value;
        return this;
    }

    public String getSource() {
        return source;
    }

    public UserExportEventsItem source(String source) {
        this.source = source;
        return this;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public UserExportEventsItem occurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
