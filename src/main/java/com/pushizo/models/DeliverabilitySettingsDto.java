// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeliverabilitySettingsDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DeliverabilitySettingsDto {
    @JsonProperty("bcc_address")
    private String bccAddress;

    @JsonProperty("validation")
    private DeliverabilitySettingsDtoValidation validation;

    @JsonProperty("verifier")
    private DeliverabilitySettingsDtoVerifier verifier;

    @JsonProperty("volume_spike")
    private DeliverabilitySettingsDtoVolumeSpike volumeSpike;

    @JsonProperty("postmaster")
    private DeliverabilitySettingsDtoPostmaster postmaster;

    public String getBccAddress() {
        return bccAddress;
    }

    public DeliverabilitySettingsDto bccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
        return this;
    }

    public DeliverabilitySettingsDtoValidation getValidation() {
        return validation;
    }

    public DeliverabilitySettingsDto validation(DeliverabilitySettingsDtoValidation validation) {
        this.validation = validation;
        return this;
    }

    public DeliverabilitySettingsDtoVerifier getVerifier() {
        return verifier;
    }

    public DeliverabilitySettingsDto verifier(DeliverabilitySettingsDtoVerifier verifier) {
        this.verifier = verifier;
        return this;
    }

    public DeliverabilitySettingsDtoVolumeSpike getVolumeSpike() {
        return volumeSpike;
    }

    public DeliverabilitySettingsDto volumeSpike(DeliverabilitySettingsDtoVolumeSpike volumeSpike) {
        this.volumeSpike = volumeSpike;
        return this;
    }

    public DeliverabilitySettingsDtoPostmaster getPostmaster() {
        return postmaster;
    }

    public DeliverabilitySettingsDto postmaster(DeliverabilitySettingsDtoPostmaster postmaster) {
        this.postmaster = postmaster;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
