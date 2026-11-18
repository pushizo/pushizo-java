// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UninstallReportPrevious şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UninstallReportPrevious {
    /**
     * Zorunlu.
     */
    @JsonProperty("uninstalls")
    private Long uninstalls;

    /**
     * Zorunlu.
     */
    @JsonProperty("active")
    private Long active;

    /**
     * Zorunlu.
     */
    @JsonProperty("rate")
    private Double rate;

    public Long getUninstalls() {
        return uninstalls;
    }

    public UninstallReportPrevious uninstalls(Long uninstalls) {
        this.uninstalls = uninstalls;
        return this;
    }

    public Long getActive() {
        return active;
    }

    public UninstallReportPrevious active(Long active) {
        this.active = active;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public UninstallReportPrevious rate(Double rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
