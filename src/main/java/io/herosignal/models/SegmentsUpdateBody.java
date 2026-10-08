// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** SegmentsUpdateBody şeması (api/openapi.yaml). */
public final class SegmentsUpdateBody {

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "description" alanı. */
    @JsonProperty("description")
    private String description;

    /** "definition" alanı. Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7). */
    @JsonProperty("definition")
    private SegmentsUpdateBodyDefinition definition;

    /** "is_dynamic" alanı. */
    @JsonProperty("is_dynamic")
    private Boolean isDynamic;

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsUpdateBody setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "description" alanı */
    public String getDescription() {
        return description;
    }

    /**
     * "description" alanını ayarlar.
     *
     * @param description yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsUpdateBody setDescription(String description) {
        this.description = description;
        return this;
    }

    /** @return "definition" alanı */
    public SegmentsUpdateBodyDefinition getDefinition() {
        return definition;
    }

    /**
     * "definition" alanını ayarlar.
     *
     * @param definition yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsUpdateBody setDefinition(SegmentsUpdateBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    /** @return "is_dynamic" alanı */
    public Boolean getIsDynamic() {
        return isDynamic;
    }

    /**
     * "is_dynamic" alanını ayarlar.
     *
     * @param isDynamic yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsUpdateBody setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }
}
