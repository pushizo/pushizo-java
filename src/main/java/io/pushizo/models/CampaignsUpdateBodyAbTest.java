// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsUpdateBodyAbTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsUpdateBodyAbTest {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("test_percentage")
    private Long testPercentage;

    @JsonProperty("winner")
    private CampaignsUpdateBodyAbTestWinner winner;

    public Boolean getEnabled() {
        return enabled;
    }

    public CampaignsUpdateBodyAbTest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getTestPercentage() {
        return testPercentage;
    }

    public CampaignsUpdateBodyAbTest testPercentage(Long testPercentage) {
        this.testPercentage = testPercentage;
        return this;
    }

    public CampaignsUpdateBodyAbTestWinner getWinner() {
        return winner;
    }

    public CampaignsUpdateBodyAbTest winner(CampaignsUpdateBodyAbTestWinner winner) {
        this.winner = winner;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
