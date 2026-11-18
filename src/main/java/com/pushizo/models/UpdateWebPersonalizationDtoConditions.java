// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebPersonalizationDtoConditions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebPersonalizationDtoConditions {
    @JsonProperty("url_rules")
    private java.util.List<UpdateWebPersonalizationDtoConditionsUrlRulesItem> urlRules;

    @JsonProperty("utm_rules")
    private java.util.List<UpdateWebPersonalizationDtoConditionsUtmRulesItem> utmRules;

    @JsonProperty("visits")
    private UpdateWebPersonalizationDtoConditionsVisits visits;

    public java.util.List<UpdateWebPersonalizationDtoConditionsUrlRulesItem> getUrlRules() {
        return urlRules;
    }

    public UpdateWebPersonalizationDtoConditions urlRules(java.util.List<UpdateWebPersonalizationDtoConditionsUrlRulesItem> urlRules) {
        this.urlRules = urlRules;
        return this;
    }

    public java.util.List<UpdateWebPersonalizationDtoConditionsUtmRulesItem> getUtmRules() {
        return utmRules;
    }

    public UpdateWebPersonalizationDtoConditions utmRules(java.util.List<UpdateWebPersonalizationDtoConditionsUtmRulesItem> utmRules) {
        this.utmRules = utmRules;
        return this;
    }

    public UpdateWebPersonalizationDtoConditionsVisits getVisits() {
        return visits;
    }

    public UpdateWebPersonalizationDtoConditions visits(UpdateWebPersonalizationDtoConditionsVisits visits) {
        this.visits = visits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
