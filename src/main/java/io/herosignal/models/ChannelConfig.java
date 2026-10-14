// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelConfig {
    /**
     * Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu. Değerler: "apns", "fcm", "webpush", "smtp", "ses", "resend", "twilio", "netgsm", "mock".
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
    @JsonProperty("config")
    private ChannelConfigConfig config;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_secret")
    private Boolean hasSecret;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_hook")
    private Boolean hasHook;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_validated_at")
    private String lastValidatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("suspended_reason")
    private String suspendedReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("dns_check")
    private ChannelConfigDnsCheck dnsCheck;

    public String getChannel() {
        return channel;
    }

    public ChannelConfig channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public ChannelConfig provider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ChannelConfig status(String status) {
        this.status = status;
        return this;
    }

    public ChannelConfigConfig getConfig() {
        return config;
    }

    public ChannelConfig config(ChannelConfigConfig config) {
        this.config = config;
        return this;
    }

    public Boolean getHasSecret() {
        return hasSecret;
    }

    public ChannelConfig hasSecret(Boolean hasSecret) {
        this.hasSecret = hasSecret;
        return this;
    }

    public Boolean getHasHook() {
        return hasHook;
    }

    public ChannelConfig hasHook(Boolean hasHook) {
        this.hasHook = hasHook;
        return this;
    }

    public String getLastValidatedAt() {
        return lastValidatedAt;
    }

    public ChannelConfig lastValidatedAt(String lastValidatedAt) {
        this.lastValidatedAt = lastValidatedAt;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public ChannelConfig lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public ChannelConfig updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getSuspendedReason() {
        return suspendedReason;
    }

    public ChannelConfig suspendedReason(String suspendedReason) {
        this.suspendedReason = suspendedReason;
        return this;
    }

    public ChannelConfigDnsCheck getDnsCheck() {
        return dnsCheck;
    }

    public ChannelConfig dnsCheck(ChannelConfigDnsCheck dnsCheck) {
        this.dnsCheck = dnsCheck;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
