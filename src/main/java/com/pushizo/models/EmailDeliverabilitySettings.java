// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailDeliverabilitySettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailDeliverabilitySettings {
    /**
     * Zorunlu.
     */
    @JsonProperty("bcc_address")
    private String bccAddress;

    /**
     * Zorunlu.
     */
    @JsonProperty("validation")
    private EmailDeliverabilitySettingsValidation validation;

    /**
     * Zorunlu.
     */
    @JsonProperty("verifier")
    private EmailDeliverabilitySettingsVerifier verifier;

    /**
     * Zorunlu.
     */
    @JsonProperty("volume_spike")
    private EmailDeliverabilitySettingsVolumeSpike volumeSpike;

    /**
     * Zorunlu.
     */
    @JsonProperty("postmaster")
    private EmailDeliverabilitySettingsPostmaster postmaster;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_invalid_ratio")
    private Double maxInvalidRatio;

    public String getBccAddress() {
        return bccAddress;
    }

    public EmailDeliverabilitySettings bccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
        return this;
    }

    public EmailDeliverabilitySettingsValidation getValidation() {
        return validation;
    }

    public EmailDeliverabilitySettings validation(EmailDeliverabilitySettingsValidation validation) {
        this.validation = validation;
        return this;
    }

    public EmailDeliverabilitySettingsVerifier getVerifier() {
        return verifier;
    }

    public EmailDeliverabilitySettings verifier(EmailDeliverabilitySettingsVerifier verifier) {
        this.verifier = verifier;
        return this;
    }

    public EmailDeliverabilitySettingsVolumeSpike getVolumeSpike() {
        return volumeSpike;
    }

    public EmailDeliverabilitySettings volumeSpike(EmailDeliverabilitySettingsVolumeSpike volumeSpike) {
        this.volumeSpike = volumeSpike;
        return this;
    }

    public EmailDeliverabilitySettingsPostmaster getPostmaster() {
        return postmaster;
    }

    public EmailDeliverabilitySettings postmaster(EmailDeliverabilitySettingsPostmaster postmaster) {
        this.postmaster = postmaster;
        return this;
    }

    public Double getMaxInvalidRatio() {
        return maxInvalidRatio;
    }

    public EmailDeliverabilitySettings maxInvalidRatio(Double maxInvalidRatio) {
        this.maxInvalidRatio = maxInvalidRatio;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
