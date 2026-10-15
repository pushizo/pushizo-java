// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Webhook şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Webhook {
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
    private WebhookEventFilters eventFilters;

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
    private WebhookFilters filters;

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

    public Webhook id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Webhook appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Webhook url(String url) {
        this.url = url;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Webhook description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getEvents() {
        return events;
    }

    public Webhook events(java.util.List<String> events) {
        this.events = events;
        return this;
    }

    public WebhookEventFilters getEventFilters() {
        return eventFilters;
    }

    public Webhook eventFilters(WebhookEventFilters eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public Boolean getBatch() {
        return batch;
    }

    public Webhook batch(Boolean batch) {
        this.batch = batch;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Webhook status(String status) {
        this.status = status;
        return this;
    }

    public String getDisabledReason() {
        return disabledReason;
    }

    public Webhook disabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    public Long getFailureCount() {
        return failureCount;
    }

    public Webhook failureCount(Long failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    public String getFailingSince() {
        return failingSince;
    }

    public Webhook failingSince(String failingSince) {
        this.failingSince = failingSince;
        return this;
    }

    public String getLastSuccessAt() {
        return lastSuccessAt;
    }

    public Webhook lastSuccessAt(String lastSuccessAt) {
        this.lastSuccessAt = lastSuccessAt;
        return this;
    }

    public String getLastFailureAt() {
        return lastFailureAt;
    }

    public Webhook lastFailureAt(String lastFailureAt) {
        this.lastFailureAt = lastFailureAt;
        return this;
    }

    public java.util.List<String> getHeaderNames() {
        return headerNames;
    }

    public Webhook headerNames(java.util.List<String> headerNames) {
        this.headerNames = headerNames;
        return this;
    }

    public String getPreviousSecretExpiresAt() {
        return previousSecretExpiresAt;
    }

    public Webhook previousSecretExpiresAt(String previousSecretExpiresAt) {
        this.previousSecretExpiresAt = previousSecretExpiresAt;
        return this;
    }

    public String getBodyTemplate() {
        return bodyTemplate;
    }

    public Webhook bodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }

    public String getBodyContentType() {
        return bodyContentType;
    }

    public Webhook bodyContentType(String bodyContentType) {
        this.bodyContentType = bodyContentType;
        return this;
    }

    public WebhookFilters getFilters() {
        return filters;
    }

    public Webhook filters(WebhookFilters filters) {
        this.filters = filters;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Webhook createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Webhook updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
