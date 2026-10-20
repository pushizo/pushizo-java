// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageSettings {
    @JsonProperty("language")
    private String language;

    @JsonProperty("form_id")
    private String formId;

    @JsonProperty("form_section_id")
    private String formSectionId;

    @JsonProperty("cookie_consent")
    private LandingPageSettingsCookieConsent cookieConsent;

    @JsonProperty("web_sdk")
    private Boolean webSdk;

    @JsonProperty("favicon_url")
    private String faviconUrl;

    public String getLanguage() {
        return language;
    }

    public LandingPageSettings language(String language) {
        this.language = language;
        return this;
    }

    public String getFormId() {
        return formId;
    }

    public LandingPageSettings formId(String formId) {
        this.formId = formId;
        return this;
    }

    public String getFormSectionId() {
        return formSectionId;
    }

    public LandingPageSettings formSectionId(String formSectionId) {
        this.formSectionId = formSectionId;
        return this;
    }

    public LandingPageSettingsCookieConsent getCookieConsent() {
        return cookieConsent;
    }

    public LandingPageSettings cookieConsent(LandingPageSettingsCookieConsent cookieConsent) {
        this.cookieConsent = cookieConsent;
        return this;
    }

    public Boolean getWebSdk() {
        return webSdk;
    }

    public LandingPageSettings webSdk(Boolean webSdk) {
        this.webSdk = webSdk;
        return this;
    }

    public String getFaviconUrl() {
        return faviconUrl;
    }

    public LandingPageSettings faviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
