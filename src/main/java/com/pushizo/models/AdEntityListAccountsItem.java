// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdEntityListAccountsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdEntityListAccountsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("campaigns_synced_at")
    private String campaignsSyncedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("insights_synced_at")
    private String insightsSyncedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("campaigns_sync_error")
    private String campaignsSyncError;

    /**
     * Zorunlu.
     */
    @JsonProperty("insights_sync_error")
    private String insightsSyncError;

    public String getId() {
        return id;
    }

    public AdEntityListAccountsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getCampaignsSyncedAt() {
        return campaignsSyncedAt;
    }

    public AdEntityListAccountsItem campaignsSyncedAt(String campaignsSyncedAt) {
        this.campaignsSyncedAt = campaignsSyncedAt;
        return this;
    }

    public String getInsightsSyncedAt() {
        return insightsSyncedAt;
    }

    public AdEntityListAccountsItem insightsSyncedAt(String insightsSyncedAt) {
        this.insightsSyncedAt = insightsSyncedAt;
        return this;
    }

    public String getCampaignsSyncError() {
        return campaignsSyncError;
    }

    public AdEntityListAccountsItem campaignsSyncError(String campaignsSyncError) {
        this.campaignsSyncError = campaignsSyncError;
        return this;
    }

    public String getInsightsSyncError() {
        return insightsSyncError;
    }

    public AdEntityListAccountsItem insightsSyncError(String insightsSyncError) {
        this.insightsSyncError = insightsSyncError;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
