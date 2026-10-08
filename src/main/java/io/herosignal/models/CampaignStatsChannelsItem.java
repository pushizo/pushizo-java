// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CampaignStatsChannelsItem şeması (api/openapi.yaml). */
public final class CampaignStatsChannelsItem {

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "targeted" alanı. Zorunlu. */
    @JsonProperty("targeted")
    private Long targeted;

    /** "sent" alanı. Zorunlu. */
    @JsonProperty("sent")
    private Long sent;

    /** "failed" alanı. Zorunlu. */
    @JsonProperty("failed")
    private Long failed;

    /** "opened" alanı. Zorunlu. */
    @JsonProperty("opened")
    private Long opened;

    /** "clicked" alanı. Zorunlu. */
    @JsonProperty("clicked")
    private Long clicked;

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
    public CampaignStatsChannelsItem setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "targeted" alanı */
    public Long getTargeted() {
        return targeted;
    }

    /**
     * "targeted" alanını ayarlar.
     *
     * @param targeted yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStatsChannelsItem setTargeted(Long targeted) {
        this.targeted = targeted;
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
    public CampaignStatsChannelsItem setSent(Long sent) {
        this.sent = sent;
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
    public CampaignStatsChannelsItem setFailed(Long failed) {
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
    public CampaignStatsChannelsItem setOpened(Long opened) {
        this.opened = opened;
        return this;
    }

    /** @return "clicked" alanı */
    public Long getClicked() {
        return clicked;
    }

    /**
     * "clicked" alanını ayarlar.
     *
     * @param clicked yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStatsChannelsItem setClicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }
}
