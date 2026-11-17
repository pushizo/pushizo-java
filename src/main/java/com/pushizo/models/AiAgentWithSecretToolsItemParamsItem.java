// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgentWithSecretToolsItemParamsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgentWithSecretToolsItemParamsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("required")
    private Boolean required;

    public String getName() {
        return name;
    }

    public AiAgentWithSecretToolsItemParamsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AiAgentWithSecretToolsItemParamsItem description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getRequired() {
        return required;
    }

    public AiAgentWithSecretToolsItemParamsItem required(Boolean required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
