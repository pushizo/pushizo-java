// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDtoSeo şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDtoSeo {
    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("og_image")
    private String ogImage;

    @JsonProperty("canonical_url")
    private String canonicalUrl;

    @JsonProperty("noindex")
    private Boolean noindex;

    public String getTitle() {
        return title;
    }

    public UpdateLandingPageDtoSeo title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateLandingPageDtoSeo description(String description) {
        this.description = description;
        return this;
    }

    public String getOgImage() {
        return ogImage;
    }

    public UpdateLandingPageDtoSeo ogImage(String ogImage) {
        this.ogImage = ogImage;
        return this;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public UpdateLandingPageDtoSeo canonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
        return this;
    }

    public Boolean getNoindex() {
        return noindex;
    }

    public UpdateLandingPageDtoSeo noindex(Boolean noindex) {
        this.noindex = noindex;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
