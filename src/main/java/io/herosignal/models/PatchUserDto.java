// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchUserDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PatchUserDto {
    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    @JsonProperty("deltas")
    private PatchUserDtoDeltas deltas;

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public PatchUserDto properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public PatchUserDto tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public PatchUserDtoDeltas getDeltas() {
        return deltas;
    }

    public PatchUserDto deltas(PatchUserDtoDeltas deltas) {
        this.deltas = deltas;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
