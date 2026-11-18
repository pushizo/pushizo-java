// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationListCatalogItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class IntegrationListCatalogItem {
    /**
     * Zorunlu. Değerler: "segment", "amplitude", "mixpanel", "ga4", "posthog", "rudderstack", "hubspot", "appsflyer", "adjust", "revenuecat", "zapier", "slack", "activecampaign", "adobe_audience_manager", "salesforce".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.List<String> events;

    /**
     * Zorunlu.
     */
    @JsonProperty("cohorts")
    private Boolean cohorts;

    /**
     * Zorunlu.
     */
    @JsonProperty("inbound")
    private Boolean inbound;

    public String getType() {
        return type;
    }

    public IntegrationListCatalogItem type(String type) {
        this.type = type;
        return this;
    }

    public java.util.List<String> getEvents() {
        return events;
    }

    public IntegrationListCatalogItem events(java.util.List<String> events) {
        this.events = events;
        return this;
    }

    public Boolean getCohorts() {
        return cohorts;
    }

    public IntegrationListCatalogItem cohorts(Boolean cohorts) {
        this.cohorts = cohorts;
        return this;
    }

    public Boolean getInbound() {
        return inbound;
    }

    public IntegrationListCatalogItem inbound(Boolean inbound) {
        this.inbound = inbound;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
