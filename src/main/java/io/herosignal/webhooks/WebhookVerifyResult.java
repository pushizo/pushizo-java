package io.herosignal.webhooks;

/** Webhook imza doğrulama sonucu. Geçerliyse {@link #getTimestamp()}, değilse {@link #getReason()} doludur. */
public final class WebhookVerifyResult {
    private final boolean ok;
    private final long timestamp;
    private final WebhookVerifyFailure reason;

    private WebhookVerifyResult(boolean ok, long timestamp, WebhookVerifyFailure reason) {
        this.ok = ok;
        this.timestamp = timestamp;
        this.reason = reason;
    }

    static WebhookVerifyResult success(long timestamp) {
        return new WebhookVerifyResult(true, timestamp, null);
    }

    static WebhookVerifyResult failure(WebhookVerifyFailure reason) {
        return new WebhookVerifyResult(false, 0, reason);
    }

    /** @return imza geçerli mi */
    public boolean isOk() {
        return ok;
    }

    /** @return imzadaki Unix zaman damgası (geçerliyse) */
    public long getTimestamp() {
        return timestamp;
    }

    /** @return başarısızlık nedeni (geçerliyse null) */
    public WebhookVerifyFailure getReason() {
        return reason;
    }
}
