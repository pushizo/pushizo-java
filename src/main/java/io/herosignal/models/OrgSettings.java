// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** OrgSettings şeması (api/openapi.yaml). */
public final class OrgSettings {

    /** "mfaRequired" alanı. */
    @JsonProperty("mfaRequired")
    private Boolean mfaRequired;

    /** "ipAllowlist" alanı. */
    @JsonProperty("ipAllowlist")
    private List<String> ipAllowlist;

    /** "retentionDays" alanı. */
    @JsonProperty("retentionDays")
    private Long retentionDays;

    /** "sessionMaxHours" alanı. */
    @JsonProperty("sessionMaxHours")
    private Long sessionMaxHours;

    /** @return "mfaRequired" alanı */
    public Boolean getMfaRequired() {
        return mfaRequired;
    }

    /**
     * "mfaRequired" alanını ayarlar.
     *
     * @param mfaRequired yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrgSettings setMfaRequired(Boolean mfaRequired) {
        this.mfaRequired = mfaRequired;
        return this;
    }

    /** @return "ipAllowlist" alanı */
    public List<String> getIpAllowlist() {
        return ipAllowlist;
    }

    /**
     * "ipAllowlist" alanını ayarlar.
     *
     * @param ipAllowlist yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrgSettings setIpAllowlist(List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
        return this;
    }

    /** @return "retentionDays" alanı */
    public Long getRetentionDays() {
        return retentionDays;
    }

    /**
     * "retentionDays" alanını ayarlar.
     *
     * @param retentionDays yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrgSettings setRetentionDays(Long retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /** @return "sessionMaxHours" alanı */
    public Long getSessionMaxHours() {
        return sessionMaxHours;
    }

    /**
     * "sessionMaxHours" alanını ayarlar.
     *
     * @param sessionMaxHours yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrgSettings setSessionMaxHours(Long sessionMaxHours) {
        this.sessionMaxHours = sessionMaxHours;
        return this;
    }
}
