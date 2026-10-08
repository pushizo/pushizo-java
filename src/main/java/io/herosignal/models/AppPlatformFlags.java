// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** AppPlatformFlags şeması (api/openapi.yaml). */
public final class AppPlatformFlags {

    /** "ios" alanı. */
    @JsonProperty("ios")
    private Boolean ios;

    /** "android" alanı. */
    @JsonProperty("android")
    private Boolean android;

    /** "web" alanı. */
    @JsonProperty("web")
    private Boolean web;

    /** "email" alanı. */
    @JsonProperty("email")
    private Boolean email;

    /** "sms" alanı. */
    @JsonProperty("sms")
    private Boolean sms;

    /** @return "ios" alanı */
    public Boolean getIos() {
        return ios;
    }

    /**
     * "ios" alanını ayarlar.
     *
     * @param ios yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppPlatformFlags setIos(Boolean ios) {
        this.ios = ios;
        return this;
    }

    /** @return "android" alanı */
    public Boolean getAndroid() {
        return android;
    }

    /**
     * "android" alanını ayarlar.
     *
     * @param android yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppPlatformFlags setAndroid(Boolean android) {
        this.android = android;
        return this;
    }

    /** @return "web" alanı */
    public Boolean getWeb() {
        return web;
    }

    /**
     * "web" alanını ayarlar.
     *
     * @param web yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppPlatformFlags setWeb(Boolean web) {
        this.web = web;
        return this;
    }

    /** @return "email" alanı */
    public Boolean getEmail() {
        return email;
    }

    /**
     * "email" alanını ayarlar.
     *
     * @param email yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppPlatformFlags setEmail(Boolean email) {
        this.email = email;
        return this;
    }

    /** @return "sms" alanı */
    public Boolean getSms() {
        return sms;
    }

    /**
     * "sms" alanını ayarlar.
     *
     * @param sms yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppPlatformFlags setSms(Boolean sms) {
        this.sms = sms;
        return this;
    }
}
