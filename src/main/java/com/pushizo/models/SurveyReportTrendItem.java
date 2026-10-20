// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyReportTrendItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyReportTrendItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("responses")
    private Long responses;

    /**
     * Zorunlu.
     */
    @JsonProperty("promoters")
    private Long promoters;

    /**
     * Zorunlu.
     */
    @JsonProperty("passives")
    private Long passives;

    /**
     * Zorunlu.
     */
    @JsonProperty("detractors")
    private Long detractors;

    /**
     * Zorunlu.
     */
    @JsonProperty("nps")
    private Double nps;

    public String getDate() {
        return date;
    }

    public SurveyReportTrendItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getResponses() {
        return responses;
    }

    public SurveyReportTrendItem responses(Long responses) {
        this.responses = responses;
        return this;
    }

    public Long getPromoters() {
        return promoters;
    }

    public SurveyReportTrendItem promoters(Long promoters) {
        this.promoters = promoters;
        return this;
    }

    public Long getPassives() {
        return passives;
    }

    public SurveyReportTrendItem passives(Long passives) {
        this.passives = passives;
        return this;
    }

    public Long getDetractors() {
        return detractors;
    }

    public SurveyReportTrendItem detractors(Long detractors) {
        this.detractors = detractors;
        return this;
    }

    public Double getNps() {
        return nps;
    }

    public SurveyReportTrendItem nps(Double nps) {
        this.nps = nps;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
