// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * CampaignsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class CampaignsListParams {
    private Long limit;

    private String cursor;

    private String q;

    /**
     * Değerler: "draft", "scheduled", "running", "paused", "completed", "cancelled", "failed".
     */
    private String status;

    /**
     * Değerler: "one_time", "scheduled", "recurring", "automated", "transactional".
     */
    private String type;

    /**
     * Değerler: "ios_push", "android_push", "web_push", "email", "sms".
     */
    private String channel;

    public Long getLimit() {
        return limit;
    }

    public CampaignsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public CampaignsListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getQ() {
        return q;
    }

    public CampaignsListParams q(String q) {
        this.q = q;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CampaignsListParams status(String status) {
        this.status = status;
        return this;
    }

    public String getType() {
        return type;
    }

    public CampaignsListParams type(String type) {
        this.type = type;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public CampaignsListParams channel(String channel) {
        this.channel = channel;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CampaignsListParams copy() {
        CampaignsListParams c = new CampaignsListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.q = q;
        c.status = status;
        c.type = type;
        c.channel = channel;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("q", q);
        op.query("status", status);
        op.query("type", type);
        op.query("channel", channel);
    }
}
