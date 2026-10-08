// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** OverviewStatsTopErrorsItem şeması (api/openapi.yaml). */
public final class OverviewStatsTopErrorsItem {

    /** "code" alanı. Zorunlu. */
    @JsonProperty("code")
    private String code;

    /** "count" alanı. Zorunlu. */
    @JsonProperty("count")
    private Long count;

    /** @return "code" alanı */
    public String getCode() {
        return code;
    }

    /**
     * "code" alanını ayarlar.
     *
     * @param code yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsTopErrorsItem setCode(String code) {
        this.code = code;
        return this;
    }

    /** @return "count" alanı */
    public Long getCount() {
        return count;
    }

    /**
     * "count" alanını ayarlar.
     *
     * @param count yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OverviewStatsTopErrorsItem setCount(Long count) {
        this.count = count;
        return this;
    }
}
