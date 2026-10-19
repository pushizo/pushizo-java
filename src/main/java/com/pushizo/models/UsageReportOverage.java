// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReportOverage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReportOverage {
    /**
     * Zorunlu.
     */
    @JsonProperty("lines")
    private java.util.List<UsageReportOverageLinesItem> lines;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private UsageReportOverageTotals totals;

    public java.util.List<UsageReportOverageLinesItem> getLines() {
        return lines;
    }

    public UsageReportOverage lines(java.util.List<UsageReportOverageLinesItem> lines) {
        this.lines = lines;
        return this;
    }

    public UsageReportOverageTotals getTotals() {
        return totals;
    }

    public UsageReportOverage totals(UsageReportOverageTotals totals) {
        this.totals = totals;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
