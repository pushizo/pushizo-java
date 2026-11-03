// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PathReportTopPathsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PathReportTopPathsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("path")
    private java.util.List<String> path;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("share")
    private Double share;

    public java.util.List<String> getPath() {
        return path;
    }

    public PathReportTopPathsItem path(java.util.List<String> path) {
        this.path = path;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public PathReportTopPathsItem users(Long users) {
        this.users = users;
        return this;
    }

    public Double getShare() {
        return share;
    }

    public PathReportTopPathsItem share(Double share) {
        this.share = share;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
