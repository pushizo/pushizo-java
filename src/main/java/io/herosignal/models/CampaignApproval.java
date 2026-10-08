// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CampaignApproval şeması (api/openapi.yaml). */
public final class CampaignApproval {

    /** "required" alanı. Zorunlu. */
    @JsonProperty("required")
    private Boolean required;

    /** "pending_action" alanı. Değerler: "send", "schedule". */
    @JsonProperty("pending_action")
    private String pendingAction;

    /** "requested_by" alanı. */
    @JsonProperty("requested_by")
    private String requestedBy;

    /** "requested_at" alanı. */
    @JsonProperty("requested_at")
    private String requestedAt;

    /** "approved_by" alanı. */
    @JsonProperty("approved_by")
    private String approvedBy;

    /** "approved_at" alanı. */
    @JsonProperty("approved_at")
    private String approvedAt;

    /** @return "required" alanı */
    public Boolean getRequired() {
        return required;
    }

    /**
     * "required" alanını ayarlar.
     *
     * @param required yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignApproval setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /** @return "pending_action" alanı */
    public String getPendingAction() {
        return pendingAction;
    }

    /**
     * "pending_action" alanını ayarlar.
     *
     * @param pendingAction yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignApproval setPendingAction(String pendingAction) {
        this.pendingAction = pendingAction;
        return this;
    }

    /** @return "requested_by" alanı */
    public String getRequestedBy() {
        return requestedBy;
    }

    /**
     * "requested_by" alanını ayarlar.
     *
     * @param requestedBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignApproval setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    /** @return "requested_at" alanı */
    public String getRequestedAt() {
        return requestedAt;
    }

    /**
     * "requested_at" alanını ayarlar.
     *
     * @param requestedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignApproval setRequestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

    /** @return "approved_by" alanı */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * "approved_by" alanını ayarlar.
     *
     * @param approvedBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignApproval setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    /** @return "approved_at" alanı */
    public String getApprovedAt() {
        return approvedAt;
    }

    /**
     * "approved_at" alanını ayarlar.
     *
     * @param approvedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignApproval setApprovedAt(String approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }
}
