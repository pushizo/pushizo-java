// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignVariantStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignVariantStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("ab_test")
    private CampaignVariantStatsAbTest abTest;

    /**
     * Zorunlu.
     */
    @JsonProperty("variants")
    private java.util.List<CampaignVariantStatsVariantsItem> variants;

    /**
     * Zorunlu.
     */
    @JsonProperty("leader")
    private String leader;

    /**
     * Zorunlu.
     */
    @JsonProperty("significance")
    private CampaignVariantStatsSignificance significance;

    public CampaignVariantStatsAbTest getAbTest() {
        return abTest;
    }

    public CampaignVariantStats abTest(CampaignVariantStatsAbTest abTest) {
        this.abTest = abTest;
        return this;
    }

    public java.util.List<CampaignVariantStatsVariantsItem> getVariants() {
        return variants;
    }

    public CampaignVariantStats variants(java.util.List<CampaignVariantStatsVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public String getLeader() {
        return leader;
    }

    public CampaignVariantStats leader(String leader) {
        this.leader = leader;
        return this;
    }

    public CampaignVariantStatsSignificance getSignificance() {
        return significance;
    }

    public CampaignVariantStats significance(CampaignVariantStatsSignificance significance) {
        this.significance = significance;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
