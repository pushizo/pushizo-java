// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchUserDtoDeltasPurchasesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PatchUserDtoDeltasPurchasesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("sku")
    private String sku;

    /**
     * Zorunlu.
     */
    @JsonProperty("amount")
    private Double amount;

    @JsonProperty("iso")
    private String iso;

    @JsonProperty("count")
    private Long count;

    public String getSku() {
        return sku;
    }

    public PatchUserDtoDeltasPurchasesItem sku(String sku) {
        this.sku = sku;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public PatchUserDtoDeltasPurchasesItem amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public String getIso() {
        return iso;
    }

    public PatchUserDtoDeltasPurchasesItem iso(String iso) {
        this.iso = iso;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public PatchUserDtoDeltasPurchasesItem count(Long count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
