// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * McpCreateSegmentDraftBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class McpCreateSegmentDraftBody {
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
    private McpCreateSegmentDraftBodyDefinition definition;

    @JsonProperty("is_dynamic")
    private Boolean isDynamic;

    public String getName() {
        return name;
    }

    public McpCreateSegmentDraftBody name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public McpCreateSegmentDraftBody description(String description) {
        this.description = description;
        return this;
    }

    public McpCreateSegmentDraftBodyDefinition getDefinition() {
        return definition;
    }

    public McpCreateSegmentDraftBody definition(McpCreateSegmentDraftBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public McpCreateSegmentDraftBody isDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
