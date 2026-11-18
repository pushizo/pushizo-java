// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CompanyMemberBatchResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CompanyMemberBatchResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("added")
    private Long added;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated")
    private Long updated;

    /**
     * Zorunlu.
     */
    @JsonProperty("not_found")
    private java.util.List<CompanyMemberBatchResultNotFoundItem> notFound;

    public Long getAdded() {
        return added;
    }

    public CompanyMemberBatchResult added(Long added) {
        this.added = added;
        return this;
    }

    public Long getUpdated() {
        return updated;
    }

    public CompanyMemberBatchResult updated(Long updated) {
        this.updated = updated;
        return this;
    }

    public java.util.List<CompanyMemberBatchResultNotFoundItem> getNotFound() {
        return notFound;
    }

    public CompanyMemberBatchResult notFound(java.util.List<CompanyMemberBatchResultNotFoundItem> notFound) {
        this.notFound = notFound;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
