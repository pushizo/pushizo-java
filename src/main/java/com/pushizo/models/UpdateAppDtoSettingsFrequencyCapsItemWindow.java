// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsFrequencyCapsItemWindow şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsFrequencyCapsItemWindow {
    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private Long value;

    /**
     * Zorunlu. Değerler: "minutes", "hours", "days", "weeks".
     */
    @JsonProperty("unit")
    private String unit;

    public Long getValue() {
        return value;
    }

    public UpdateAppDtoSettingsFrequencyCapsItemWindow value(Long value) {
        this.value = value;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public UpdateAppDtoSettingsFrequencyCapsItemWindow unit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
