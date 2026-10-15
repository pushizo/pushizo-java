// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailAddressCheck şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailAddressCheck {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu. Değerler: "syntax", "no_mx", "disposable", "role", "verifier_invalid".
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Zorunlu.
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * Zorunlu.
     */
    @JsonProperty("checks")
    private java.util.List<String> checks;

    /**
     * Zorunlu.
     */
    @JsonProperty("unknown")
    private java.util.List<String> unknown;

    public Boolean getOk() {
        return ok;
    }

    public EmailAddressCheck ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public EmailAddressCheck reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public EmailAddressCheck detail(String detail) {
        this.detail = detail;
        return this;
    }

    public java.util.List<String> getChecks() {
        return checks;
    }

    public EmailAddressCheck checks(java.util.List<String> checks) {
        this.checks = checks;
        return this;
    }

    public java.util.List<String> getUnknown() {
        return unknown;
    }

    public EmailAddressCheck unknown(java.util.List<String> unknown) {
        this.unknown = unknown;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
