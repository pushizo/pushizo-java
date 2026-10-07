// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * TemplatesResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class TemplatesListParams {
    private Long limit;

    private String cursor;

    private String q;

    /**
     * Değerler: "ios_push", "android_push", "web_push", "email", "sms".
     */
    private String channel;

    public Long getLimit() {
        return limit;
    }

    public TemplatesListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public TemplatesListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getQ() {
        return q;
    }

    public TemplatesListParams q(String q) {
        this.q = q;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public TemplatesListParams channel(String channel) {
        this.channel = channel;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public TemplatesListParams copy() {
        TemplatesListParams c = new TemplatesListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.q = q;
        c.channel = channel;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("q", q);
        op.query("channel", channel);
    }
}
