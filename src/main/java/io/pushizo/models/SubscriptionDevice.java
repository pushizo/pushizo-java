// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubscriptionDevice şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SubscriptionDevice {
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

    public SubscriptionDevice model(String model) {
        this.model = model;
        return this;
    }

    public String getOs() {
        return os;
    }

    public SubscriptionDevice os(String os) {
        this.os = os;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public SubscriptionDevice osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public SubscriptionDevice appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public SubscriptionDevice sdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    public String getSdkPlatform() {
        return sdkPlatform;
    }

    public SubscriptionDevice sdkPlatform(String sdkPlatform) {
        this.sdkPlatform = sdkPlatform;
        return this;
    }

    public String getCarrier() {
        return carrier;
    }

    public SubscriptionDevice carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public SubscriptionDevice locale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public SubscriptionDevice timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public Boolean getPushCapable() {
        return pushCapable;
    }

    public SubscriptionDevice pushCapable(Boolean pushCapable) {
        this.pushCapable = pushCapable;
        return this;
    }

    public String getPushEnvironment() {
        return pushEnvironment;
    }

    public SubscriptionDevice pushEnvironment(String pushEnvironment) {
        this.pushEnvironment = pushEnvironment;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
