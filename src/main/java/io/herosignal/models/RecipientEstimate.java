// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** RecipientEstimate şeması (api/openapi.yaml). */
public final class RecipientEstimate {

    /** "recipients_estimate" alanı. Zorunlu. */
    @JsonProperty("recipients_estimate")
    private Long recipientsEstimate;

    /** "by_channel" alanı. Zorunlu. */
    @JsonProperty("by_channel")
    private Map<String, Long> byChannel;

    /** "unknown_contacts" alanı. Zorunlu. */
    @JsonProperty("unknown_contacts")
    private Long unknownContacts;

    /** "external_id_missing" alanı. Zorunlu. */
    @JsonProperty("external_id_missing")
    private List<String> externalIdMissing;

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
    public RecipientEstimate setRecipientsEstimate(Long recipientsEstimate) {
        this.recipientsEstimate = recipientsEstimate;
        return this;
    }

    /** @return "by_channel" alanı */
    public Map<String, Long> getByChannel() {
        return byChannel;
    }

    /**
     * "by_channel" alanını ayarlar.
     *
     * @param byChannel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RecipientEstimate setByChannel(Map<String, Long> byChannel) {
        this.byChannel = byChannel;
        return this;
    }

    /** @return "unknown_contacts" alanı */
    public Long getUnknownContacts() {
        return unknownContacts;
    }

    /**
     * "unknown_contacts" alanını ayarlar.
     *
     * @param unknownContacts yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RecipientEstimate setUnknownContacts(Long unknownContacts) {
        this.unknownContacts = unknownContacts;
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
    public RecipientEstimate setExternalIdMissing(List<String> externalIdMissing) {
        this.externalIdMissing = externalIdMissing;
        return this;
    }
}
