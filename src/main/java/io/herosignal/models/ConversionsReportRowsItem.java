// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ConversionsReportRowsItem şeması (api/openapi.yaml). */
public final class ConversionsReportRowsItem {

    /** "date" alanı. Zorunlu. */
    @JsonProperty("date")
    private String date;

    /** "conversions" alanı. Zorunlu. */
    @JsonProperty("conversions")
    private Long conversions;

    /** "revenue" alanı. Zorunlu. */
    @JsonProperty("revenue")
    private Double revenue;

    /** @return "date" alanı */
    public String getDate() {
        return date;
    }

    /**
     * "date" alanını ayarlar.
     *
     * @param date yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportRowsItem setDate(String date) {
        this.date = date;
        return this;
    }

    /** @return "conversions" alanı */
    public Long getConversions() {
        return conversions;
    }

    /**
     * "conversions" alanını ayarlar.
     *
     * @param conversions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportRowsItem setConversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    /** @return "revenue" alanı */
    public Double getRevenue() {
        return revenue;
    }

    /**
     * "revenue" alanını ayarlar.
     *
     * @param revenue yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportRowsItem setRevenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }
}
