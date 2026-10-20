// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FormSubmissionConsentItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FormSubmissionConsentItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("field_id")
    private String fieldId;

    /**
     * Zorunlu.
     */
    @JsonProperty("given")
    private Boolean given;

    /**
     * Zorunlu.
     */
    @JsonProperty("text")
    private String text;

    /**
     * Zorunlu.
     */
    @JsonProperty("text_hash")
    private String textHash;

    /**
     * Zorunlu.
     */
    @JsonProperty("policy_url")
    private String policyUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("at")
    private String at;

    public String getFieldId() {
        return fieldId;
    }

    public FormSubmissionConsentItem fieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    public Boolean getGiven() {
        return given;
    }

    public FormSubmissionConsentItem given(Boolean given) {
        this.given = given;
        return this;
    }

    public String getText() {
        return text;
    }

    public FormSubmissionConsentItem text(String text) {
        this.text = text;
        return this;
    }

    public String getTextHash() {
        return textHash;
    }

    public FormSubmissionConsentItem textHash(String textHash) {
        this.textHash = textHash;
        return this;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public FormSubmissionConsentItem policyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public FormSubmissionConsentItem language(String language) {
        this.language = language;
        return this;
    }

    public String getAt() {
        return at;
    }

    public FormSubmissionConsentItem at(String at) {
        this.at = at;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
