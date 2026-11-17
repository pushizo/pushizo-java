// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelsVerifyDnsResponseSpf şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelsVerifyDnsResponseSpf {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

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

    public ChannelsVerifyDnsResponseSpf ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getRecord_() {
        return record_;
    }

    public ChannelsVerifyDnsResponseSpf record_(String record_) {
        this.record_ = record_;
        return this;
    }

    public String getExpected() {
        return expected;
    }

    public ChannelsVerifyDnsResponseSpf expected(String expected) {
        this.expected = expected;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
