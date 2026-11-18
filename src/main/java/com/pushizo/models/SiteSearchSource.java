// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchSource şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchSource {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "sitemap", "urls".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("urls")
    private java.util.List<String> urls;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_pages")
    private Long maxPages;

    /**
     * Zorunlu.
     */
    @JsonProperty("refresh_hours")
    private Long refreshHours;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "idle", "queued", "crawling", "ok", "partial", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("documents")
    private Long documents;

    /**
     * Zorunlu.
     */
    @JsonProperty("crawl_requested_at")
    private String crawlRequestedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_crawled_at")
    private String lastCrawledAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_crawl_at")
    private String nextCrawlAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private SiteSearchSourceStats stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public SiteSearchSource id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SiteSearchSource name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public SiteSearchSource kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SiteSearchSource url(String url) {
        this.url = url;
        return this;
    }

    public java.util.List<String> getUrls() {
        return urls;
    }

    public SiteSearchSource urls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }

    public Long getMaxPages() {
        return maxPages;
    }

    public SiteSearchSource maxPages(Long maxPages) {
        this.maxPages = maxPages;
        return this;
    }

    public Long getRefreshHours() {
        return refreshHours;
    }

    public SiteSearchSource refreshHours(Long refreshHours) {
        this.refreshHours = refreshHours;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public SiteSearchSource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SiteSearchSource status(String status) {
        this.status = status;
        return this;
    }

    public Long getDocuments() {
        return documents;
    }

    public SiteSearchSource documents(Long documents) {
        this.documents = documents;
        return this;
    }

    public String getCrawlRequestedAt() {
        return crawlRequestedAt;
    }

    public SiteSearchSource crawlRequestedAt(String crawlRequestedAt) {
        this.crawlRequestedAt = crawlRequestedAt;
        return this;
    }

    public String getLastCrawledAt() {
        return lastCrawledAt;
    }

    public SiteSearchSource lastCrawledAt(String lastCrawledAt) {
        this.lastCrawledAt = lastCrawledAt;
        return this;
    }

    public String getNextCrawlAt() {
        return nextCrawlAt;
    }

    public SiteSearchSource nextCrawlAt(String nextCrawlAt) {
        this.nextCrawlAt = nextCrawlAt;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public SiteSearchSource lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public SiteSearchSourceStats getStats() {
        return stats;
    }

    public SiteSearchSource stats(SiteSearchSourceStats stats) {
        this.stats = stats;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public SiteSearchSource createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public SiteSearchSource updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
