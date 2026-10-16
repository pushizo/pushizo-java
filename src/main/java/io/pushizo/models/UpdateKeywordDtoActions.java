// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateKeywordDtoActions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateKeywordDtoActions {
    @JsonProperty("add_tags")
    private java.util.Map<String, String> addTags;

    @JsonProperty("remove_tags")
    private java.util.List<String> removeTags;

    @JsonProperty("event")
    private UpdateKeywordDtoActionsEvent event;

    @JsonProperty("reply")
    private UpdateKeywordDtoActionsReply reply;

    @JsonProperty("opt_in")
    private Boolean optIn;

    public java.util.Map<String, String> getAddTags() {
        return addTags;
    }

    public UpdateKeywordDtoActions addTags(java.util.Map<String, String> addTags) {
        this.addTags = addTags;
        return this;
    }

    public java.util.List<String> getRemoveTags() {
        return removeTags;
    }

    public UpdateKeywordDtoActions removeTags(java.util.List<String> removeTags) {
        this.removeTags = removeTags;
        return this;
    }

    public UpdateKeywordDtoActionsEvent getEvent() {
        return event;
    }

    public UpdateKeywordDtoActions event(UpdateKeywordDtoActionsEvent event) {
        this.event = event;
        return this;
    }

    public UpdateKeywordDtoActionsReply getReply() {
        return reply;
    }

    public UpdateKeywordDtoActions reply(UpdateKeywordDtoActionsReply reply) {
        this.reply = reply;
        return this;
    }

    public Boolean getOptIn() {
        return optIn;
    }

    public UpdateKeywordDtoActions optIn(Boolean optIn) {
        this.optIn = optIn;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
