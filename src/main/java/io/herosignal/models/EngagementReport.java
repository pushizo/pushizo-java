// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** EngagementReport şeması (api/openapi.yaml). */
public final class EngagementReport {

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "timezone" alanı. Zorunlu. */
    @JsonProperty("timezone")
    private String timezone;

    /** "totals" alanı. Zorunlu. */
    @JsonProperty("totals")
    private EngagementReportTotals totals;

    /** "previous" alanı. Zorunlu. */
    @JsonProperty("previous")
    private EngagementReportPrevious previous;

    /** "cells" alanı. Zorunlu. */
    @JsonProperty("cells")
    private List<EngagementReportCellsItem> cells;

    /** "rows" alanı. Zorunlu. */
    @JsonProperty("rows")
    private List<EngagementReportRowsItem> rows;

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
    public EngagementReport setFrom(String from) {
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
    public EngagementReport setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "timezone" alanı */
    public String getTimezone() {
        return timezone;
    }

    /**
     * "timezone" alanını ayarlar.
     *
     * @param timezone yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReport setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /** @return "totals" alanı */
    public EngagementReportTotals getTotals() {
        return totals;
    }

    /**
     * "totals" alanını ayarlar.
     *
     * @param totals yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReport setTotals(EngagementReportTotals totals) {
        this.totals = totals;
        return this;
    }

    /** @return "previous" alanı */
    public EngagementReportPrevious getPrevious() {
        return previous;
    }

    /**
     * "previous" alanını ayarlar.
     *
     * @param previous yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReport setPrevious(EngagementReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    /** @return "cells" alanı */
    public List<EngagementReportCellsItem> getCells() {
        return cells;
    }

    /**
     * "cells" alanını ayarlar.
     *
     * @param cells yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReport setCells(List<EngagementReportCellsItem> cells) {
        this.cells = cells;
        return this;
    }

    /** @return "rows" alanı */
    public List<EngagementReportRowsItem> getRows() {
        return rows;
    }

    /**
     * "rows" alanını ayarlar.
     *
     * @param rows yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReport setRows(List<EngagementReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }
}
