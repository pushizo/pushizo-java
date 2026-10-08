// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EstimateRecipientsDto şeması (api/openapi.yaml). */
public final class EstimateRecipientsDto {

    /** "app_id" alanı. */
    @JsonProperty("app_id")
    private String appId;

    /** "target" alanı. Zorunlu. */
    @JsonProperty("target")
    private EstimateRecipientsDtoTarget target;

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDto setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "target" alanı */
    public EstimateRecipientsDtoTarget getTarget() {
        return target;
    }

    /**
     * "target" alanını ayarlar.
     *
     * @param target yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDto setTarget(EstimateRecipientsDtoTarget target) {
        this.target = target;
        return this;
    }
}
