// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdAudienceSyncList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdAudienceSyncList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<AdAudienceSyncListDataItem> data;

    public java.util.List<AdAudienceSyncListDataItem> getData() {
        return data;
    }

    public AdAudienceSyncList data(java.util.List<AdAudienceSyncListDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
