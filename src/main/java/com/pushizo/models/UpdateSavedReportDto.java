// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSavedReportDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateSavedReportDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("definition")
    private UpdateSavedReportDtoDefinition definition;

    public String getName() {
        return name;
    }

    public UpdateSavedReportDto name(String name) {
        this.name = name;
        return this;
    }

    public UpdateSavedReportDtoDefinition getDefinition() {
        return definition;
    }

    public UpdateSavedReportDto definition(UpdateSavedReportDtoDefinition definition) {
        this.definition = definition;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
