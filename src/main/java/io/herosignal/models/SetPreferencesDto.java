// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SetPreferencesDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SetPreferencesDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("preferences")
    private java.util.List<SetPreferencesDtoPreferencesItem> preferences;

    public java.util.List<SetPreferencesDtoPreferencesItem> getPreferences() {
        return preferences;
    }

    public SetPreferencesDto preferences(java.util.List<SetPreferencesDtoPreferencesItem> preferences) {
        this.preferences = preferences;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
