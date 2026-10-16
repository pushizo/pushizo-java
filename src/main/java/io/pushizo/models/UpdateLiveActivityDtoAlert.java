// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLiveActivityDtoAlert şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLiveActivityDtoAlert {
    @JsonProperty("title")
    private java.util.Map<String, String> title;

    @JsonProperty("body")
    private java.util.Map<String, String> body;

    @JsonProperty("sound")
    private String sound;

    public java.util.Map<String, String> getTitle() {
        return title;
    }

    public UpdateLiveActivityDtoAlert title(java.util.Map<String, String> title) {
        this.title = title;
        return this;
    }

    public java.util.Map<String, String> getBody() {
        return body;
    }

    public UpdateLiveActivityDtoAlert body(java.util.Map<String, String> body) {
        this.body = body;
        return this;
    }

    public String getSound() {
        return sound;
    }

    public UpdateLiveActivityDtoAlert sound(String sound) {
        this.sound = sound;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
