// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateKeywordDtoActions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateKeywordDtoActions {
    @JsonProperty("add_tags")
    private java.util.Map<String, String> addTags;

    @JsonProperty("remove_tags")
    private java.util.List<String> removeTags;

    @JsonProperty("event")
    private CreateKeywordDtoActionsEvent event;

    @JsonProperty("reply")
    private CreateKeywordDtoActionsReply reply;

    @JsonProperty("opt_in")
    private Boolean optIn;

    public java.util.Map<String, String> getAddTags() {
        return addTags;
    }

    public CreateKeywordDtoActions addTags(java.util.Map<String, String> addTags) {
        this.addTags = addTags;
        return this;
    }

    public java.util.List<String> getRemoveTags() {
        return removeTags;
    }

    public CreateKeywordDtoActions removeTags(java.util.List<String> removeTags) {
        this.removeTags = removeTags;
        return this;
    }

    public CreateKeywordDtoActionsEvent getEvent() {
        return event;
    }

    public CreateKeywordDtoActions event(CreateKeywordDtoActionsEvent event) {
        this.event = event;
        return this;
    }

    public CreateKeywordDtoActionsReply getReply() {
        return reply;
    }

    public CreateKeywordDtoActions reply(CreateKeywordDtoActionsReply reply) {
        this.reply = reply;
        return this;
    }

    public Boolean getOptIn() {
        return optIn;
    }

    public CreateKeywordDtoActions optIn(Boolean optIn) {
        this.optIn = optIn;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
