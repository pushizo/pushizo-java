// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignDelivery şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignDelivery {
    /**
     * Değerler: "immediate", "per_user_timezone", "optimized".
     */
    @JsonProperty("timezone_mode")
    private String timezoneMode;

    @JsonProperty("delivery_time_of_day")
    private String deliveryTimeOfDay;

    @JsonProperty("throttle_per_minute")
    private Long throttlePerMinute;

    @JsonProperty("ttl")
    private Long ttl;

    /**
     * Değerler: 5, 10.
     */
    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("collapse_id")
    private String collapseId;

    @JsonProperty("frequency_cap_exempt")
    private Boolean frequencyCapExempt;

    @JsonProperty("global_control_exempt")
    private Boolean globalControlExempt;

    @JsonProperty("quiet_hours_exempt")
    private Boolean quietHoursExempt;

    @JsonProperty("one_per_user")
    private Boolean onePerUser;

    public String getTimezoneMode() {
        return timezoneMode;
    }

    public CampaignDelivery timezoneMode(String timezoneMode) {
        this.timezoneMode = timezoneMode;
        return this;
    }

    public String getDeliveryTimeOfDay() {
        return deliveryTimeOfDay;
    }

    public CampaignDelivery deliveryTimeOfDay(String deliveryTimeOfDay) {
        this.deliveryTimeOfDay = deliveryTimeOfDay;
        return this;
    }

    public Long getThrottlePerMinute() {
        return throttlePerMinute;
    }

    public CampaignDelivery throttlePerMinute(Long throttlePerMinute) {
        this.throttlePerMinute = throttlePerMinute;
        return this;
    }

    public Long getTtl() {
        return ttl;
    }

    public CampaignDelivery ttl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public CampaignDelivery priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getCollapseId() {
        return collapseId;
    }

    public CampaignDelivery collapseId(String collapseId) {
        this.collapseId = collapseId;
        return this;
    }

    public Boolean getFrequencyCapExempt() {
        return frequencyCapExempt;
    }

    public CampaignDelivery frequencyCapExempt(Boolean frequencyCapExempt) {
        this.frequencyCapExempt = frequencyCapExempt;
        return this;
    }

    public Boolean getGlobalControlExempt() {
        return globalControlExempt;
    }

    public CampaignDelivery globalControlExempt(Boolean globalControlExempt) {
        this.globalControlExempt = globalControlExempt;
        return this;
    }

    public Boolean getQuietHoursExempt() {
        return quietHoursExempt;
    }

    public CampaignDelivery quietHoursExempt(Boolean quietHoursExempt) {
        this.quietHoursExempt = quietHoursExempt;
        return this;
    }

    public Boolean getOnePerUser() {
        return onePerUser;
    }

    public CampaignDelivery onePerUser(Boolean onePerUser) {
        this.onePerUser = onePerUser;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
