// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZapierHook şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ZapierHook {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("event")
    private String event;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_name")
    private String eventName;

    /**
     * Zorunlu.
     */
    @JsonProperty("target_url")
    private String targetUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_delivered_at")
    private String lastDeliveredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("failure_count")
    private Long failureCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public ZapierHook id(String id) {
        this.id = id;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public ZapierHook event(String event) {
        this.event = event;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public ZapierHook eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public ZapierHook targetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    public String getLastDeliveredAt() {
        return lastDeliveredAt;
    }

    public ZapierHook lastDeliveredAt(String lastDeliveredAt) {
        this.lastDeliveredAt = lastDeliveredAt;
        return this;
    }

    public Long getFailureCount() {
        return failureCount;
    }

    public ZapierHook failureCount(Long failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ZapierHook createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
