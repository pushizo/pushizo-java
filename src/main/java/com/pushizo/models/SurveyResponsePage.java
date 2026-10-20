// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyResponsePage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyResponsePage {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<SurveyResponse> data;

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

    public java.util.List<SurveyResponse> getData() {
        return data;
    }

    public SurveyResponsePage data(java.util.List<SurveyResponse> data) {
        this.data = data;
        return this;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public SurveyResponsePage nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public SurveyResponsePage hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
