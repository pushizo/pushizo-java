// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookDeliveryPageDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookDeliveryPageDataItem {
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
    @JsonProperty("event_id")
    private String eventId;

    /**
     * Zorunlu.
     */
    @JsonProperty("subject_id")
    private String subjectId;

    /**
     * Zorunlu.
     */
    @JsonProperty("attempt")
    private Long attempt;

    /**
     * Zorunlu. Değerler: "pending", "success", "failed", "dead".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("response_status")
    private Long responseStatus;

    /**
     * Zorunlu.
     */
    @JsonProperty("response_body_excerpt")
    private String responseBodyExcerpt;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_retry_at")
    private String nextRetryAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("replay_of")
    private String replayOf;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public WebhookDeliveryPageDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getEndpointId() {
        return endpointId;
    }

    public WebhookDeliveryPageDataItem endpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getEventType() {
        return eventType;
    }

    public WebhookDeliveryPageDataItem eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public WebhookDeliveryPageDataItem eventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public WebhookDeliveryPageDataItem subjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    public Long getAttempt() {
        return attempt;
    }

    public WebhookDeliveryPageDataItem attempt(Long attempt) {
        this.attempt = attempt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WebhookDeliveryPageDataItem status(String status) {
        this.status = status;
        return this;
    }

    public Long getResponseStatus() {
        return responseStatus;
    }

    public WebhookDeliveryPageDataItem responseStatus(Long responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    public String getResponseBodyExcerpt() {
        return responseBodyExcerpt;
    }

    public WebhookDeliveryPageDataItem responseBodyExcerpt(String responseBodyExcerpt) {
        this.responseBodyExcerpt = responseBodyExcerpt;
        return this;
    }

    public String getError() {
        return error;
    }

    public WebhookDeliveryPageDataItem error(String error) {
        this.error = error;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public WebhookDeliveryPageDataItem durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public String getNextRetryAt() {
        return nextRetryAt;
    }

    public WebhookDeliveryPageDataItem nextRetryAt(String nextRetryAt) {
        this.nextRetryAt = nextRetryAt;
        return this;
    }

    public String getDeliveredAt() {
        return deliveredAt;
    }

    public WebhookDeliveryPageDataItem deliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    public String getReplayOf() {
        return replayOf;
    }

    public WebhookDeliveryPageDataItem replayOf(String replayOf) {
        this.replayOf = replayOf;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WebhookDeliveryPageDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
