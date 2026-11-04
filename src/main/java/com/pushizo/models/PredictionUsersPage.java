// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PredictionUsersPage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PredictionUsersPage {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<PredictionUsersPageDataItem> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_cursor")
    private String nextCursor;

    public java.util.List<PredictionUsersPageDataItem> getData() {
        return data;
    }

    public PredictionUsersPage data(java.util.List<PredictionUsersPageDataItem> data) {
        this.data = data;
        return this;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public PredictionUsersPage nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
