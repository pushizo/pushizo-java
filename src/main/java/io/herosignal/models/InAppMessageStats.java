// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** InAppMessageStats şeması (api/openapi.yaml). */
public final class InAppMessageStats {

    /** "impressions" alanı. Zorunlu. */
    @JsonProperty("impressions")
    private Long impressions;

    /** "clicks" alanı. Zorunlu. */
    @JsonProperty("clicks")
    private Long clicks;

    /** "dismissals" alanı. Zorunlu. */
    @JsonProperty("dismissals")
    private Long dismissals;

    /** "unique_users" alanı. Zorunlu. */
    @JsonProperty("unique_users")
    private Long uniqueUsers;

    /** "ctr" alanı. Zorunlu. */
    @JsonProperty("ctr")
    private Double ctr;

    /** @return "impressions" alanı */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * "impressions" alanını ayarlar.
     *
     * @param impressions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessageStats setImpressions(Long impressions) {
        this.impressions = impressions;
        return this;
    }

    /** @return "clicks" alanı */
    public Long getClicks() {
        return clicks;
    }

    /**
     * "clicks" alanını ayarlar.
     *
     * @param clicks yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessageStats setClicks(Long clicks) {
        this.clicks = clicks;
        return this;
    }

    /** @return "dismissals" alanı */
    public Long getDismissals() {
        return dismissals;
    }

    /**
     * "dismissals" alanını ayarlar.
     *
     * @param dismissals yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessageStats setDismissals(Long dismissals) {
        this.dismissals = dismissals;
        return this;
    }

    /** @return "unique_users" alanı */
    public Long getUniqueUsers() {
        return uniqueUsers;
    }

    /**
     * "unique_users" alanını ayarlar.
     *
     * @param uniqueUsers yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessageStats setUniqueUsers(Long uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
        return this;
    }

    /** @return "ctr" alanı */
    public Double getCtr() {
        return ctr;
    }

    /**
     * "ctr" alanını ayarlar.
     *
     * @param ctr yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessageStats setCtr(Double ctr) {
        this.ctr = ctr;
        return this;
    }
}
