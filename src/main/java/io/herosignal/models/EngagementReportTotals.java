// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EngagementReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EngagementReportTotals {
    /**
     * Zorunlu.
     */
    @JsonProperty("opened")
    private Long opened;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked")
    private Long clicked;

    public Long getOpened() {
        return opened;
    }

    public EngagementReportTotals opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public EngagementReportTotals clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
