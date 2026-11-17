// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SiteSearchResource.report için isteğe bağlı sorgu parametreleri.
 */
public final class SiteSearchReportParams {
    private Long days;

    public Long getDays() {
        return days;
    }

    public SiteSearchReportParams days(Long days) {
        this.days = days;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SiteSearchReportParams copy() {
        SiteSearchReportParams c = new SiteSearchReportParams();
        c.days = days;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("days", days);
    }
}
