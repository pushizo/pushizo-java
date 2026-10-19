// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignAbTestSignificance şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignAbTestSignificance {
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

    public CampaignAbTestSignificance pValue(Double pValue) {
        this.pValue = pValue;
        return this;
    }

    public Boolean getSignificant() {
        return significant;
    }

    public CampaignAbTestSignificance significant(Boolean significant) {
        this.significant = significant;
        return this;
    }

    public String getMetric() {
        return metric;
    }

    public CampaignAbTestSignificance metric(String metric) {
        this.metric = metric;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
