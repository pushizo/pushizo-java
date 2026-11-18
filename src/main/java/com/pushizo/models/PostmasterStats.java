// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostmasterStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PostmasterStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("domain")
    private String domain;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<PostmasterStatsDataItem> data;

    public String getDomain() {
        return domain;
    }

    public PostmasterStats domain(String domain) {
        this.domain = domain;
        return this;
    }

    public java.util.List<PostmasterStatsDataItem> getData() {
        return data;
    }

    public PostmasterStats data(java.util.List<PostmasterStatsDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
