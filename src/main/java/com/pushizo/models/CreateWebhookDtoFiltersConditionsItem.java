// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebhookDtoFiltersConditionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebhookDtoFiltersConditionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("field")
    private String field;

    /**
     * Zorunlu. Değerler: "eq", "neq", "in", "not_in", "starts_with", "contains", "exists", "not_exists".
     */
    @JsonProperty("op")
    private String op;

    @JsonProperty("value")
    private Object value;

    public String getField() {
        return field;
    }

    public CreateWebhookDtoFiltersConditionsItem field(String field) {
        this.field = field;
        return this;
    }

    public String getOp() {
        return op;
    }

    public CreateWebhookDtoFiltersConditionsItem op(String op) {
        this.op = op;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public CreateWebhookDtoFiltersConditionsItem value(Object value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
