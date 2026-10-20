// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaignConditionsVisits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaignConditionsVisits {
    /**
     * Zorunlu. Değerler: "gte", "lte", "eq".
     */
    @JsonProperty("op")
    private String op;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private Long value;

    public String getOp() {
        return op;
    }

    public WebCampaignConditionsVisits op(String op) {
        this.op = op;
        return this;
    }

    public Long getValue() {
        return value;
    }

    public WebCampaignConditionsVisits value(Long value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
