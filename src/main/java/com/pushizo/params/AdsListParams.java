// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class AdsListParams {
    private String adAccountId;

    /**
     * Değerler: "campaign", "ad_set", "ad".
     */
    private String level;

    private String parentId;

    /**
     * Değerler: "active", "paused", "pending", "rejected", "archived", "deleted", "unknown".
     */
    private String status;

    private String q;

    private String from;

    private String to;

    private Long limit;

    public String getAdAccountId() {
        return adAccountId;
    }

    public AdsListParams adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public AdsListParams level(String level) {
        this.level = level;
        return this;
    }

    public String getParentId() {
        return parentId;
    }

    public AdsListParams parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AdsListParams status(String status) {
        this.status = status;
        return this;
    }

    public String getQ() {
        return q;
    }

    public AdsListParams q(String q) {
        this.q = q;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public AdsListParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AdsListParams to(String to) {
        this.to = to;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public AdsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsListParams copy() {
        AdsListParams c = new AdsListParams();
        c.adAccountId = adAccountId;
        c.level = level;
        c.parentId = parentId;
        c.status = status;
        c.q = q;
        c.from = from;
        c.to = to;
        c.limit = limit;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("ad_account_id", adAccountId);
        op.query("level", level);
        op.query("parent_id", parentId);
        op.query("status", status);
        op.query("q", q);
        op.query("from", from);
        op.query("to", to);
        op.query("limit", limit);
    }
}
