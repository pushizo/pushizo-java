// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateDataFeedDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateDataFeedDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("url_template")
    private String urlTemplate;

    /**
     * Değerler: "GET", "POST".
     */
    @JsonProperty("method")
    private String method;

    @JsonProperty("body_template")
    private String bodyTemplate;

    @JsonProperty("headers")
    private java.util.Map<String, String> headers;

    @JsonProperty("secret_headers")
    private java.util.Map<String, String> secretHeaders;

    @JsonProperty("cache_ttl_seconds")
    private Long cacheTtlSeconds;

    @JsonProperty("timeout_ms")
    private Long timeoutMs;

    @JsonProperty("enabled")
    private Boolean enabled;

    public String getName() {
        return name;
    }

    public CreateDataFeedDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateDataFeedDto description(String description) {
        this.description = description;
        return this;
    }

    public String getUrlTemplate() {
        return urlTemplate;
    }

    public CreateDataFeedDto urlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public CreateDataFeedDto method(String method) {
        this.method = method;
        return this;
    }

    public String getBodyTemplate() {
        return bodyTemplate;
    }

    public CreateDataFeedDto bodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    public CreateDataFeedDto headers(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public java.util.Map<String, String> getSecretHeaders() {
        return secretHeaders;
    }

    public CreateDataFeedDto secretHeaders(java.util.Map<String, String> secretHeaders) {
        this.secretHeaders = secretHeaders;
        return this;
    }

    public Long getCacheTtlSeconds() {
        return cacheTtlSeconds;
    }

    public CreateDataFeedDto cacheTtlSeconds(Long cacheTtlSeconds) {
        this.cacheTtlSeconds = cacheTtlSeconds;
        return this;
    }

    public Long getTimeoutMs() {
        return timeoutMs;
    }

    public CreateDataFeedDto timeoutMs(Long timeoutMs) {
        this.timeoutMs = timeoutMs;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateDataFeedDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
