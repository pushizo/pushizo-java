// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * AnalyticsResource.retention için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsRetentionParams {
    private Long weeks;

    /**
     * Değerler: "json", "csv".
     */
    private String format;

    public Long getWeeks() {
        return weeks;
    }

    public AnalyticsRetentionParams weeks(Long weeks) {
        this.weeks = weeks;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public AnalyticsRetentionParams format(String format) {
        this.format = format;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AnalyticsRetentionParams copy() {
        AnalyticsRetentionParams c = new AnalyticsRetentionParams();
        c.weeks = weeks;
        c.format = format;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("weeks", weeks);
        op.query("format", format);
    }
}
