// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * AnalyticsResource.conversions için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsConversionsParams {

    /** "from" sorgu parametresi. */
    private String from;

    /** "to" sorgu parametresi. */
    private String to;

    /** "compare" sorgu parametresi. Değerler: "true", "false". */
    private String compare;

    /** "format" sorgu parametresi. Değerler: "json", "csv". */
    private String format;

    /** "campaign_id" sorgu parametresi. */
    private String campaignId;

    /** @return "from" değeri */
    public String getFrom() {
        return from;
    }

    /**
     * "from" değerini ayarlar.
     *
     * @param from yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsConversionsParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /** @return "to" değeri */
    public String getTo() {
        return to;
    }

    /**
     * "to" değerini ayarlar.
     *
     * @param to yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsConversionsParams setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "compare" değeri */
    public String getCompare() {
        return compare;
    }

    /**
     * "compare" değerini ayarlar.
     *
     * @param compare yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsConversionsParams setCompare(String compare) {
        this.compare = compare;
        return this;
    }

    /** @return "format" değeri */
    public String getFormat() {
        return format;
    }

    /**
     * "format" değerini ayarlar.
     *
     * @param format yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsConversionsParams setFormat(String format) {
        this.format = format;
        return this;
    }

    /** @return "campaign_id" değeri */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * "campaign_id" değerini ayarlar.
     *
     * @param campaignId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsConversionsParams setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public AnalyticsConversionsParams copy() {
        AnalyticsConversionsParams copy = new AnalyticsConversionsParams();
        copy.from = from;
        copy.to = to;
        copy.compare = compare;
        copy.format = format;
        copy.campaignId = campaignId;
        return copy;
    }
}
