// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FormSubmitResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FormSubmitResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu. Değerler: "accepted", "pending_confirmation".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("submission_id")
    private String submissionId;

    /**
     * Zorunlu.
     */
    @JsonProperty("success_message")
    private String successMessage;

    /**
     * Zorunlu.
     */
    @JsonProperty("redirect_url")
    private String redirectUrl;

    public Boolean getOk() {
        return ok;
    }

    public FormSubmitResult ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public FormSubmitResult status(String status) {
        this.status = status;
        return this;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public FormSubmitResult submissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public FormSubmitResult successMessage(String successMessage) {
        this.successMessage = successMessage;
        return this;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public FormSubmitResult redirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
