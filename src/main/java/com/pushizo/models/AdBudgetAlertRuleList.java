// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdBudgetAlertRuleList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdBudgetAlertRuleList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<AdBudgetAlertRule> data;

    public java.util.List<AdBudgetAlertRule> getData() {
        return data;
    }

    public AdBudgetAlertRuleList data(java.util.List<AdBudgetAlertRule> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
