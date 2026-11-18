// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignStatsCards şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignStatsCards {
    /**
     * Zorunlu.
     */
    @JsonProperty("created")
    private Long created;

    /**
     * Zorunlu.
     */
    @JsonProperty("viewed")
    private Long viewed;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked")
    private Long clicked;

    /**
     * Zorunlu.
     */
    @JsonProperty("dismissed")
    private Long dismissed;

    /**
     * Zorunlu.
     */
    @JsonProperty("view_rate")
    private Double viewRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("click_rate")
    private Double clickRate;

    public Long getCreated() {
        return created;
    }

    public CampaignStatsCards created(Long created) {
        this.created = created;
        return this;
    }

    public Long getViewed() {
        return viewed;
    }

    public CampaignStatsCards viewed(Long viewed) {
        this.viewed = viewed;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public CampaignStatsCards clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getDismissed() {
        return dismissed;
    }

    public CampaignStatsCards dismissed(Long dismissed) {
        this.dismissed = dismissed;
        return this;
    }

    public Double getViewRate() {
        return viewRate;
    }

    public CampaignStatsCards viewRate(Double viewRate) {
        this.viewRate = viewRate;
        return this;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public CampaignStatsCards clickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
