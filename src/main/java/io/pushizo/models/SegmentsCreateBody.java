// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentsCreateBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentsCreateBody {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu. Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7).
     */
    @JsonProperty("definition")
    private SegmentsCreateBodyDefinition definition;

    @JsonProperty("is_dynamic")
    private Boolean isDynamic;

    public String getName() {
        return name;
    }

    public SegmentsCreateBody name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SegmentsCreateBody description(String description) {
        this.description = description;
        return this;
    }

    public SegmentsCreateBodyDefinition getDefinition() {
        return definition;
    }

    public SegmentsCreateBody definition(SegmentsCreateBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public SegmentsCreateBody isDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
