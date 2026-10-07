package io.herosignal;

/** API hata zarfındaki {@code error.code} değerleri (HS_ önekli katalog). */
public final class ErrorCodes {
    public static final String VALIDATION_ERROR = "HS_VALIDATION_ERROR";
    public static final String BAD_REQUEST = "HS_BAD_REQUEST";
    public static final String UNAUTHENTICATED = "HS_UNAUTHENTICATED";
    public static final String FORBIDDEN = "HS_FORBIDDEN";
    public static final String TENANT_MISMATCH = "HS_TENANT_MISMATCH";
    public static final String NOT_FOUND = "HS_NOT_FOUND";
    public static final String CONFLICT = "HS_CONFLICT";
    public static final String IDEMPOTENCY_CONFLICT = "HS_IDEMPOTENCY_CONFLICT";
    public static final String IDEMPOTENCY_IN_PROGRESS = "HS_IDEMPOTENCY_IN_PROGRESS";
    public static final String NO_RECIPIENTS = "HS_NO_RECIPIENTS";
    public static final String CHANNEL_NOT_CONFIGURED = "HS_CHANNEL_NOT_CONFIGURED";
    public static final String CONTENT_INVALID = "HS_CONTENT_INVALID";
    public static final String SUBSCRIPTION_INVALID = "HS_SUBSCRIPTION_INVALID";
    public static final String UNPROCESSABLE = "HS_UNPROCESSABLE";
    public static final String RATE_LIMITED = "HS_RATE_LIMITED";
    public static final String QUOTA_EXCEEDED = "HS_QUOTA_EXCEEDED";
    public static final String INTERNAL = "HS_INTERNAL";
    public static final String NOT_IMPLEMENTED = "HS_NOT_IMPLEMENTED";
    public static final String PROVIDER_UNAVAILABLE = "HS_PROVIDER_UNAVAILABLE";
    public static final String SERVICE_UNAVAILABLE = "HS_SERVICE_UNAVAILABLE";
    /** İstemci tarafı: bağlantı kurulamadı veya zaman aşımı (status 0). */
    public static final String NETWORK = "NETWORK";

    private ErrorCodes() {
    }
}
