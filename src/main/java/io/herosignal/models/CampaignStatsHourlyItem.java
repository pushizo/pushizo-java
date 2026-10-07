// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignStatsHourlyItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignStatsHourlyItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("hour")
    private String hour;

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

    public String getHour() {
        return hour;
    }

    public CampaignStatsHourlyItem hour(String hour) {
        this.hour = hour;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public CampaignStatsHourlyItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public CampaignStatsHourlyItem failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public CampaignStatsHourlyItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public CampaignStatsHourlyItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
