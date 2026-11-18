// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageVersionsDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageVersionsDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("published_at")
    private String publishedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("published_by")
    private String publishedBy;

    public Long getVersion() {
        return version;
    }

    public LandingPageVersionsDataItem version(Long version) {
        this.version = version;
        return this;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public LandingPageVersionsDataItem publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public LandingPageVersionsDataItem publishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
