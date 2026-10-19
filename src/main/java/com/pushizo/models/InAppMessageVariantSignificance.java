// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InAppMessageVariantSignificance şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InAppMessageVariantSignificance {
    /**
     * Zorunlu.
     */
    @JsonProperty("leader")
    private String leader;

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

    public String getLeader() {
        return leader;
    }

    public InAppMessageVariantSignificance leader(String leader) {
        this.leader = leader;
        return this;
    }

    public Double getPValue() {
        return pValue;
    }

    public InAppMessageVariantSignificance pValue(Double pValue) {
        this.pValue = pValue;
        return this;
    }

    public Boolean getSignificant() {
        return significant;
    }

    public InAppMessageVariantSignificance significant(Boolean significant) {
        this.significant = significant;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
