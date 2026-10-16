// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignVariantStatsAbTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignVariantStatsAbTest {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("test_percentage")
    private Long testPercentage;

    @JsonProperty("winner")
    private CampaignVariantStatsAbTestWinner winner;

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
    private CampaignVariantStatsAbTestSignificance significance;

    public Boolean getEnabled() {
        return enabled;
    }

    public CampaignVariantStatsAbTest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getTestPercentage() {
        return testPercentage;
    }

    public CampaignVariantStatsAbTest testPercentage(Long testPercentage) {
        this.testPercentage = testPercentage;
        return this;
    }

    public CampaignVariantStatsAbTestWinner getWinner() {
        return winner;
    }

    public CampaignVariantStatsAbTest winner(CampaignVariantStatsAbTestWinner winner) {
        this.winner = winner;
        return this;
    }

    public String getPhase() {
        return phase;
    }

    public CampaignVariantStatsAbTest phase(String phase) {
        this.phase = phase;
        return this;
    }

    public String getWinnerVariantId() {
        return winnerVariantId;
    }

    public CampaignVariantStatsAbTest winnerVariantId(String winnerVariantId) {
        this.winnerVariantId = winnerVariantId;
        return this;
    }

    public String getDecidedAt() {
        return decidedAt;
    }

    public CampaignVariantStatsAbTest decidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    public String getDecidedBy() {
        return decidedBy;
    }

    public CampaignVariantStatsAbTest decidedBy(String decidedBy) {
        this.decidedBy = decidedBy;
        return this;
    }

    public CampaignVariantStatsAbTestSignificance getSignificance() {
        return significance;
    }

    public CampaignVariantStatsAbTest significance(CampaignVariantStatsAbTestSignificance significance) {
        this.significance = significance;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
