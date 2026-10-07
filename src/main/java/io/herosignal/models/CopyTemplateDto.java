// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CopyTemplateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CopyTemplateDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("target_app_id")
    private String targetAppId;

    @JsonProperty("name")
    private String name;

    public String getTargetAppId() {
        return targetAppId;
    }

    public CopyTemplateDto targetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CopyTemplateDto name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
