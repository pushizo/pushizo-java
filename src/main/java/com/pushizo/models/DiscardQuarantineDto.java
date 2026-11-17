// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DiscardQuarantineDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DiscardQuarantineDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("ids")
    private java.util.List<String> ids;

    public java.util.List<String> getIds() {
        return ids;
    }

    public DiscardQuarantineDto ids(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
