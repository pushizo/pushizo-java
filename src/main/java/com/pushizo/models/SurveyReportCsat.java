// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyReportCsat şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyReportCsat {
    /**
     * Zorunlu.
     */
    @JsonProperty("responses")
    private Long responses;

    /**
     * Zorunlu.
     */
    @JsonProperty("average")
    private Double average;

    /**
     * Zorunlu.
     */
    @JsonProperty("distribution")
    private java.util.Map<String, Long> distribution;

    public Long getResponses() {
        return responses;
    }

    public SurveyReportCsat responses(Long responses) {
        this.responses = responses;
        return this;
    }

    public Double getAverage() {
        return average;
    }

    public SurveyReportCsat average(Double average) {
        this.average = average;
        return this;
    }

    public java.util.Map<String, Long> getDistribution() {
        return distribution;
    }

    public SurveyReportCsat distribution(java.util.Map<String, Long> distribution) {
        this.distribution = distribution;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
