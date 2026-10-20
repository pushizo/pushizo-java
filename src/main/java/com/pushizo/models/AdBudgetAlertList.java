// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdBudgetAlertList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdBudgetAlertList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<AdBudgetAlertListDataItem> data;

    public java.util.List<AdBudgetAlertListDataItem> getData() {
        return data;
    }

    public AdBudgetAlertList data(java.util.List<AdBudgetAlertListDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
