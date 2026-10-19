// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Subscription {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

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
    @JsonProperty("token")
    private String token;

    /**
     * Zorunlu. Değerler: "subscribed", "unsubscribed", "invalid", "pending".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu. Değerler: "provider_rejected", "user_opt_out", "api", "uninstall".
     */
    @JsonProperty("unsubscribe_reason")
    private String unsubscribeReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("device")
    private SubscriptionDevice device;

    /**
     * Zorunlu.
     */
    @JsonProperty("test_device")
    private Boolean testDevice;

    /**
     * Zorunlu.
     */
    @JsonProperty("test_device_name")
    private String testDeviceName;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_active_at")
    private String lastActiveAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_sent_at")
    private String lastSentAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_delivered_at")
    private String lastDeliveredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("opted_in_at")
    private String optedInAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("opt_in_source")
    private String optInSource;

    /**
     * Zorunlu.
     */
    @JsonProperty("unsubscribed_at")
    private String unsubscribedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("location")
    private SubscriptionLocation location;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public Subscription id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Subscription appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Subscription userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public Subscription channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getToken() {
        return token;
    }

    public Subscription token(String token) {
        this.token = token;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Subscription status(String status) {
        this.status = status;
        return this;
    }

    public String getUnsubscribeReason() {
        return unsubscribeReason;
    }

    public Subscription unsubscribeReason(String unsubscribeReason) {
        this.unsubscribeReason = unsubscribeReason;
        return this;
    }

    public SubscriptionDevice getDevice() {
        return device;
    }

    public Subscription device(SubscriptionDevice device) {
        this.device = device;
        return this;
    }

    public Boolean getTestDevice() {
        return testDevice;
    }

    public Subscription testDevice(Boolean testDevice) {
        this.testDevice = testDevice;
        return this;
    }

    public String getTestDeviceName() {
        return testDeviceName;
    }

    public Subscription testDeviceName(String testDeviceName) {
        this.testDeviceName = testDeviceName;
        return this;
    }

    public String getLastActiveAt() {
        return lastActiveAt;
    }

    public Subscription lastActiveAt(String lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
        return this;
    }

    public String getLastSentAt() {
        return lastSentAt;
    }

    public Subscription lastSentAt(String lastSentAt) {
        this.lastSentAt = lastSentAt;
        return this;
    }

    public String getLastDeliveredAt() {
        return lastDeliveredAt;
    }

    public Subscription lastDeliveredAt(String lastDeliveredAt) {
        this.lastDeliveredAt = lastDeliveredAt;
        return this;
    }

    public String getOptedInAt() {
        return optedInAt;
    }

    public Subscription optedInAt(String optedInAt) {
        this.optedInAt = optedInAt;
        return this;
    }

    public String getOptInSource() {
        return optInSource;
    }

    public Subscription optInSource(String optInSource) {
        this.optInSource = optInSource;
        return this;
    }

    public String getUnsubscribedAt() {
        return unsubscribedAt;
    }

    public Subscription unsubscribedAt(String unsubscribedAt) {
        this.unsubscribedAt = unsubscribedAt;
        return this;
    }

    public SubscriptionLocation getLocation() {
        return location;
    }

    public Subscription location(SubscriptionLocation location) {
        this.location = location;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Subscription createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
