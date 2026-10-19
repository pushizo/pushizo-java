// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateExportDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateExportDto {
    /**
     * Zorunlu. Değerler: "users", "subscriptions", "events", "deliveries", "message_events".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("filters")
    private CreateExportDtoFilters filters;

    public String getType() {
        return type;
    }

    public CreateExportDto type(String type) {
        this.type = type;
        return this;
    }

    public CreateExportDtoFilters getFilters() {
        return filters;
    }

    public CreateExportDto filters(CreateExportDtoFilters filters) {
        this.filters = filters;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
