// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPush şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPush {
    @JsonProperty("serviceWorkerPath")
    private String serviceWorkerPath;

    @JsonProperty("serviceWorkerScope")
    private String serviceWorkerScope;

    @JsonProperty("prompt")
    private UpdateAppDtoSettingsWebPushPrompt prompt;

    @JsonProperty("welcomeNotification")
    private UpdateAppDtoSettingsWebPushWelcomeNotification welcomeNotification;

    @JsonProperty("clickBehavior")
    private UpdateAppDtoSettingsWebPushClickBehavior clickBehavior;

    @JsonProperty("customLink")
    private UpdateAppDtoSettingsWebPushCustomLink customLink;

    @JsonProperty("promptBackoffDays")
    private java.util.List<Long> promptBackoffDays;

    public String getServiceWorkerPath() {
        return serviceWorkerPath;
    }

    public UpdateAppDtoSettingsWebPush serviceWorkerPath(String serviceWorkerPath) {
        this.serviceWorkerPath = serviceWorkerPath;
        return this;
    }

    public String getServiceWorkerScope() {
        return serviceWorkerScope;
    }

    public UpdateAppDtoSettingsWebPush serviceWorkerScope(String serviceWorkerScope) {
        this.serviceWorkerScope = serviceWorkerScope;
        return this;
    }

    public UpdateAppDtoSettingsWebPushPrompt getPrompt() {
        return prompt;
    }

    public UpdateAppDtoSettingsWebPush prompt(UpdateAppDtoSettingsWebPushPrompt prompt) {
        this.prompt = prompt;
        return this;
    }

    public UpdateAppDtoSettingsWebPushWelcomeNotification getWelcomeNotification() {
        return welcomeNotification;
    }

    public UpdateAppDtoSettingsWebPush welcomeNotification(UpdateAppDtoSettingsWebPushWelcomeNotification welcomeNotification) {
        this.welcomeNotification = welcomeNotification;
        return this;
    }

    public UpdateAppDtoSettingsWebPushClickBehavior getClickBehavior() {
        return clickBehavior;
    }

    public UpdateAppDtoSettingsWebPush clickBehavior(UpdateAppDtoSettingsWebPushClickBehavior clickBehavior) {
        this.clickBehavior = clickBehavior;
        return this;
    }

    public UpdateAppDtoSettingsWebPushCustomLink getCustomLink() {
        return customLink;
    }

    public UpdateAppDtoSettingsWebPush customLink(UpdateAppDtoSettingsWebPushCustomLink customLink) {
        this.customLink = customLink;
        return this;
    }

    public java.util.List<Long> getPromptBackoffDays() {
        return promptBackoffDays;
    }

    public UpdateAppDtoSettingsWebPush promptBackoffDays(java.util.List<Long> promptBackoffDays) {
        this.promptBackoffDays = promptBackoffDays;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
