// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignStats2 şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignStats2 {
    @JsonProperty("runs")
    private Long runs;

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

    public Long getRuns() {
        return runs;
    }

    public CampaignStats2 runs(Long runs) {
        this.runs = runs;
        return this;
    }

    public Long getTargeted() {
        return targeted;
    }

    public CampaignStats2 targeted(Long targeted) {
        this.targeted = targeted;
        return this;
    }

    public Long getSuppressed() {
        return suppressed;
    }

    public CampaignStats2 suppressed(Long suppressed) {
        this.suppressed = suppressed;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public CampaignStats2 sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public CampaignStats2 delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public CampaignStats2 failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public CampaignStats2 opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public CampaignStats2 clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public CampaignStats2 converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Long getBounced() {
        return bounced;
    }

    public CampaignStats2 bounced(Long bounced) {
        this.bounced = bounced;
        return this;
    }

    public Long getComplained() {
        return complained;
    }

    public CampaignStats2 complained(Long complained) {
        this.complained = complained;
        return this;
    }

    public Long getUnsubscribed() {
        return unsubscribed;
    }

    public CampaignStats2 unsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }

    public Long getSmsSegments() {
        return smsSegments;
    }

    public CampaignStats2 smsSegments(Long smsSegments) {
        this.smsSegments = smsSegments;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
