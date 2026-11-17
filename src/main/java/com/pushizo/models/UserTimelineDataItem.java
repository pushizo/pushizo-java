// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserTimelineDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserTimelineDataItem {
    /**
     * Zorunlu. Değerler: "event", "delivery".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("at")
    private String at;

    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("detail")
    private String detail;

    public String getKind() {
        return kind;
    }

    public UserTimelineDataItem kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getAt() {
        return at;
    }

    public UserTimelineDataItem at(String at) {
        this.at = at;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public UserTimelineDataItem title(String title) {
        this.title = title;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public UserTimelineDataItem detail(String detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
