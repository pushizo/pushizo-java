// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchOverviewAi şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchOverviewAi {
    /**
     * Zorunlu.
     */
    @JsonProperty("available")
    private Boolean available;

    /**
     * Zorunlu. Değerler: "disabled", "unavailable", "cap_reached".
     */
    @JsonProperty("reason")
    private String reason;

    public Boolean getAvailable() {
        return available;
    }

    public SiteSearchOverviewAi available(Boolean available) {
        this.available = available;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SiteSearchOverviewAi reason(String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
