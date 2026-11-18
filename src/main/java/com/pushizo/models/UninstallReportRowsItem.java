// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UninstallReportRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UninstallReportRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("uninstalls")
    private Long uninstalls;

    public String getDate() {
        return date;
    }

    public UninstallReportRowsItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getUninstalls() {
        return uninstalls;
    }

    public UninstallReportRowsItem uninstalls(Long uninstalls) {
        this.uninstalls = uninstalls;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
