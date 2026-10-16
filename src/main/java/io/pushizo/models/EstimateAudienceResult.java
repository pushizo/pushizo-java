// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EstimateAudienceResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EstimateAudienceResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("recipients")
    private Long recipients;

    /**
     * Zorunlu.
     */
    @JsonProperty("by_channel")
    private java.util.Map<String, Long> byChannel;

    /**
     * Zorunlu.
     */
    @JsonProperty("new_contacts")
    private Long newContacts;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id_missing")
    private java.util.List<String> externalIdMissing;

    public Long getRecipients() {
        return recipients;
    }

    public EstimateAudienceResult recipients(Long recipients) {
        this.recipients = recipients;
        return this;
    }

    public java.util.Map<String, Long> getByChannel() {
        return byChannel;
    }

    public EstimateAudienceResult byChannel(java.util.Map<String, Long> byChannel) {
        this.byChannel = byChannel;
        return this;
    }

    public Long getNewContacts() {
        return newContacts;
    }

    public EstimateAudienceResult newContacts(Long newContacts) {
        this.newContacts = newContacts;
        return this;
    }

    public java.util.List<String> getExternalIdMissing() {
        return externalIdMissing;
    }

    public EstimateAudienceResult externalIdMissing(java.util.List<String> externalIdMissing) {
        this.externalIdMissing = externalIdMissing;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
