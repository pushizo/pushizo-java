// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * PromoCodeListsResource.promoCodes için isteğe bağlı sorgu parametreleri.
 */
public final class PromoCodeListsPromoCodesParams {
    private Long limit;

    private Long offset;

    private String q;

    /**
     * Değerler: "available", "assigned".
     */
    private String status;

    public Long getLimit() {
        return limit;
    }

    public PromoCodeListsPromoCodesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getOffset() {
        return offset;
    }

    public PromoCodeListsPromoCodesParams offset(Long offset) {
        this.offset = offset;
        return this;
    }

    public String getQ() {
        return q;
    }

    public PromoCodeListsPromoCodesParams q(String q) {
        this.q = q;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PromoCodeListsPromoCodesParams status(String status) {
        this.status = status;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public PromoCodeListsPromoCodesParams copy() {
        PromoCodeListsPromoCodesParams c = new PromoCodeListsPromoCodesParams();
        c.limit = limit;
        c.offset = offset;
        c.q = q;
        c.status = status;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("offset", offset);
        op.query("q", q);
        op.query("status", status);
    }
}
