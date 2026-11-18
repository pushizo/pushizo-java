// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignPreflightReportFindingsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignPreflightReportFindingsItem {
    /**
     * Zorunlu. Değerler: "brand_name_casing", "off_brand_color", "off_brand_font", "banned_phrase", "phishing_term", "link_invalid", "link_insecure_http", "link_unsafe_host", "link_shortener", "link_missing_utm", "link_broken", "link_unreachable", "liquid_syntax_error", "liquid_missing_default", "liquid_unknown_variable", "liquid_undefined_property", "commercial_no_category", "iys_sms_filter_informational", "sms_missing_opt_out", "email_missing_postal_address", "send_time_outside_hours".
     */
    @JsonProperty("code")
    private String code;

    /**
     * Zorunlu. Değerler: "brand", "content", "links", "personalization", "compliance".
     */
    @JsonProperty("category")
    private String category;

    /**
     * Zorunlu. Değerler: "critical", "warning", "info".
     */
    @JsonProperty("severity")
    private String severity;

    @JsonProperty("field")
    private String field;

    @JsonProperty("params")
    private java.util.Map<String, Object> params;

    public String getCode() {
        return code;
    }

    public CampaignPreflightReportFindingsItem code(String code) {
        this.code = code;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CampaignPreflightReportFindingsItem category(String category) {
        this.category = category;
        return this;
    }

    public String getSeverity() {
        return severity;
    }

    public CampaignPreflightReportFindingsItem severity(String severity) {
        this.severity = severity;
        return this;
    }

    public String getField() {
        return field;
    }

    public CampaignPreflightReportFindingsItem field(String field) {
        this.field = field;
        return this;
    }

    public java.util.Map<String, Object> getParams() {
        return params;
    }

    public CampaignPreflightReportFindingsItem params(java.util.Map<String, Object> params) {
        this.params = params;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
