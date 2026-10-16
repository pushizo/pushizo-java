// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * ConversationsResource.messages için isteğe bağlı sorgu parametreleri.
 */
public final class ConversationsMessagesParams {
    private Long limit;

    private String cursor;

    public Long getLimit() {
        return limit;
    }

    public ConversationsMessagesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public ConversationsMessagesParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ConversationsMessagesParams copy() {
        ConversationsMessagesParams c = new ConversationsMessagesParams();
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
