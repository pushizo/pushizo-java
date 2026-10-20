// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPage {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Zorunlu. Değerler: "draft", "published", "archived".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("seo")
    private LandingPageSeo seo;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private LandingPageSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("custom_domain_id")
    private String customDomainId;

    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("published_version")
    private Long publishedVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("published_at")
    private String publishedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_unpublished_changes")
    private Boolean hasUnpublishedChanges;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("domain_url")
    private String domainUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private LandingPageStats stats;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("document")
    private LandingPageDocument document;

    public String getId() {
        return id;
    }

    public LandingPage id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public LandingPage appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public LandingPage name(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public LandingPage slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public LandingPage status(String status) {
        this.status = status;
        return this;
    }

    public LandingPageSeo getSeo() {
        return seo;
    }

    public LandingPage seo(LandingPageSeo seo) {
        this.seo = seo;
        return this;
    }

    public LandingPageSettings getSettings() {
        return settings;
    }

    public LandingPage settings(LandingPageSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getCustomDomainId() {
        return customDomainId;
    }

    public LandingPage customDomainId(String customDomainId) {
        this.customDomainId = customDomainId;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public LandingPage version(Long version) {
        this.version = version;
        return this;
    }

    public Long getPublishedVersion() {
        return publishedVersion;
    }

    public LandingPage publishedVersion(Long publishedVersion) {
        this.publishedVersion = publishedVersion;
        return this;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public LandingPage publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public Boolean getHasUnpublishedChanges() {
        return hasUnpublishedChanges;
    }

    public LandingPage hasUnpublishedChanges(Boolean hasUnpublishedChanges) {
        this.hasUnpublishedChanges = hasUnpublishedChanges;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public LandingPage url(String url) {
        this.url = url;
        return this;
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public LandingPage domainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
        return this;
    }

    public LandingPageStats getStats() {
        return stats;
    }

    public LandingPage stats(LandingPageStats stats) {
        this.stats = stats;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public LandingPage createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public LandingPage updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public LandingPageDocument getDocument() {
        return document;
    }

    public LandingPage document(LandingPageDocument document) {
        this.document = document;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
