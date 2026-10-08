// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyStatsNodesItemVariantsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyStatsNodesItemVariantsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("variant_id")
    private String variantId;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("converted")
    private Long converted;

    /**
     * Zorunlu.
     */
    @JsonProperty("winner")
    private Boolean winner;

    public String getVariantId() {
        return variantId;
    }

    public JourneyStatsNodesItemVariantsItem variantId(String variantId) {
        this.variantId = variantId;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public JourneyStatsNodesItemVariantsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public JourneyStatsNodesItemVariantsItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public JourneyStatsNodesItemVariantsItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public JourneyStatsNodesItemVariantsItem converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Boolean getWinner() {
        return winner;
    }

    public JourneyStatsNodesItemVariantsItem winner(Boolean winner) {
        this.winner = winner;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
