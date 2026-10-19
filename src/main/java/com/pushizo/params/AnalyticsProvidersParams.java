// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AnalyticsResource.providers için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsProvidersParams {
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

    public AnalyticsProvidersParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AnalyticsProvidersParams to(String to) {
        this.to = to;
        return this;
    }

    public String getCompare() {
        return compare;
    }

    public AnalyticsProvidersParams compare(String compare) {
        this.compare = compare;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public AnalyticsProvidersParams format(String format) {
        this.format = format;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AnalyticsProvidersParams copy() {
        AnalyticsProvidersParams c = new AnalyticsProvidersParams();
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
