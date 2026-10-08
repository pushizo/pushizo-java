// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ConversionsReportTotals şeması (api/openapi.yaml). */
public final class ConversionsReportTotals {

    /** "conversions" alanı. Zorunlu. */
    @JsonProperty("conversions")
    private Long conversions;

    /** "direct" alanı. Zorunlu. */
    @JsonProperty("direct")
    private Long direct;

    /** "influenced" alanı. Zorunlu. */
    @JsonProperty("influenced")
    private Long influenced;

    /** "revenue" alanı. Zorunlu. */
    @JsonProperty("revenue")
    private Double revenue;

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
    public ConversionsReportTotals setConversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    /** @return "direct" alanı */
    public Long getDirect() {
        return direct;
    }

    /**
     * "direct" alanını ayarlar.
     *
     * @param direct yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportTotals setDirect(Long direct) {
        this.direct = direct;
        return this;
    }

    /** @return "influenced" alanı */
    public Long getInfluenced() {
        return influenced;
    }

    /**
     * "influenced" alanını ayarlar.
     *
     * @param influenced yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReportTotals setInfluenced(Long influenced) {
        this.influenced = influenced;
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
    public ConversionsReportTotals setRevenue(Double revenue) {
        this.revenue = revenue;
        return this;
    }
}
