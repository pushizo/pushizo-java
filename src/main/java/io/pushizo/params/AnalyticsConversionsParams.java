// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * AnalyticsResource.conversions için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsConversionsParams {
    private String from;

    private String to;

    /**
     * Değerler: "true", "false".
     */
    private String compare;

    /**
     * Değerler: "json", "csv".
     */
    private String format;

    private String campaignId;

    public String getFrom() {
        return from;
    }

    public AnalyticsConversionsParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AnalyticsConversionsParams to(String to) {
        this.to = to;
        return this;
    }

    public String getCompare() {
        return compare;
    }

    public AnalyticsConversionsParams compare(String compare) {
        this.compare = compare;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public AnalyticsConversionsParams format(String format) {
        this.format = format;
        return this;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public AnalyticsConversionsParams campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AnalyticsConversionsParams copy() {
        AnalyticsConversionsParams c = new AnalyticsConversionsParams();
        c.from = from;
        c.to = to;
        c.compare = compare;
        c.format = format;
        c.campaignId = campaignId;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("from", from);
        op.query("to", to);
        op.query("compare", compare);
        op.query("format", format);
        op.query("campaign_id", campaignId);
    }
}
