// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchEventDefinitionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PatchEventDefinitionDto {
    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("is_conversion")
    private Boolean isConversion;

    public String getDisplayName() {
        return displayName;
    }

    public PatchEventDefinitionDto displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public Boolean getIsConversion() {
        return isConversion;
    }

    public PatchEventDefinitionDto isConversion(Boolean isConversion) {
        this.isConversion = isConversion;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
