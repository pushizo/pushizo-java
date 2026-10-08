// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** ProvidersReport şeması (api/openapi.yaml). */
public final class ProvidersReport {

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "totals" alanı. Zorunlu. */
    @JsonProperty("totals")
    private ProvidersReportTotals totals;

    /** "previous" alanı. Zorunlu. */
    @JsonProperty("previous")
    private ProvidersReportPrevious previous;

    /** "rows" alanı. Zorunlu. */
    @JsonProperty("rows")
    private List<ProvidersReportRowsItem> rows;

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
    public ProvidersReport setFrom(String from) {
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
    public ProvidersReport setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "totals" alanı */
    public ProvidersReportTotals getTotals() {
        return totals;
    }

    /**
     * "totals" alanını ayarlar.
     *
     * @param totals yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReport setTotals(ProvidersReportTotals totals) {
        this.totals = totals;
        return this;
    }

    /** @return "previous" alanı */
    public ProvidersReportPrevious getPrevious() {
        return previous;
    }

    /**
     * "previous" alanını ayarlar.
     *
     * @param previous yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReport setPrevious(ProvidersReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    /** @return "rows" alanı */
    public List<ProvidersReportRowsItem> getRows() {
        return rows;
    }

    /**
     * "rows" alanını ayarlar.
     *
     * @param rows yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReport setRows(List<ProvidersReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }
}
