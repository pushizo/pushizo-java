// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PathReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PathReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Zorunlu.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Zorunlu.
     */
    @JsonProperty("event")
    private String event;

    /**
     * Zorunlu. Değerler: "after", "before".
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Zorunlu.
     */
    @JsonProperty("window_hours")
    private Long windowHours;

    /**
     * Zorunlu.
     */
    @JsonProperty("total_users")
    private Long totalUsers;

    /**
     * Zorunlu.
     */
    @JsonProperty("truncated")
    private Boolean truncated;

    /**
     * Zorunlu.
     */
    @JsonProperty("levels")
    private java.util.List<PathReportLevelsItem> levels;

    /**
     * Zorunlu.
     */
    @JsonProperty("links")
    private java.util.List<PathReportLinksItem> links;

    /**
     * Zorunlu.
     */
    @JsonProperty("top_paths")
    private java.util.List<PathReportTopPathsItem> topPaths;

    public String getFrom() {
        return from;
    }

    public PathReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public PathReport to(String to) {
        this.to = to;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public PathReport event(String event) {
        this.event = event;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public PathReport direction(String direction) {
        this.direction = direction;
        return this;
    }

    public Long getWindowHours() {
        return windowHours;
    }

    public PathReport windowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    public Long getTotalUsers() {
        return totalUsers;
    }

    public PathReport totalUsers(Long totalUsers) {
        this.totalUsers = totalUsers;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public PathReport truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public java.util.List<PathReportLevelsItem> getLevels() {
        return levels;
    }

    public PathReport levels(java.util.List<PathReportLevelsItem> levels) {
        this.levels = levels;
        return this;
    }

    public java.util.List<PathReportLinksItem> getLinks() {
        return links;
    }

    public PathReport links(java.util.List<PathReportLinksItem> links) {
        this.links = links;
        return this;
    }

    public java.util.List<PathReportTopPathsItem> getTopPaths() {
        return topPaths;
    }

    public PathReport topPaths(java.util.List<PathReportTopPathsItem> topPaths) {
        this.topPaths = topPaths;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
