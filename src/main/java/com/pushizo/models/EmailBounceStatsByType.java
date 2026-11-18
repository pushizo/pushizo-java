// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailBounceStatsByType şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailBounceStatsByType {
    /**
     * Zorunlu.
     */
    @JsonProperty("hard")
    private Long hard;

    /**
     * Zorunlu.
     */
    @JsonProperty("soft")
    private Long soft;

    /**
     * Zorunlu.
     */
    @JsonProperty("complaint")
    private Long complaint;

    /**
     * Zorunlu.
     */
    @JsonProperty("blocked_before_send")
    private Long blockedBeforeSend;

    public Long getHard() {
        return hard;
    }

    public EmailBounceStatsByType hard(Long hard) {
        this.hard = hard;
        return this;
    }

    public Long getSoft() {
        return soft;
    }

    public EmailBounceStatsByType soft(Long soft) {
        this.soft = soft;
        return this;
    }

    public Long getComplaint() {
        return complaint;
    }

    public EmailBounceStatsByType complaint(Long complaint) {
        this.complaint = complaint;
        return this;
    }

    public Long getBlockedBeforeSend() {
        return blockedBeforeSend;
    }

    public EmailBounceStatsByType blockedBeforeSend(Long blockedBeforeSend) {
        this.blockedBeforeSend = blockedBeforeSend;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
