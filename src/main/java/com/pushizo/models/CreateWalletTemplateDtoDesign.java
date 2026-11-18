// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWalletTemplateDtoDesign şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWalletTemplateDtoDesign {
    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("organization")
    private String organization;

    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("foreground_color")
    private String foregroundColor;

    @JsonProperty("label_color")
    private String labelColor;

    /**
     * Değerler: "qr", "pdf417", "aztec", "code128".
     */
    @JsonProperty("barcode")
    private String barcode;

    @JsonProperty("fields")
    private java.util.List<CreateWalletTemplateDtoDesignFieldsItem> fields;

    @JsonProperty("expires_at")
    private String expiresAt;

    @JsonProperty("relevant_at")
    private String relevantAt;

    public String getTitle() {
        return title;
    }

    public CreateWalletTemplateDtoDesign title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateWalletTemplateDtoDesign description(String description) {
        this.description = description;
        return this;
    }

    public String getOrganization() {
        return organization;
    }

    public CreateWalletTemplateDtoDesign organization(String organization) {
        this.organization = organization;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public CreateWalletTemplateDtoDesign backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getForegroundColor() {
        return foregroundColor;
    }

    public CreateWalletTemplateDtoDesign foregroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
        return this;
    }

    public String getLabelColor() {
        return labelColor;
    }

    public CreateWalletTemplateDtoDesign labelColor(String labelColor) {
        this.labelColor = labelColor;
        return this;
    }

    public String getBarcode() {
        return barcode;
    }

    public CreateWalletTemplateDtoDesign barcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public java.util.List<CreateWalletTemplateDtoDesignFieldsItem> getFields() {
        return fields;
    }

    public CreateWalletTemplateDtoDesign fields(java.util.List<CreateWalletTemplateDtoDesignFieldsItem> fields) {
        this.fields = fields;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public CreateWalletTemplateDtoDesign expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getRelevantAt() {
        return relevantAt;
    }

    public CreateWalletTemplateDtoDesign relevantAt(String relevantAt) {
        this.relevantAt = relevantAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
