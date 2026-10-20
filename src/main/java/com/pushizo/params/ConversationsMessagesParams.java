// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * ConversationsResource.messages için isteğe bağlı sorgu parametreleri.
 */
public final class ConversationsMessagesParams {
    private Long limit;

    private String cursor;

    private Long afterSeq;

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

    public Long getAfterSeq() {
        return afterSeq;
    }

    public ConversationsMessagesParams afterSeq(Long afterSeq) {
        this.afterSeq = afterSeq;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ConversationsMessagesParams copy() {
        ConversationsMessagesParams c = new ConversationsMessagesParams();
        c.limit = limit;
        c.cursor = cursor;
        c.afterSeq = afterSeq;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("after_seq", afterSeq);
    }
}
