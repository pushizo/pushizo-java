// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Olay filtresi: { match: all|any, conditions: [{ field, op, value? }] }.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookPreviewDtoFilters {
    /**
     * Zorunlu. Değerler: "all", "any".
     */
    @JsonProperty("match")
    private String match;

    /**
     * Zorunlu.
     */
    @JsonProperty("conditions")
    private java.util.List<WebhookPreviewDtoFiltersConditionsItem> conditions;

    public String getMatch() {
        return match;
    }

    public WebhookPreviewDtoFilters match(String match) {
        this.match = match;
        return this;
    }

    public java.util.List<WebhookPreviewDtoFiltersConditionsItem> getConditions() {
        return conditions;
    }

    public WebhookPreviewDtoFilters conditions(java.util.List<WebhookPreviewDtoFiltersConditionsItem> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
