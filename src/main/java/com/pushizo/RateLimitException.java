package com.pushizo;

import java.time.Duration;
import java.util.Map;

/** 429: hız sınırı veya plan kotası aşıldı. */
public class RateLimitException extends PushizoException {
    private static final long serialVersionUID = 1L;

    public RateLimitException(int status, String code, String message, String requestId, Map<String, Object> details, Duration retryAfter) {
        super(status, code, message, requestId, details, retryAfter, null);
    }
}
