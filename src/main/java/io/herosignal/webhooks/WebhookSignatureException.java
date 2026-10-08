package io.herosignal.webhooks;

/** Webhook imzası veya gövdesi geçersiz. */
public final class WebhookSignatureException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final WebhookVerifyFailure reason;

    /** @param reason başarısızlık nedeni */
    public WebhookSignatureException(WebhookVerifyFailure reason) {
        super("HeroSignal webhook imzası geçersiz: " + reason.code());
        this.reason = reason;
    }

    /** @return başarısızlık nedeni */
    public WebhookVerifyFailure getReason() {
        return reason;
    }
}
