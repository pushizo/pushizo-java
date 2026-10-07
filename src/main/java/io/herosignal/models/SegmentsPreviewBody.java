// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentsPreviewBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentsPreviewBody {
    /**
     * Zorunlu. Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7).
     */
    @JsonProperty("definition")
    private SegmentsPreviewBodyDefinition definition;

    @JsonProperty("limit")
    private Long limit;

    public SegmentsPreviewBodyDefinition getDefinition() {
        return definition;
    }

    public SegmentsPreviewBody definition(SegmentsPreviewBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public SegmentsPreviewBody limit(Long limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
