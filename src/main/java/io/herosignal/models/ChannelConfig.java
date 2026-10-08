// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ChannelConfig şeması (api/openapi.yaml). */
public final class ChannelConfig {

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "provider" alanı. Zorunlu. Değerler: "apns", "fcm", "webpush", "smtp", "ses", "resend", "twilio", "netgsm", "mock". */
    @JsonProperty("provider")
    private String provider;

    /** "status" alanı. Zorunlu. Değerler: "unconfigured", "active", "invalid". */
    @JsonProperty("status")
    private String status;

    /** "config" alanı. Zorunlu. */
    @JsonProperty("config")
    private ChannelConfigConfig config;

    /** "has_secret" alanı. Zorunlu. */
    @JsonProperty("has_secret")
    private Boolean hasSecret;

    /** "has_hook" alanı. Zorunlu. */
    @JsonProperty("has_hook")
    private Boolean hasHook;

    /** "last_validated_at" alanı. Zorunlu. */
    @JsonProperty("last_validated_at")
    private String lastValidatedAt;

    /** "last_error" alanı. Zorunlu. */
    @JsonProperty("last_error")
    private String lastError;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

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
    public ChannelConfig setChannel(String channel) {
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
    public ChannelConfig setProvider(String provider) {
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
    public ChannelConfig setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "config" alanı */
    public ChannelConfigConfig getConfig() {
        return config;
    }

    /**
     * "config" alanını ayarlar.
     *
     * @param config yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfig setConfig(ChannelConfigConfig config) {
        this.config = config;
        return this;
    }

    /** @return "has_secret" alanı */
    public Boolean getHasSecret() {
        return hasSecret;
    }

    /**
     * "has_secret" alanını ayarlar.
     *
     * @param hasSecret yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfig setHasSecret(Boolean hasSecret) {
        this.hasSecret = hasSecret;
        return this;
    }

    /** @return "has_hook" alanı */
    public Boolean getHasHook() {
        return hasHook;
    }

    /**
     * "has_hook" alanını ayarlar.
     *
     * @param hasHook yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfig setHasHook(Boolean hasHook) {
        this.hasHook = hasHook;
        return this;
    }

    /** @return "last_validated_at" alanı */
    public String getLastValidatedAt() {
        return lastValidatedAt;
    }

    /**
     * "last_validated_at" alanını ayarlar.
     *
     * @param lastValidatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfig setLastValidatedAt(String lastValidatedAt) {
        this.lastValidatedAt = lastValidatedAt;
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
    public ChannelConfig setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    /** @return "updated_at" alanı */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * "updated_at" alanını ayarlar.
     *
     * @param updatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfig setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
