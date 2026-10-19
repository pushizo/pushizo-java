// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWarmupPlanDtoProviderShares şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWarmupPlanDtoProviderShares {
    /**
     * Zorunlu.
     */
    @JsonProperty("gmail")
    private Double gmail;

    /**
     * Zorunlu.
     */
    @JsonProperty("outlook")
    private Double outlook;

    /**
     * Zorunlu.
     */
    @JsonProperty("yahoo")
    private Double yahoo;

    /**
     * Zorunlu.
     */
    @JsonProperty("other")
    private Double other;

    public Double getGmail() {
        return gmail;
    }

    public UpdateWarmupPlanDtoProviderShares gmail(Double gmail) {
        this.gmail = gmail;
        return this;
    }

    public Double getOutlook() {
        return outlook;
    }

    public UpdateWarmupPlanDtoProviderShares outlook(Double outlook) {
        this.outlook = outlook;
        return this;
    }

    public Double getYahoo() {
        return yahoo;
    }

    public UpdateWarmupPlanDtoProviderShares yahoo(Double yahoo) {
        this.yahoo = yahoo;
        return this;
    }

    public Double getOther() {
        return other;
    }

    public UpdateWarmupPlanDtoProviderShares other(Double other) {
        this.other = other;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
