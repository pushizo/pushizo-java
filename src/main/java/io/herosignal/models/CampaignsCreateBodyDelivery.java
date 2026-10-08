// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CampaignsCreateBodyDelivery şeması (api/openapi.yaml). */
public final class CampaignsCreateBodyDelivery {

    /** "timezone_mode" alanı. Değerler: "immediate", "per_user_timezone", "optimized". */
    @JsonProperty("timezone_mode")
    private String timezoneMode;

    /** "delivery_time_of_day" alanı. */
    @JsonProperty("delivery_time_of_day")
    private String deliveryTimeOfDay;

    /** "throttle_per_minute" alanı. */
    @JsonProperty("throttle_per_minute")
    private Long throttlePerMinute;

    /** "ttl" alanı. */
    @JsonProperty("ttl")
    private Long ttl;

    /** "priority" alanı. Değerler: 5, 10. */
    @JsonProperty("priority")
    private Long priority;

    /** "collapse_id" alanı. */
    @JsonProperty("collapse_id")
    private String collapseId;

    /** "frequency_cap_exempt" alanı. */
    @JsonProperty("frequency_cap_exempt")
    private Boolean frequencyCapExempt;

    /** "quiet_hours_exempt" alanı. */
    @JsonProperty("quiet_hours_exempt")
    private Boolean quietHoursExempt;

    /** "one_per_user" alanı. */
    @JsonProperty("one_per_user")
    private Boolean onePerUser;

    /** @return "timezone_mode" alanı */
    public String getTimezoneMode() {
        return timezoneMode;
    }

    /**
     * "timezone_mode" alanını ayarlar.
     *
     * @param timezoneMode yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setTimezoneMode(String timezoneMode) {
        this.timezoneMode = timezoneMode;
        return this;
    }

    /** @return "delivery_time_of_day" alanı */
    public String getDeliveryTimeOfDay() {
        return deliveryTimeOfDay;
    }

    /**
     * "delivery_time_of_day" alanını ayarlar.
     *
     * @param deliveryTimeOfDay yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setDeliveryTimeOfDay(String deliveryTimeOfDay) {
        this.deliveryTimeOfDay = deliveryTimeOfDay;
        return this;
    }

    /** @return "throttle_per_minute" alanı */
    public Long getThrottlePerMinute() {
        return throttlePerMinute;
    }

    /**
     * "throttle_per_minute" alanını ayarlar.
     *
     * @param throttlePerMinute yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setThrottlePerMinute(Long throttlePerMinute) {
        this.throttlePerMinute = throttlePerMinute;
        return this;
    }

    /** @return "ttl" alanı */
    public Long getTtl() {
        return ttl;
    }

    /**
     * "ttl" alanını ayarlar.
     *
     * @param ttl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    /** @return "priority" alanı */
    public Long getPriority() {
        return priority;
    }

    /**
     * "priority" alanını ayarlar.
     *
     * @param priority yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setPriority(Long priority) {
        this.priority = priority;
        return this;
    }

    /** @return "collapse_id" alanı */
    public String getCollapseId() {
        return collapseId;
    }

    /**
     * "collapse_id" alanını ayarlar.
     *
     * @param collapseId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setCollapseId(String collapseId) {
        this.collapseId = collapseId;
        return this;
    }

    /** @return "frequency_cap_exempt" alanı */
    public Boolean getFrequencyCapExempt() {
        return frequencyCapExempt;
    }

    /**
     * "frequency_cap_exempt" alanını ayarlar.
     *
     * @param frequencyCapExempt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setFrequencyCapExempt(Boolean frequencyCapExempt) {
        this.frequencyCapExempt = frequencyCapExempt;
        return this;
    }

    /** @return "quiet_hours_exempt" alanı */
    public Boolean getQuietHoursExempt() {
        return quietHoursExempt;
    }

    /**
     * "quiet_hours_exempt" alanını ayarlar.
     *
     * @param quietHoursExempt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setQuietHoursExempt(Boolean quietHoursExempt) {
        this.quietHoursExempt = quietHoursExempt;
        return this;
    }

    /** @return "one_per_user" alanı */
    public Boolean getOnePerUser() {
        return onePerUser;
    }

    /**
     * "one_per_user" alanını ayarlar.
     *
     * @param onePerUser yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyDelivery setOnePerUser(Boolean onePerUser) {
        this.onePerUser = onePerUser;
        return this;
    }
}
