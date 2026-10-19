// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AnalyticsResource.subscriptions için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsSubscriptionsParams {
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

    public String getFrom() {
        return from;
    }

    public AnalyticsSubscriptionsParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AnalyticsSubscriptionsParams to(String to) {
        this.to = to;
        return this;
    }

    public String getCompare() {
        return compare;
    }

    public AnalyticsSubscriptionsParams compare(String compare) {
        this.compare = compare;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public AnalyticsSubscriptionsParams format(String format) {
        this.format = format;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AnalyticsSubscriptionsParams copy() {
        AnalyticsSubscriptionsParams c = new AnalyticsSubscriptionsParams();
        c.from = from;
        c.to = to;
        c.compare = compare;
        c.format = format;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("from", from);
        op.query("to", to);
        op.query("compare", compare);
        op.query("format", format);
    }
}
