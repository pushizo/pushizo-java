// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CannedResponseList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CannedResponseList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<CannedResponse> data;

    public java.util.List<CannedResponse> getData() {
        return data;
    }

    public CannedResponseList data(java.util.List<CannedResponse> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
