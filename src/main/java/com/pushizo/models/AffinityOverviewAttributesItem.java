// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AffinityOverviewAttributesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AffinityOverviewAttributesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("attribute")
    private String attribute;

    /**
     * Zorunlu.
     */
    @JsonProperty("values")
    private java.util.List<AffinityOverviewAttributesItemValuesItem> values;

    public String getAttribute() {
        return attribute;
    }

    public AffinityOverviewAttributesItem attribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    public java.util.List<AffinityOverviewAttributesItemValuesItem> getValues() {
        return values;
    }

    public AffinityOverviewAttributesItem values(java.util.List<AffinityOverviewAttributesItemValuesItem> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
