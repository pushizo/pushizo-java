// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessageCounts şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessageCounts {
    @JsonProperty("targeted")
    private Long targeted;

    @JsonProperty("suppressed")
    private Long suppressed;

    @JsonProperty("sent")
    private Long sent;

    @JsonProperty("delivered")
    private Long delivered;

    @JsonProperty("failed")
    private Long failed;

    @JsonProperty("errored")
    private Long errored;

    @JsonProperty("expired")
    private Long expired;

    @JsonProperty("opened")
    private Long opened;

    @JsonProperty("clicked")
    private Long clicked;

    @JsonProperty("converted")
    private Long converted;

    @JsonProperty("bounced")
    private Long bounced;

    @JsonProperty("complained")
    private Long complained;

    @JsonProperty("unsubscribed")
    private Long unsubscribed;

    @JsonProperty("sms_segments")
    private Long smsSegments;

    public Long getTargeted() {
        return targeted;
    }

    public MessageCounts targeted(Long targeted) {
        this.targeted = targeted;
        return this;
    }

    public Long getSuppressed() {
        return suppressed;
    }

    public MessageCounts suppressed(Long suppressed) {
        this.suppressed = suppressed;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public MessageCounts sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public MessageCounts delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public MessageCounts failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getErrored() {
        return errored;
    }

    public MessageCounts errored(Long errored) {
        this.errored = errored;
        return this;
    }

    public Long getExpired() {
        return expired;
    }

    public MessageCounts expired(Long expired) {
        this.expired = expired;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public MessageCounts opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public MessageCounts clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public MessageCounts converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Long getBounced() {
        return bounced;
    }

    public MessageCounts bounced(Long bounced) {
        this.bounced = bounced;
        return this;
    }

    public Long getComplained() {
        return complained;
    }

    public MessageCounts complained(Long complained) {
        this.complained = complained;
        return this;
    }

    public Long getUnsubscribed() {
        return unsubscribed;
    }

    public MessageCounts unsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }

    public Long getSmsSegments() {
        return smsSegments;
    }

    public MessageCounts smsSegments(Long smsSegments) {
        this.smsSegments = smsSegments;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
