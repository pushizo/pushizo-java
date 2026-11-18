// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebPersonalizationDtoConditions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebPersonalizationDtoConditions {
    @JsonProperty("url_rules")
    private java.util.List<CreateWebPersonalizationDtoConditionsUrlRulesItem> urlRules;

    @JsonProperty("utm_rules")
    private java.util.List<CreateWebPersonalizationDtoConditionsUtmRulesItem> utmRules;

    @JsonProperty("visits")
    private CreateWebPersonalizationDtoConditionsVisits visits;

    public java.util.List<CreateWebPersonalizationDtoConditionsUrlRulesItem> getUrlRules() {
        return urlRules;
    }

    public CreateWebPersonalizationDtoConditions urlRules(java.util.List<CreateWebPersonalizationDtoConditionsUrlRulesItem> urlRules) {
        this.urlRules = urlRules;
        return this;
    }

    public java.util.List<CreateWebPersonalizationDtoConditionsUtmRulesItem> getUtmRules() {
        return utmRules;
    }

    public CreateWebPersonalizationDtoConditions utmRules(java.util.List<CreateWebPersonalizationDtoConditionsUtmRulesItem> utmRules) {
        this.utmRules = utmRules;
        return this;
    }

    public CreateWebPersonalizationDtoConditionsVisits getVisits() {
        return visits;
    }

    public CreateWebPersonalizationDtoConditions visits(CreateWebPersonalizationDtoConditionsVisits visits) {
        this.visits = visits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
