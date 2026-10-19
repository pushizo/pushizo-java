// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookFilters şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookFilters {
    /**
     * Zorunlu. Değerler: "all", "any".
     */
    @JsonProperty("match")
    private String match;

    /**
     * Zorunlu.
     */
    @JsonProperty("conditions")
    private java.util.List<WebhookFiltersConditionsItem> conditions;

    public String getMatch() {
        return match;
    }

    public WebhookFilters match(String match) {
        this.match = match;
        return this;
    }

    public java.util.List<WebhookFiltersConditionsItem> getConditions() {
        return conditions;
    }

    public WebhookFilters conditions(java.util.List<WebhookFiltersConditionsItem> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
