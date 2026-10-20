// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.spend için isteğe bağlı sorgu parametreleri.
 */
public final class AdsSpendParams {
    private String currency;

    /**
     * Değerler: "day", "platform", "account", "campaign", "ad_set".
     */
    private String groupBy;

    private String adAccountId;

    private String campaignId;

    public String getCurrency() {
        return currency;
    }

    public AdsSpendParams currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public AdsSpendParams groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public String getAdAccountId() {
        return adAccountId;
    }

    public AdsSpendParams adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public AdsSpendParams campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsSpendParams copy() {
        AdsSpendParams c = new AdsSpendParams();
        c.currency = currency;
        c.groupBy = groupBy;
        c.adAccountId = adAccountId;
        c.campaignId = campaignId;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("currency", currency);
        op.query("group_by", groupBy);
        op.query("ad_account_id", adAccountId);
        op.query("campaign_id", campaignId);
    }
}
