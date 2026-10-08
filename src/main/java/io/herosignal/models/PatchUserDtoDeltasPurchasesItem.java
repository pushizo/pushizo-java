// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** PatchUserDtoDeltasPurchasesItem şeması (api/openapi.yaml). */
public final class PatchUserDtoDeltasPurchasesItem {

    /** "sku" alanı. Zorunlu. */
    @JsonProperty("sku")
    private String sku;

    /** "amount" alanı. Zorunlu. */
    @JsonProperty("amount")
    private Double amount;

    /** "iso" alanı. */
    @JsonProperty("iso")
    private String iso;

    /** "count" alanı. */
    @JsonProperty("count")
    private Long count;

    /** @return "sku" alanı */
    public String getSku() {
        return sku;
    }

    /**
     * "sku" alanını ayarlar.
     *
     * @param sku yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDtoDeltasPurchasesItem setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /** @return "amount" alanı */
    public Double getAmount() {
        return amount;
    }

    /**
     * "amount" alanını ayarlar.
     *
     * @param amount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDtoDeltasPurchasesItem setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /** @return "iso" alanı */
    public String getIso() {
        return iso;
    }

    /**
     * "iso" alanını ayarlar.
     *
     * @param iso yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDtoDeltasPurchasesItem setIso(String iso) {
        this.iso = iso;
        return this;
    }

    /** @return "count" alanı */
    public Long getCount() {
        return count;
    }

    /**
     * "count" alanını ayarlar.
     *
     * @param count yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDtoDeltasPurchasesItem setCount(Long count) {
        this.count = count;
        return this;
    }
}
