// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WalletConfigGoogle şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WalletConfigGoogle {
    /**
     * Zorunlu.
     */
    @JsonProperty("configured")
    private Boolean configured;

    /**
     * Zorunlu.
     */
    @JsonProperty("issuer_id")
    private String issuerId;

    public Boolean getConfigured() {
        return configured;
    }

    public WalletConfigGoogle configured(Boolean configured) {
        this.configured = configured;
        return this;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public WalletConfigGoogle issuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
