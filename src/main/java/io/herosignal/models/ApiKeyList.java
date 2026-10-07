// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiKeyList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ApiKeyList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<ApiKey> data;

    public java.util.List<ApiKey> getData() {
        return data;
    }

    public ApiKeyList data(java.util.List<ApiKey> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
