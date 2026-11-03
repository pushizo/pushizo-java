// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PathReportLinksItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PathReportLinksItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private String target;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    public String getSource() {
        return source;
    }

    public PathReportLinksItem source(String source) {
        this.source = source;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public PathReportLinksItem target(String target) {
        this.target = target;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public PathReportLinksItem users(Long users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
