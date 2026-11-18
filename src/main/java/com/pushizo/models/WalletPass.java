// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WalletPass şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WalletPass {
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
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

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
     * Zorunlu. Değerler: "active", "voided".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("apple_url")
    private String appleUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("google_url")
    private String googleUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("apple_devices")
    private Long appleDevices;

    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

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

    public WalletPass id(String id) {
        this.id = id;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public WalletPass templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public WalletPass userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public WalletPass externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getBarcodeValue() {
        return barcodeValue;
    }

    public WalletPass barcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
        return this;
    }

    public java.util.Map<String, String> getValues() {
        return values;
    }

    public WalletPass values(java.util.Map<String, String> values) {
        this.values = values;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WalletPass status(String status) {
        this.status = status;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public WalletPass url(String url) {
        this.url = url;
        return this;
    }

    public String getAppleUrl() {
        return appleUrl;
    }

    public WalletPass appleUrl(String appleUrl) {
        this.appleUrl = appleUrl;
        return this;
    }

    public String getGoogleUrl() {
        return googleUrl;
    }

    public WalletPass googleUrl(String googleUrl) {
        this.googleUrl = googleUrl;
        return this;
    }

    public Long getAppleDevices() {
        return appleDevices;
    }

    public WalletPass appleDevices(Long appleDevices) {
        this.appleDevices = appleDevices;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public WalletPass version(Long version) {
        this.version = version;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WalletPass createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public WalletPass updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
