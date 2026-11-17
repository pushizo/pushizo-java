// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchOverviewIndex şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchOverviewIndex {
    /**
     * Zorunlu.
     */
    @JsonProperty("documents")
    private Long documents;

    /**
     * Zorunlu.
     */
    @JsonProperty("chunks")
    private Long chunks;

    /**
     * Zorunlu.
     */
    @JsonProperty("sources")
    private Long sources;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_indexed_at")
    private String lastIndexedAt;

    public Long getDocuments() {
        return documents;
    }

    public SiteSearchOverviewIndex documents(Long documents) {
        this.documents = documents;
        return this;
    }

    public Long getChunks() {
        return chunks;
    }

    public SiteSearchOverviewIndex chunks(Long chunks) {
        this.chunks = chunks;
        return this;
    }

    public Long getSources() {
        return sources;
    }

    public SiteSearchOverviewIndex sources(Long sources) {
        this.sources = sources;
        return this;
    }

    public String getLastIndexedAt() {
        return lastIndexedAt;
    }

    public SiteSearchOverviewIndex lastIndexedAt(String lastIndexedAt) {
        this.lastIndexedAt = lastIndexedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
