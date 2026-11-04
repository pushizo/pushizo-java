// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWalletTemplateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWalletTemplateDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "coupon", "loyalty", "event", "generic".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("design")
    private CreateWalletTemplateDtoDesign design;

    @JsonProperty("images")
    private java.util.Map<String, String> images;

    public String getSlug() {
        return slug;
    }

    public CreateWalletTemplateDto slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateWalletTemplateDto name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreateWalletTemplateDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    public CreateWalletTemplateDtoDesign getDesign() {
        return design;
    }

    public CreateWalletTemplateDto design(CreateWalletTemplateDtoDesign design) {
        this.design = design;
        return this;
    }

    public java.util.Map<String, String> getImages() {
        return images;
    }

    public CreateWalletTemplateDto images(java.util.Map<String, String> images) {
        this.images = images;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
