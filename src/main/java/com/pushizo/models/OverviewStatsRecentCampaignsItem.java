// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OverviewStatsRecentCampaignsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class OverviewStatsRecentCampaignsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public OverviewStatsRecentCampaignsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public OverviewStatsRecentCampaignsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public OverviewStatsRecentCampaignsItem type(String type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public OverviewStatsRecentCampaignsItem status(String status) {
        this.status = status;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public OverviewStatsRecentCampaignsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public OverviewStatsRecentCampaignsItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public OverviewStatsRecentCampaignsItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public OverviewStatsRecentCampaignsItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
