// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDtoSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDtoSettings {
    @JsonProperty("language")
    private String language;

    @JsonProperty("form_id")
    private String formId;

    @JsonProperty("form_section_id")
    private String formSectionId;

    @JsonProperty("cookie_consent")
    private UpdateLandingPageDtoSettingsCookieConsent cookieConsent;

    @JsonProperty("web_sdk")
    private Boolean webSdk;

    @JsonProperty("favicon_url")
    private String faviconUrl;

    public String getLanguage() {
        return language;
    }

    public UpdateLandingPageDtoSettings language(String language) {
        this.language = language;
        return this;
    }

    public String getFormId() {
        return formId;
    }

    public UpdateLandingPageDtoSettings formId(String formId) {
        this.formId = formId;
        return this;
    }

    public String getFormSectionId() {
        return formSectionId;
    }

    public UpdateLandingPageDtoSettings formSectionId(String formSectionId) {
        this.formSectionId = formSectionId;
        return this;
    }

    public UpdateLandingPageDtoSettingsCookieConsent getCookieConsent() {
        return cookieConsent;
    }

    public UpdateLandingPageDtoSettings cookieConsent(UpdateLandingPageDtoSettingsCookieConsent cookieConsent) {
        this.cookieConsent = cookieConsent;
        return this;
    }

    public Boolean getWebSdk() {
        return webSdk;
    }

    public UpdateLandingPageDtoSettings webSdk(Boolean webSdk) {
        this.webSdk = webSdk;
        return this;
    }

    public String getFaviconUrl() {
        return faviconUrl;
    }

    public UpdateLandingPageDtoSettings faviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
