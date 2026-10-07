// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventDefinition şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventDefinition {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("display_name")
    private String displayName;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties_schema")
    private java.util.Map<String, String> propertiesSchema;

    /**
     * Zorunlu.
     */
    @JsonProperty("is_conversion")
    private Boolean isConversion;

    /**
     * Zorunlu.
     */
    @JsonProperty("first_seen_at")
    private String firstSeenAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_seen_at")
    private String lastSeenAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("count_30d")
    private Long count30d;

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

    public EventDefinition id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public EventDefinition appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public EventDefinition name(String name) {
        this.name = name;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public EventDefinition displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public java.util.Map<String, String> getPropertiesSchema() {
        return propertiesSchema;
    }

    public EventDefinition propertiesSchema(java.util.Map<String, String> propertiesSchema) {
        this.propertiesSchema = propertiesSchema;
        return this;
    }

    public Boolean getIsConversion() {
        return isConversion;
    }

    public EventDefinition isConversion(Boolean isConversion) {
        this.isConversion = isConversion;
        return this;
    }

    public String getFirstSeenAt() {
        return firstSeenAt;
    }

    public EventDefinition firstSeenAt(String firstSeenAt) {
        this.firstSeenAt = firstSeenAt;
        return this;
    }

    public String getLastSeenAt() {
        return lastSeenAt;
    }

    public EventDefinition lastSeenAt(String lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
        return this;
    }

    public Long getCount30d() {
        return count30d;
    }

    public EventDefinition count30d(Long count30d) {
        this.count30d = count30d;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public EventDefinition createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public EventDefinition updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
