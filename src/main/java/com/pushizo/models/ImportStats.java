// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImportStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImportStats {
    @JsonProperty("processed")
    private Long processed;

    @JsonProperty("created_users")
    private Long createdUsers;

    @JsonProperty("updated_users")
    private Long updatedUsers;

    @JsonProperty("created_subscriptions")
    private Long createdSubscriptions;

    @JsonProperty("skipped")
    private Long skipped;

    @JsonProperty("errors")
    private Long errors;

    @JsonProperty("rejected_emails")
    private Long rejectedEmails;

    @JsonProperty("rejected_email_reasons")
    private java.util.Map<String, Long> rejectedEmailReasons;

    public Long getProcessed() {
        return processed;
    }

    public ImportStats processed(Long processed) {
        this.processed = processed;
        return this;
    }

    public Long getCreatedUsers() {
        return createdUsers;
    }

    public ImportStats createdUsers(Long createdUsers) {
        this.createdUsers = createdUsers;
        return this;
    }

    public Long getUpdatedUsers() {
        return updatedUsers;
    }

    public ImportStats updatedUsers(Long updatedUsers) {
        this.updatedUsers = updatedUsers;
        return this;
    }

    public Long getCreatedSubscriptions() {
        return createdSubscriptions;
    }

    public ImportStats createdSubscriptions(Long createdSubscriptions) {
        this.createdSubscriptions = createdSubscriptions;
        return this;
    }

    public Long getSkipped() {
        return skipped;
    }

    public ImportStats skipped(Long skipped) {
        this.skipped = skipped;
        return this;
    }

    public Long getErrors() {
        return errors;
    }

    public ImportStats errors(Long errors) {
        this.errors = errors;
        return this;
    }

    public Long getRejectedEmails() {
        return rejectedEmails;
    }

    public ImportStats rejectedEmails(Long rejectedEmails) {
        this.rejectedEmails = rejectedEmails;
        return this;
    }

    public java.util.Map<String, Long> getRejectedEmailReasons() {
        return rejectedEmailReasons;
    }

    public ImportStats rejectedEmailReasons(java.util.Map<String, Long> rejectedEmailReasons) {
        this.rejectedEmailReasons = rejectedEmailReasons;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
