// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.alertHistory için isteğe bağlı sorgu parametreleri.
 */
public final class AdsAlertHistoryParams {
    private String ruleId;

    private Long limit;

    public String getRuleId() {
        return ruleId;
    }

    public AdsAlertHistoryParams ruleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public AdsAlertHistoryParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsAlertHistoryParams copy() {
        AdsAlertHistoryParams c = new AdsAlertHistoryParams();
        c.ruleId = ruleId;
        c.limit = limit;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("rule_id", ruleId);
        op.query("limit", limit);
    }
}
