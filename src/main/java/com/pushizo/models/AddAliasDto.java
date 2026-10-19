// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddAliasDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AddAliasDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("identity")
    private java.util.Map<String, String> identity;

    public java.util.Map<String, String> getIdentity() {
        return identity;
    }

    public AddAliasDto identity(java.util.Map<String, String> identity) {
        this.identity = identity;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
