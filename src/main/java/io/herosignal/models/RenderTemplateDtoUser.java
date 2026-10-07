// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDtoUser şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDtoUser {
    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    public String getExternalId() {
        return externalId;
    }

    public RenderTemplateDtoUser externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public RenderTemplateDtoUser tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public RenderTemplateDtoUser properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
