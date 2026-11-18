// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WalletConfigApple şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WalletConfigApple {
    /**
     * Zorunlu.
     */
    @JsonProperty("configured")
    private Boolean configured;

    /**
     * Zorunlu.
     */
    @JsonProperty("pass_type_id")
    private String passTypeId;

    /**
     * Zorunlu.
     */
    @JsonProperty("team_id")
    private String teamId;

    /**
     * Zorunlu.
     */
    @JsonProperty("certificate_expires_at")
    private String certificateExpiresAt;

    public Boolean getConfigured() {
        return configured;
    }

    public WalletConfigApple configured(Boolean configured) {
        this.configured = configured;
        return this;
    }

    public String getPassTypeId() {
        return passTypeId;
    }

    public WalletConfigApple passTypeId(String passTypeId) {
        this.passTypeId = passTypeId;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public WalletConfigApple teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getCertificateExpiresAt() {
        return certificateExpiresAt;
    }

    public WalletConfigApple certificateExpiresAt(String certificateExpiresAt) {
        this.certificateExpiresAt = certificateExpiresAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
