// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SessionVolume şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SessionVolume {
    /**
     * Zorunlu.
     */
    @JsonProperty("days")
    private java.util.List<SessionVolumeDaysItem> days;

    public java.util.List<SessionVolumeDaysItem> getDays() {
        return days;
    }

    public SessionVolume days(java.util.List<SessionVolumeDaysItem> days) {
        this.days = days;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
