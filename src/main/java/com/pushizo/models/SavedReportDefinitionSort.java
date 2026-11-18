// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SavedReportDefinitionSort şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SavedReportDefinitionSort {
    /**
     * Zorunlu.
     */
    @JsonProperty("by")
    private String by;

    /**
     * Zorunlu. Değerler: "asc", "desc".
     */
    @JsonProperty("direction")
    private String direction;

    public String getBy() {
        return by;
    }

    public SavedReportDefinitionSort by(String by) {
        this.by = by;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public SavedReportDefinitionSort direction(String direction) {
        this.direction = direction;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
