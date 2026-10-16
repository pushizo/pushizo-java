// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Olay filtresi: { match: all|any, conditions: [{ field, op, value? }] }.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebhookDtoFilters {
    /**
     * Zorunlu. Değerler: "all", "any".
     */
    @JsonProperty("match")
    private String match;

    /**
     * Zorunlu.
     */
    @JsonProperty("conditions")
    private java.util.List<CreateWebhookDtoFiltersConditionsItem> conditions;

    public String getMatch() {
        return match;
    }

    public CreateWebhookDtoFilters match(String match) {
        this.match = match;
        return this;
    }

    public java.util.List<CreateWebhookDtoFiltersConditionsItem> getConditions() {
        return conditions;
    }

    public CreateWebhookDtoFilters conditions(java.util.List<CreateWebhookDtoFiltersConditionsItem> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
