// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

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

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
