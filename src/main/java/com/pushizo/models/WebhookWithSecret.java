// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookWithSecret şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookWithSecret {
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
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.List<String> events;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_filters")
    private WebhookWithSecretEventFilters eventFilters;

    /**
     * Zorunlu.
     */
    @JsonProperty("batch")
    private Boolean batch;

    /**
     * Zorunlu. Değerler: "active", "failing", "disabled".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("disabled_reason")
    private String disabledReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("failure_count")
    private Long failureCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("failing_since")
    private String failingSince;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_success_at")
    private String lastSuccessAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_failure_at")
    private String lastFailureAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("header_names")
    private java.util.List<String> headerNames;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous_secret_expires_at")
    private String previousSecretExpiresAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("body_template")
    private String bodyTemplate;

    /**
     * Zorunlu. Değerler: "application/json", "text/plain".
     */
    @JsonProperty("body_content_type")
    private String bodyContentType;

    /**
     * Zorunlu.
     */
    @JsonProperty("filters")
    private WebhookWithSecretFilters filters;

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
     * Zorunlu. Yalnızca oluşturma ve rotasyon yanıtında bir kez döner.
     */
    @JsonProperty("secret")
    private String secret;

    public String getId() {
        return id;
    }

    public WebhookWithSecret id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public WebhookWithSecret appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public WebhookWithSecret url(String url) {
        this.url = url;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public WebhookWithSecret description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getEvents() {
        return events;
    }

    public WebhookWithSecret events(java.util.List<String> events) {
        this.events = events;
        return this;
    }

    public WebhookWithSecretEventFilters getEventFilters() {
        return eventFilters;
    }

    public WebhookWithSecret eventFilters(WebhookWithSecretEventFilters eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public Boolean getBatch() {
        return batch;
    }

    public WebhookWithSecret batch(Boolean batch) {
        this.batch = batch;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WebhookWithSecret status(String status) {
        this.status = status;
        return this;
    }

    public String getDisabledReason() {
        return disabledReason;
    }

    public WebhookWithSecret disabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    public Long getFailureCount() {
        return failureCount;
    }

    public WebhookWithSecret failureCount(Long failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    public String getFailingSince() {
        return failingSince;
    }

    public WebhookWithSecret failingSince(String failingSince) {
        this.failingSince = failingSince;
        return this;
    }

    public String getLastSuccessAt() {
        return lastSuccessAt;
    }

    public WebhookWithSecret lastSuccessAt(String lastSuccessAt) {
        this.lastSuccessAt = lastSuccessAt;
        return this;
    }

    public String getLastFailureAt() {
        return lastFailureAt;
    }

    public WebhookWithSecret lastFailureAt(String lastFailureAt) {
        this.lastFailureAt = lastFailureAt;
        return this;
    }

    public java.util.List<String> getHeaderNames() {
        return headerNames;
    }

    public WebhookWithSecret headerNames(java.util.List<String> headerNames) {
        this.headerNames = headerNames;
        return this;
    }

    public String getPreviousSecretExpiresAt() {
        return previousSecretExpiresAt;
    }

    public WebhookWithSecret previousSecretExpiresAt(String previousSecretExpiresAt) {
        this.previousSecretExpiresAt = previousSecretExpiresAt;
        return this;
    }

    public String getBodyTemplate() {
        return bodyTemplate;
    }

    public WebhookWithSecret bodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }

    public String getBodyContentType() {
        return bodyContentType;
    }

    public WebhookWithSecret bodyContentType(String bodyContentType) {
        this.bodyContentType = bodyContentType;
        return this;
    }

    public WebhookWithSecretFilters getFilters() {
        return filters;
    }

    public WebhookWithSecret filters(WebhookWithSecretFilters filters) {
        this.filters = filters;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WebhookWithSecret createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public WebhookWithSecret updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public WebhookWithSecret secret(String secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
