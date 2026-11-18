// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AgentUpdateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AgentUpdateDto {
    @JsonProperty("max_concurrent")
    private Long maxConcurrent;

    @JsonProperty("languages")
    private java.util.List<String> languages;

    public Long getMaxConcurrent() {
        return maxConcurrent;
    }

    public AgentUpdateDto maxConcurrent(Long maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
        return this;
    }

    public java.util.List<String> getLanguages() {
        return languages;
    }

    public AgentUpdateDto languages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
