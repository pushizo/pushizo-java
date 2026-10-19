// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPush şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPush {
    @JsonProperty("serviceWorkerPath")
    private String serviceWorkerPath;

    @JsonProperty("serviceWorkerScope")
    private String serviceWorkerScope;

    @JsonProperty("prompt")
    private AppSettingsWebPushPrompt prompt;

    @JsonProperty("welcomeNotification")
    private AppSettingsWebPushWelcomeNotification welcomeNotification;

    @JsonProperty("clickBehavior")
    private AppSettingsWebPushClickBehavior clickBehavior;

    @JsonProperty("customLink")
    private AppSettingsWebPushCustomLink customLink;

    @JsonProperty("promptBackoffDays")
    private java.util.List<Long> promptBackoffDays;

    public String getServiceWorkerPath() {
        return serviceWorkerPath;
    }

    public AppSettingsWebPush serviceWorkerPath(String serviceWorkerPath) {
        this.serviceWorkerPath = serviceWorkerPath;
        return this;
    }

    public String getServiceWorkerScope() {
        return serviceWorkerScope;
    }

    public AppSettingsWebPush serviceWorkerScope(String serviceWorkerScope) {
        this.serviceWorkerScope = serviceWorkerScope;
        return this;
    }

    public AppSettingsWebPushPrompt getPrompt() {
        return prompt;
    }

    public AppSettingsWebPush prompt(AppSettingsWebPushPrompt prompt) {
        this.prompt = prompt;
        return this;
    }

    public AppSettingsWebPushWelcomeNotification getWelcomeNotification() {
        return welcomeNotification;
    }

    public AppSettingsWebPush welcomeNotification(AppSettingsWebPushWelcomeNotification welcomeNotification) {
        this.welcomeNotification = welcomeNotification;
        return this;
    }

    public AppSettingsWebPushClickBehavior getClickBehavior() {
        return clickBehavior;
    }

    public AppSettingsWebPush clickBehavior(AppSettingsWebPushClickBehavior clickBehavior) {
        this.clickBehavior = clickBehavior;
        return this;
    }

    public AppSettingsWebPushCustomLink getCustomLink() {
        return customLink;
    }

    public AppSettingsWebPush customLink(AppSettingsWebPushCustomLink customLink) {
        this.customLink = customLink;
        return this;
    }

    public java.util.List<Long> getPromptBackoffDays() {
        return promptBackoffDays;
    }

    public AppSettingsWebPush promptBackoffDays(java.util.List<Long> promptBackoffDays) {
        this.promptBackoffDays = promptBackoffDays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
