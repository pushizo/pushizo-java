// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentSql şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentSql {
    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Zorunlu.
     */
    @JsonProperty("refresh_interval_minutes")
    private Long refreshIntervalMinutes;

    /**
     * Zorunlu.
     */
    @JsonProperty("refreshed_at")
    private String refreshedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("member_count")
    private Long memberCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    public String getQuery() {
        return query;
    }

    public SegmentSql query(String query) {
        this.query = query;
        return this;
    }

    public Long getRefreshIntervalMinutes() {
        return refreshIntervalMinutes;
    }

    public SegmentSql refreshIntervalMinutes(Long refreshIntervalMinutes) {
        this.refreshIntervalMinutes = refreshIntervalMinutes;
        return this;
    }

    public String getRefreshedAt() {
        return refreshedAt;
    }

    public SegmentSql refreshedAt(String refreshedAt) {
        this.refreshedAt = refreshedAt;
        return this;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public SegmentSql memberCount(Long memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public SegmentSql lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
