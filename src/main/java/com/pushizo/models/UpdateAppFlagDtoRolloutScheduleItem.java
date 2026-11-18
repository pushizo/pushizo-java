// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppFlagDtoRolloutScheduleItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppFlagDtoRolloutScheduleItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("at")
    private String at;

    /**
     * Zorunlu.
     */
    @JsonProperty("percent")
    private Long percent;

    public String getAt() {
        return at;
    }

    public UpdateAppFlagDtoRolloutScheduleItem at(String at) {
        this.at = at;
        return this;
    }

    public Long getPercent() {
        return percent;
    }

    public UpdateAppFlagDtoRolloutScheduleItem percent(Long percent) {
        this.percent = percent;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
