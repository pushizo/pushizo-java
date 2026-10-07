// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunnelReportStepsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FunnelReportStepsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("drop_off")
    private Long dropOff;

    public String getName() {
        return name;
    }

    public FunnelReportStepsItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public FunnelReportStepsItem users(Long users) {
        this.users = users;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public FunnelReportStepsItem conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    public Long getDropOff() {
        return dropOff;
    }

    public FunnelReportStepsItem dropOff(Long dropOff) {
        this.dropOff = dropOff;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
