// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** PatchSubscriptionDto şeması (api/openapi.yaml). */
public final class PatchSubscriptionDto {

    /** "token" alanı. */
    @JsonProperty("token")
    private String token;

    /** "device" alanı. */
    @JsonProperty("device")
    private PatchSubscriptionDtoDevice device;

    /** "status" alanı. Değerler: "subscribed", "unsubscribed". */
    @JsonProperty("status")
    private String status;

    /** "test_device" alanı. */
    @JsonProperty("test_device")
    private Boolean testDevice;

    /** "test_device_name" alanı. */
    @JsonProperty("test_device_name")
    private String testDeviceName;

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
    public PatchSubscriptionDto setToken(String token) {
        this.token = token;
        return this;
    }

    /** @return "device" alanı */
    public PatchSubscriptionDtoDevice getDevice() {
        return device;
    }

    /**
     * "device" alanını ayarlar.
     *
     * @param device yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDto setDevice(PatchSubscriptionDtoDevice device) {
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
    public PatchSubscriptionDto setStatus(String status) {
        this.status = status;
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
    public PatchSubscriptionDto setTestDevice(Boolean testDevice) {
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
    public PatchSubscriptionDto setTestDeviceName(String testDeviceName) {
        this.testDeviceName = testDeviceName;
        return this;
    }
}
