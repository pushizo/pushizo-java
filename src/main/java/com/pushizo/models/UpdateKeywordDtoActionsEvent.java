// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateKeywordDtoActionsEvent şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateKeywordDtoActionsEvent {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("properties")
    private java.util.Map<String, String> properties;

    public String getName() {
        return name;
    }

    public UpdateKeywordDtoActionsEvent name(String name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    public UpdateKeywordDtoActionsEvent properties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
