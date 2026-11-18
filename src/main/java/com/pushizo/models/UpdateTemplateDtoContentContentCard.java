// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentContentCard şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentContentCard {
    /**
     * Zorunlu. Değerler: "classic", "captioned_image", "image_only".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("pinned")
    private Boolean pinned;

    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("button_text")
    private java.util.Map<String, String> buttonText;

    public String getType() {
        return type;
    }

    public UpdateTemplateDtoContentContentCard type(String type) {
        this.type = type;
        return this;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public UpdateTemplateDtoContentContentCard pinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public UpdateTemplateDtoContentContentCard priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public java.util.Map<String, String> getButtonText() {
        return buttonText;
    }

    public UpdateTemplateDtoContentContentCard buttonText(java.util.Map<String, String> buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
