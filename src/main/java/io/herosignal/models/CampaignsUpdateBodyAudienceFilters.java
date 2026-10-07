// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsUpdateBodyAudienceFilters {
    @JsonProperty("all")
    private java.util.List<java.util.Map<String, Object>> all;

    @JsonProperty("any")
    private java.util.List<java.util.Map<String, Object>> any;

    @JsonProperty("none")
    private java.util.List<java.util.Map<String, Object>> none;

    public java.util.List<java.util.Map<String, Object>> getAll() {
        return all;
    }

    public CampaignsUpdateBodyAudienceFilters all(java.util.List<java.util.Map<String, Object>> all) {
        this.all = all;
        return this;
    }

    public java.util.List<java.util.Map<String, Object>> getAny() {
        return any;
    }

    public CampaignsUpdateBodyAudienceFilters any(java.util.List<java.util.Map<String, Object>> any) {
        this.any = any;
        return this;
    }

    public java.util.List<java.util.Map<String, Object>> getNone() {
        return none;
    }

    public CampaignsUpdateBodyAudienceFilters none(java.util.List<java.util.Map<String, Object>> none) {
        this.none = none;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
