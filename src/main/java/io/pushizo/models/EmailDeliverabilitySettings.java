// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

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

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
