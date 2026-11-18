// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchReportZeroResultQueriesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchReportZeroResultQueriesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Zorunlu.
     */
    @JsonProperty("searches")
    private Long searches;

    public String getQuery() {
        return query;
    }

    public SiteSearchReportZeroResultQueriesItem query(String query) {
        this.query = query;
        return this;
    }

    public Long getSearches() {
        return searches;
    }

    public SiteSearchReportZeroResultQueriesItem searches(Long searches) {
        this.searches = searches;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
