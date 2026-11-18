// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WalletTemplate şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WalletTemplate {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

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
     * Zorunlu. Değerler: "active", "archived".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("design")
    private WalletTemplateDesign design;

    /**
     * Zorunlu.
     */
    @JsonProperty("images")
    private java.util.List<String> images;

    /**
     * Zorunlu.
     */
    @JsonProperty("passes")
    private Long passes;

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

    public WalletTemplate id(String id) {
        this.id = id;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public WalletTemplate slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getName() {
        return name;
    }

    public WalletTemplate name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public WalletTemplate kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WalletTemplate status(String status) {
        this.status = status;
        return this;
    }

    public WalletTemplateDesign getDesign() {
        return design;
    }

    public WalletTemplate design(WalletTemplateDesign design) {
        this.design = design;
        return this;
    }

    public java.util.List<String> getImages() {
        return images;
    }

    public WalletTemplate images(java.util.List<String> images) {
        this.images = images;
        return this;
    }

    public Long getPasses() {
        return passes;
    }

    public WalletTemplate passes(Long passes) {
        this.passes = passes;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WalletTemplate createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public WalletTemplate updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
