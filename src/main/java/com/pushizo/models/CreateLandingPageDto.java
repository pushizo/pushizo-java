// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLandingPageDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLandingPageDto {
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
     * Zorunlu.
     */
    @JsonProperty("document")
    private CreateLandingPageDtoDocument document;

    @JsonProperty("seo")
    private CreateLandingPageDtoSeo seo;

    @JsonProperty("settings")
    private CreateLandingPageDtoSettings settings;

    @JsonProperty("custom_domain_id")
    private String customDomainId;

    public String getName() {
        return name;
    }

    public CreateLandingPageDto name(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public CreateLandingPageDto slug(String slug) {
        this.slug = slug;
        return this;
    }

    public CreateLandingPageDtoDocument getDocument() {
        return document;
    }

    public CreateLandingPageDto document(CreateLandingPageDtoDocument document) {
        this.document = document;
        return this;
    }

    public CreateLandingPageDtoSeo getSeo() {
        return seo;
    }

    public CreateLandingPageDto seo(CreateLandingPageDtoSeo seo) {
        this.seo = seo;
        return this;
    }

    public CreateLandingPageDtoSettings getSettings() {
        return settings;
    }

    public CreateLandingPageDto settings(CreateLandingPageDtoSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getCustomDomainId() {
        return customDomainId;
    }

    public CreateLandingPageDto customDomainId(String customDomainId) {
        this.customDomainId = customDomainId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
