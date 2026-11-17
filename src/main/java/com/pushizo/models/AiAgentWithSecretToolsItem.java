// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AiAgentWithSecretToolsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AiAgentWithSecretToolsItem {
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
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("params")
    private java.util.List<AiAgentWithSecretToolsItemParamsItem> params;

    public String getName() {
        return name;
    }

    public AiAgentWithSecretToolsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AiAgentWithSecretToolsItem description(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AiAgentWithSecretToolsItem url(String url) {
        this.url = url;
        return this;
    }

    public java.util.List<AiAgentWithSecretToolsItemParamsItem> getParams() {
        return params;
    }

    public AiAgentWithSecretToolsItem params(java.util.List<AiAgentWithSecretToolsItemParamsItem> params) {
        this.params = params;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
