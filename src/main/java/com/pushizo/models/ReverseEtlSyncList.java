// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReverseEtlSyncList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ReverseEtlSyncList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<ReverseEtlSync> data;

    public java.util.List<ReverseEtlSync> getData() {
        return data;
    }

    public ReverseEtlSyncList data(java.util.List<ReverseEtlSync> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
