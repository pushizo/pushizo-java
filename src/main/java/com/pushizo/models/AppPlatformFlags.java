// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppPlatformFlags şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppPlatformFlags {
    @JsonProperty("ios")
    private Boolean ios;

    @JsonProperty("android")
    private Boolean android;

    @JsonProperty("web")
    private Boolean web;

    @JsonProperty("email")
    private Boolean email;

    @JsonProperty("sms")
    private Boolean sms;

    public Boolean getIos() {
        return ios;
    }

    public AppPlatformFlags ios(Boolean ios) {
        this.ios = ios;
        return this;
    }

    public Boolean getAndroid() {
        return android;
    }

    public AppPlatformFlags android(Boolean android) {
        this.android = android;
        return this;
    }

    public Boolean getWeb() {
        return web;
    }

    public AppPlatformFlags web(Boolean web) {
        this.web = web;
        return this;
    }

    public Boolean getEmail() {
        return email;
    }

    public AppPlatformFlags email(Boolean email) {
        this.email = email;
        return this;
    }

    public Boolean getSms() {
        return sms;
    }

    public AppPlatformFlags sms(Boolean sms) {
        this.sms = sms;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
