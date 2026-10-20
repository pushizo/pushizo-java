// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyResponseResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyResponseResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu.
     */
    @JsonProperty("response_id")
    private String responseId;

    /**
     * Zorunlu.
     */
    @JsonProperty("duplicate")
    private Boolean duplicate;

    /**
     * Zorunlu.
     */
    @JsonProperty("thank_you")
    private String thankYou;

    public Boolean getOk() {
        return ok;
    }

    public SurveyResponseResult ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getResponseId() {
        return responseId;
    }

    public SurveyResponseResult responseId(String responseId) {
        this.responseId = responseId;
        return this;
    }

    public Boolean getDuplicate() {
        return duplicate;
    }

    public SurveyResponseResult duplicate(Boolean duplicate) {
        this.duplicate = duplicate;
        return this;
    }

    public String getThankYou() {
        return thankYou;
    }

    public SurveyResponseResult thankYou(String thankYou) {
        this.thankYou = thankYou;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
