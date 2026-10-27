// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsFrequencyCapsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsFrequencyCapsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("max")
    private Long max;

    /**
     * Zorunlu.
     */
    @JsonProperty("window")
    private AppSettingsFrequencyCapsItemWindow window;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "adm_push", "wns_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    public Long getMax() {
        return max;
    }

    public AppSettingsFrequencyCapsItem max(Long max) {
        this.max = max;
        return this;
    }

    public AppSettingsFrequencyCapsItemWindow getWindow() {
        return window;
    }

    public AppSettingsFrequencyCapsItem window(AppSettingsFrequencyCapsItemWindow window) {
        this.window = window;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public AppSettingsFrequencyCapsItem channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
