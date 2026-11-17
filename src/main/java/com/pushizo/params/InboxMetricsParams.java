// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * InboxResource.metrics için isteğe bağlı sorgu parametreleri.
 */
public final class InboxMetricsParams {
    private String from;

    private String to;

    /**
     * Değerler: "sms", "whatsapp", "rcs", "telegram", "viber", "email", "chat".
     */
    private String channel;

    public String getFrom() {
        return from;
    }

    public InboxMetricsParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public InboxMetricsParams to(String to) {
        this.to = to;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public InboxMetricsParams channel(String channel) {
        this.channel = channel;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public InboxMetricsParams copy() {
        InboxMetricsParams c = new InboxMetricsParams();
        c.from = from;
        c.to = to;
        c.channel = channel;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("from", from);
        op.query("to", to);
        op.query("channel", channel);
    }
}
