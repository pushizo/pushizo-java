// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** PatchUserDto şeması (api/openapi.yaml). */
public final class PatchUserDto {

    /** "properties" alanı. */
    @JsonProperty("properties")
    private Map<String, Object> properties;

    /** "tags" alanı. */
    @JsonProperty("tags")
    private Map<String, String> tags;

    /** "deltas" alanı. */
    @JsonProperty("deltas")
    private PatchUserDtoDeltas deltas;

    /** @return "properties" alanı */
    public Map<String, Object> getProperties() {
        return properties;
    }

    /**
     * "properties" alanını ayarlar.
     *
     * @param properties yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDto setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /** @return "tags" alanı */
    public Map<String, String> getTags() {
        return tags;
    }

    /**
     * "tags" alanını ayarlar.
     *
     * @param tags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDto setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /** @return "deltas" alanı */
    public PatchUserDtoDeltas getDeltas() {
        return deltas;
    }

    /**
     * "deltas" alanını ayarlar.
     *
     * @param deltas yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDto setDeltas(PatchUserDtoDeltas deltas) {
        this.deltas = deltas;
        return this;
    }
}
