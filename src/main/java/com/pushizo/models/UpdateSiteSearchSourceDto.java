// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSiteSearchSourceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateSiteSearchSourceDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "sitemap", "urls".
     */
    @JsonProperty("kind")
    private String kind;

    @JsonProperty("url")
    private String url;

    @JsonProperty("urls")
    private java.util.List<String> urls;

    @JsonProperty("max_pages")
    private Long maxPages;

    @JsonProperty("refresh_hours")
    private Long refreshHours;

    @JsonProperty("enabled")
    private Boolean enabled;

    public String getName() {
        return name;
    }

    public UpdateSiteSearchSourceDto name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public UpdateSiteSearchSourceDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public UpdateSiteSearchSourceDto url(String url) {
        this.url = url;
        return this;
    }

    public java.util.List<String> getUrls() {
        return urls;
    }

    public UpdateSiteSearchSourceDto urls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }

    public Long getMaxPages() {
        return maxPages;
    }

    public UpdateSiteSearchSourceDto maxPages(Long maxPages) {
        this.maxPages = maxPages;
        return this;
    }

    public Long getRefreshHours() {
        return refreshHours;
    }

    public UpdateSiteSearchSourceDto refreshHours(Long refreshHours) {
        this.refreshHours = refreshHours;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateSiteSearchSourceDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
