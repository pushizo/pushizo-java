// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookPreviewDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookPreviewDto {
    /**
     * Zorunlu. Değerler: "message.queued", "message.completed", "message.failed", "delivery.sent", "delivery.delivered", "delivery.failed", "delivery.opened", "delivery.clicked", "delivery.bounced", "delivery.complained", "delivery.unsubscribed", "in_app.impression", "in_app.clicked", "in_app.dismissed", "subscription.created", "subscription.unsubscribed", "subscription.invalidated", "user.created", "user.updated", "user.merged", "user.deleted", "event.received", "conversion.created", "campaign.scheduled", "campaign.started", "campaign.completed", "journey.entered", "journey.step_completed", "journey.completed", "journey.exited", "audit.created", "webhook.test".
     */
    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("data")
    private java.util.Map<String, Object> data;

    @JsonProperty("body_template")
    private String bodyTemplate;

    /**
     * Şablon çıktısının içerik türü (varsayılan application/json). Değerler: "application/json", "text/plain".
     */
    @JsonProperty("body_content_type")
    private String bodyContentType;

    @JsonProperty("filters")
    private WebhookPreviewDtoFilters filters;

    @JsonProperty("batch")
    private Boolean batch;

    public String getEventType() {
        return eventType;
    }

    public WebhookPreviewDto eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public java.util.Map<String, Object> getData() {
        return data;
    }

    public WebhookPreviewDto data(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public String getBodyTemplate() {
        return bodyTemplate;
    }

    public WebhookPreviewDto bodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }

    public String getBodyContentType() {
        return bodyContentType;
    }

    public WebhookPreviewDto bodyContentType(String bodyContentType) {
        this.bodyContentType = bodyContentType;
        return this;
    }

    public WebhookPreviewDtoFilters getFilters() {
        return filters;
    }

    public WebhookPreviewDto filters(WebhookPreviewDtoFilters filters) {
        this.filters = filters;
        return this;
    }

    public Boolean getBatch() {
        return batch;
    }

    public WebhookPreviewDto batch(Boolean batch) {
        this.batch = batch;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
