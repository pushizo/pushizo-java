// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * NotificationsResource.deliveries için isteğe bağlı sorgu parametreleri.
 */
public final class NotificationsDeliveriesParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "pending", "sent", "delivered", "failed", "bounced", "suppressed", "expired", "cancelled".
     */
    private String status;

    public Long getLimit() {
        return limit;
    }

    public NotificationsDeliveriesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public NotificationsDeliveriesParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public NotificationsDeliveriesParams status(String status) {
        this.status = status;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public NotificationsDeliveriesParams copy() {
        NotificationsDeliveriesParams c = new NotificationsDeliveriesParams();
        c.limit = limit;
        c.cursor = cursor;
        c.status = status;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("status", status);
    }
}
