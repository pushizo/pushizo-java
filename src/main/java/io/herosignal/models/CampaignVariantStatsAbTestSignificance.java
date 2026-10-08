// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignVariantStatsAbTestSignificance şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignVariantStatsAbTestSignificance {
    /**
     * Zorunlu.
     */
    @JsonProperty("p_value")
    private Double pValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("significant")
    private Boolean significant;

    /**
     * Zorunlu.
     */
    @JsonProperty("metric")
    private String metric;

    public Double getPValue() {
        return pValue;
    }

    public CampaignVariantStatsAbTestSignificance pValue(Double pValue) {
        this.pValue = pValue;
        return this;
    }

    public Boolean getSignificant() {
        return significant;
    }

    public CampaignVariantStatsAbTestSignificance significant(Boolean significant) {
        this.significant = significant;
        return this;
    }

    public String getMetric() {
        return metric;
    }

    public CampaignVariantStatsAbTestSignificance metric(String metric) {
        this.metric = metric;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
