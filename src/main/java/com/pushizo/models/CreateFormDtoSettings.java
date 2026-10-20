// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateFormDtoSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateFormDtoSettings {
    @JsonProperty("submit_label")
    private java.util.Map<String, String> submitLabel;

    @JsonProperty("success_message")
    private java.util.Map<String, String> successMessage;

    @JsonProperty("redirect_url")
    private String redirectUrl;

    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    @JsonProperty("subscribe")
    private CreateFormDtoSettingsSubscribe subscribe;

    @JsonProperty("double_opt_in")
    private CreateFormDtoSettingsDoubleOptIn doubleOptIn;

    @JsonProperty("event_name")
    private String eventName;

    @JsonProperty("captcha")
    private Boolean captcha;

    @JsonProperty("default_language")
    private String defaultLanguage;

    public java.util.Map<String, String> getSubmitLabel() {
        return submitLabel;
    }

    public CreateFormDtoSettings submitLabel(java.util.Map<String, String> submitLabel) {
        this.submitLabel = submitLabel;
        return this;
    }

    public java.util.Map<String, String> getSuccessMessage() {
        return successMessage;
    }

    public CreateFormDtoSettings successMessage(java.util.Map<String, String> successMessage) {
        this.successMessage = successMessage;
        return this;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public CreateFormDtoSettings redirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public CreateFormDtoSettings tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateFormDtoSettingsSubscribe getSubscribe() {
        return subscribe;
    }

    public CreateFormDtoSettings subscribe(CreateFormDtoSettingsSubscribe subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    public CreateFormDtoSettingsDoubleOptIn getDoubleOptIn() {
        return doubleOptIn;
    }

    public CreateFormDtoSettings doubleOptIn(CreateFormDtoSettingsDoubleOptIn doubleOptIn) {
        this.doubleOptIn = doubleOptIn;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public CreateFormDtoSettings eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public Boolean getCaptcha() {
        return captcha;
    }

    public CreateFormDtoSettings captcha(Boolean captcha) {
        this.captcha = captcha;
        return this;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public CreateFormDtoSettings defaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
