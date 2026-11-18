// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCapiTestResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCapiTestResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu.
     */
    @JsonProperty("response")
    private java.util.Map<String, Object> response;

    public Boolean getOk() {
        return ok;
    }

    public AdCapiTestResult ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public java.util.Map<String, Object> getResponse() {
        return response;
    }

    public AdCapiTestResult response(java.util.Map<String, Object> response) {
        this.response = response;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
