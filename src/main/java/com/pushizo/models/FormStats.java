// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FormStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FormStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("submissions")
    private Long submissions;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_submission_at")
    private String lastSubmissionAt;

    public Long getSubmissions() {
        return submissions;
    }

    public FormStats submissions(Long submissions) {
        this.submissions = submissions;
        return this;
    }

    public String getLastSubmissionAt() {
        return lastSubmissionAt;
    }

    public FormStats lastSubmissionAt(String lastSubmissionAt) {
        this.lastSubmissionAt = lastSubmissionAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
