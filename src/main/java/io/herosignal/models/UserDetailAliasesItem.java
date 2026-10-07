// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserDetailAliasesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserDetailAliasesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    public String getLabel() {
        return label;
    }

    public UserDetailAliasesItem label(String label) {
        this.label = label;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UserDetailAliasesItem value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
