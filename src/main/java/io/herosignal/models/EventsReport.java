// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** EventsReport şeması (api/openapi.yaml). */
public final class EventsReport {

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "group_by" alanı. Zorunlu. Değerler: "day", "name". */
    @JsonProperty("group_by")
    private String groupBy;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "totals" alanı. Zorunlu. */
    @JsonProperty("totals")
    private EventsReportTotals totals;

    /** "previous" alanı. Zorunlu. */
    @JsonProperty("previous")
    private EventsReportPrevious previous;

    /** "rows" alanı. Zorunlu. */
    @JsonProperty("rows")
    private List<EventsReportRowsItem> rows;

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
    public EventsReport setFrom(String from) {
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
    public EventsReport setTo(String to) {
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
    public EventsReport setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventsReport setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "totals" alanı */
    public EventsReportTotals getTotals() {
        return totals;
    }

    /**
     * "totals" alanını ayarlar.
     *
     * @param totals yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventsReport setTotals(EventsReportTotals totals) {
        this.totals = totals;
        return this;
    }

    /** @return "previous" alanı */
    public EventsReportPrevious getPrevious() {
        return previous;
    }

    /**
     * "previous" alanını ayarlar.
     *
     * @param previous yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventsReport setPrevious(EventsReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    /** @return "rows" alanı */
    public List<EventsReportRowsItem> getRows() {
        return rows;
    }

    /**
     * "rows" alanını ayarlar.
     *
     * @param rows yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventsReport setRows(List<EventsReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }
}
