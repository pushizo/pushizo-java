// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCampaignPreview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCampaignPreview {
    /**
     * Zorunlu.
     */
    @JsonProperty("preview_url")
    private String previewUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_url")
    private String platformUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("creative")
    private AdCampaignPreviewCreative creative;

    public String getPreviewUrl() {
        return previewUrl;
    }

    public AdCampaignPreview previewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getPlatformUrl() {
        return platformUrl;
    }

    public AdCampaignPreview platformUrl(String platformUrl) {
        this.platformUrl = platformUrl;
        return this;
    }

    public AdCampaignPreviewCreative getCreative() {
        return creative;
    }

    public AdCampaignPreview creative(AdCampaignPreviewCreative creative) {
        this.creative = creative;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
