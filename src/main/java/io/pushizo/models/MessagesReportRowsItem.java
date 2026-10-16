// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessagesReportRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessagesReportRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivered")
    private Long delivered;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

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

    public String getKey() {
        return key;
    }

    public MessagesReportRowsItem key(String key) {
        this.key = key;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public MessagesReportRowsItem label(String label) {
        this.label = label;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public MessagesReportRowsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public MessagesReportRowsItem delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public MessagesReportRowsItem failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public MessagesReportRowsItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public MessagesReportRowsItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public MessagesReportRowsItem converted(Long converted) {
        this.converted = converted;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
