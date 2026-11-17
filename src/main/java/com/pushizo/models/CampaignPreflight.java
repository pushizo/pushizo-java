// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignPreflight şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignPreflight {
    /**
     * Zorunlu.
     */
    @JsonProperty("checked_at")
    private String checkedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("summary")
    private CampaignPreflightSummary summary;

    /**
     * Zorunlu.
     */
    @JsonProperty("codes")
    private java.util.List<String> codes;

    @JsonProperty("acknowledged_by")
    private String acknowledgedBy;

    @JsonProperty("acknowledged_at")
    private String acknowledgedAt;

    public String getCheckedAt() {
        return checkedAt;
    }

    public CampaignPreflight checkedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }

    public CampaignPreflightSummary getSummary() {
        return summary;
    }

    public CampaignPreflight summary(CampaignPreflightSummary summary) {
        this.summary = summary;
        return this;
    }

    public java.util.List<String> getCodes() {
        return codes;
    }

    public CampaignPreflight codes(java.util.List<String> codes) {
        this.codes = codes;
        return this;
    }

    public String getAcknowledgedBy() {
        return acknowledgedBy;
    }

    public CampaignPreflight acknowledgedBy(String acknowledgedBy) {
        this.acknowledgedBy = acknowledgedBy;
        return this;
    }

    public String getAcknowledgedAt() {
        return acknowledgedAt;
    }

    public CampaignPreflight acknowledgedAt(String acknowledgedAt) {
        this.acknowledgedAt = acknowledgedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
