// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchSubscriptionDtoDeviceDelivery şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PatchSubscriptionDtoDeviceDelivery {
    @JsonProperty("battery_optimization_exempt")
    private Boolean batteryOptimizationExempt;

    @JsonProperty("background_restricted")
    private Boolean backgroundRestricted;

    @JsonProperty("channel_blocked")
    private Boolean channelBlocked;

    @JsonProperty("power_save_mode")
    private Boolean powerSaveMode;

    @JsonProperty("data_saver")
    private Boolean dataSaver;

    /**
     * Değerler: "exempted", "active", "working_set", "frequent", "rare", "restricted".
     */
    @JsonProperty("standby_bucket")
    private String standbyBucket;

    public Boolean getBatteryOptimizationExempt() {
        return batteryOptimizationExempt;
    }

    public PatchSubscriptionDtoDeviceDelivery batteryOptimizationExempt(Boolean batteryOptimizationExempt) {
        this.batteryOptimizationExempt = batteryOptimizationExempt;
        return this;
    }

    public Boolean getBackgroundRestricted() {
        return backgroundRestricted;
    }

    public PatchSubscriptionDtoDeviceDelivery backgroundRestricted(Boolean backgroundRestricted) {
        this.backgroundRestricted = backgroundRestricted;
        return this;
    }

    public Boolean getChannelBlocked() {
        return channelBlocked;
    }

    public PatchSubscriptionDtoDeviceDelivery channelBlocked(Boolean channelBlocked) {
        this.channelBlocked = channelBlocked;
        return this;
    }

    public Boolean getPowerSaveMode() {
        return powerSaveMode;
    }

    public PatchSubscriptionDtoDeviceDelivery powerSaveMode(Boolean powerSaveMode) {
        this.powerSaveMode = powerSaveMode;
        return this;
    }

    public Boolean getDataSaver() {
        return dataSaver;
    }

    public PatchSubscriptionDtoDeviceDelivery dataSaver(Boolean dataSaver) {
        this.dataSaver = dataSaver;
        return this;
    }

    public String getStandbyBucket() {
        return standbyBucket;
    }

    public PatchSubscriptionDtoDeviceDelivery standbyBucket(String standbyBucket) {
        this.standbyBucket = standbyBucket;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
