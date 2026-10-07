// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

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

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
