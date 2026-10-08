// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** PatchEventDefinitionDto şeması (api/openapi.yaml). */
public final class PatchEventDefinitionDto {

    /** "display_name" alanı. */
    @JsonProperty("display_name")
    private String displayName;

    /** "is_conversion" alanı. */
    @JsonProperty("is_conversion")
    private Boolean isConversion;

    /** @return "display_name" alanı */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * "display_name" alanını ayarlar.
     *
     * @param displayName yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchEventDefinitionDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** @return "is_conversion" alanı */
    public Boolean getIsConversion() {
        return isConversion;
    }

    /**
     * "is_conversion" alanını ayarlar.
     *
     * @param isConversion yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchEventDefinitionDto setIsConversion(Boolean isConversion) {
        this.isConversion = isConversion;
        return this;
    }
}
