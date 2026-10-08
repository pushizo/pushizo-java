// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** OverviewStats şeması (api/openapi.yaml). */
public final class OverviewStats {

    /** "range" alanı. Zorunlu. Değerler: "7d", "30d", "custom". */
    @JsonProperty("range")
    private String range;

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "kpis" alanı. Zorunlu. */
    @JsonProperty("kpis")
    private OverviewStatsKpis kpis;

    /** "series" alanı. Zorunlu. */
    @JsonProperty("series")
    private List<OverviewStatsSeriesItem> series;

    /** "recent_messages" alanı. Zorunlu. */
    @JsonProperty("recent_messages")
    private List<Message> recentMessages;

    /** "recent_campaigns" alanı. Zorunlu. */
    @JsonProperty("recent_campaigns")
    private List<OverviewStatsRecentCampaignsItem> recentCampaigns;

    /** "top_errors" alanı. Zorunlu. */
    @JsonProperty("top_errors")
    private List<OverviewStatsTopErrorsItem> topErrors;

    /** "channels" alanı. Zorunlu. */
    @JsonProperty("channels")
    private List<OverviewStatsChannelsItem> channels;

    /** @return "range" alanı */
    public String getRange() {
        return range;
    }

    /**
     * "range" alanını ayarlar.
     *
     * @param range yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStats setRange(String range) {
        this.range = range;
        return this;
    }

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
    public OverviewStats setFrom(String from) {
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
    public OverviewStats setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "kpis" alanı */
    public OverviewStatsKpis getKpis() {
        return kpis;
    }

    /**
     * "kpis" alanını ayarlar.
     *
     * @param kpis yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStats setKpis(OverviewStatsKpis kpis) {
        this.kpis = kpis;
        return this;
    }

    /** @return "series" alanı */
    public List<OverviewStatsSeriesItem> getSeries() {
        return series;
    }

    /**
     * "series" alanını ayarlar.
     *
     * @param series yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStats setSeries(List<OverviewStatsSeriesItem> series) {
        this.series = series;
        return this;
    }

    /** @return "recent_messages" alanı */
    public List<Message> getRecentMessages() {
        return recentMessages;
    }

    /**
     * "recent_messages" alanını ayarlar.
     *
     * @param recentMessages yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStats setRecentMessages(List<Message> recentMessages) {
        this.recentMessages = recentMessages;
        return this;
    }

    /** @return "recent_campaigns" alanı */
    public List<OverviewStatsRecentCampaignsItem> getRecentCampaigns() {
        return recentCampaigns;
    }

    /**
     * "recent_campaigns" alanını ayarlar.
     *
     * @param recentCampaigns yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStats setRecentCampaigns(List<OverviewStatsRecentCampaignsItem> recentCampaigns) {
        this.recentCampaigns = recentCampaigns;
        return this;
    }

    /** @return "top_errors" alanı */
    public List<OverviewStatsTopErrorsItem> getTopErrors() {
        return topErrors;
    }

    /**
     * "top_errors" alanını ayarlar.
     *
     * @param topErrors yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStats setTopErrors(List<OverviewStatsTopErrorsItem> topErrors) {
        this.topErrors = topErrors;
        return this;
    }

    /** @return "channels" alanı */
    public List<OverviewStatsChannelsItem> getChannels() {
        return channels;
    }

    /**
     * "channels" alanını ayarlar.
     *
     * @param channels yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStats setChannels(List<OverviewStatsChannelsItem> channels) {
        this.channels = channels;
        return this;
    }
}
