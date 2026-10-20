// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaignAbTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaignAbTest {
    /**
     * Zorunlu.
     */
    @JsonProperty("winner_variant_id")
    private String winnerVariantId;

    /**
     * Zorunlu.
     */
    @JsonProperty("decided_at")
    private String decidedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("decided_by")
    private String decidedBy;

    public String getWinnerVariantId() {
        return winnerVariantId;
    }

    public WebCampaignAbTest winnerVariantId(String winnerVariantId) {
        this.winnerVariantId = winnerVariantId;
        return this;
    }

    public String getDecidedAt() {
        return decidedAt;
    }

    public WebCampaignAbTest decidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    public String getDecidedBy() {
        return decidedBy;
    }

    public WebCampaignAbTest decidedBy(String decidedBy) {
        this.decidedBy = decidedBy;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
