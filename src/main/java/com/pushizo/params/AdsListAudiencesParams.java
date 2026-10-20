// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.listAudiences için isteğe bağlı sorgu parametreleri.
 */
public final class AdsListAudiencesParams {
    private String adAccountId;

    public String getAdAccountId() {
        return adAccountId;
    }

    public AdsListAudiencesParams adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsListAudiencesParams copy() {
        AdsListAudiencesParams c = new AdsListAudiencesParams();
        c.adAccountId = adAccountId;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("ad_account_id", adAccountId);
    }
}
