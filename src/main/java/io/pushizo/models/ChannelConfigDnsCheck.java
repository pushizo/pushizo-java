// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelConfigDnsCheck şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelConfigDnsCheck {
    /**
     * Zorunlu.
     */
    @JsonProperty("domain")
    private String domain;

    /**
     * Zorunlu.
     */
    @JsonProperty("checked_at")
    private String checkedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("spf")
    private ChannelConfigDnsCheckSpf spf;

    /**
     * Zorunlu.
     */
    @JsonProperty("dkim")
    private ChannelConfigDnsCheckDkim dkim;

    /**
     * Zorunlu.
     */
    @JsonProperty("dmarc")
    private ChannelConfigDnsCheckDmarc dmarc;

    /**
     * Zorunlu.
     */
    @JsonProperty("issues")
    private java.util.List<String> issues;

    public String getDomain() {
        return domain;
    }

    public ChannelConfigDnsCheck domain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getCheckedAt() {
        return checkedAt;
    }

    public ChannelConfigDnsCheck checkedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }

    public ChannelConfigDnsCheckSpf getSpf() {
        return spf;
    }

    public ChannelConfigDnsCheck spf(ChannelConfigDnsCheckSpf spf) {
        this.spf = spf;
        return this;
    }

    public ChannelConfigDnsCheckDkim getDkim() {
        return dkim;
    }

    public ChannelConfigDnsCheck dkim(ChannelConfigDnsCheckDkim dkim) {
        this.dkim = dkim;
        return this;
    }

    public ChannelConfigDnsCheckDmarc getDmarc() {
        return dmarc;
    }

    public ChannelConfigDnsCheck dmarc(ChannelConfigDnsCheckDmarc dmarc) {
        this.dmarc = dmarc;
        return this;
    }

    public java.util.List<String> getIssues() {
        return issues;
    }

    public ChannelConfigDnsCheck issues(java.util.List<String> issues) {
        this.issues = issues;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
