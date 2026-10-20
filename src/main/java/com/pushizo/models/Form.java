// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Form şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Form {
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
     * Zorunlu. Değerler: "active", "archived".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("fields")
    private java.util.List<FormFieldsItem> fields;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private FormSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private FormStats stats;

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

    public Form id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Form appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Form name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Form status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<FormFieldsItem> getFields() {
        return fields;
    }

    public Form fields(java.util.List<FormFieldsItem> fields) {
        this.fields = fields;
        return this;
    }

    public FormSettings getSettings() {
        return settings;
    }

    public Form settings(FormSettings settings) {
        this.settings = settings;
        return this;
    }

    public FormStats getStats() {
        return stats;
    }

    public Form stats(FormStats stats) {
        this.stats = stats;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Form createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Form updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
