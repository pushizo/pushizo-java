// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** MessagesReport şeması (api/openapi.yaml). */
public final class MessagesReport {

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "group_by" alanı. Zorunlu. Değerler: "day", "channel", "campaign". */
    @JsonProperty("group_by")
    private String groupBy;

    /** "totals" alanı. Zorunlu. */
    @JsonProperty("totals")
    private MessagesReportTotals totals;

    /** "previous" alanı. Zorunlu. */
    @JsonProperty("previous")
    private MessagesReportPrevious previous;

    /** "rows" alanı. Zorunlu. */
    @JsonProperty("rows")
    private List<MessagesReportRowsItem> rows;

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
    public MessagesReport setFrom(String from) {
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
    public MessagesReport setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "group_by" alanı */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * "group_by" alanını ayarlar.
     *
     * @param groupBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReport setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** @return "totals" alanı */
    public MessagesReportTotals getTotals() {
        return totals;
    }

    /**
     * "totals" alanını ayarlar.
     *
     * @param totals yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReport setTotals(MessagesReportTotals totals) {
        this.totals = totals;
        return this;
    }

    /** @return "previous" alanı */
    public MessagesReportPrevious getPrevious() {
        return previous;
    }

    /**
     * "previous" alanını ayarlar.
     *
     * @param previous yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReport setPrevious(MessagesReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    /** @return "rows" alanı */
    public List<MessagesReportRowsItem> getRows() {
        return rows;
    }

    /**
     * "rows" alanını ayarlar.
     *
     * @param rows yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReport setRows(List<MessagesReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }
}
