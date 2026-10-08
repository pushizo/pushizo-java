// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** AppSettingsFrequencyCap şeması (api/openapi.yaml). */
public final class AppSettingsFrequencyCap {

    /** "max" alanı. Zorunlu. */
    @JsonProperty("max")
    private Long max;

    /** "windowHours" alanı. Zorunlu. */
    @JsonProperty("windowHours")
    private Long windowHours;

    /** @return "max" alanı */
    public Long getMax() {
        return max;
    }

    /**
     * "max" alanını ayarlar.
     *
     * @param max yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsFrequencyCap setMax(Long max) {
        this.max = max;
        return this;
    }

    /** @return "windowHours" alanı */
    public Long getWindowHours() {
        return windowHours;
    }

    /**
     * "windowHours" alanını ayarlar.
     *
     * @param windowHours yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsFrequencyCap setWindowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }
}
