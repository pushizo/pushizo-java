// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** SubscriptionsReportRowsItem şeması (api/openapi.yaml). */
public final class SubscriptionsReportRowsItem {

    /** "date" alanı. Zorunlu. */
    @JsonProperty("date")
    private String date;

    /** "new" alanı. Zorunlu. */
    @JsonProperty("new")
    private Long newValue;

    /** "unsubscribed" alanı. Zorunlu. */
    @JsonProperty("unsubscribed")
    private Long unsubscribed;

    /** "opt_outs" alanı. Zorunlu. */
    @JsonProperty("opt_outs")
    private Long optOuts;

    /** "net" alanı. Zorunlu. */
    @JsonProperty("net")
    private Long net;

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
    public SubscriptionsReportRowsItem setDate(String date) {
        this.date = date;
        return this;
    }

    /** @return "new" alanı */
    public Long getNewValue() {
        return newValue;
    }

    /**
     * "new" alanını ayarlar.
     *
     * @param newValue yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReportRowsItem setNewValue(Long newValue) {
        this.newValue = newValue;
        return this;
    }

    /** @return "unsubscribed" alanı */
    public Long getUnsubscribed() {
        return unsubscribed;
    }

    /**
     * "unsubscribed" alanını ayarlar.
     *
     * @param unsubscribed yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReportRowsItem setUnsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }

    /** @return "opt_outs" alanı */
    public Long getOptOuts() {
        return optOuts;
    }

    /**
     * "opt_outs" alanını ayarlar.
     *
     * @param optOuts yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReportRowsItem setOptOuts(Long optOuts) {
        this.optOuts = optOuts;
        return this;
    }

    /** @return "net" alanı */
    public Long getNet() {
        return net;
    }

    /**
     * "net" alanını ayarlar.
     *
     * @param net yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReportRowsItem setNet(Long net) {
        this.net = net;
        return this;
    }
}
