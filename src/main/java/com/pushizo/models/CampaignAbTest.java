// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignAbTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignAbTest {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("test_percentage")
    private Long testPercentage;

    @JsonProperty("winner")
    private CampaignAbTestWinner winner;

    /**
     * Değerler: "testing", "winner_sent".
     */
    @JsonProperty("phase")
    private String phase;

    @JsonProperty("winner_variant_id")
    private String winnerVariantId;

    @JsonProperty("decided_at")
    private String decidedAt;

    @JsonProperty("decided_by")
    private String decidedBy;

    @JsonProperty("significance")
    private CampaignAbTestSignificance significance;

    public Boolean getEnabled() {
        return enabled;
    }

    public CampaignAbTest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getTestPercentage() {
        return testPercentage;
    }

    public CampaignAbTest testPercentage(Long testPercentage) {
        this.testPercentage = testPercentage;
        return this;
    }

    public CampaignAbTestWinner getWinner() {
        return winner;
    }

    public CampaignAbTest winner(CampaignAbTestWinner winner) {
        this.winner = winner;
        return this;
    }

    public String getPhase() {
        return phase;
    }

    public CampaignAbTest phase(String phase) {
        this.phase = phase;
        return this;
    }

    public String getWinnerVariantId() {
        return winnerVariantId;
    }

    public CampaignAbTest winnerVariantId(String winnerVariantId) {
        this.winnerVariantId = winnerVariantId;
        return this;
    }

    public String getDecidedAt() {
        return decidedAt;
    }

    public CampaignAbTest decidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    public String getDecidedBy() {
        return decidedBy;
    }

    public CampaignAbTest decidedBy(String decidedBy) {
        this.decidedBy = decidedBy;
        return this;
    }

    public CampaignAbTestSignificance getSignificance() {
        return significance;
    }

    public CampaignAbTest significance(CampaignAbTestSignificance significance) {
        this.significance = significance;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
