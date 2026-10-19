// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelConfigDnsCheckDkim şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelConfigDnsCheckDkim {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu.
     */
    @JsonProperty("selector")
    private String selector;

    /**
     * Zorunlu.
     */
    @JsonProperty("record")
    private String record_;

    /**
     * Zorunlu.
     */
    @JsonProperty("expected")
    private String expected;

    public Boolean getOk() {
        return ok;
    }

    public ChannelConfigDnsCheckDkim ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getSelector() {
        return selector;
    }

    public ChannelConfigDnsCheckDkim selector(String selector) {
        this.selector = selector;
        return this;
    }

    public String getRecord_() {
        return record_;
    }

    public ChannelConfigDnsCheckDkim record_(String record_) {
        this.record_ = record_;
        return this;
    }

    public String getExpected() {
        return expected;
    }

    public ChannelConfigDnsCheckDkim expected(String expected) {
        this.expected = expected;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
