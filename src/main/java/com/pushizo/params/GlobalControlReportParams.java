// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * GlobalControlResource.report için isteğe bağlı sorgu parametreleri.
 */
public final class GlobalControlReportParams {
    private Long days;

    private String event;

    public Long getDays() {
        return days;
    }

    public GlobalControlReportParams days(Long days) {
        this.days = days;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public GlobalControlReportParams event(String event) {
        this.event = event;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public GlobalControlReportParams copy() {
        GlobalControlReportParams c = new GlobalControlReportParams();
        c.days = days;
        c.event = event;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("days", days);
        op.query("event", event);
    }
}
