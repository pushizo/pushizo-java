// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** UpdateWebhookDto şeması (api/openapi.yaml). */
public final class UpdateWebhookDto {

    /** "url" alanı. */
    @JsonProperty("url")
    private String url;

    /** "description" alanı. */
    @JsonProperty("description")
    private String description;

    /** "events" alanı. Değerler: "message.queued", "message.completed", "message.failed", "delivery.sent", "delivery.delivered", "delivery.failed", "delivery.opened", "delivery.clicked", "delivery.bounced", "delivery.complained", "delivery.unsubscribed", "in_app.impression", "in_app.clicked", "in_app.dismissed", "subscription.created", "subscription.unsubscribed", "subscription.invalidated", "user.created", "user.updated", "user.merged", "user.deleted", "event.received", "conversion.created", "campaign.scheduled", "campaign.started", "campaign.completed". */
    @JsonProperty("events")
    private List<String> events;

    /** "event_filters" alanı. */
    @JsonProperty("event_filters")
    private UpdateWebhookDtoEventFilters eventFilters;

    /** "batch" alanı. */
    @JsonProperty("batch")
    private Boolean batch;

    /** "headers" alanı. */
    @JsonProperty("headers")
    private Map<String, String> headers;

    /** "status" alanı. Değerler: "active", "disabled". */
    @JsonProperty("status")
    private String status;

    /** @return "url" alanı */
    public String getUrl() {
        return url;
    }

    /**
     * "url" alanını ayarlar.
     *
     * @param url yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateWebhookDto setUrl(String url) {
        this.url = url;
        return this;
    }

    /** @return "description" alanı */
    public String getDescription() {
        return description;
    }

    /**
     * "description" alanını ayarlar.
     *
     * @param description yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateWebhookDto setDescription(String description) {
        this.description = description;
        return this;
    }

    /** @return "events" alanı */
    public List<String> getEvents() {
        return events;
    }

    /**
     * "events" alanını ayarlar.
     *
     * @param events yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateWebhookDto setEvents(List<String> events) {
        this.events = events;
        return this;
    }

    /** @return "event_filters" alanı */
    public UpdateWebhookDtoEventFilters getEventFilters() {
        return eventFilters;
    }

    /**
     * "event_filters" alanını ayarlar.
     *
     * @param eventFilters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateWebhookDto setEventFilters(UpdateWebhookDtoEventFilters eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    /** @return "batch" alanı */
    public Boolean getBatch() {
        return batch;
    }

    /**
     * "batch" alanını ayarlar.
     *
     * @param batch yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateWebhookDto setBatch(Boolean batch) {
        this.batch = batch;
        return this;
    }

    /** @return "headers" alanı */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * "headers" alanını ayarlar.
     *
     * @param headers yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateWebhookDto setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateWebhookDto setStatus(String status) {
        this.status = status;
        return this;
    }
}
