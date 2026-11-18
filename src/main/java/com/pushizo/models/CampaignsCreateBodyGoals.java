// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dönüşüm hedefleri (ADR-0080): birincil A/B kazananını belirler; olaylar dönüşüm olayı olarak tanımlı olmalı.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsCreateBodyGoals {
    @JsonProperty("primary")
    private String primary;

    @JsonProperty("secondary")
    private java.util.List<String> secondary;

    public String getPrimary() {
        return primary;
    }

    public CampaignsCreateBodyGoals primary(String primary) {
        this.primary = primary;
        return this;
    }

    public java.util.List<String> getSecondary() {
        return secondary;
    }

    public CampaignsCreateBodyGoals secondary(java.util.List<String> secondary) {
        this.secondary = secondary;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
