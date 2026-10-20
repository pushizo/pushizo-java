// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageListDataItemSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageListDataItemSettings {
    @JsonProperty("language")
    private String language;

    @JsonProperty("form_id")
    private String formId;

    @JsonProperty("form_section_id")
    private String formSectionId;

    @JsonProperty("cookie_consent")
    private LandingPageListDataItemSettingsCookieConsent cookieConsent;

    @JsonProperty("web_sdk")
    private Boolean webSdk;

    @JsonProperty("favicon_url")
    private String faviconUrl;

    public String getLanguage() {
        return language;
    }

    public LandingPageListDataItemSettings language(String language) {
        this.language = language;
        return this;
    }

    public String getFormId() {
        return formId;
    }

    public LandingPageListDataItemSettings formId(String formId) {
        this.formId = formId;
        return this;
    }

    public String getFormSectionId() {
        return formSectionId;
    }

    public LandingPageListDataItemSettings formSectionId(String formSectionId) {
        this.formSectionId = formSectionId;
        return this;
    }

    public LandingPageListDataItemSettingsCookieConsent getCookieConsent() {
        return cookieConsent;
    }

    public LandingPageListDataItemSettings cookieConsent(LandingPageListDataItemSettingsCookieConsent cookieConsent) {
        this.cookieConsent = cookieConsent;
        return this;
    }

    public Boolean getWebSdk() {
        return webSdk;
    }

    public LandingPageListDataItemSettings webSdk(Boolean webSdk) {
        this.webSdk = webSdk;
        return this;
    }

    public String getFaviconUrl() {
        return faviconUrl;
    }

    public LandingPageListDataItemSettings faviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
