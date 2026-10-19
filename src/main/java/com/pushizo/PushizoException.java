package com.pushizo;

import java.time.Duration;
import java.util.Map;

/**
 * API hata zarfından ({@code {"error": {"code", "message", "request_id", "details"}}}) türetilen istisna.
 * HTTP durumuna göre alt sınıflar fırlatılır ({@link NotFoundException}, {@link RateLimitException} …);
 * ağ hatalarında {@link NetworkException} (status 0, code {@code NETWORK}).
 */
public class PushizoException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final int status;
    private final String code;
    private final String requestId;
    private final transient Map<String, Object> details;
    private final Duration retryAfter;

    public PushizoException(int status, String code, String message, String requestId, Map<String, Object> details, Duration retryAfter, Throwable cause) {
        super(message, cause);
        this.status = status;
        this.code = code;
        this.requestId = requestId;
        this.details = details;
        this.retryAfter = retryAfter;
    }

    /** HTTP durumu (ağ hatasında 0). */
    public int getStatus() {
        return status;
    }

    /** HS_ hata kodu ({@link ErrorCodes}); zarf yoksa {@code HTTP_<durum>}. */
    public String getCode() {
        return code;
    }

    public String getRequestId() {
        return requestId;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    /** 429/503 yanıtındaki Retry-After (yoksa null). */
    public Duration getRetryAfter() {
        return retryAfter;
    }

    /** 429, 5xx veya ağ hatası: yeniden denenebilir. */
    public boolean isRetryable() {
        return status == 0 || status == 429 || status >= 500;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + status + " " + code + "] " + getMessage() + (requestId != null ? " (request_id=" + requestId + ")" : "");
    }

    /** HTTP durumuna karşılık gelen alt sınıfı oluşturur. */
    public static PushizoException of(int status, String code, String message, String requestId, Map<String, Object> details, Duration retryAfter) {
        if (status == 400 || status == 422) {
            return new InvalidRequestException(status, code, message, requestId, details);
        }
        if (status == 401) {
            return new AuthenticationException(status, code, message, requestId, details);
        }
        if (status == 403) {
            return new PermissionDeniedException(status, code, message, requestId, details);
        }
        if (status == 404) {
            return new NotFoundException(status, code, message, requestId, details);
        }
        if (status == 409) {
            return new ConflictException(status, code, message, requestId, details);
        }
        if (status == 429) {
            return new RateLimitException(status, code, message, requestId, details, retryAfter);
        }
        if (status >= 500) {
            return new ServerException(status, code, message, requestId, details, retryAfter);
        }
        return new PushizoException(status, code, message, requestId, details, retryAfter, null);
    }
}
