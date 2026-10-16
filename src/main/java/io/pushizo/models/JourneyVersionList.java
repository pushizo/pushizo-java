// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyVersionList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyVersionList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<JourneyVersionListDataItem> data;

    public java.util.List<JourneyVersionListDataItem> getData() {
        return data;
    }

    public JourneyVersionList data(java.util.List<JourneyVersionListDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
