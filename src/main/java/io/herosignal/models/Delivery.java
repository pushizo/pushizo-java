// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Delivery şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Delivery {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("message_id")
    private String messageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscription_id")
    private String subscriptionId;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu. Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("provider")
    private String provider;

    /**
     * Zorunlu. Değerler: "pending", "sent", "delivered", "failed", "bounced", "suppressed", "expired", "cancelled".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("attempt_count")
    private Long attemptCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("provider_message_id")
    private String providerMessageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_code")
    private String errorCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_message")
    private String errorMessage;

    /**
     * Zorunlu.
     */
    @JsonProperty("suppression_reason")
    private String suppressionReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("send_after")
    private String sendAfter;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("opened_at")
    private String openedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked_at")
    private String clickedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed_at")
    private String failedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public Delivery id(String id) {
        this.id = id;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public Delivery messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public Delivery subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Delivery userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public Delivery channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public Delivery provider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Delivery status(String status) {
        this.status = status;
        return this;
    }

    public Long getAttemptCount() {
        return attemptCount;
    }

    public Delivery attemptCount(Long attemptCount) {
        this.attemptCount = attemptCount;
        return this;
    }

    public String getProviderMessageId() {
        return providerMessageId;
    }

    public Delivery providerMessageId(String providerMessageId) {
        this.providerMessageId = providerMessageId;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public Delivery errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Delivery errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public String getSuppressionReason() {
        return suppressionReason;
    }

    public Delivery suppressionReason(String suppressionReason) {
        this.suppressionReason = suppressionReason;
        return this;
    }

    public String getSendAfter() {
        return sendAfter;
    }

    public Delivery sendAfter(String sendAfter) {
        this.sendAfter = sendAfter;
        return this;
    }

    public String getSentAt() {
        return sentAt;
    }

    public Delivery sentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    public String getDeliveredAt() {
        return deliveredAt;
    }

    public Delivery deliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    public String getOpenedAt() {
        return openedAt;
    }

    public Delivery openedAt(String openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    public String getClickedAt() {
        return clickedAt;
    }

    public Delivery clickedAt(String clickedAt) {
        this.clickedAt = clickedAt;
        return this;
    }

    public String getFailedAt() {
        return failedAt;
    }

    public Delivery failedAt(String failedAt) {
        this.failedAt = failedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Delivery createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
