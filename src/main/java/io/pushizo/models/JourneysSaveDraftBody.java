// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneysSaveDraftBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneysSaveDraftBody {
    /**
     * Zorunlu. React Flow uyumlu journey grafı: { nodes: [{ id, type, position, data }], edges: [{ id, source, target, sourceHandle }] } (docs/journeys.md)
     */
    @JsonProperty("graph")
    private JourneysSaveDraftBodyGraph graph;

    /**
     * Yeniden giriş, yalnızca yeni girenler, çıkış kuralları, çıkış tag'leri, hedefler, takvim (docs/journeys.md)
     */
    @JsonProperty("settings")
    private java.util.Map<String, Object> settings;

    public JourneysSaveDraftBodyGraph getGraph() {
        return graph;
    }

    public JourneysSaveDraftBody graph(JourneysSaveDraftBodyGraph graph) {
        this.graph = graph;
        return this;
    }

    public java.util.Map<String, Object> getSettings() {
        return settings;
    }

    public JourneysSaveDraftBody settings(java.util.Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
