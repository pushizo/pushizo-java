// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<ChannelConfig> data;

    public java.util.List<ChannelConfig> getData() {
        return data;
    }

    public ChannelList data(java.util.List<ChannelConfig> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
