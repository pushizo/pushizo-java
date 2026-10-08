// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CopyTemplateDto şeması (api/openapi.yaml). */
public final class CopyTemplateDto {

    /** "target_app_id" alanı. Zorunlu. */
    @JsonProperty("target_app_id")
    private String targetAppId;

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** @return "target_app_id" alanı */
    public String getTargetAppId() {
        return targetAppId;
    }

    /**
     * "target_app_id" alanını ayarlar.
     *
     * @param targetAppId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CopyTemplateDto setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }

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
    public CopyTemplateDto setName(String name) {
        this.name = name;
        return this;
    }
}
