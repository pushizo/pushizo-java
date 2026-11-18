// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelsVerifyDnsResponseDkim şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelsVerifyDnsResponseDkim {
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

    public ChannelsVerifyDnsResponseDkim ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getSelector() {
        return selector;
    }

    public ChannelsVerifyDnsResponseDkim selector(String selector) {
        this.selector = selector;
        return this;
    }

    public String getRecord_() {
        return record_;
    }

    public ChannelsVerifyDnsResponseDkim record_(String record_) {
        this.record_ = record_;
        return this;
    }

    public String getExpected() {
        return expected;
    }

    public ChannelsVerifyDnsResponseDkim expected(String expected) {
        this.expected = expected;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
