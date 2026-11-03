// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PathBodyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PathBodyDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("event")
    private String event;

    /**
     * Değerler: "after", "before".
     */
    @JsonProperty("direction")
    private String direction;

    @JsonProperty("depth")
    private Long depth;

    @JsonProperty("top")
    private Long top;

    @JsonProperty("window_hours")
    private Long windowHours;

    @JsonProperty("exclude")
    private java.util.List<String> exclude;

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    /**
     * Değerler: "json", "csv".
     */
    @JsonProperty("format")
    private String format;

    public String getEvent() {
        return event;
    }

    public PathBodyDto event(String event) {
        this.event = event;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public PathBodyDto direction(String direction) {
        this.direction = direction;
        return this;
    }

    public Long getDepth() {
        return depth;
    }

    public PathBodyDto depth(Long depth) {
        this.depth = depth;
        return this;
    }

    public Long getTop() {
        return top;
    }

    public PathBodyDto top(Long top) {
        this.top = top;
        return this;
    }

    public Long getWindowHours() {
        return windowHours;
    }

    public PathBodyDto windowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    public java.util.List<String> getExclude() {
        return exclude;
    }

    public PathBodyDto exclude(java.util.List<String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public PathBodyDto from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public PathBodyDto to(String to) {
        this.to = to;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public PathBodyDto format(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
