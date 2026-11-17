// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAiAgentDtoToolsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAiAgentDtoToolsItem {
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

    @JsonProperty("params")
    private java.util.List<CreateAiAgentDtoToolsItemParamsItem> params;

    public String getName() {
        return name;
    }

    public CreateAiAgentDtoToolsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAiAgentDtoToolsItem description(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CreateAiAgentDtoToolsItem url(String url) {
        this.url = url;
        return this;
    }

    public java.util.List<CreateAiAgentDtoToolsItemParamsItem> getParams() {
        return params;
    }

    public CreateAiAgentDtoToolsItem params(java.util.List<CreateAiAgentDtoToolsItemParamsItem> params) {
        this.params = params;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
