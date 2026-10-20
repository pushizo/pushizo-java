// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * WebCampaignsResource.report için isteğe bağlı sorgu parametreleri.
 */
public final class WebCampaignsReportParams {
    private Long days;

    public Long getDays() {
        return days;
    }

    public WebCampaignsReportParams days(Long days) {
        this.days = days;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public WebCampaignsReportParams copy() {
        WebCampaignsReportParams c = new WebCampaignsReportParams();
        c.days = days;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("days", days);
    }
}
