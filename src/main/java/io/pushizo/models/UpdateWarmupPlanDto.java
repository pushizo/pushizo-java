// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWarmupPlanDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWarmupPlanDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "active", "paused".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("daily_limits")
    private java.util.List<Long> dailyLimits;

    @JsonProperty("provider_shares")
    private UpdateWarmupPlanDtoProviderShares providerShares;

    public String getName() {
        return name;
    }

    public UpdateWarmupPlanDto name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdateWarmupPlanDto status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<Long> getDailyLimits() {
        return dailyLimits;
    }

    public UpdateWarmupPlanDto dailyLimits(java.util.List<Long> dailyLimits) {
        this.dailyLimits = dailyLimits;
        return this;
    }

    public UpdateWarmupPlanDtoProviderShares getProviderShares() {
        return providerShares;
    }

    public UpdateWarmupPlanDto providerShares(UpdateWarmupPlanDtoProviderShares providerShares) {
        this.providerShares = providerShares;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
