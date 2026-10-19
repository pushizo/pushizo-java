// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsInApp şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsInApp {
    @JsonProperty("minIntervalSeconds")
    private Long minIntervalSeconds;

    public Long getMinIntervalSeconds() {
        return minIntervalSeconds;
    }

    public UpdateAppDtoSettingsInApp minIntervalSeconds(Long minIntervalSeconds) {
        this.minIntervalSeconds = minIntervalSeconds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
