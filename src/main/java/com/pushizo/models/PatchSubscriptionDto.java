// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchSubscriptionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PatchSubscriptionDto {
    @JsonProperty("token")
    private String token;

    @JsonProperty("device")
    private PatchSubscriptionDtoDevice device;

    /**
     * Değerler: "subscribed", "unsubscribed".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("test_device")
    private Boolean testDevice;

    @JsonProperty("test_device_name")
    private String testDeviceName;

    public String getToken() {
        return token;
    }

    public PatchSubscriptionDto token(String token) {
        this.token = token;
        return this;
    }

    public PatchSubscriptionDtoDevice getDevice() {
        return device;
    }

    public PatchSubscriptionDto device(PatchSubscriptionDtoDevice device) {
        this.device = device;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PatchSubscriptionDto status(String status) {
        this.status = status;
        return this;
    }

    public Boolean getTestDevice() {
        return testDevice;
    }

    public PatchSubscriptionDto testDevice(Boolean testDevice) {
        this.testDevice = testDevice;
        return this;
    }

    public String getTestDeviceName() {
        return testDeviceName;
    }

    public PatchSubscriptionDto testDeviceName(String testDeviceName) {
        this.testDeviceName = testDeviceName;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
