// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsUpdateDtoEmail şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsUpdateDtoEmail {
    @JsonProperty("capture_replies")
    private Boolean captureReplies;

    public Boolean getCaptureReplies() {
        return captureReplies;
    }

    public InboxSettingsUpdateDtoEmail captureReplies(Boolean captureReplies) {
        this.captureReplies = captureReplies;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
