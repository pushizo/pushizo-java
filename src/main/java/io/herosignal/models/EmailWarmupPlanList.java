// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailWarmupPlanList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailWarmupPlanList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<EmailWarmupPlan> data;

    public java.util.List<EmailWarmupPlan> getData() {
        return data;
    }

    public EmailWarmupPlanList data(java.util.List<EmailWarmupPlan> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
