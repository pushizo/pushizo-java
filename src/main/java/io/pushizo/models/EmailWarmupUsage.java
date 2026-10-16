// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailWarmupUsage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailWarmupUsage {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<EmailWarmupUsageDataItem> data;

    public java.util.List<EmailWarmupUsageDataItem> getData() {
        return data;
    }

    public EmailWarmupUsage data(java.util.List<EmailWarmupUsageDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
