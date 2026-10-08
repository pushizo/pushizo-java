// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** OverviewStatsSeriesItem şeması (api/openapi.yaml). */
public final class OverviewStatsSeriesItem {

    /** "date" alanı. Zorunlu. */
    @JsonProperty("date")
    private String date;

    /** "sent" alanı. Zorunlu. */
    @JsonProperty("sent")
    private Long sent;

    /** "delivered" alanı. Zorunlu. */
    @JsonProperty("delivered")
    private Long delivered;

    /** "failed" alanı. Zorunlu. */
    @JsonProperty("failed")
    private Long failed;

    /** "opened" alanı. Zorunlu. */
    @JsonProperty("opened")
    private Long opened;

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
    public OverviewStatsSeriesItem setDate(String date) {
        this.date = date;
        return this;
    }

    /** @return "sent" alanı */
    public Long getSent() {
        return sent;
    }

    /**
     * "sent" alanını ayarlar.
     *
     * @param sent yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsSeriesItem setSent(Long sent) {
        this.sent = sent;
        return this;
    }

    /** @return "delivered" alanı */
    public Long getDelivered() {
        return delivered;
    }

    /**
     * "delivered" alanını ayarlar.
     *
     * @param delivered yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsSeriesItem setDelivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    /** @return "failed" alanı */
    public Long getFailed() {
        return failed;
    }

    /**
     * "failed" alanını ayarlar.
     *
     * @param failed yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsSeriesItem setFailed(Long failed) {
        this.failed = failed;
        return this;
    }

    /** @return "opened" alanı */
    public Long getOpened() {
        return opened;
    }

    /**
     * "opened" alanını ayarlar.
     *
     * @param opened yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsSeriesItem setOpened(Long opened) {
        this.opened = opened;
        return this;
    }
}
