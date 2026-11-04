// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWalletConfigDtoGoogle şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWalletConfigDtoGoogle {
    /**
     * Zorunlu.
     */
    @JsonProperty("issuer_id")
    private String issuerId;

    /**
     * Zorunlu.
     */
    @JsonProperty("service_account_json")
    private String serviceAccountJson;

    public String getIssuerId() {
        return issuerId;
    }

    public UpdateWalletConfigDtoGoogle issuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    public String getServiceAccountJson() {
        return serviceAccountJson;
    }

    public UpdateWalletConfigDtoGoogle serviceAccountJson(String serviceAccountJson) {
        this.serviceAccountJson = serviceAccountJson;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
