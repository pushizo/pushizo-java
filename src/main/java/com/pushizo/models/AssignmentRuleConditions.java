// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AssignmentRuleConditions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AssignmentRuleConditions {
    /**
     * Değerler: "sms", "whatsapp", "rcs", "telegram", "viber", "email", "chat".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    @JsonProperty("languages")
    private java.util.List<String> languages;

    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    public java.util.List<String> getChannels() {
        return channels;
    }

    public AssignmentRuleConditions channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public java.util.List<String> getLanguages() {
        return languages;
    }

    public AssignmentRuleConditions languages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public AssignmentRuleConditions tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
