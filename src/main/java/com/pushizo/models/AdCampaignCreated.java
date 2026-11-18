// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCampaignCreated şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCampaignCreated {
    /**
     * Zorunlu.
     */
    @JsonProperty("campaign")
    private AdEntity campaign;

    /**
     * Zorunlu.
     */
    @JsonProperty("ad_set_id")
    private String adSetId;

    /**
     * Zorunlu.
     */
    @JsonProperty("ad_id")
    private String adId;

    /**
     * Zorunlu.
     */
    @JsonProperty("warnings")
    private java.util.List<String> warnings;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_url")
    private String platformUrl;

    public AdEntity getCampaign() {
        return campaign;
    }

    public AdCampaignCreated campaign(AdEntity campaign) {
        this.campaign = campaign;
        return this;
    }

    public String getAdSetId() {
        return adSetId;
    }

    public AdCampaignCreated adSetId(String adSetId) {
        this.adSetId = adSetId;
        return this;
    }

    public String getAdId() {
        return adId;
    }

    public AdCampaignCreated adId(String adId) {
        this.adId = adId;
        return this;
    }

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    public AdCampaignCreated warnings(java.util.List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    public String getPlatformUrl() {
        return platformUrl;
    }

    public AdCampaignCreated platformUrl(String platformUrl) {
        this.platformUrl = platformUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
