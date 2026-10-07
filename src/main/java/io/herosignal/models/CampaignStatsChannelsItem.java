// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignStatsChannelsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignStatsChannelsItem {
    /**
     * Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("targeted")
    private Long targeted;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("opened")
    private Long opened;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked")
    private Long clicked;

    public String getChannel() {
        return channel;
    }

    public CampaignStatsChannelsItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Long getTargeted() {
        return targeted;
    }

    public CampaignStatsChannelsItem targeted(Long targeted) {
        this.targeted = targeted;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public CampaignStatsChannelsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public CampaignStatsChannelsItem failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public CampaignStatsChannelsItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public CampaignStatsChannelsItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
