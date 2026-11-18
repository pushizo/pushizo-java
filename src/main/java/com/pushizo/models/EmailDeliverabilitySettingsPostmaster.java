// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailDeliverabilitySettingsPostmaster şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailDeliverabilitySettingsPostmaster {
    /**
     * Zorunlu.
     */
    @JsonProperty("domain")
    private String domain;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_token")
    private Boolean hasToken;

    public String getDomain() {
        return domain;
    }

    public EmailDeliverabilitySettingsPostmaster domain(String domain) {
        this.domain = domain;
        return this;
    }

    public Boolean getHasToken() {
        return hasToken;
    }

    public EmailDeliverabilitySettingsPostmaster hasToken(Boolean hasToken) {
        this.hasToken = hasToken;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
