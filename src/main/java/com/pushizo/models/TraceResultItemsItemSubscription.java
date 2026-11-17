// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TraceResultItemsItemSubscription şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TraceResultItemsItemSubscription {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "ios_push", "android_push", "hms_push", "adm_push", "wns_push", "web_push", "email", "sms", "whatsapp", "rcs", "telegram", "viber".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("token_suffix")
    private String tokenSuffix;

    /**
     * Zorunlu.
     */
    @JsonProperty("device")
    private java.util.Map<String, Object> device;

    /**
     * Zorunlu.
     */
    @JsonProperty("test_device")
    private Boolean testDevice;

    public String getId() {
        return id;
    }

    public TraceResultItemsItemSubscription id(String id) {
        this.id = id;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public TraceResultItemsItemSubscription channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TraceResultItemsItemSubscription status(String status) {
        this.status = status;
        return this;
    }

    public String getTokenSuffix() {
        return tokenSuffix;
    }

    public TraceResultItemsItemSubscription tokenSuffix(String tokenSuffix) {
        this.tokenSuffix = tokenSuffix;
        return this;
    }

    public java.util.Map<String, Object> getDevice() {
        return device;
    }

    public TraceResultItemsItemSubscription device(java.util.Map<String, Object> device) {
        this.device = device;
        return this;
    }

    public Boolean getTestDevice() {
        return testDevice;
    }

    public TraceResultItemsItemSubscription testDevice(Boolean testDevice) {
        this.testDevice = testDevice;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
