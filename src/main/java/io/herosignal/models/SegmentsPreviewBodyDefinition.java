// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7). */
public final class SegmentsPreviewBodyDefinition {

    /** "all" alanı. */
    @JsonProperty("all")
    private List<Map<String, Object>> all;

    /** "any" alanı. */
    @JsonProperty("any")
    private List<Map<String, Object>> any;

    /** "none" alanı. */
    @JsonProperty("none")
    private List<Map<String, Object>> none;

    /** @return "all" alanı */
    public List<Map<String, Object>> getAll() {
        return all;
    }

    /**
     * "all" alanını ayarlar.
     *
     * @param all yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsPreviewBodyDefinition setAll(List<Map<String, Object>> all) {
        this.all = all;
        return this;
    }

    /** @return "any" alanı */
    public List<Map<String, Object>> getAny() {
        return any;
    }

    /**
     * "any" alanını ayarlar.
     *
     * @param any yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsPreviewBodyDefinition setAny(List<Map<String, Object>> any) {
        this.any = any;
        return this;
    }

    /** @return "none" alanı */
    public List<Map<String, Object>> getNone() {
        return none;
    }

    /**
     * "none" alanını ayarlar.
     *
     * @param none yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentsPreviewBodyDefinition setNone(List<Map<String, Object>> none) {
        this.none = none;
        return this;
    }
}
