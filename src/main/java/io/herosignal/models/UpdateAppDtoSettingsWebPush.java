// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** UpdateAppDtoSettingsWebPush şeması (api/openapi.yaml). */
public final class UpdateAppDtoSettingsWebPush {

    /** "serviceWorkerPath" alanı. */
    @JsonProperty("serviceWorkerPath")
    private String serviceWorkerPath;

    /** "serviceWorkerScope" alanı. */
    @JsonProperty("serviceWorkerScope")
    private String serviceWorkerScope;

    /** "prompt" alanı. */
    @JsonProperty("prompt")
    private UpdateAppDtoSettingsWebPushPrompt prompt;

    /** @return "serviceWorkerPath" alanı */
    public String getServiceWorkerPath() {
        return serviceWorkerPath;
    }

    /**
     * "serviceWorkerPath" alanını ayarlar.
     *
     * @param serviceWorkerPath yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPush setServiceWorkerPath(String serviceWorkerPath) {
        this.serviceWorkerPath = serviceWorkerPath;
        return this;
    }

    /** @return "serviceWorkerScope" alanı */
    public String getServiceWorkerScope() {
        return serviceWorkerScope;
    }

    /**
     * "serviceWorkerScope" alanını ayarlar.
     *
     * @param serviceWorkerScope yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPush setServiceWorkerScope(String serviceWorkerScope) {
        this.serviceWorkerScope = serviceWorkerScope;
        return this;
    }

    /** @return "prompt" alanı */
    public UpdateAppDtoSettingsWebPushPrompt getPrompt() {
        return prompt;
    }

    /**
     * "prompt" alanını ayarlar.
     *
     * @param prompt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPush setPrompt(UpdateAppDtoSettingsWebPushPrompt prompt) {
        this.prompt = prompt;
        return this;
    }
}
