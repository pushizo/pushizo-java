package io.herosignal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/** Webhook olayı (tekil gövde). Batch gövdesi {@code {"events": [...]}} biçimindedir. */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookEvent {
    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("data")
    private JsonNode data;

    /** Olay kimliği ({@code HeroSignal-Event-Id} ile aynı); tekrarları ayıklamak için kullanın. */
    public String getId() {
        return id;
    }

    /** Olay tipi (ör. {@code delivery.delivered}). */
    public String getType() {
        return type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getAppId() {
        return appId;
    }

    /** Olaya özgü veri. */
    public JsonNode getData() {
        return data;
    }
}
