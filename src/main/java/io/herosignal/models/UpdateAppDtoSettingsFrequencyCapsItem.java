// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsFrequencyCapsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsFrequencyCapsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("max")
    private Long max;

    /**
     * Zorunlu.
     */
    @JsonProperty("window")
    private UpdateAppDtoSettingsFrequencyCapsItemWindow window;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    public Long getMax() {
        return max;
    }

    public UpdateAppDtoSettingsFrequencyCapsItem max(Long max) {
        this.max = max;
        return this;
    }

    public UpdateAppDtoSettingsFrequencyCapsItemWindow getWindow() {
        return window;
    }

    public UpdateAppDtoSettingsFrequencyCapsItem window(UpdateAppDtoSettingsFrequencyCapsItemWindow window) {
        this.window = window;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public UpdateAppDtoSettingsFrequencyCapsItem channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
