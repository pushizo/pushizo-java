// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaignConditions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaignConditions {
    @JsonProperty("url_rules")
    private java.util.List<WebCampaignConditionsUrlRulesItem> urlRules;

    @JsonProperty("utm_rules")
    private java.util.List<WebCampaignConditionsUtmRulesItem> utmRules;

    @JsonProperty("visits")
    private WebCampaignConditionsVisits visits;

    public java.util.List<WebCampaignConditionsUrlRulesItem> getUrlRules() {
        return urlRules;
    }

    public WebCampaignConditions urlRules(java.util.List<WebCampaignConditionsUrlRulesItem> urlRules) {
        this.urlRules = urlRules;
        return this;
    }

    public java.util.List<WebCampaignConditionsUtmRulesItem> getUtmRules() {
        return utmRules;
    }

    public WebCampaignConditions utmRules(java.util.List<WebCampaignConditionsUtmRulesItem> utmRules) {
        this.utmRules = utmRules;
        return this;
    }

    public WebCampaignConditionsVisits getVisits() {
        return visits;
    }

    public WebCampaignConditions visits(WebCampaignConditionsVisits visits) {
        this.visits = visits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
