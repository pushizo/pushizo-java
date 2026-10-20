// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCapiConfigEventMappingsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCapiConfigEventMappingsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("event_name")
    private String eventName;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_event")
    private String platformEvent;

    /**
     * Zorunlu.
     */
    @JsonProperty("value_property")
    private String valueProperty;

    /**
     * Zorunlu.
     */
    @JsonProperty("currency_property")
    private String currencyProperty;

    public String getEventName() {
        return eventName;
    }

    public AdCapiConfigEventMappingsItem eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getPlatformEvent() {
        return platformEvent;
    }

    public AdCapiConfigEventMappingsItem platformEvent(String platformEvent) {
        this.platformEvent = platformEvent;
        return this;
    }

    public String getValueProperty() {
        return valueProperty;
    }

    public AdCapiConfigEventMappingsItem valueProperty(String valueProperty) {
        this.valueProperty = valueProperty;
        return this;
    }

    public String getCurrencyProperty() {
        return currencyProperty;
    }

    public AdCapiConfigEventMappingsItem currencyProperty(String currencyProperty) {
        this.currencyProperty = currencyProperty;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
