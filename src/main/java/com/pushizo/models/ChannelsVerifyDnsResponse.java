// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelsVerifyDnsResponse şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelsVerifyDnsResponse {
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
    private ChannelsVerifyDnsResponseSpf spf;

    /**
     * Zorunlu.
     */
    @JsonProperty("dkim")
    private ChannelsVerifyDnsResponseDkim dkim;

    /**
     * Zorunlu.
     */
    @JsonProperty("dmarc")
    private ChannelsVerifyDnsResponseDmarc dmarc;

    /**
     * Zorunlu.
     */
    @JsonProperty("issues")
    private java.util.List<String> issues;

    public String getDomain() {
        return domain;
    }

    public ChannelsVerifyDnsResponse domain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getCheckedAt() {
        return checkedAt;
    }

    public ChannelsVerifyDnsResponse checkedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }

    public ChannelsVerifyDnsResponseSpf getSpf() {
        return spf;
    }

    public ChannelsVerifyDnsResponse spf(ChannelsVerifyDnsResponseSpf spf) {
        this.spf = spf;
        return this;
    }

    public ChannelsVerifyDnsResponseDkim getDkim() {
        return dkim;
    }

    public ChannelsVerifyDnsResponse dkim(ChannelsVerifyDnsResponseDkim dkim) {
        this.dkim = dkim;
        return this;
    }

    public ChannelsVerifyDnsResponseDmarc getDmarc() {
        return dmarc;
    }

    public ChannelsVerifyDnsResponse dmarc(ChannelsVerifyDnsResponseDmarc dmarc) {
        this.dmarc = dmarc;
        return this;
    }

    public java.util.List<String> getIssues() {
        return issues;
    }

    public ChannelsVerifyDnsResponse issues(java.util.List<String> issues) {
        this.issues = issues;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
