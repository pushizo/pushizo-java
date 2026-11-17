// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLandingPageDtoSettingsCookieConsent şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLandingPageDtoSettingsCookieConsent {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("text")
    private String text;

    @JsonProperty("accept_label")
    private String acceptLabel;

    @JsonProperty("reject_label")
    private String rejectLabel;

    @JsonProperty("policy_url")
    private String policyUrl;

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateLandingPageDtoSettingsCookieConsent enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getText() {
        return text;
    }

    public CreateLandingPageDtoSettingsCookieConsent text(String text) {
        this.text = text;
        return this;
    }

    public String getAcceptLabel() {
        return acceptLabel;
    }

    public CreateLandingPageDtoSettingsCookieConsent acceptLabel(String acceptLabel) {
        this.acceptLabel = acceptLabel;
        return this;
    }

    public String getRejectLabel() {
        return rejectLabel;
    }

    public CreateLandingPageDtoSettingsCookieConsent rejectLabel(String rejectLabel) {
        this.rejectLabel = rejectLabel;
        return this;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public CreateLandingPageDtoSettingsCookieConsent policyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
