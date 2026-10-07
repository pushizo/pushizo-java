// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneysCreateBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneysCreateBody {
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
    private JourneysCreateBodyGraph graph;

    /**
     * Yeniden giriş, yalnızca yeni girenler, çıkış kuralları, çıkış tag'leri, hedefler, takvim (docs/journeys.md)
     */
    @JsonProperty("settings")
    private java.util.Map<String, Object> settings;

    public String getName() {
        return name;
    }

    public JourneysCreateBody name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public JourneysCreateBody description(String description) {
        this.description = description;
        return this;
    }

    public JourneysCreateBodyGraph getGraph() {
        return graph;
    }

    public JourneysCreateBody graph(JourneysCreateBodyGraph graph) {
        this.graph = graph;
        return this;
    }

    public java.util.Map<String, Object> getSettings() {
        return settings;
    }

    public JourneysCreateBody settings(java.util.Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
