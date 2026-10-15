// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignApproval şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignApproval {
    /**
     * Zorunlu.
     */
    @JsonProperty("required")
    private Boolean required;

    /**
     * Değerler: "send", "schedule".
     */
    @JsonProperty("pending_action")
    private String pendingAction;

    @JsonProperty("requested_by")
    private String requestedBy;

    @JsonProperty("requested_at")
    private String requestedAt;

    @JsonProperty("approved_by")
    private String approvedBy;

    @JsonProperty("approved_at")
    private String approvedAt;

    @JsonProperty("rejected_by")
    private String rejectedBy;

    @JsonProperty("rejected_at")
    private String rejectedAt;

    public Boolean getRequired() {
        return required;
    }

    public CampaignApproval required(Boolean required) {
        this.required = required;
        return this;
    }

    public String getPendingAction() {
        return pendingAction;
    }

    public CampaignApproval pendingAction(String pendingAction) {
        this.pendingAction = pendingAction;
        return this;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public CampaignApproval requestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    public String getRequestedAt() {
        return requestedAt;
    }

    public CampaignApproval requestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public CampaignApproval approvedBy(String approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    public String getApprovedAt() {
        return approvedAt;
    }

    public CampaignApproval approvedAt(String approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    public CampaignApproval rejectedBy(String rejectedBy) {
        this.rejectedBy = rejectedBy;
        return this;
    }

    public String getRejectedAt() {
        return rejectedAt;
    }

    public CampaignApproval rejectedAt(String rejectedAt) {
        this.rejectedAt = rejectedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
