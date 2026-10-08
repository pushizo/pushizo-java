// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * CampaignsResource.deliveries için isteğe bağlı sorgu parametreleri.
 */
public final class CampaignsDeliveriesParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "status" sorgu parametresi. Değerler: "pending", "sent", "delivered", "failed", "bounced", "suppressed", "expired", "cancelled". */
    private String status;

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
    public CampaignsDeliveriesParams setLimit(Long limit) {
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
    public CampaignsDeliveriesParams setCursor(String cursor) {
        this.cursor = cursor;
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
    public CampaignsDeliveriesParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public CampaignsDeliveriesParams copy() {
        CampaignsDeliveriesParams copy = new CampaignsDeliveriesParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.status = status;
        return copy;
    }
}
