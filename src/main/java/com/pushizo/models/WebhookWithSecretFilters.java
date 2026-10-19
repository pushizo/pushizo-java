// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookWithSecretFilters şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookWithSecretFilters {
    /**
     * Zorunlu. Değerler: "all", "any".
     */
    @JsonProperty("match")
    private String match;

    /**
     * Zorunlu.
     */
    @JsonProperty("conditions")
    private java.util.List<WebhookWithSecretFiltersConditionsItem> conditions;

    public String getMatch() {
        return match;
    }

    public WebhookWithSecretFilters match(String match) {
        this.match = match;
        return this;
    }

    public java.util.List<WebhookWithSecretFiltersConditionsItem> getConditions() {
        return conditions;
    }

    public WebhookWithSecretFilters conditions(java.util.List<WebhookWithSecretFiltersConditionsItem> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
