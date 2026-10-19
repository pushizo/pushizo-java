// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * McpCreateCampaignDraftBodyAbTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class McpCreateCampaignDraftBodyAbTest {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("test_percentage")
    private Long testPercentage;

    @JsonProperty("winner")
    private McpCreateCampaignDraftBodyAbTestWinner winner;

    public Boolean getEnabled() {
        return enabled;
    }

    public McpCreateCampaignDraftBodyAbTest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getTestPercentage() {
        return testPercentage;
    }

    public McpCreateCampaignDraftBodyAbTest testPercentage(Long testPercentage) {
        this.testPercentage = testPercentage;
        return this;
    }

    public McpCreateCampaignDraftBodyAbTestWinner getWinner() {
        return winner;
    }

    public McpCreateCampaignDraftBodyAbTest winner(McpCreateCampaignDraftBodyAbTestWinner winner) {
        this.winner = winner;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
