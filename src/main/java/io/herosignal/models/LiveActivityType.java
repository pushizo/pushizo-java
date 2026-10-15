// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LiveActivityType şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LiveActivityType {
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
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("content_state_schema")
    private LiveActivityTypeContentStateSchema contentStateSchema;

    /**
     * Zorunlu.
     */
    @JsonProperty("attributes_schema")
    private LiveActivityTypeAttributesSchema attributesSchema;

    /**
     * Zorunlu.
     */
    @JsonProperty("push_to_start_tokens")
    private Long pushToStartTokens;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public LiveActivityType id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public LiveActivityType name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public LiveActivityType description(String description) {
        this.description = description;
        return this;
    }

    public LiveActivityTypeContentStateSchema getContentStateSchema() {
        return contentStateSchema;
    }

    public LiveActivityType contentStateSchema(LiveActivityTypeContentStateSchema contentStateSchema) {
        this.contentStateSchema = contentStateSchema;
        return this;
    }

    public LiveActivityTypeAttributesSchema getAttributesSchema() {
        return attributesSchema;
    }

    public LiveActivityType attributesSchema(LiveActivityTypeAttributesSchema attributesSchema) {
        this.attributesSchema = attributesSchema;
        return this;
    }

    public Long getPushToStartTokens() {
        return pushToStartTokens;
    }

    public LiveActivityType pushToStartTokens(Long pushToStartTokens) {
        this.pushToStartTokens = pushToStartTokens;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public LiveActivityType createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public LiveActivityType updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
