// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** Subscription şeması (api/openapi.yaml). */
public final class Subscription {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "user_id" alanı. Zorunlu. */
    @JsonProperty("user_id")
    private String userId;

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "token" alanı. Zorunlu. */
    @JsonProperty("token")
    private String token;

    /** "status" alanı. Zorunlu. Değerler: "subscribed", "unsubscribed", "invalid", "pending". */
    @JsonProperty("status")
    private String status;

    /** "unsubscribe_reason" alanı. Zorunlu. Değerler: "provider_rejected", "user_opt_out", "api", "uninstall". */
    @JsonProperty("unsubscribe_reason")
    private String unsubscribeReason;

    /** "device" alanı. Zorunlu. */
    @JsonProperty("device")
    private SubscriptionDevice device;

    /** "test_device" alanı. Zorunlu. */
    @JsonProperty("test_device")
    private Boolean testDevice;

    /** "test_device_name" alanı. Zorunlu. */
    @JsonProperty("test_device_name")
    private String testDeviceName;

    /** "last_active_at" alanı. Zorunlu. */
    @JsonProperty("last_active_at")
    private String lastActiveAt;

    /** "last_sent_at" alanı. Zorunlu. */
    @JsonProperty("last_sent_at")
    private String lastSentAt;

    /** "last_delivered_at" alanı. Zorunlu. */
    @JsonProperty("last_delivered_at")
    private String lastDeliveredAt;

    /** "opted_in_at" alanı. Zorunlu. */
    @JsonProperty("opted_in_at")
    private String optedInAt;

    /** "unsubscribed_at" alanı. Zorunlu. */
    @JsonProperty("unsubscribed_at")
    private String unsubscribedAt;

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
    public Subscription setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setAppId(String appId) {
        this.appId = appId;
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
    public Subscription setUserId(String userId) {
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
    public Subscription setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "token" alanı */
    public String getToken() {
        return token;
    }

    /**
     * "token" alanını ayarlar.
     *
     * @param token yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setToken(String token) {
        this.token = token;
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
    public Subscription setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "unsubscribe_reason" alanı */
    public String getUnsubscribeReason() {
        return unsubscribeReason;
    }

    /**
     * "unsubscribe_reason" alanını ayarlar.
     *
     * @param unsubscribeReason yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setUnsubscribeReason(String unsubscribeReason) {
        this.unsubscribeReason = unsubscribeReason;
        return this;
    }

    /** @return "device" alanı */
    public SubscriptionDevice getDevice() {
        return device;
    }

    /**
     * "device" alanını ayarlar.
     *
     * @param device yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setDevice(SubscriptionDevice device) {
        this.device = device;
        return this;
    }

    /** @return "test_device" alanı */
    public Boolean getTestDevice() {
        return testDevice;
    }

    /**
     * "test_device" alanını ayarlar.
     *
     * @param testDevice yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setTestDevice(Boolean testDevice) {
        this.testDevice = testDevice;
        return this;
    }

    /** @return "test_device_name" alanı */
    public String getTestDeviceName() {
        return testDeviceName;
    }

    /**
     * "test_device_name" alanını ayarlar.
     *
     * @param testDeviceName yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setTestDeviceName(String testDeviceName) {
        this.testDeviceName = testDeviceName;
        return this;
    }

    /** @return "last_active_at" alanı */
    public String getLastActiveAt() {
        return lastActiveAt;
    }

    /**
     * "last_active_at" alanını ayarlar.
     *
     * @param lastActiveAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setLastActiveAt(String lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
        return this;
    }

    /** @return "last_sent_at" alanı */
    public String getLastSentAt() {
        return lastSentAt;
    }

    /**
     * "last_sent_at" alanını ayarlar.
     *
     * @param lastSentAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setLastSentAt(String lastSentAt) {
        this.lastSentAt = lastSentAt;
        return this;
    }

    /** @return "last_delivered_at" alanı */
    public String getLastDeliveredAt() {
        return lastDeliveredAt;
    }

    /**
     * "last_delivered_at" alanını ayarlar.
     *
     * @param lastDeliveredAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setLastDeliveredAt(String lastDeliveredAt) {
        this.lastDeliveredAt = lastDeliveredAt;
        return this;
    }

    /** @return "opted_in_at" alanı */
    public String getOptedInAt() {
        return optedInAt;
    }

    /**
     * "opted_in_at" alanını ayarlar.
     *
     * @param optedInAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setOptedInAt(String optedInAt) {
        this.optedInAt = optedInAt;
        return this;
    }

    /** @return "unsubscribed_at" alanı */
    public String getUnsubscribedAt() {
        return unsubscribedAt;
    }

    /**
     * "unsubscribed_at" alanını ayarlar.
     *
     * @param unsubscribedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Subscription setUnsubscribedAt(String unsubscribedAt) {
        this.unsubscribedAt = unsubscribedAt;
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
    public Subscription setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
