// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationTestResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class IntegrationTestResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("run_id")
    private String runId;

    public Boolean getOk() {
        return ok;
    }

    public IntegrationTestResult ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getError() {
        return error;
    }

    public IntegrationTestResult error(String error) {
        this.error = error;
        return this;
    }

    public String getRunId() {
        return runId;
    }

    public IntegrationTestResult runId(String runId) {
        this.runId = runId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
