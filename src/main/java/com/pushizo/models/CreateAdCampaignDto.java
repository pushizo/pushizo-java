// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAdCampaignDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAdCampaignDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("ad_account_id")
    private String adAccountId;

    /**
     * Zorunlu.
     */
    @JsonProperty("audience_id")
    private String audienceId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "traffic", "conversions", "leads", "awareness".
     */
    @JsonProperty("objective")
    private String objective;

    /**
     * Değerler: "clicks", "landing_page_views", "conversions", "reach", "impressions".
     */
    @JsonProperty("optimization_goal")
    private String optimizationGoal;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily_budget")
    private Object dailyBudget;

    @JsonProperty("start_at")
    private String startAt;

    @JsonProperty("end_at")
    private String endAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("countries")
    private java.util.List<String> countries;

    /**
     * Değerler: "active", "paused".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("pixel_id")
    private String pixelId;

    @JsonProperty("creative")
    private CreateAdCampaignDtoCreative creative;

    public String getAdAccountId() {
        return adAccountId;
    }

    public CreateAdCampaignDto adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getAudienceId() {
        return audienceId;
    }

    public CreateAdCampaignDto audienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAdCampaignDto name(String name) {
        this.name = name;
        return this;
    }

    public String getObjective() {
        return objective;
    }

    public CreateAdCampaignDto objective(String objective) {
        this.objective = objective;
        return this;
    }

    public String getOptimizationGoal() {
        return optimizationGoal;
    }

    public CreateAdCampaignDto optimizationGoal(String optimizationGoal) {
        this.optimizationGoal = optimizationGoal;
        return this;
    }

    public Object getDailyBudget() {
        return dailyBudget;
    }

    public CreateAdCampaignDto dailyBudget(Object dailyBudget) {
        this.dailyBudget = dailyBudget;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public CreateAdCampaignDto startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public CreateAdCampaignDto endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public java.util.List<String> getCountries() {
        return countries;
    }

    public CreateAdCampaignDto countries(java.util.List<String> countries) {
        this.countries = countries;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CreateAdCampaignDto status(String status) {
        this.status = status;
        return this;
    }

    public String getPixelId() {
        return pixelId;
    }

    public CreateAdCampaignDto pixelId(String pixelId) {
        this.pixelId = pixelId;
        return this;
    }

    public CreateAdCampaignDtoCreative getCreative() {
        return creative;
    }

    public CreateAdCampaignDto creative(CreateAdCampaignDtoCreative creative) {
        this.creative = creative;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
