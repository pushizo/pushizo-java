// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebCampaignDtoConditionsUtmRulesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebCampaignDtoConditionsUtmRulesItem {
    /**
     * Zorunlu. Değerler: "utm_source", "utm_medium", "utm_campaign", "utm_term", "utm_content".
     */
    @JsonProperty("param")
    private String param;

    /**
     * Zorunlu. Değerler: "equals", "contains", "exists".
     */
    @JsonProperty("op")
    private String op;

    @JsonProperty("value")
    private String value;

    public String getParam() {
        return param;
    }

    public CreateWebCampaignDtoConditionsUtmRulesItem param(String param) {
        this.param = param;
        return this;
    }

    public String getOp() {
        return op;
    }

    public CreateWebCampaignDtoConditionsUtmRulesItem op(String op) {
        this.op = op;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CreateWebCampaignDtoConditionsUtmRulesItem value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
