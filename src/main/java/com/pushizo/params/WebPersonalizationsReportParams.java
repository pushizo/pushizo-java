// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * WebPersonalizationsResource.report için isteğe bağlı sorgu parametreleri.
 */
public final class WebPersonalizationsReportParams {
    private Long days;

    public Long getDays() {
        return days;
    }

    public WebPersonalizationsReportParams days(Long days) {
        this.days = days;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public WebPersonalizationsReportParams copy() {
        WebPersonalizationsReportParams c = new WebPersonalizationsReportParams();
        c.days = days;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("days", days);
    }
}
