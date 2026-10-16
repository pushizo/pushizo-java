// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsQuietHours şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsQuietHours {
    /**
     * Zorunlu.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Zorunlu.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Zorunlu. Değerler: "user", "app".
     */
    @JsonProperty("timezoneMode")
    private String timezoneMode;

    public String getStart() {
        return start;
    }

    public UpdateAppDtoSettingsQuietHours start(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public UpdateAppDtoSettingsQuietHours end(String end) {
        this.end = end;
        return this;
    }

    public String getTimezoneMode() {
        return timezoneMode;
    }

    public UpdateAppDtoSettingsQuietHours timezoneMode(String timezoneMode) {
        this.timezoneMode = timezoneMode;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
