// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** ConversionsReport şeması (api/openapi.yaml). */
public final class ConversionsReport {

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "totals" alanı. Zorunlu. */
    @JsonProperty("totals")
    private ConversionsReportTotals totals;

    /** "previous" alanı. Zorunlu. */
    @JsonProperty("previous")
    private ConversionsReportPrevious previous;

    /** "by_campaign" alanı. Zorunlu. */
    @JsonProperty("by_campaign")
    private List<ConversionsReportByCampaignItem> byCampaign;

    /** "rows" alanı. Zorunlu. */
    @JsonProperty("rows")
    private List<ConversionsReportRowsItem> rows;

    /** @return "from" alanı */
    public String getFrom() {
        return from;
    }

    /**
     * "from" alanını ayarlar.
     *
     * @param from yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReport setFrom(String from) {
        this.from = from;
        return this;
    }

    /** @return "to" alanı */
    public String getTo() {
        return to;
    }

    /**
     * "to" alanını ayarlar.
     *
     * @param to yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReport setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "totals" alanı */
    public ConversionsReportTotals getTotals() {
        return totals;
    }

    /**
     * "totals" alanını ayarlar.
     *
     * @param totals yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReport setTotals(ConversionsReportTotals totals) {
        this.totals = totals;
        return this;
    }

    /** @return "previous" alanı */
    public ConversionsReportPrevious getPrevious() {
        return previous;
    }

    /**
     * "previous" alanını ayarlar.
     *
     * @param previous yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReport setPrevious(ConversionsReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    /** @return "by_campaign" alanı */
    public List<ConversionsReportByCampaignItem> getByCampaign() {
        return byCampaign;
    }

    /**
     * "by_campaign" alanını ayarlar.
     *
     * @param byCampaign yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReport setByCampaign(List<ConversionsReportByCampaignItem> byCampaign) {
        this.byCampaign = byCampaign;
        return this;
    }

    /** @return "rows" alanı */
    public List<ConversionsReportRowsItem> getRows() {
        return rows;
    }

    /**
     * "rows" alanını ayarlar.
     *
     * @param rows yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ConversionsReport setRows(List<ConversionsReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }
}
