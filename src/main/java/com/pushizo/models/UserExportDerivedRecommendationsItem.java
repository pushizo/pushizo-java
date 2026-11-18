// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedRecommendationsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedRecommendationsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("catalog_id")
    private String catalogId;

    /**
     * Zorunlu.
     */
    @JsonProperty("personalized")
    private java.util.List<String> personalized;

    /**
     * Zorunlu.
     */
    @JsonProperty("recent")
    private java.util.List<String> recent;

    /**
     * Zorunlu.
     */
    @JsonProperty("purchased")
    private java.util.List<String> purchased;

    /**
     * Zorunlu.
     */
    @JsonProperty("computed_at")
    private String computedAt;

    public String getCatalogId() {
        return catalogId;
    }

    public UserExportDerivedRecommendationsItem catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public java.util.List<String> getPersonalized() {
        return personalized;
    }

    public UserExportDerivedRecommendationsItem personalized(java.util.List<String> personalized) {
        this.personalized = personalized;
        return this;
    }

    public java.util.List<String> getRecent() {
        return recent;
    }

    public UserExportDerivedRecommendationsItem recent(java.util.List<String> recent) {
        this.recent = recent;
        return this;
    }

    public java.util.List<String> getPurchased() {
        return purchased;
    }

    public UserExportDerivedRecommendationsItem purchased(java.util.List<String> purchased) {
        this.purchased = purchased;
        return this;
    }

    public String getComputedAt() {
        return computedAt;
    }

    public UserExportDerivedRecommendationsItem computedAt(String computedAt) {
        this.computedAt = computedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
