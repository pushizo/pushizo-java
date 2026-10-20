// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebCampaignDtoConditions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebCampaignDtoConditions {
    @JsonProperty("url_rules")
    private java.util.List<CreateWebCampaignDtoConditionsUrlRulesItem> urlRules;

    @JsonProperty("utm_rules")
    private java.util.List<CreateWebCampaignDtoConditionsUtmRulesItem> utmRules;

    @JsonProperty("visits")
    private CreateWebCampaignDtoConditionsVisits visits;

    public java.util.List<CreateWebCampaignDtoConditionsUrlRulesItem> getUrlRules() {
        return urlRules;
    }

    public CreateWebCampaignDtoConditions urlRules(java.util.List<CreateWebCampaignDtoConditionsUrlRulesItem> urlRules) {
        this.urlRules = urlRules;
        return this;
    }

    public java.util.List<CreateWebCampaignDtoConditionsUtmRulesItem> getUtmRules() {
        return utmRules;
    }

    public CreateWebCampaignDtoConditions utmRules(java.util.List<CreateWebCampaignDtoConditionsUtmRulesItem> utmRules) {
        this.utmRules = utmRules;
        return this;
    }

    public CreateWebCampaignDtoConditionsVisits getVisits() {
        return visits;
    }

    public CreateWebCampaignDtoConditions visits(CreateWebCampaignDtoConditionsVisits visits) {
        this.visits = visits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
