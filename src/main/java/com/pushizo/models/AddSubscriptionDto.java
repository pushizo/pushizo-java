// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddSubscriptionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AddSubscriptionDto {
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

    @JsonProperty("device")
    private AddSubscriptionDtoDevice device;

    /**
     * Değerler: "subscribed", "unsubscribed".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("opt_in")
    private AddSubscriptionDtoOptIn optIn;

    public String getChannel() {
        return channel;
    }

    public AddSubscriptionDto channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getToken() {
        return token;
    }

    public AddSubscriptionDto token(String token) {
        this.token = token;
        return this;
    }

    public AddSubscriptionDtoDevice getDevice() {
        return device;
    }

    public AddSubscriptionDto device(AddSubscriptionDtoDevice device) {
        this.device = device;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AddSubscriptionDto status(String status) {
        this.status = status;
        return this;
    }

    public AddSubscriptionDtoOptIn getOptIn() {
        return optIn;
    }

    public AddSubscriptionDto optIn(AddSubscriptionDtoOptIn optIn) {
        this.optIn = optIn;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
