// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsCreateBodyAbTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsCreateBodyAbTest {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("test_percentage")
    private Long testPercentage;

    @JsonProperty("winner")
    private CampaignsCreateBodyAbTestWinner winner;

    public Boolean getEnabled() {
        return enabled;
    }

    public CampaignsCreateBodyAbTest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getTestPercentage() {
        return testPercentage;
    }

    public CampaignsCreateBodyAbTest testPercentage(Long testPercentage) {
        this.testPercentage = testPercentage;
        return this;
    }

    public CampaignsCreateBodyAbTestWinner getWinner() {
        return winner;
    }

    public CampaignsCreateBodyAbTest winner(CampaignsCreateBodyAbTestWinner winner) {
        this.winner = winner;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
