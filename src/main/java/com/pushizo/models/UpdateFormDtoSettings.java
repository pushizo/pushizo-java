// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateFormDtoSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateFormDtoSettings {
    @JsonProperty("submit_label")
    private java.util.Map<String, String> submitLabel;

    @JsonProperty("success_message")
    private java.util.Map<String, String> successMessage;

    @JsonProperty("redirect_url")
    private String redirectUrl;

    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    @JsonProperty("subscribe")
    private UpdateFormDtoSettingsSubscribe subscribe;

    @JsonProperty("double_opt_in")
    private UpdateFormDtoSettingsDoubleOptIn doubleOptIn;

    @JsonProperty("event_name")
    private String eventName;

    @JsonProperty("captcha")
    private Boolean captcha;

    @JsonProperty("default_language")
    private String defaultLanguage;

    public java.util.Map<String, String> getSubmitLabel() {
        return submitLabel;
    }

    public UpdateFormDtoSettings submitLabel(java.util.Map<String, String> submitLabel) {
        this.submitLabel = submitLabel;
        return this;
    }

    public java.util.Map<String, String> getSuccessMessage() {
        return successMessage;
    }

    public UpdateFormDtoSettings successMessage(java.util.Map<String, String> successMessage) {
        this.successMessage = successMessage;
        return this;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public UpdateFormDtoSettings redirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public UpdateFormDtoSettings tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateFormDtoSettingsSubscribe getSubscribe() {
        return subscribe;
    }

    public UpdateFormDtoSettings subscribe(UpdateFormDtoSettingsSubscribe subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    public UpdateFormDtoSettingsDoubleOptIn getDoubleOptIn() {
        return doubleOptIn;
    }

    public UpdateFormDtoSettings doubleOptIn(UpdateFormDtoSettingsDoubleOptIn doubleOptIn) {
        this.doubleOptIn = doubleOptIn;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public UpdateFormDtoSettings eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public Boolean getCaptcha() {
        return captcha;
    }

    public UpdateFormDtoSettings captcha(Boolean captcha) {
        this.captcha = captcha;
        return this;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public UpdateFormDtoSettings defaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
