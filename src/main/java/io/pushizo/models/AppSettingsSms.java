// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsSms şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsSms {
    @JsonProperty("helpReply")
    private String helpReply;

    @JsonProperty("stopReply")
    private String stopReply;

    @JsonProperty("autoReply")
    private Boolean autoReply;

    public String getHelpReply() {
        return helpReply;
    }

    public AppSettingsSms helpReply(String helpReply) {
        this.helpReply = helpReply;
        return this;
    }

    public String getStopReply() {
        return stopReply;
    }

    public AppSettingsSms stopReply(String stopReply) {
        this.stopReply = stopReply;
        return this;
    }

    public Boolean getAutoReply() {
        return autoReply;
    }

    public AppSettingsSms autoReply(Boolean autoReply) {
        this.autoReply = autoReply;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
