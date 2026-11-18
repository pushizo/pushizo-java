// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddSubscriptionDtoDevice şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AddSubscriptionDtoDevice {
    @JsonProperty("model")
    private String model;

    @JsonProperty("os")
    private String os;

    @JsonProperty("os_version")
    private String osVersion;

    @JsonProperty("app_version")
    private String appVersion;

    @JsonProperty("sdk_version")
    private String sdkVersion;

    @JsonProperty("sdk_platform")
    private String sdkPlatform;

    @JsonProperty("carrier")
    private String carrier;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("push_capable")
    private Boolean pushCapable;

    /**
     * Değerler: "sandbox", "production".
     */
    @JsonProperty("push_environment")
    private String pushEnvironment;

    /**
     * Değerler: "phone", "watch".
     */
    @JsonProperty("form_factor")
    private String formFactor;

    /**
     * Değerler: "alert", "voip", "app_clip".
     */
    @JsonProperty("push_kind")
    private String pushKind;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("rom")
    private String rom;

    @JsonProperty("rom_version")
    private String romVersion;

    @JsonProperty("delivery")
    private AddSubscriptionDtoDeviceDelivery delivery;

    public String getModel() {
        return model;
    }

    public AddSubscriptionDtoDevice model(String model) {
        this.model = model;
        return this;
    }

    public String getOs() {
        return os;
    }

    public AddSubscriptionDtoDevice os(String os) {
        this.os = os;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public AddSubscriptionDtoDevice osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public AddSubscriptionDtoDevice appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public AddSubscriptionDtoDevice sdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    public String getSdkPlatform() {
        return sdkPlatform;
    }

    public AddSubscriptionDtoDevice sdkPlatform(String sdkPlatform) {
        this.sdkPlatform = sdkPlatform;
        return this;
    }

    public String getCarrier() {
        return carrier;
    }

    public AddSubscriptionDtoDevice carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public AddSubscriptionDtoDevice locale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public AddSubscriptionDtoDevice timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public Boolean getPushCapable() {
        return pushCapable;
    }

    public AddSubscriptionDtoDevice pushCapable(Boolean pushCapable) {
        this.pushCapable = pushCapable;
        return this;
    }

    public String getPushEnvironment() {
        return pushEnvironment;
    }

    public AddSubscriptionDtoDevice pushEnvironment(String pushEnvironment) {
        this.pushEnvironment = pushEnvironment;
        return this;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public AddSubscriptionDtoDevice formFactor(String formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public String getPushKind() {
        return pushKind;
    }

    public AddSubscriptionDtoDevice pushKind(String pushKind) {
        this.pushKind = pushKind;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public AddSubscriptionDtoDevice manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public AddSubscriptionDtoDevice brand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getRom() {
        return rom;
    }

    public AddSubscriptionDtoDevice rom(String rom) {
        this.rom = rom;
        return this;
    }

    public String getRomVersion() {
        return romVersion;
    }

    public AddSubscriptionDtoDevice romVersion(String romVersion) {
        this.romVersion = romVersion;
        return this;
    }

    public AddSubscriptionDtoDeviceDelivery getDelivery() {
        return delivery;
    }

    public AddSubscriptionDtoDevice delivery(AddSubscriptionDtoDeviceDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
