package io.herosignal;

/** Webhook imzası geçersiz veya gövde ayrıştırılamadı ({@code malformed_body}). */
public class WebhookSignatureException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final String reason;

    public WebhookSignatureException(String reason) {
        super("HeroSignal webhook imzası geçersiz: " + reason);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
