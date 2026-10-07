// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * NotificationsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class NotificationsListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "campaign", "api", "journey", "test".
     */
    private String source;

    /**
     * Değerler: "campaign", "api", "journey", "test".
     */
    private String kind;

    /**
     * Değerler: "queued", "processing", "completed", "cancelled", "failed".
     */
    private String status;

    /**
     * Değerler: "created_at", "-created_at".
     */
    private String sort;

    public Long getLimit() {
        return limit;
    }

    public NotificationsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public NotificationsListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getSource() {
        return source;
    }

    public NotificationsListParams source(String source) {
        this.source = source;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public NotificationsListParams kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public NotificationsListParams status(String status) {
        this.status = status;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public NotificationsListParams sort(String sort) {
        this.sort = sort;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public NotificationsListParams copy() {
        NotificationsListParams c = new NotificationsListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.source = source;
        c.kind = kind;
        c.status = status;
        c.sort = sort;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("source", source);
        op.query("kind", kind);
        op.query("status", status);
        op.query("sort", sort);
    }
}
