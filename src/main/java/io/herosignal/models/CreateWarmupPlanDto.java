// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWarmupPlanDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWarmupPlanDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "domain", "ip".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private String target;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("daily_limits")
    private java.util.List<Long> dailyLimits;

    @JsonProperty("curve")
    private CreateWarmupPlanDtoCurve curve;

    @JsonProperty("provider_shares")
    private CreateWarmupPlanDtoProviderShares providerShares;

    @JsonProperty("timezone")
    private String timezone;

    public String getName() {
        return name;
    }

    public CreateWarmupPlanDto name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreateWarmupPlanDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public CreateWarmupPlanDto target(String target) {
        this.target = target;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public CreateWarmupPlanDto startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public java.util.List<Long> getDailyLimits() {
        return dailyLimits;
    }

    public CreateWarmupPlanDto dailyLimits(java.util.List<Long> dailyLimits) {
        this.dailyLimits = dailyLimits;
        return this;
    }

    public CreateWarmupPlanDtoCurve getCurve() {
        return curve;
    }

    public CreateWarmupPlanDto curve(CreateWarmupPlanDtoCurve curve) {
        this.curve = curve;
        return this;
    }

    public CreateWarmupPlanDtoProviderShares getProviderShares() {
        return providerShares;
    }

    public CreateWarmupPlanDto providerShares(CreateWarmupPlanDtoProviderShares providerShares) {
        this.providerShares = providerShares;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public CreateWarmupPlanDto timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
