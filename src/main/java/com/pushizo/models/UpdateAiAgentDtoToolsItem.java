// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAiAgentDtoToolsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAiAgentDtoToolsItem {
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
    private java.util.List<UpdateAiAgentDtoToolsItemParamsItem> params;

    public String getName() {
        return name;
    }

    public UpdateAiAgentDtoToolsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAiAgentDtoToolsItem description(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public UpdateAiAgentDtoToolsItem url(String url) {
        this.url = url;
        return this;
    }

    public java.util.List<UpdateAiAgentDtoToolsItemParamsItem> getParams() {
        return params;
    }

    public UpdateAiAgentDtoToolsItem params(java.util.List<UpdateAiAgentDtoToolsItemParamsItem> params) {
        this.params = params;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
