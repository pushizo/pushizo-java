// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.capiDeliveries için isteğe bağlı sorgu parametreleri.
 */
public final class AdsCapiDeliveriesParams {
    private String configId;

    /**
     * Değerler: "pending", "sent", "failed", "skipped".
     */
    private String status;

    private Long limit;

    public String getConfigId() {
        return configId;
    }

    public AdsCapiDeliveriesParams configId(String configId) {
        this.configId = configId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AdsCapiDeliveriesParams status(String status) {
        this.status = status;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public AdsCapiDeliveriesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsCapiDeliveriesParams copy() {
        AdsCapiDeliveriesParams c = new AdsCapiDeliveriesParams();
        c.configId = configId;
        c.status = status;
        c.limit = limit;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("config_id", configId);
        op.query("status", status);
        op.query("limit", limit);
    }
}
