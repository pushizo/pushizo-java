// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueWalletPassDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class IssueWalletPassDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("template_id")
    private String templateId;

    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("barcode_value")
    private String barcodeValue;

    @JsonProperty("values")
    private java.util.Map<String, String> values;

    public String getTemplateId() {
        return templateId;
    }

    public IssueWalletPassDto templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public IssueWalletPassDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getBarcodeValue() {
        return barcodeValue;
    }

    public IssueWalletPassDto barcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
        return this;
    }

    public java.util.Map<String, String> getValues() {
        return values;
    }

    public IssueWalletPassDto values(java.util.Map<String, String> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
