// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionReportCohortsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RetentionReportCohortsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("week")
    private String week;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("retention")
    private java.util.List<Double> retention;

    public String getWeek() {
        return week;
    }

    public RetentionReportCohortsItem week(String week) {
        this.week = week;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public RetentionReportCohortsItem users(Long users) {
        this.users = users;
        return this;
    }

    public java.util.List<Double> getRetention() {
        return retention;
    }

    public RetentionReportCohortsItem retention(java.util.List<Double> retention) {
        this.retention = retention;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
