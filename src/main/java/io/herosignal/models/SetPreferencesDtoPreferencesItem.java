// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SetPreferencesDtoPreferencesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SetPreferencesDtoPreferencesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("opted_in")
    private Boolean optedIn;

    public String getCategory() {
        return category;
    }

    public SetPreferencesDtoPreferencesItem category(String category) {
        this.category = category;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public SetPreferencesDtoPreferencesItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Boolean getOptedIn() {
        return optedIn;
    }

    public SetPreferencesDtoPreferencesItem optedIn(Boolean optedIn) {
        this.optedIn = optedIn;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
