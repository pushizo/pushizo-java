// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataFeed şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataFeed {
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
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("url_template")
    private String urlTemplate;

    /**
     * Zorunlu. Değerler: "GET", "POST".
     */
    @JsonProperty("method")
    private String method;

    /**
     * Zorunlu.
     */
    @JsonProperty("body_template")
    private String bodyTemplate;

    /**
     * Zorunlu.
     */
    @JsonProperty("headers")
    private java.util.Map<String, String> headers;

    /**
     * Zorunlu.
     */
    @JsonProperty("secret_header_names")
    private java.util.List<String> secretHeaderNames;

    /**
     * Zorunlu.
     */
    @JsonProperty("cache_ttl_seconds")
    private Long cacheTtlSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("timeout_ms")
    private Long timeoutMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("liquid")
    private String liquid;

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

    public DataFeed id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public DataFeed appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DataFeed name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DataFeed description(String description) {
        this.description = description;
        return this;
    }

    public String getUrlTemplate() {
        return urlTemplate;
    }

    public DataFeed urlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public DataFeed method(String method) {
        this.method = method;
        return this;
    }

    public String getBodyTemplate() {
        return bodyTemplate;
    }

    public DataFeed bodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    public DataFeed headers(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public java.util.List<String> getSecretHeaderNames() {
        return secretHeaderNames;
    }

    public DataFeed secretHeaderNames(java.util.List<String> secretHeaderNames) {
        this.secretHeaderNames = secretHeaderNames;
        return this;
    }

    public Long getCacheTtlSeconds() {
        return cacheTtlSeconds;
    }

    public DataFeed cacheTtlSeconds(Long cacheTtlSeconds) {
        this.cacheTtlSeconds = cacheTtlSeconds;
        return this;
    }

    public Long getTimeoutMs() {
        return timeoutMs;
    }

    public DataFeed timeoutMs(Long timeoutMs) {
        this.timeoutMs = timeoutMs;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public DataFeed enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getLiquid() {
        return liquid;
    }

    public DataFeed liquid(String liquid) {
        this.liquid = liquid;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DataFeed createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DataFeed updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
