// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SuppressionsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class SuppressionsListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "email", "sms", "whatsapp", "rcs", "telegram", "viber".
     */
    private String channel;

    /**
     * Değerler: "bounce", "complaint", "manual", "unsubscribe_link", "stop".
     */
    private String reason;

    private String value;

    public Long getLimit() {
        return limit;
    }

    public SuppressionsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SuppressionsListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public SuppressionsListParams channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SuppressionsListParams reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getValue() {
        return value;
    }

    public SuppressionsListParams value(String value) {
        this.value = value;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SuppressionsListParams copy() {
        SuppressionsListParams c = new SuppressionsListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.channel = channel;
        c.reason = reason;
        c.value = value;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("channel", channel);
        op.query("reason", reason);
        op.query("value", value);
    }
}
