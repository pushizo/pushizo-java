// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CreateNotificationResult şeması (api/openapi.yaml). */
public final class CreateNotificationResult {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "status" alanı. Zorunlu. Değerler: "queued", "processing", "completed", "cancelled", "failed". */
    @JsonProperty("status")
    private String status;

    /** "recipients_estimate" alanı. Zorunlu. */
    @JsonProperty("recipients_estimate")
    private Long recipientsEstimate;

    /** "external_id_missing" alanı. Zorunlu. */
    @JsonProperty("external_id_missing")
    private List<String> externalIdMissing;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationResult setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationResult setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "recipients_estimate" alanı */
    public Long getRecipientsEstimate() {
        return recipientsEstimate;
    }

    /**
     * "recipients_estimate" alanını ayarlar.
     *
     * @param recipientsEstimate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationResult setRecipientsEstimate(Long recipientsEstimate) {
        this.recipientsEstimate = recipientsEstimate;
        return this;
    }

    /** @return "external_id_missing" alanı */
    public List<String> getExternalIdMissing() {
        return externalIdMissing;
    }

    /**
     * "external_id_missing" alanını ayarlar.
     *
     * @param externalIdMissing yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationResult setExternalIdMissing(List<String> externalIdMissing) {
        this.externalIdMissing = externalIdMissing;
        return this;
    }
}
