// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWalletTemplateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWalletTemplateDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "active", "archived".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("design")
    private UpdateWalletTemplateDtoDesign design;

    @JsonProperty("images")
    private java.util.Map<String, String> images;

    public String getName() {
        return name;
    }

    public UpdateWalletTemplateDto name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdateWalletTemplateDto status(String status) {
        this.status = status;
        return this;
    }

    public UpdateWalletTemplateDtoDesign getDesign() {
        return design;
    }

    public UpdateWalletTemplateDto design(UpdateWalletTemplateDtoDesign design) {
        this.design = design;
        return this;
    }

    public java.util.Map<String, String> getImages() {
        return images;
    }

    public UpdateWalletTemplateDto images(java.util.Map<String, String> images) {
        this.images = images;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
