// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedWalletPassesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedWalletPassesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("template_id")
    private String templateId;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("barcode_value")
    private String barcodeValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("values")
    private java.util.Map<String, String> values;

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

    public UserExportDerivedWalletPassesItem id(String id) {
        this.id = id;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public UserExportDerivedWalletPassesItem templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserExportDerivedWalletPassesItem status(String status) {
        this.status = status;
        return this;
    }

    public String getBarcodeValue() {
        return barcodeValue;
    }

    public UserExportDerivedWalletPassesItem barcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
        return this;
    }

    public java.util.Map<String, String> getValues() {
        return values;
    }

    public UserExportDerivedWalletPassesItem values(java.util.Map<String, String> values) {
        this.values = values;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UserExportDerivedWalletPassesItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserExportDerivedWalletPassesItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
