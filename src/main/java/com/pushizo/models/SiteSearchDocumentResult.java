// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchDocumentResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchDocumentResult {
    /**
     * Zorunlu. Değerler: "created", "updated", "unchanged".
     */
    @JsonProperty("outcome")
    private String outcome;

    /**
     * Zorunlu.
     */
    @JsonProperty("document")
    private SiteSearchDocument document;

    public String getOutcome() {
        return outcome;
    }

    public SiteSearchDocumentResult outcome(String outcome) {
        this.outcome = outcome;
        return this;
    }

    public SiteSearchDocument getDocument() {
        return document;
    }

    public SiteSearchDocumentResult document(SiteSearchDocument document) {
        this.document = document;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
