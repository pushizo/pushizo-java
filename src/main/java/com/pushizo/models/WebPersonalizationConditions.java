// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebPersonalizationConditions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebPersonalizationConditions {
    @JsonProperty("url_rules")
    private java.util.List<WebPersonalizationConditionsUrlRulesItem> urlRules;

    @JsonProperty("utm_rules")
    private java.util.List<WebPersonalizationConditionsUtmRulesItem> utmRules;

    @JsonProperty("visits")
    private WebPersonalizationConditionsVisits visits;

    public java.util.List<WebPersonalizationConditionsUrlRulesItem> getUrlRules() {
        return urlRules;
    }

    public WebPersonalizationConditions urlRules(java.util.List<WebPersonalizationConditionsUrlRulesItem> urlRules) {
        this.urlRules = urlRules;
        return this;
    }

    public java.util.List<WebPersonalizationConditionsUtmRulesItem> getUtmRules() {
        return utmRules;
    }

    public WebPersonalizationConditions utmRules(java.util.List<WebPersonalizationConditionsUtmRulesItem> utmRules) {
        this.utmRules = utmRules;
        return this;
    }

    public WebPersonalizationConditionsVisits getVisits() {
        return visits;
    }

    public WebPersonalizationConditions visits(WebPersonalizationConditionsVisits visits) {
        this.visits = visits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
