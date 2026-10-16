// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IdentityKey şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class IdentityKey {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("kid")
    private String kid;

    /**
     * Zorunlu. Değerler: "ES256".
     */
    @JsonProperty("alg")
    private String alg;

    /**
     * Zorunlu.
     */
    @JsonProperty("public_jwk")
    private java.util.Map<String, String> publicJwk;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("revoked_at")
    private String revokedAt;

    public String getId() {
        return id;
    }

    public IdentityKey id(String id) {
        this.id = id;
        return this;
    }

    public String getKid() {
        return kid;
    }

    public IdentityKey kid(String kid) {
        this.kid = kid;
        return this;
    }

    public String getAlg() {
        return alg;
    }

    public IdentityKey alg(String alg) {
        this.alg = alg;
        return this;
    }

    public java.util.Map<String, String> getPublicJwk() {
        return publicJwk;
    }

    public IdentityKey publicJwk(java.util.Map<String, String> publicJwk) {
        this.publicJwk = publicJwk;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public IdentityKey label(String label) {
        this.label = label;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public IdentityKey createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getRevokedAt() {
        return revokedAt;
    }

    public IdentityKey revokedAt(String revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
