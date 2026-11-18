// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * ChannelScoresResource.users için isteğe bağlı sorgu parametreleri.
 */
public final class ChannelScoresUsersParams {
    /**
     * Değerler: "push", "email", "whatsapp", "rcs", "sms".
     */
    private String channel;

    private Long limit;

    private String cursor;

    public String getChannel() {
        return channel;
    }

    public ChannelScoresUsersParams channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public ChannelScoresUsersParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public ChannelScoresUsersParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ChannelScoresUsersParams copy() {
        ChannelScoresUsersParams c = new ChannelScoresUsersParams();
        c.channel = channel;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("channel", channel);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
