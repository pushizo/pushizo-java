// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWalletConfigDtoApple şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWalletConfigDtoApple {
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
    @JsonProperty("certificate_pem")
    private String certificatePem;

    /**
     * Zorunlu.
     */
    @JsonProperty("private_key_pem")
    private String privateKeyPem;

    @JsonProperty("key_passphrase")
    private String keyPassphrase;

    /**
     * Zorunlu.
     */
    @JsonProperty("wwdr_pem")
    private String wwdrPem;

    public String getPassTypeId() {
        return passTypeId;
    }

    public UpdateWalletConfigDtoApple passTypeId(String passTypeId) {
        this.passTypeId = passTypeId;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public UpdateWalletConfigDtoApple teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getCertificatePem() {
        return certificatePem;
    }

    public UpdateWalletConfigDtoApple certificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    public String getPrivateKeyPem() {
        return privateKeyPem;
    }

    public UpdateWalletConfigDtoApple privateKeyPem(String privateKeyPem) {
        this.privateKeyPem = privateKeyPem;
        return this;
    }

    public String getKeyPassphrase() {
        return keyPassphrase;
    }

    public UpdateWalletConfigDtoApple keyPassphrase(String keyPassphrase) {
        this.keyPassphrase = keyPassphrase;
        return this;
    }

    public String getWwdrPem() {
        return wwdrPem;
    }

    public UpdateWalletConfigDtoApple wwdrPem(String wwdrPem) {
        this.wwdrPem = wwdrPem;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
