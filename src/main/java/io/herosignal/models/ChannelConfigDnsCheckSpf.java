// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelConfigDnsCheckSpf şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelConfigDnsCheckSpf {
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

    public ChannelConfigDnsCheckSpf ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getRecord_() {
        return record_;
    }

    public ChannelConfigDnsCheckSpf record_(String record_) {
        this.record_ = record_;
        return this;
    }

    public String getExpected() {
        return expected;
    }

    public ChannelConfigDnsCheckSpf expected(String expected) {
        this.expected = expected;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
