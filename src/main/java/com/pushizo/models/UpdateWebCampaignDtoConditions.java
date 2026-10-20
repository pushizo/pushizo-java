// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebCampaignDtoConditions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebCampaignDtoConditions {
    @JsonProperty("url_rules")
    private java.util.List<UpdateWebCampaignDtoConditionsUrlRulesItem> urlRules;

    @JsonProperty("utm_rules")
    private java.util.List<UpdateWebCampaignDtoConditionsUtmRulesItem> utmRules;

    @JsonProperty("visits")
    private UpdateWebCampaignDtoConditionsVisits visits;

    public java.util.List<UpdateWebCampaignDtoConditionsUrlRulesItem> getUrlRules() {
        return urlRules;
    }

    public UpdateWebCampaignDtoConditions urlRules(java.util.List<UpdateWebCampaignDtoConditionsUrlRulesItem> urlRules) {
        this.urlRules = urlRules;
        return this;
    }

    public java.util.List<UpdateWebCampaignDtoConditionsUtmRulesItem> getUtmRules() {
        return utmRules;
    }

    public UpdateWebCampaignDtoConditions utmRules(java.util.List<UpdateWebCampaignDtoConditionsUtmRulesItem> utmRules) {
        this.utmRules = utmRules;
        return this;
    }

    public UpdateWebCampaignDtoConditionsVisits getVisits() {
        return visits;
    }

    public UpdateWebCampaignDtoConditions visits(UpdateWebCampaignDtoConditionsVisits visits) {
        this.visits = visits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
