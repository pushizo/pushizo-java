// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("responses")
    private Long responses;

    /**
     * Zorunlu.
     */
    @JsonProperty("nps")
    private Double nps;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_response_at")
    private String lastResponseAt;

    public Long getResponses() {
        return responses;
    }

    public SurveyStats responses(Long responses) {
        this.responses = responses;
        return this;
    }

    public Double getNps() {
        return nps;
    }

    public SurveyStats nps(Double nps) {
        this.nps = nps;
        return this;
    }

    public String getLastResponseAt() {
        return lastResponseAt;
    }

    public SurveyStats lastResponseAt(String lastResponseAt) {
        this.lastResponseAt = lastResponseAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
