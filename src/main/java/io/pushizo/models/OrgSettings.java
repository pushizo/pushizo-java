// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrgSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class OrgSettings {
    @JsonProperty("mfaRequired")
    private Boolean mfaRequired;

    @JsonProperty("ipAllowlist")
    private java.util.List<String> ipAllowlist;

    @JsonProperty("retentionDays")
    private Long retentionDays;

    @JsonProperty("sessionMaxHours")
    private Long sessionMaxHours;

    @JsonProperty("auditStream")
    private OrgSettingsAuditStream auditStream;

    public Boolean getMfaRequired() {
        return mfaRequired;
    }

    public OrgSettings mfaRequired(Boolean mfaRequired) {
        this.mfaRequired = mfaRequired;
        return this;
    }

    public java.util.List<String> getIpAllowlist() {
        return ipAllowlist;
    }

    public OrgSettings ipAllowlist(java.util.List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
        return this;
    }

    public Long getRetentionDays() {
        return retentionDays;
    }

    public OrgSettings retentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    public Long getSessionMaxHours() {
        return sessionMaxHours;
    }

    public OrgSettings sessionMaxHours(Long sessionMaxHours) {
        this.sessionMaxHours = sessionMaxHours;
        return this;
    }

    public OrgSettingsAuditStream getAuditStream() {
        return auditStream;
    }

    public OrgSettings auditStream(OrgSettingsAuditStream auditStream) {
        this.auditStream = auditStream;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
