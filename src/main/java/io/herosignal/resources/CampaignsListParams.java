// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * CampaignsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class CampaignsListParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "q" sorgu parametresi. */
    private String q;

    /** "status" sorgu parametresi. Değerler: "draft", "scheduled", "running", "paused", "completed", "cancelled", "failed". */
    private String status;

    /** "type" sorgu parametresi. Değerler: "one_time", "scheduled", "recurring", "automated", "transactional". */
    private String type;

    /** "channel" sorgu parametresi. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    private String channel;

    /** @return "limit" değeri */
    public Long getLimit() {
        return limit;
    }

    /**
     * "limit" değerini ayarlar.
     *
     * @param limit yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsListParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** @return "cursor" değeri */
    public String getCursor() {
        return cursor;
    }

    /**
     * "cursor" değerini ayarlar.
     *
     * @param cursor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsListParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return "q" değeri */
    public String getQ() {
        return q;
    }

    /**
     * "q" değerini ayarlar.
     *
     * @param q yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsListParams setQ(String q) {
        this.q = q;
        return this;
    }

    /** @return "status" değeri */
    public String getStatus() {
        return status;
    }

    /**
     * "status" değerini ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsListParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "type" değeri */
    public String getType() {
        return type;
    }

    /**
     * "type" değerini ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsListParams setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "channel" değeri */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" değerini ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsListParams setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public CampaignsListParams copy() {
        CampaignsListParams copy = new CampaignsListParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.q = q;
        copy.status = status;
        copy.type = type;
        copy.channel = channel;
        return copy;
    }
}
