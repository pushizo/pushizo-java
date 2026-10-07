// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * AnalyticsResource.messages için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsMessagesParams {
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

    /**
     * Değerler: "day", "channel", "campaign".
     */
    private String groupBy;

    public String getFrom() {
        return from;
    }

    public AnalyticsMessagesParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AnalyticsMessagesParams to(String to) {
        this.to = to;
        return this;
    }

    public String getCompare() {
        return compare;
    }

    public AnalyticsMessagesParams compare(String compare) {
        this.compare = compare;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public AnalyticsMessagesParams format(String format) {
        this.format = format;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public AnalyticsMessagesParams groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AnalyticsMessagesParams copy() {
        AnalyticsMessagesParams c = new AnalyticsMessagesParams();
        c.from = from;
        c.to = to;
        c.compare = compare;
        c.format = format;
        c.groupBy = groupBy;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("from", from);
        op.query("to", to);
        op.query("compare", compare);
        op.query("format", format);
        op.query("group_by", groupBy);
    }
}
