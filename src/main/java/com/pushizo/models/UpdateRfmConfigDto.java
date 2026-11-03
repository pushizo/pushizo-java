// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateRfmConfigDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateRfmConfigDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    @JsonProperty("value_property")
    private String valueProperty;

    @JsonProperty("use_monetary")
    private Boolean useMonetary;

    @JsonProperty("window_days")
    private Long windowDays;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateRfmConfigDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public UpdateRfmConfigDto eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    public String getValueProperty() {
        return valueProperty;
    }

    public UpdateRfmConfigDto valueProperty(String valueProperty) {
        this.valueProperty = valueProperty;
        return this;
    }

    public Boolean getUseMonetary() {
        return useMonetary;
    }

    public UpdateRfmConfigDto useMonetary(Boolean useMonetary) {
        this.useMonetary = useMonetary;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public UpdateRfmConfigDto windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
