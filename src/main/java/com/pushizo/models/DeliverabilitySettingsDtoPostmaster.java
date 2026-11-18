// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeliverabilitySettingsDtoPostmaster şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DeliverabilitySettingsDtoPostmaster {
    /**
     * Zorunlu.
     */
    @JsonProperty("domain")
    private String domain;

    @JsonProperty("access_token")
    private String accessToken;

    public String getDomain() {
        return domain;
    }

    public DeliverabilitySettingsDtoPostmaster domain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public DeliverabilitySettingsDtoPostmaster accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
