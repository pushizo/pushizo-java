// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignPreflightReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignPreflightReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_id")
    private String campaignId;

    /**
     * Zorunlu.
     */
    @JsonProperty("checked_at")
    private String checkedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("links_checked")
    private Boolean linksChecked;

    /**
     * Zorunlu.
     */
    @JsonProperty("summary")
    private CampaignPreflightReportSummary summary;

    /**
     * Zorunlu.
     */
    @JsonProperty("findings")
    private java.util.List<CampaignPreflightReportFindingsItem> findings;

    public String getCampaignId() {
        return campaignId;
    }

    public CampaignPreflightReport campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getCheckedAt() {
        return checkedAt;
    }

    public CampaignPreflightReport checkedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }

    public Boolean getLinksChecked() {
        return linksChecked;
    }

    public CampaignPreflightReport linksChecked(Boolean linksChecked) {
        this.linksChecked = linksChecked;
        return this;
    }

    public CampaignPreflightReportSummary getSummary() {
        return summary;
    }

    public CampaignPreflightReport summary(CampaignPreflightReportSummary summary) {
        this.summary = summary;
        return this;
    }

    public java.util.List<CampaignPreflightReportFindingsItem> getFindings() {
        return findings;
    }

    public CampaignPreflightReport findings(java.util.List<CampaignPreflightReportFindingsItem> findings) {
        this.findings = findings;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
