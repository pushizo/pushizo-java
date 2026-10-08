// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** SegmentsPreviewBody şeması (api/openapi.yaml). */
public final class SegmentsPreviewBody {

    /** "definition" alanı. Zorunlu. Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7). */
    @JsonProperty("definition")
    private SegmentsPreviewBodyDefinition definition;

    /** "limit" alanı. */
    @JsonProperty("limit")
    private Long limit;

    /** @return "definition" alanı */
    public SegmentsPreviewBodyDefinition getDefinition() {
        return definition;
    }

    /**
     * "definition" alanını ayarlar.
     *
     * @param definition yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsPreviewBody setDefinition(SegmentsPreviewBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    /** @return "limit" alanı */
    public Long getLimit() {
        return limit;
    }

    /**
     * "limit" alanını ayarlar.
     *
     * @param limit yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsPreviewBody setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
}
