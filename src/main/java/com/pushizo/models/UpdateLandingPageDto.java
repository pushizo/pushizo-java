// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("document")
    private UpdateLandingPageDtoDocument document;

    @JsonProperty("seo")
    private UpdateLandingPageDtoSeo seo;

    @JsonProperty("settings")
    private UpdateLandingPageDtoSettings settings;

    @JsonProperty("custom_domain_id")
    private String customDomainId;

    public String getName() {
        return name;
    }

    public UpdateLandingPageDto name(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public UpdateLandingPageDto slug(String slug) {
        this.slug = slug;
        return this;
    }

    public UpdateLandingPageDtoDocument getDocument() {
        return document;
    }

    public UpdateLandingPageDto document(UpdateLandingPageDtoDocument document) {
        this.document = document;
        return this;
    }

    public UpdateLandingPageDtoSeo getSeo() {
        return seo;
    }

    public UpdateLandingPageDto seo(UpdateLandingPageDtoSeo seo) {
        this.seo = seo;
        return this;
    }

    public UpdateLandingPageDtoSettings getSettings() {
        return settings;
    }

    public UpdateLandingPageDto settings(UpdateLandingPageDtoSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getCustomDomainId() {
        return customDomainId;
    }

    public UpdateLandingPageDto customDomainId(String customDomainId) {
        this.customDomainId = customDomainId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
