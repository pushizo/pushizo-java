// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * InAppMessagesResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class InAppMessagesListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "draft", "active", "paused", "archived".
     */
    private String status;

    public Long getLimit() {
        return limit;
    }

    public InAppMessagesListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public InAppMessagesListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public InAppMessagesListParams status(String status) {
        this.status = status;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public InAppMessagesListParams copy() {
        InAppMessagesListParams c = new InAppMessagesListParams();
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
