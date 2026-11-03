// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PathReportLevelsItemNodesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PathReportLevelsItemNodesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "event", "other", "end".
     */
    @JsonProperty("kind")
    private String kind;

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

    public String getId() {
        return id;
    }

    public PathReportLevelsItemNodesItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PathReportLevelsItemNodesItem name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public PathReportLevelsItemNodesItem kind(String kind) {
        this.kind = kind;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public PathReportLevelsItemNodesItem users(Long users) {
        this.users = users;
        return this;
    }

    public Double getShare() {
        return share;
    }

    public PathReportLevelsItemNodesItem share(Double share) {
        this.share = share;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
