// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * WebhooksResource.deliveries için isteğe bağlı sorgu parametreleri.
 */
public final class WebhooksDeliveriesParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "pending", "success", "failed", "dead".
     */
    private String status;

    private String eventType;

    public Long getLimit() {
        return limit;
    }

    public WebhooksDeliveriesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public WebhooksDeliveriesParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WebhooksDeliveriesParams status(String status) {
        this.status = status;
        return this;
    }

    public String getEventType() {
        return eventType;
    }

    public WebhooksDeliveriesParams eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public WebhooksDeliveriesParams copy() {
        WebhooksDeliveriesParams c = new WebhooksDeliveriesParams();
        c.limit = limit;
        c.cursor = cursor;
        c.status = status;
        c.eventType = eventType;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("status", status);
        op.query("event_type", eventType);
    }
}
