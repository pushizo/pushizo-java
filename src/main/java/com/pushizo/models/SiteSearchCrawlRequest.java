// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchCrawlRequest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchCrawlRequest {
    /**
     * Zorunlu.
     */
    @JsonProperty("queued")
    private Boolean queued;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private SiteSearchSource source;

    public Boolean getQueued() {
        return queued;
    }

    public SiteSearchCrawlRequest queued(Boolean queued) {
        this.queued = queued;
        return this;
    }

    public SiteSearchSource getSource() {
        return source;
    }

    public SiteSearchCrawlRequest source(SiteSearchSource source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
