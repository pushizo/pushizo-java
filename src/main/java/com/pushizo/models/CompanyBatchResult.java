// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CompanyBatchResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CompanyBatchResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("created")
    private Long created;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated")
    private Long updated;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<CompanyBatchResultDataItem> data;

    public Long getCreated() {
        return created;
    }

    public CompanyBatchResult created(Long created) {
        this.created = created;
        return this;
    }

    public Long getUpdated() {
        return updated;
    }

    public CompanyBatchResult updated(Long updated) {
        this.updated = updated;
        return this;
    }

    public java.util.List<CompanyBatchResultDataItem> getData() {
        return data;
    }

    public CompanyBatchResult data(java.util.List<CompanyBatchResultDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
