// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AnalyticsResource.overview için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsOverviewParams {
    /**
     * Değerler: "7d", "30d".
     */
    private String range;

    private String from;

    private String to;

    public String getRange() {
        return range;
    }

    public AnalyticsOverviewParams range(String range) {
        this.range = range;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public AnalyticsOverviewParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AnalyticsOverviewParams to(String to) {
        this.to = to;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AnalyticsOverviewParams copy() {
        AnalyticsOverviewParams c = new AnalyticsOverviewParams();
        c.range = range;
        c.from = from;
        c.to = to;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("range", range);
        op.query("from", from);
        op.query("to", to);
    }
}
