// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchSourceStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchSourceStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("pages_found")
    private Long pagesFound;

    /**
     * Zorunlu.
     */
    @JsonProperty("pages_indexed")
    private Long pagesIndexed;

    /**
     * Zorunlu.
     */
    @JsonProperty("pages_unchanged")
    private Long pagesUnchanged;

    /**
     * Zorunlu.
     */
    @JsonProperty("pages_skipped")
    private Long pagesSkipped;

    /**
     * Zorunlu.
     */
    @JsonProperty("pages_failed")
    private Long pagesFailed;

    /**
     * Zorunlu.
     */
    @JsonProperty("pages_removed")
    private Long pagesRemoved;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    public Long getPagesFound() {
        return pagesFound;
    }

    public SiteSearchSourceStats pagesFound(Long pagesFound) {
        this.pagesFound = pagesFound;
        return this;
    }

    public Long getPagesIndexed() {
        return pagesIndexed;
    }

    public SiteSearchSourceStats pagesIndexed(Long pagesIndexed) {
        this.pagesIndexed = pagesIndexed;
        return this;
    }

    public Long getPagesUnchanged() {
        return pagesUnchanged;
    }

    public SiteSearchSourceStats pagesUnchanged(Long pagesUnchanged) {
        this.pagesUnchanged = pagesUnchanged;
        return this;
    }

    public Long getPagesSkipped() {
        return pagesSkipped;
    }

    public SiteSearchSourceStats pagesSkipped(Long pagesSkipped) {
        this.pagesSkipped = pagesSkipped;
        return this;
    }

    public Long getPagesFailed() {
        return pagesFailed;
    }

    public SiteSearchSourceStats pagesFailed(Long pagesFailed) {
        this.pagesFailed = pagesFailed;
        return this;
    }

    public Long getPagesRemoved() {
        return pagesRemoved;
    }

    public SiteSearchSourceStats pagesRemoved(Long pagesRemoved) {
        this.pagesRemoved = pagesRemoved;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public SiteSearchSourceStats durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
