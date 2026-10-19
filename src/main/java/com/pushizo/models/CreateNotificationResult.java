// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "queued", "processing", "completed", "cancelled", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("recipients_estimate")
    private Long recipientsEstimate;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id_missing")
    private java.util.List<String> externalIdMissing;

    public String getId() {
        return id;
    }

    public CreateNotificationResult id(String id) {
        this.id = id;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CreateNotificationResult status(String status) {
        this.status = status;
        return this;
    }

    public Long getRecipientsEstimate() {
        return recipientsEstimate;
    }

    public CreateNotificationResult recipientsEstimate(Long recipientsEstimate) {
        this.recipientsEstimate = recipientsEstimate;
        return this;
    }

    public java.util.List<String> getExternalIdMissing() {
        return externalIdMissing;
    }

    public CreateNotificationResult externalIdMissing(java.util.List<String> externalIdMissing) {
        this.externalIdMissing = externalIdMissing;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
