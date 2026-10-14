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

    @JsonProperty("outcome_unique")
    private Boolean outcomeUnique;

    @JsonProperty("outcome_unattributed")
    private Boolean outcomeUnattributed;

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

    public Boolean getOutcomeUnique() {
        return outcomeUnique;
    }

    public PatchEventDefinitionDto outcomeUnique(Boolean outcomeUnique) {
        this.outcomeUnique = outcomeUnique;
        return this;
    }

    public Boolean getOutcomeUnattributed() {
        return outcomeUnattributed;
    }

    public PatchEventDefinitionDto outcomeUnattributed(Boolean outcomeUnattributed) {
        this.outcomeUnattributed = outcomeUnattributed;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
