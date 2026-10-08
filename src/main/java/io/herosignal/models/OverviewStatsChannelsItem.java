// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** OverviewStatsChannelsItem şeması (api/openapi.yaml). */
public final class OverviewStatsChannelsItem {

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "provider" alanı. Zorunlu. Değerler: "apns", "fcm", "webpush", "smtp", "ses", "resend", "twilio", "netgsm", "mock". */
    @JsonProperty("provider")
    private String provider;

    /** "status" alanı. Zorunlu. Değerler: "unconfigured", "active", "invalid". */
    @JsonProperty("status")
    private String status;

    /** "last_error" alanı. Zorunlu. */
    @JsonProperty("last_error")
    private String lastError;

    /** "active_subscriptions" alanı. Zorunlu. */
    @JsonProperty("active_subscriptions")
    private Long activeSubscriptions;

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
    public OverviewStatsChannelsItem setChannel(String channel) {
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
    public OverviewStatsChannelsItem setProvider(String provider) {
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
    public OverviewStatsChannelsItem setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "last_error" alanı */
    public String getLastError() {
        return lastError;
    }

    /**
     * "last_error" alanını ayarlar.
     *
     * @param lastError yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsChannelsItem setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    /** @return "active_subscriptions" alanı */
    public Long getActiveSubscriptions() {
        return activeSubscriptions;
    }

    /**
     * "active_subscriptions" alanını ayarlar.
     *
     * @param activeSubscriptions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsChannelsItem setActiveSubscriptions(Long activeSubscriptions) {
        this.activeSubscriptions = activeSubscriptions;
        return this;
    }
}
