// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsInstall şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsInstall {
    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("sdk_url")
    private String sdkUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("api_url")
    private String apiUrl;

    public String getAppId() {
        return appId;
    }

    public InboxSettingsInstall appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getSdkUrl() {
        return sdkUrl;
    }

    public InboxSettingsInstall sdkUrl(String sdkUrl) {
        this.sdkUrl = sdkUrl;
        return this;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public InboxSettingsInstall apiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
