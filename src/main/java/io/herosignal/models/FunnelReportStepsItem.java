// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** FunnelReportStepsItem şeması (api/openapi.yaml). */
public final class FunnelReportStepsItem {

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "users" alanı. Zorunlu. */
    @JsonProperty("users")
    private Long users;

    /** "conversion_rate" alanı. Zorunlu. */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    /** "drop_off" alanı. Zorunlu. */
    @JsonProperty("drop_off")
    private Long dropOff;

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReportStepsItem setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "users" alanı */
    public Long getUsers() {
        return users;
    }

    /**
     * "users" alanını ayarlar.
     *
     * @param users yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReportStepsItem setUsers(Long users) {
        this.users = users;
        return this;
    }

    /** @return "conversion_rate" alanı */
    public Double getConversionRate() {
        return conversionRate;
    }

    /**
     * "conversion_rate" alanını ayarlar.
     *
     * @param conversionRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReportStepsItem setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    /** @return "drop_off" alanı */
    public Long getDropOff() {
        return dropOff;
    }

    /**
     * "drop_off" alanını ayarlar.
     *
     * @param dropOff yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReportStepsItem setDropOff(Long dropOff) {
        this.dropOff = dropOff;
        return this;
    }
}
