// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateCategoryDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateCategoryDto {
    @JsonProperty("name")
    private java.util.Map<String, String> name;

    @JsonProperty("description")
    private java.util.Map<String, String> description;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    @JsonProperty("default_opted_in")
    private Boolean defaultOptedIn;

    @JsonProperty("position")
    private Long position;

    public java.util.Map<String, String> getName() {
        return name;
    }

    public UpdateCategoryDto name(java.util.Map<String, String> name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, String> getDescription() {
        return description;
    }

    public UpdateCategoryDto description(java.util.Map<String, String> description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public UpdateCategoryDto channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public Boolean getDefaultOptedIn() {
        return defaultOptedIn;
    }

    public UpdateCategoryDto defaultOptedIn(Boolean defaultOptedIn) {
        this.defaultOptedIn = defaultOptedIn;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public UpdateCategoryDto position(Long position) {
        this.position = position;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
