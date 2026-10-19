// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * React Flow uyumlu journey grafı: { nodes: [{ id, type, position, data }], edges: [{ id, source, target, sourceHandle }] } (docs/journeys.md)
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneysCreateBodyGraph {
    /**
     * Zorunlu.
     */
    @JsonProperty("nodes")
    private java.util.List<java.util.Map<String, Object>> nodes;

    /**
     * Zorunlu.
     */
    @JsonProperty("edges")
    private java.util.List<java.util.Map<String, Object>> edges;

    public java.util.List<java.util.Map<String, Object>> getNodes() {
        return nodes;
    }

    public JourneysCreateBodyGraph nodes(java.util.List<java.util.Map<String, Object>> nodes) {
        this.nodes = nodes;
        return this;
    }

    public java.util.List<java.util.Map<String, Object>> getEdges() {
        return edges;
    }

    public JourneysCreateBodyGraph edges(java.util.List<java.util.Map<String, Object>> edges) {
        this.edges = edges;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
