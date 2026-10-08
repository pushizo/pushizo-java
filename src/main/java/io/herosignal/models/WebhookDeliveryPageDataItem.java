// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** WebhookDeliveryPageDataItem şeması (api/openapi.yaml). */
public final class WebhookDeliveryPageDataItem {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "endpoint_id" alanı. Zorunlu. */
    @JsonProperty("endpoint_id")
    private String endpointId;

    /** "event_type" alanı. Zorunlu. */
    @JsonProperty("event_type")
    private String eventType;

    /** "event_id" alanı. Zorunlu. */
    @JsonProperty("event_id")
    private String eventId;

    /** "subject_id" alanı. Zorunlu. */
    @JsonProperty("subject_id")
    private String subjectId;

    /** "attempt" alanı. Zorunlu. */
    @JsonProperty("attempt")
    private Long attempt;

    /** "status" alanı. Zorunlu. Değerler: "pending", "success", "failed", "dead". */
    @JsonProperty("status")
    private String status;

    /** "response_status" alanı. Zorunlu. */
    @JsonProperty("response_status")
    private Long responseStatus;

    /** "response_body_excerpt" alanı. Zorunlu. */
    @JsonProperty("response_body_excerpt")
    private String responseBodyExcerpt;

    /** "error" alanı. Zorunlu. */
    @JsonProperty("error")
    private String error;

    /** "duration_ms" alanı. Zorunlu. */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /** "next_retry_at" alanı. Zorunlu. */
    @JsonProperty("next_retry_at")
    private String nextRetryAt;

    /** "delivered_at" alanı. Zorunlu. */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /** "replay_of" alanı. Zorunlu. */
    @JsonProperty("replay_of")
    private String replayOf;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "endpoint_id" alanı */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * "endpoint_id" alanını ayarlar.
     *
     * @param endpointId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /** @return "event_type" alanı */
    public String getEventType() {
        return eventType;
    }

    /**
     * "event_type" alanını ayarlar.
     *
     * @param eventType yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /** @return "event_id" alanı */
    public String getEventId() {
        return eventId;
    }

    /**
     * "event_id" alanını ayarlar.
     *
     * @param eventId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /** @return "subject_id" alanı */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * "subject_id" alanını ayarlar.
     *
     * @param subjectId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    /** @return "attempt" alanı */
    public Long getAttempt() {
        return attempt;
    }

    /**
     * "attempt" alanını ayarlar.
     *
     * @param attempt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setAttempt(Long attempt) {
        this.attempt = attempt;
        return this;
    }

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "response_status" alanı */
    public Long getResponseStatus() {
        return responseStatus;
    }

    /**
     * "response_status" alanını ayarlar.
     *
     * @param responseStatus yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setResponseStatus(Long responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }

    /** @return "response_body_excerpt" alanı */
    public String getResponseBodyExcerpt() {
        return responseBodyExcerpt;
    }

    /**
     * "response_body_excerpt" alanını ayarlar.
     *
     * @param responseBodyExcerpt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setResponseBodyExcerpt(String responseBodyExcerpt) {
        this.responseBodyExcerpt = responseBodyExcerpt;
        return this;
    }

    /** @return "error" alanı */
    public String getError() {
        return error;
    }

    /**
     * "error" alanını ayarlar.
     *
     * @param error yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setError(String error) {
        this.error = error;
        return this;
    }

    /** @return "duration_ms" alanı */
    public Long getDurationMs() {
        return durationMs;
    }

    /**
     * "duration_ms" alanını ayarlar.
     *
     * @param durationMs yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    /** @return "next_retry_at" alanı */
    public String getNextRetryAt() {
        return nextRetryAt;
    }

    /**
     * "next_retry_at" alanını ayarlar.
     *
     * @param nextRetryAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setNextRetryAt(String nextRetryAt) {
        this.nextRetryAt = nextRetryAt;
        return this;
    }

    /** @return "delivered_at" alanı */
    public String getDeliveredAt() {
        return deliveredAt;
    }

    /**
     * "delivered_at" alanını ayarlar.
     *
     * @param deliveredAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    /** @return "replay_of" alanı */
    public String getReplayOf() {
        return replayOf;
    }

    /**
     * "replay_of" alanını ayarlar.
     *
     * @param replayOf yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setReplayOf(String replayOf) {
        this.replayOf = replayOf;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookDeliveryPageDataItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
