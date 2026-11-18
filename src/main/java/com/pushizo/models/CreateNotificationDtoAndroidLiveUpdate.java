// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationDtoAndroidLiveUpdate şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationDtoAndroidLiveUpdate {
    /**
     * Zorunlu.
     */
    @JsonProperty("progress")
    private Long progress;

    @JsonProperty("ongoing")
    private Boolean ongoing;

    public Long getProgress() {
        return progress;
    }

    public CreateNotificationDtoAndroidLiveUpdate progress(Long progress) {
        this.progress = progress;
        return this;
    }

    public Boolean getOngoing() {
        return ongoing;
    }

    public CreateNotificationDtoAndroidLiveUpdate ongoing(Boolean ongoing) {
        this.ongoing = ongoing;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
