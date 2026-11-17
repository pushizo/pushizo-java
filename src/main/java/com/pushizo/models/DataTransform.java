// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataTransform şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataTransform {
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
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "event", "person".
     */
    @JsonProperty("target")
    private String target;

    /**
     * Zorunlu. Değerler: "rules", "javascript".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("position")
    private Long position;

    /**
     * Zorunlu. Değerler: "sdk", "api", "import", "system", "webhook_source", "pull_source".
     */
    @JsonProperty("sources")
    private java.util.List<String> sources;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    /**
     * Zorunlu.
     */
    @JsonProperty("rules")
    private java.util.List<java.util.Map<String, Object>> rules;

    /**
     * Zorunlu.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_count")
    private Long errorCount;

    /**
     * Zorunlu. Değerler: "mapping_failed", "invalid_path", "cast_failed", "rule_failed", "invalid_output", "js_error", "js_timeout", "js_memory", "js_invalid_return", "sandbox_unavailable", "write_failed".
     */
    @JsonProperty("last_error_code")
    private String lastErrorCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error_at")
    private String lastErrorAt;

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

    public DataTransform id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public DataTransform appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public DataTransform name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DataTransform description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public DataTransform enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public DataTransform target(String target) {
        this.target = target;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public DataTransform kind(String kind) {
        this.kind = kind;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public DataTransform position(Long position) {
        this.position = position;
        return this;
    }

    public java.util.List<String> getSources() {
        return sources;
    }

    public DataTransform sources(java.util.List<String> sources) {
        this.sources = sources;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public DataTransform eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    public java.util.List<java.util.Map<String, Object>> getRules() {
        return rules;
    }

    public DataTransform rules(java.util.List<java.util.Map<String, Object>> rules) {
        this.rules = rules;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DataTransform code(String code) {
        this.code = code;
        return this;
    }

    public Long getErrorCount() {
        return errorCount;
    }

    public DataTransform errorCount(Long errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    public String getLastErrorCode() {
        return lastErrorCode;
    }

    public DataTransform lastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
        return this;
    }

    public String getLastErrorAt() {
        return lastErrorAt;
    }

    public DataTransform lastErrorAt(String lastErrorAt) {
        this.lastErrorAt = lastErrorAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DataTransform createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DataTransform updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
