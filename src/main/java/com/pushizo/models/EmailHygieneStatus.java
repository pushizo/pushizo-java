// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailHygieneStatus şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailHygieneStatus {
    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private EmailHygieneStatusStatus status;

    /**
     * Zorunlu.
     */
    @JsonProperty("latest_run")
    private EmailHygieneRun latestRun;

    public EmailHygieneStatusStatus getStatus() {
        return status;
    }

    public EmailHygieneStatus status(EmailHygieneStatusStatus status) {
        this.status = status;
        return this;
    }

    public EmailHygieneRun getLatestRun() {
        return latestRun;
    }

    public EmailHygieneStatus latestRun(EmailHygieneRun latestRun) {
        this.latestRun = latestRun;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
