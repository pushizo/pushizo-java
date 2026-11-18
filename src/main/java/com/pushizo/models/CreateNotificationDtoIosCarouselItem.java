// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationDtoIosCarouselItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationDtoIosCarouselItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    @JsonProperty("title")
    private String title;

    public String getUrl() {
        return url;
    }

    public CreateNotificationDtoIosCarouselItem url(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CreateNotificationDtoIosCarouselItem title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
