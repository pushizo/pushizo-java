// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailHygieneStatusStatus şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailHygieneStatusStatus {
    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("valid")
    private Long valid;

    /**
     * Zorunlu.
     */
    @JsonProperty("invalid")
    private Long invalid;

    /**
     * Zorunlu.
     */
    @JsonProperty("unknown")
    private Long unknown;

    /**
     * Zorunlu.
     */
    @JsonProperty("pending")
    private Long pending;

    /**
     * Zorunlu.
     */
    @JsonProperty("unchecked")
    private Long unchecked;

    /**
     * Zorunlu.
     */
    @JsonProperty("invalid_by_reason")
    private java.util.Map<String, Long> invalidByReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("unsendable")
    private Long unsendable;

    public Long getTotal() {
        return total;
    }

    public EmailHygieneStatusStatus total(Long total) {
        this.total = total;
        return this;
    }

    public Long getValid() {
        return valid;
    }

    public EmailHygieneStatusStatus valid(Long valid) {
        this.valid = valid;
        return this;
    }

    public Long getInvalid() {
        return invalid;
    }

    public EmailHygieneStatusStatus invalid(Long invalid) {
        this.invalid = invalid;
        return this;
    }

    public Long getUnknown() {
        return unknown;
    }

    public EmailHygieneStatusStatus unknown(Long unknown) {
        this.unknown = unknown;
        return this;
    }

    public Long getPending() {
        return pending;
    }

    public EmailHygieneStatusStatus pending(Long pending) {
        this.pending = pending;
        return this;
    }

    public Long getUnchecked() {
        return unchecked;
    }

    public EmailHygieneStatusStatus unchecked(Long unchecked) {
        this.unchecked = unchecked;
        return this;
    }

    public java.util.Map<String, Long> getInvalidByReason() {
        return invalidByReason;
    }

    public EmailHygieneStatusStatus invalidByReason(java.util.Map<String, Long> invalidByReason) {
        this.invalidByReason = invalidByReason;
        return this;
    }

    public Long getUnsendable() {
        return unsendable;
    }

    public EmailHygieneStatusStatus unsendable(Long unsendable) {
        this.unsendable = unsendable;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
