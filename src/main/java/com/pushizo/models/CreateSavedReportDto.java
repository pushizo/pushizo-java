// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSavedReportDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateSavedReportDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("definition")
    private CreateSavedReportDtoDefinition definition;

    public String getName() {
        return name;
    }

    public CreateSavedReportDto name(String name) {
        this.name = name;
        return this;
    }

    public CreateSavedReportDtoDefinition getDefinition() {
        return definition;
    }

    public CreateSavedReportDto definition(CreateSavedReportDtoDefinition definition) {
        this.definition = definition;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
