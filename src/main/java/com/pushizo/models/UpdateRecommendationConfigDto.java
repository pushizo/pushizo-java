// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRecommendationConfigDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateRecommendationConfigDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("view_events")
    private java.util.List<String> viewEvents;

    @JsonProperty("purchase_events")
    private java.util.List<String> purchaseEvents;

    @JsonProperty("item_property")
    private String itemProperty;

    @JsonProperty("window_days")
    private Long windowDays;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateRecommendationConfigDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getViewEvents() {
        return viewEvents;
    }

    public UpdateRecommendationConfigDto viewEvents(java.util.List<String> viewEvents) {
        this.viewEvents = viewEvents;
        return this;
    }

    public java.util.List<String> getPurchaseEvents() {
        return purchaseEvents;
    }

    public UpdateRecommendationConfigDto purchaseEvents(java.util.List<String> purchaseEvents) {
        this.purchaseEvents = purchaseEvents;
        return this;
    }

    public String getItemProperty() {
        return itemProperty;
    }

    public UpdateRecommendationConfigDto itemProperty(String itemProperty) {
        this.itemProperty = itemProperty;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public UpdateRecommendationConfigDto windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
