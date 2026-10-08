// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** SubscriptionsReportByChannelItem şeması (api/openapi.yaml). */
public final class SubscriptionsReportByChannelItem {

    /** "channel" alanı. Zorunlu. */
    @JsonProperty("channel")
    private String channel;

    /** "active" alanı. Zorunlu. */
    @JsonProperty("active")
    private Long active;

    /** "new" alanı. Zorunlu. */
    @JsonProperty("new")
    private Long newValue;

    /** "unsubscribed" alanı. Zorunlu. */
    @JsonProperty("unsubscribed")
    private Long unsubscribed;

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReportByChannelItem setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "active" alanı */
    public Long getActive() {
        return active;
    }

    /**
     * "active" alanını ayarlar.
     *
     * @param active yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SubscriptionsReportByChannelItem setActive(Long active) {
        this.active = active;
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
    public SubscriptionsReportByChannelItem setNewValue(Long newValue) {
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
    public SubscriptionsReportByChannelItem setUnsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }
}
