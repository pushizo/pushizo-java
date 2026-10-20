// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PublicFormSubmitDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PublicFormSubmitDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("values")
    private java.util.Map<String, Object> values;

    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("page_url")
    private String pageUrl;

    @JsonProperty("language")
    private String language;

    public java.util.Map<String, Object> getValues() {
        return values;
    }

    public PublicFormSubmitDto values(java.util.Map<String, Object> values) {
        this.values = values;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public PublicFormSubmitDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public PublicFormSubmitDto pageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public PublicFormSubmitDto language(String language) {
        this.language = language;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
