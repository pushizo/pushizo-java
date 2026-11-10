// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebPersonalizationDtoConditionsUrlRulesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebPersonalizationDtoConditionsUrlRulesItem {
    /**
     * Zorunlu. Değerler: "equals", "contains", "starts_with", "not_contains", "matches".
     */
    @JsonProperty("op")
    private String op;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    public String getOp() {
        return op;
    }

    public UpdateWebPersonalizationDtoConditionsUrlRulesItem op(String op) {
        this.op = op;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UpdateWebPersonalizationDtoConditionsUrlRulesItem value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
