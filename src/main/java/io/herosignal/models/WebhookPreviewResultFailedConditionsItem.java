// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookPreviewResultFailedConditionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookPreviewResultFailedConditionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("field")
    private String field;

    /**
     * Zorunlu.
     */
    @JsonProperty("op")
    private String op;

    @JsonProperty("value")
    private Object value;

    public String getField() {
        return field;
    }

    public WebhookPreviewResultFailedConditionsItem field(String field) {
        this.field = field;
        return this;
    }

    public String getOp() {
        return op;
    }

    public WebhookPreviewResultFailedConditionsItem op(String op) {
        this.op = op;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public WebhookPreviewResultFailedConditionsItem value(Object value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
