// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.ltv için isteğe bağlı sorgu parametreleri.
 */
public final class AdsLtvParams {
    private Long months;

    private Long cohorts;

    private String currency;

    public Long getMonths() {
        return months;
    }

    public AdsLtvParams months(Long months) {
        this.months = months;
        return this;
    }

    public Long getCohorts() {
        return cohorts;
    }

    public AdsLtvParams cohorts(Long cohorts) {
        this.cohorts = cohorts;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AdsLtvParams currency(String currency) {
        this.currency = currency;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsLtvParams copy() {
        AdsLtvParams c = new AdsLtvParams();
        c.months = months;
        c.cohorts = cohorts;
        c.currency = currency;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("months", months);
        op.query("cohorts", cohorts);
        op.query("currency", currency);
    }
}
