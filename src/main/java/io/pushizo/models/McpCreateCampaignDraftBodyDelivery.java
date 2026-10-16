// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * McpCreateCampaignDraftBodyDelivery şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class McpCreateCampaignDraftBodyDelivery {
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

    @JsonProperty("quiet_hours_exempt")
    private Boolean quietHoursExempt;

    @JsonProperty("one_per_user")
    private Boolean onePerUser;

    public String getTimezoneMode() {
        return timezoneMode;
    }

    public McpCreateCampaignDraftBodyDelivery timezoneMode(String timezoneMode) {
        this.timezoneMode = timezoneMode;
        return this;
    }

    public String getDeliveryTimeOfDay() {
        return deliveryTimeOfDay;
    }

    public McpCreateCampaignDraftBodyDelivery deliveryTimeOfDay(String deliveryTimeOfDay) {
        this.deliveryTimeOfDay = deliveryTimeOfDay;
        return this;
    }

    public Long getThrottlePerMinute() {
        return throttlePerMinute;
    }

    public McpCreateCampaignDraftBodyDelivery throttlePerMinute(Long throttlePerMinute) {
        this.throttlePerMinute = throttlePerMinute;
        return this;
    }

    public Long getTtl() {
        return ttl;
    }

    public McpCreateCampaignDraftBodyDelivery ttl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public McpCreateCampaignDraftBodyDelivery priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getCollapseId() {
        return collapseId;
    }

    public McpCreateCampaignDraftBodyDelivery collapseId(String collapseId) {
        this.collapseId = collapseId;
        return this;
    }

    public Boolean getFrequencyCapExempt() {
        return frequencyCapExempt;
    }

    public McpCreateCampaignDraftBodyDelivery frequencyCapExempt(Boolean frequencyCapExempt) {
        this.frequencyCapExempt = frequencyCapExempt;
        return this;
    }

    public Boolean getQuietHoursExempt() {
        return quietHoursExempt;
    }

    public McpCreateCampaignDraftBodyDelivery quietHoursExempt(Boolean quietHoursExempt) {
        this.quietHoursExempt = quietHoursExempt;
        return this;
    }

    public Boolean getOnePerUser() {
        return onePerUser;
    }

    public McpCreateCampaignDraftBodyDelivery onePerUser(Boolean onePerUser) {
        this.onePerUser = onePerUser;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
