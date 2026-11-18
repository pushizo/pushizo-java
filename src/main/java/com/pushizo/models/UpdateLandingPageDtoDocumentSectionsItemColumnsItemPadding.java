// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDtoDocumentSectionsItemColumnsItemPadding şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDtoDocumentSectionsItemColumnsItemPadding {
    /**
     * Zorunlu.
     */
    @JsonProperty("top")
    private Long top;

    /**
     * Zorunlu.
     */
    @JsonProperty("right")
    private Long right;

    /**
     * Zorunlu.
     */
    @JsonProperty("bottom")
    private Long bottom;

    /**
     * Zorunlu.
     */
    @JsonProperty("left")
    private Long left;

    public Long getTop() {
        return top;
    }

    public UpdateLandingPageDtoDocumentSectionsItemColumnsItemPadding top(Long top) {
        this.top = top;
        return this;
    }

    public Long getRight() {
        return right;
    }

    public UpdateLandingPageDtoDocumentSectionsItemColumnsItemPadding right(Long right) {
        this.right = right;
        return this;
    }

    public Long getBottom() {
        return bottom;
    }

    public UpdateLandingPageDtoDocumentSectionsItemColumnsItemPadding bottom(Long bottom) {
        this.bottom = bottom;
        return this;
    }

    public Long getLeft() {
        return left;
    }

    public UpdateLandingPageDtoDocumentSectionsItemColumnsItemPadding left(Long left) {
        this.left = left;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
