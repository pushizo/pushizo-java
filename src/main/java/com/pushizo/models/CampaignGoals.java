// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignGoals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignGoals {
    @JsonProperty("primary")
    private String primary;

    @JsonProperty("secondary")
    private java.util.List<String> secondary;

    public String getPrimary() {
        return primary;
    }

    public CampaignGoals primary(String primary) {
        this.primary = primary;
        return this;
    }

    public java.util.List<String> getSecondary() {
        return secondary;
    }

    public CampaignGoals secondary(java.util.List<String> secondary) {
        this.secondary = secondary;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
