// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailDeliverabilitySettingsVolumeSpike şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailDeliverabilitySettingsVolumeSpike {
    /**
     * Zorunlu.
     */
    @JsonProperty("multiplier")
    private Long multiplier;

    /**
     * Zorunlu.
     */
    @JsonProperty("floor")
    private Long floor;

    public Long getMultiplier() {
        return multiplier;
    }

    public EmailDeliverabilitySettingsVolumeSpike multiplier(Long multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public Long getFloor() {
        return floor;
    }

    public EmailDeliverabilitySettingsVolumeSpike floor(Long floor) {
        this.floor = floor;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
