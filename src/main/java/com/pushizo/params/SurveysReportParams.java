// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SurveysResource.report için isteğe bağlı sorgu parametreleri.
 */
public final class SurveysReportParams {
    private Long days;

    public Long getDays() {
        return days;
    }

    public SurveysReportParams days(Long days) {
        this.days = days;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SurveysReportParams copy() {
        SurveysReportParams c = new SurveysReportParams();
        c.days = days;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("days", days);
    }
}
