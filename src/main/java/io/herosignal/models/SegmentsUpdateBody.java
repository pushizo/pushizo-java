// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentsUpdateBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentsUpdateBody {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7).
     */
    @JsonProperty("definition")
    private SegmentsUpdateBodyDefinition definition;

    @JsonProperty("is_dynamic")
    private Boolean isDynamic;

    public String getName() {
        return name;
    }

    public SegmentsUpdateBody name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SegmentsUpdateBody description(String description) {
        this.description = description;
        return this;
    }

    public SegmentsUpdateBodyDefinition getDefinition() {
        return definition;
    }

    public SegmentsUpdateBody definition(SegmentsUpdateBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public SegmentsUpdateBody isDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
