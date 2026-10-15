// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LiveActivitySendResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LiveActivitySendResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("message_id")
    private String messageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("activity_id")
    private String activityId;

    /**
     * Zorunlu. Değerler: "start", "update", "end".
     */
    @JsonProperty("event")
    private String event;

    /**
     * Zorunlu.
     */
    @JsonProperty("recipients_estimate")
    private Long recipientsEstimate;

    public String getMessageId() {
        return messageId;
    }

    public LiveActivitySendResult messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getActivityId() {
        return activityId;
    }

    public LiveActivitySendResult activityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public LiveActivitySendResult event(String event) {
        this.event = event;
        return this;
    }

    public Long getRecipientsEstimate() {
        return recipientsEstimate;
    }

    public LiveActivitySendResult recipientsEstimate(Long recipientsEstimate) {
        this.recipientsEstimate = recipientsEstimate;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
