// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** PatchSubscriptionDtoDevice şeması (api/openapi.yaml). */
public final class PatchSubscriptionDtoDevice {

    /** "model" alanı. */
    @JsonProperty("model")
    private String model;

    /** "os" alanı. */
    @JsonProperty("os")
    private String os;

    /** "os_version" alanı. */
    @JsonProperty("os_version")
    private String osVersion;

    /** "app_version" alanı. */
    @JsonProperty("app_version")
    private String appVersion;

    /** "sdk_version" alanı. */
    @JsonProperty("sdk_version")
    private String sdkVersion;

    /** "sdk_platform" alanı. */
    @JsonProperty("sdk_platform")
    private String sdkPlatform;

    /** "carrier" alanı. */
    @JsonProperty("carrier")
    private String carrier;

    /** "locale" alanı. */
    @JsonProperty("locale")
    private String locale;

    /** "timezone" alanı. */
    @JsonProperty("timezone")
    private String timezone;

    /** "push_capable" alanı. */
    @JsonProperty("push_capable")
    private Boolean pushCapable;

    /** "push_environment" alanı. Değerler: "sandbox", "production". */
    @JsonProperty("push_environment")
    private String pushEnvironment;

    /** @return "model" alanı */
    public String getModel() {
        return model;
    }

    /**
     * "model" alanını ayarlar.
     *
     * @param model yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setModel(String model) {
        this.model = model;
        return this;
    }

    /** @return "os" alanı */
    public String getOs() {
        return os;
    }

    /**
     * "os" alanını ayarlar.
     *
     * @param os yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setOs(String os) {
        this.os = os;
        return this;
    }

    /** @return "os_version" alanı */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * "os_version" alanını ayarlar.
     *
     * @param osVersion yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /** @return "app_version" alanı */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * "app_version" alanını ayarlar.
     *
     * @param appVersion yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /** @return "sdk_version" alanı */
    public String getSdkVersion() {
        return sdkVersion;
    }

    /**
     * "sdk_version" alanını ayarlar.
     *
     * @param sdkVersion yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    /** @return "sdk_platform" alanı */
    public String getSdkPlatform() {
        return sdkPlatform;
    }

    /**
     * "sdk_platform" alanını ayarlar.
     *
     * @param sdkPlatform yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setSdkPlatform(String sdkPlatform) {
        this.sdkPlatform = sdkPlatform;
        return this;
    }

    /** @return "carrier" alanı */
    public String getCarrier() {
        return carrier;
    }

    /**
     * "carrier" alanını ayarlar.
     *
     * @param carrier yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /** @return "locale" alanı */
    public String getLocale() {
        return locale;
    }

    /**
     * "locale" alanını ayarlar.
     *
     * @param locale yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /** @return "timezone" alanı */
    public String getTimezone() {
        return timezone;
    }

    /**
     * "timezone" alanını ayarlar.
     *
     * @param timezone yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /** @return "push_capable" alanı */
    public Boolean getPushCapable() {
        return pushCapable;
    }

    /**
     * "push_capable" alanını ayarlar.
     *
     * @param pushCapable yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setPushCapable(Boolean pushCapable) {
        this.pushCapable = pushCapable;
        return this;
    }

    /** @return "push_environment" alanı */
    public String getPushEnvironment() {
        return pushEnvironment;
    }

    /**
     * "push_environment" alanını ayarlar.
     *
     * @param pushEnvironment yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchSubscriptionDtoDevice setPushEnvironment(String pushEnvironment) {
        this.pushEnvironment = pushEnvironment;
        return this;
    }
}
