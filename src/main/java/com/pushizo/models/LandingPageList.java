// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<LandingPageListDataItem> data;

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

    public java.util.List<LandingPageListDataItem> getData() {
        return data;
    }

    public LandingPageList data(java.util.List<LandingPageListDataItem> data) {
        this.data = data;
        return this;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public LandingPageList nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public LandingPageList hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
