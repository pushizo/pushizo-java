// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * AnalyticsResource.events için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsEventsParams {
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

    private String name;

    /**
     * Değerler: "day", "name".
     */
    private String groupBy;

    public String getFrom() {
        return from;
    }

    public AnalyticsEventsParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AnalyticsEventsParams to(String to) {
        this.to = to;
        return this;
    }

    public String getCompare() {
        return compare;
    }

    public AnalyticsEventsParams compare(String compare) {
        this.compare = compare;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public AnalyticsEventsParams format(String format) {
        this.format = format;
        return this;
    }

    public String getName() {
        return name;
    }

    public AnalyticsEventsParams name(String name) {
        this.name = name;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public AnalyticsEventsParams groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AnalyticsEventsParams copy() {
        AnalyticsEventsParams c = new AnalyticsEventsParams();
        c.from = from;
        c.to = to;
        c.compare = compare;
        c.format = format;
        c.name = name;
        c.groupBy = groupBy;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("from", from);
        op.query("to", to);
        op.query("compare", compare);
        op.query("format", format);
        op.query("name", name);
        op.query("group_by", groupBy);
    }
}
