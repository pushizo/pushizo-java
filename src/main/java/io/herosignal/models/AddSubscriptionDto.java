// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** AddSubscriptionDto şeması (api/openapi.yaml). */
public final class AddSubscriptionDto {

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "token" alanı. Zorunlu. */
    @JsonProperty("token")
    private String token;

    /** "device" alanı. */
    @JsonProperty("device")
    private AddSubscriptionDtoDevice device;

    /** "status" alanı. Değerler: "subscribed", "unsubscribed". */
    @JsonProperty("status")
    private String status;

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
    public AddSubscriptionDto setChannel(String channel) {
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
    public AddSubscriptionDto setToken(String token) {
        this.token = token;
        return this;
    }

    /** @return "device" alanı */
    public AddSubscriptionDtoDevice getDevice() {
        return device;
    }

    /**
     * "device" alanını ayarlar.
     *
     * @param device yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AddSubscriptionDto setDevice(AddSubscriptionDtoDevice device) {
        this.device = device;
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
    public AddSubscriptionDto setStatus(String status) {
        this.status = status;
        return this;
    }
}
