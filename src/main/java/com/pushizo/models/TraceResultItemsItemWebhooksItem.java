// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TraceResultItemsItemWebhooksItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TraceResultItemsItemWebhooksItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("endpoint_id")
    private String endpointId;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_type")
    private String eventType;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("attempt")
    private Long attempt;

    /**
     * Zorunlu.
     */
    @JsonProperty("response_status")
    private Long responseStatus;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public TraceResultItemsItemWebhooksItem id(String id) {
        this.id = id;
        return this;
    }

    public String getEndpointId() {
        return endpointId;
    }

    public TraceResultItemsItemWebhooksItem endpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getEventType() {
        return eventType;
    }

    public TraceResultItemsItemWebhooksItem eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TraceResultItemsItemWebhooksItem status(String status) {
        this.status = status;
        return this;
    }

    public Long getAttempt() {
        return attempt;
    }

    public TraceResultItemsItemWebhooksItem attempt(Long attempt) {
        this.attempt = attempt;
        return this;
    }

    public Long getResponseStatus() {
        return responseStatus;
    }

    public TraceResultItemsItemWebhooksItem responseStatus(Long responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public TraceResultItemsItemWebhooksItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
