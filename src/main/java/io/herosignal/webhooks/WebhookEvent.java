package io.herosignal.webhooks;

import com.fasterxml.jackson.databind.JsonNode;

/** Webhook olayı. {@link #getData()} olay tipine göre değişen yüktür. */
public final class WebhookEvent {
    private final String id;
    private final String type;
    private final String createdAt;
    private final String appId;
    private final JsonNode data;

    private WebhookEvent(String id, String type, String createdAt, String appId, JsonNode data) {
        this.id = id;
        this.type = type;
        this.createdAt = createdAt;
        this.appId = appId;
        this.data = data;
    }

    static WebhookEvent from(JsonNode node) {
        return new WebhookEvent(text(node, "id"), text(node, "type"), text(node, "created_at"), text(node, "app_id"), node.get("data"));
    }

    private static String text(JsonNode node, String field) {
        JsonNode v = node.get(field);
        return v == null || v.isNull() ? null : v.asText();
    }

    /** @return olay kimliği ({@code whe_…}); tekrarları ayıklamak için */
    public String getId() {
        return id;
    }

    /** @return olay tipi (ör. {@code user.created}) */
    public String getType() {
        return type;
    }

    /** @return oluşturulma zamanı (ISO 8601) */
    public String getCreatedAt() {
        return createdAt;
    }

    /** @return app kimliği */
    public String getAppId() {
        return appId;
    }

    /** @return olay verisi (JSON) */
    public JsonNode getData() {
        return data;
    }
}
