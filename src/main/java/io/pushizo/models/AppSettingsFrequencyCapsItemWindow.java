// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsFrequencyCapsItemWindow şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsFrequencyCapsItemWindow {
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

    public AppSettingsFrequencyCapsItemWindow value(Long value) {
        this.value = value;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public AppSettingsFrequencyCapsItemWindow unit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
