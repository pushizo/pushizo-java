// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateIdentityKeyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateIdentityKeyDto {
    @JsonProperty("kid")
    private String kid;

    @JsonProperty("label")
    private String label;

    @JsonProperty("public_jwk")
    private java.util.Map<String, Object> publicJwk;

    @JsonProperty("public_key_pem")
    private String publicKeyPem;

    public String getKid() {
        return kid;
    }

    public CreateIdentityKeyDto kid(String kid) {
        this.kid = kid;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public CreateIdentityKeyDto label(String label) {
        this.label = label;
        return this;
    }

    public java.util.Map<String, Object> getPublicJwk() {
        return publicJwk;
    }

    public CreateIdentityKeyDto publicJwk(java.util.Map<String, Object> publicJwk) {
        this.publicJwk = publicJwk;
        return this;
    }

    public String getPublicKeyPem() {
        return publicKeyPem;
    }

    public CreateIdentityKeyDto publicKeyPem(String publicKeyPem) {
        this.publicKeyPem = publicKeyPem;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
