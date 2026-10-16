// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SmsKeywordList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SmsKeywordList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<SmsKeyword> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("reserved")
    private java.util.List<String> reserved;

    public java.util.List<SmsKeyword> getData() {
        return data;
    }

    public SmsKeywordList data(java.util.List<SmsKeyword> data) {
        this.data = data;
        return this;
    }

    public java.util.List<String> getReserved() {
        return reserved;
    }

    public SmsKeywordList reserved(java.util.List<String> reserved) {
        this.reserved = reserved;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
