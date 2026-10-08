// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** Delivery şeması (api/openapi.yaml). */
public final class Delivery {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "message_id" alanı. Zorunlu. */
    @JsonProperty("message_id")
    private String messageId;

    /** "subscription_id" alanı. Zorunlu. */
    @JsonProperty("subscription_id")
    private String subscriptionId;

    /** "user_id" alanı. Zorunlu. */
    @JsonProperty("user_id")
    private String userId;

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "provider" alanı. Zorunlu. */
    @JsonProperty("provider")
    private String provider;

    /** "status" alanı. Zorunlu. Değerler: "pending", "sent", "delivered", "failed", "bounced", "suppressed", "expired", "cancelled". */
    @JsonProperty("status")
    private String status;

    /** "attempt_count" alanı. Zorunlu. */
    @JsonProperty("attempt_count")
    private Long attemptCount;

    /** "provider_message_id" alanı. Zorunlu. */
    @JsonProperty("provider_message_id")
    private String providerMessageId;

    /** "error_code" alanı. Zorunlu. */
    @JsonProperty("error_code")
    private String errorCode;

    /** "error_message" alanı. Zorunlu. */
    @JsonProperty("error_message")
    private String errorMessage;

    /** "suppression_reason" alanı. Zorunlu. */
    @JsonProperty("suppression_reason")
    private String suppressionReason;

    /** "send_after" alanı. Zorunlu. */
    @JsonProperty("send_after")
    private String sendAfter;

    /** "sent_at" alanı. Zorunlu. */
    @JsonProperty("sent_at")
    private String sentAt;

    /** "delivered_at" alanı. Zorunlu. */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /** "opened_at" alanı. Zorunlu. */
    @JsonProperty("opened_at")
    private String openedAt;

    /** "clicked_at" alanı. Zorunlu. */
    @JsonProperty("clicked_at")
    private String clickedAt;

    /** "failed_at" alanı. Zorunlu. */
    @JsonProperty("failed_at")
    private String failedAt;

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
    public Delivery setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "message_id" alanı */
    public String getMessageId() {
        return messageId;
    }

    /**
     * "message_id" alanını ayarlar.
     *
     * @param messageId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /** @return "subscription_id" alanı */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * "subscription_id" alanını ayarlar.
     *
     * @param subscriptionId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** @return "user_id" alanı */
    public String getUserId() {
        return userId;
    }

    /**
     * "user_id" alanını ayarlar.
     *
     * @param userId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "provider" alanı */
    public String getProvider() {
        return provider;
    }

    /**
     * "provider" alanını ayarlar.
     *
     * @param provider yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setProvider(String provider) {
        this.provider = provider;
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
    public Delivery setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "attempt_count" alanı */
    public Long getAttemptCount() {
        return attemptCount;
    }

    /**
     * "attempt_count" alanını ayarlar.
     *
     * @param attemptCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setAttemptCount(Long attemptCount) {
        this.attemptCount = attemptCount;
        return this;
    }

    /** @return "provider_message_id" alanı */
    public String getProviderMessageId() {
        return providerMessageId;
    }

    /**
     * "provider_message_id" alanını ayarlar.
     *
     * @param providerMessageId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setProviderMessageId(String providerMessageId) {
        this.providerMessageId = providerMessageId;
        return this;
    }

    /** @return "error_code" alanı */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * "error_code" alanını ayarlar.
     *
     * @param errorCode yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** @return "error_message" alanı */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * "error_message" alanını ayarlar.
     *
     * @param errorMessage yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /** @return "suppression_reason" alanı */
    public String getSuppressionReason() {
        return suppressionReason;
    }

    /**
     * "suppression_reason" alanını ayarlar.
     *
     * @param suppressionReason yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setSuppressionReason(String suppressionReason) {
        this.suppressionReason = suppressionReason;
        return this;
    }

    /** @return "send_after" alanı */
    public String getSendAfter() {
        return sendAfter;
    }

    /**
     * "send_after" alanını ayarlar.
     *
     * @param sendAfter yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setSendAfter(String sendAfter) {
        this.sendAfter = sendAfter;
        return this;
    }

    /** @return "sent_at" alanı */
    public String getSentAt() {
        return sentAt;
    }

    /**
     * "sent_at" alanını ayarlar.
     *
     * @param sentAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setSentAt(String sentAt) {
        this.sentAt = sentAt;
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
    public Delivery setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    /** @return "opened_at" alanı */
    public String getOpenedAt() {
        return openedAt;
    }

    /**
     * "opened_at" alanını ayarlar.
     *
     * @param openedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    /** @return "clicked_at" alanı */
    public String getClickedAt() {
        return clickedAt;
    }

    /**
     * "clicked_at" alanını ayarlar.
     *
     * @param clickedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setClickedAt(String clickedAt) {
        this.clickedAt = clickedAt;
        return this;
    }

    /** @return "failed_at" alanı */
    public String getFailedAt() {
        return failedAt;
    }

    /**
     * "failed_at" alanını ayarlar.
     *
     * @param failedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Delivery setFailedAt(String failedAt) {
        this.failedAt = failedAt;
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
    public Delivery setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
