// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PathReportLevelsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PathReportLevelsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("step")
    private Long step;

    /**
     * Zorunlu.
     */
    @JsonProperty("nodes")
    private java.util.List<PathReportLevelsItemNodesItem> nodes;

    public Long getStep() {
        return step;
    }

    public PathReportLevelsItem step(Long step) {
        this.step = step;
        return this;
    }

    public java.util.List<PathReportLevelsItemNodesItem> getNodes() {
        return nodes;
    }

    public PathReportLevelsItem nodes(java.util.List<PathReportLevelsItemNodesItem> nodes) {
        this.nodes = nodes;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
