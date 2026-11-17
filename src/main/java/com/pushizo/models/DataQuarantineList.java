// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataQuarantineList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataQuarantineList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<DataQuarantineListDataItem> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_cursor")
    private String nextCursor;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_more")
    private Boolean hasMore;

    /**
     * Zorunlu.
     */
    @JsonProperty("pending_total")
    private Long pendingTotal;

    public java.util.List<DataQuarantineListDataItem> getData() {
        return data;
    }

    public DataQuarantineList data(java.util.List<DataQuarantineListDataItem> data) {
        this.data = data;
        return this;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public DataQuarantineList nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public DataQuarantineList hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    public Long getPendingTotal() {
        return pendingTotal;
    }

    public DataQuarantineList pendingTotal(Long pendingTotal) {
        this.pendingTotal = pendingTotal;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
