// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebhookDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebhookDto {
    @JsonProperty("url")
    private String url;

    @JsonProperty("description")
    private String description;

    /**
     * Değerler: "message.queued", "message.completed", "message.failed", "delivery.sent", "delivery.delivered", "delivery.failed", "delivery.opened", "delivery.clicked", "delivery.bounced", "delivery.complained", "delivery.unsubscribed", "in_app.impression", "in_app.clicked", "in_app.dismissed", "subscription.created", "subscription.unsubscribed", "subscription.invalidated", "user.created", "user.updated", "user.merged", "user.deleted", "event.received", "conversion.created", "campaign.scheduled", "campaign.started", "campaign.completed", "journey.entered", "journey.step_completed", "journey.completed", "journey.exited", "conversation.created", "conversation.message", "conversation.assigned", "conversation.resolved", "audit.created", "form.submitted", "survey.responded", "ad_audience.synced", "ad_account.revoked".
     */
    @JsonProperty("events")
    private java.util.List<String> events;

    @JsonProperty("event_filters")
    private UpdateWebhookDtoEventFilters eventFilters;

    @JsonProperty("batch")
    private Boolean batch;

    @JsonProperty("headers")
    private java.util.Map<String, String> headers;

    /**
     * Değerler: "active", "disabled".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("body_template")
    private String bodyTemplate;

    /**
     * Şablon çıktısının içerik türü (varsayılan application/json). Değerler: "application/json", "text/plain".
     */
    @JsonProperty("body_content_type")
    private String bodyContentType;

    @JsonProperty("filters")
    private UpdateWebhookDtoFilters filters;

    public String getUrl() {
        return url;
    }

    public UpdateWebhookDto url(String url) {
        this.url = url;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateWebhookDto description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getEvents() {
        return events;
    }

    public UpdateWebhookDto events(java.util.List<String> events) {
        this.events = events;
        return this;
    }

    public UpdateWebhookDtoEventFilters getEventFilters() {
        return eventFilters;
    }

    public UpdateWebhookDto eventFilters(UpdateWebhookDtoEventFilters eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    public Boolean getBatch() {
        return batch;
    }

    public UpdateWebhookDto batch(Boolean batch) {
        this.batch = batch;
        return this;
    }

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    public UpdateWebhookDto headers(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdateWebhookDto status(String status) {
        this.status = status;
        return this;
    }

    public String getBodyTemplate() {
        return bodyTemplate;
    }

    public UpdateWebhookDto bodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }

    public String getBodyContentType() {
        return bodyContentType;
    }

    public UpdateWebhookDto bodyContentType(String bodyContentType) {
        this.bodyContentType = bodyContentType;
        return this;
    }

    public UpdateWebhookDtoFilters getFilters() {
        return filters;
    }

    public UpdateWebhookDto filters(UpdateWebhookDtoFilters filters) {
        this.filters = filters;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
