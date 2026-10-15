// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OverviewStatsChannelsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class OverviewStatsChannelsItem {
    /**
     * Zorunlu. Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu. Değerler: "apns", "fcm", "hms", "webpush", "smtp", "ses", "resend", "twilio", "netgsm", "meta_whatsapp", "google_rbm", "mock".
     */
    @JsonProperty("provider")
    private String provider;

    /**
     * Zorunlu. Değerler: "unconfigured", "active", "invalid", "suspended".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("active_subscriptions")
    private Long activeSubscriptions;

    public String getChannel() {
        return channel;
    }

    public OverviewStatsChannelsItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public OverviewStatsChannelsItem provider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public OverviewStatsChannelsItem status(String status) {
        this.status = status;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public OverviewStatsChannelsItem lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public Long getActiveSubscriptions() {
        return activeSubscriptions;
    }

    public OverviewStatsChannelsItem activeSubscriptions(Long activeSubscriptions) {
        this.activeSubscriptions = activeSubscriptions;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
