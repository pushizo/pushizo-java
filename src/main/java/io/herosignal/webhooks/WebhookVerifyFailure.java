package io.herosignal.webhooks;

/** Webhook doğrulama başarısızlık nedeni (tüm SDK'larda aynı kodlar). */
public enum WebhookVerifyFailure {
    /** Başlık yok veya boş. */
    MISSING_HEADER("missing_header"),
    /** {@code t} veya geçerli bir {@code v1} yok. */
    MALFORMED_HEADER("malformed_header"),
    /** Zaman damgası tolerans dışında. */
    TIMESTAMP_OUT_OF_TOLERANCE("timestamp_out_of_tolerance"),
    /** Hiçbir secret ile imza eşleşmedi. */
    SIGNATURE_MISMATCH("signature_mismatch"),
    /** İmza geçerli ama gövde JSON nesnesi değil. */
    MALFORMED_BODY("malformed_body");

    private final String code;

    WebhookVerifyFailure(String code) {
        this.code = code;
    }

    /** @return SDK'lar arası ortak kod (ör. {@code signature_mismatch}) */
    public String code() {
        return code;
    }
}
