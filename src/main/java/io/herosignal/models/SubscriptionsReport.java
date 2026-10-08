// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** SubscriptionsReport şeması (api/openapi.yaml). */
public final class SubscriptionsReport {

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "totals" alanı. Zorunlu. */
    @JsonProperty("totals")
    private SubscriptionsReportTotals totals;

    /** "previous" alanı. Zorunlu. */
    @JsonProperty("previous")
    private SubscriptionsReportPrevious previous;

    /** "rows" alanı. Zorunlu. */
    @JsonProperty("rows")
    private List<SubscriptionsReportRowsItem> rows;

    /** "by_channel" alanı. Zorunlu. */
    @JsonProperty("by_channel")
    private List<SubscriptionsReportByChannelItem> byChannel;

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
    public SubscriptionsReport setFrom(String from) {
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
    public SubscriptionsReport setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "totals" alanı */
    public SubscriptionsReportTotals getTotals() {
        return totals;
    }

    /**
     * "totals" alanını ayarlar.
     *
     * @param totals yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReport setTotals(SubscriptionsReportTotals totals) {
        this.totals = totals;
        return this;
    }

    /** @return "previous" alanı */
    public SubscriptionsReportPrevious getPrevious() {
        return previous;
    }

    /**
     * "previous" alanını ayarlar.
     *
     * @param previous yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReport setPrevious(SubscriptionsReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    /** @return "rows" alanı */
    public List<SubscriptionsReportRowsItem> getRows() {
        return rows;
    }

    /**
     * "rows" alanını ayarlar.
     *
     * @param rows yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReport setRows(List<SubscriptionsReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    /** @return "by_channel" alanı */
    public List<SubscriptionsReportByChannelItem> getByChannel() {
        return byChannel;
    }

    /**
     * "by_channel" alanını ayarlar.
     *
     * @param byChannel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReport setByChannel(List<SubscriptionsReportByChannelItem> byChannel) {
        this.byChannel = byChannel;
        return this;
    }
}
