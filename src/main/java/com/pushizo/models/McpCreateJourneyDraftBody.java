// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * McpCreateJourneyDraftBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class McpCreateJourneyDraftBody {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * React Flow uyumlu journey grafı: { nodes: [{ id, type, position, data }], edges: [{ id, source, target, sourceHandle }] } (docs/journeys.md)
     */
    @JsonProperty("graph")
    private McpCreateJourneyDraftBodyGraph graph;

    /**
     * Yeniden giriş, yalnızca yeni girenler, çıkış kuralları, çıkış tag'leri, hedefler, takvim (docs/journeys.md)
     */
    @JsonProperty("settings")
    private java.util.Map<String, Object> settings;

    public String getName() {
        return name;
    }

    public McpCreateJourneyDraftBody name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public McpCreateJourneyDraftBody description(String description) {
        this.description = description;
        return this;
    }

    public McpCreateJourneyDraftBodyGraph getGraph() {
        return graph;
    }

    public McpCreateJourneyDraftBody graph(McpCreateJourneyDraftBodyGraph graph) {
        this.graph = graph;
        return this;
    }

    public java.util.Map<String, Object> getSettings() {
        return settings;
    }

    public McpCreateJourneyDraftBody settings(java.util.Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
