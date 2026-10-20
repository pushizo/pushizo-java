// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsEmail şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsEmail {
    /**
     * Zorunlu.
     */
    @JsonProperty("capture_replies")
    private Boolean captureReplies;

    /**
     * Zorunlu.
     */
    @JsonProperty("reply_domain")
    private String replyDomain;

    public Boolean getCaptureReplies() {
        return captureReplies;
    }

    public InboxSettingsEmail captureReplies(Boolean captureReplies) {
        this.captureReplies = captureReplies;
        return this;
    }

    public String getReplyDomain() {
        return replyDomain;
    }

    public InboxSettingsEmail replyDomain(String replyDomain) {
        this.replyDomain = replyDomain;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
