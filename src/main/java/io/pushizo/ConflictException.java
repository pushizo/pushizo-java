package io.pushizo;

import java.util.Map;

/** 409: kaynak çakışması veya idempotency anahtarı çakışması. */
public class ConflictException extends PushizoException {
    private static final long serialVersionUID = 1L;

    public ConflictException(int status, String code, String message, String requestId, Map<String, Object> details) {
        super(status, code, message, requestId, details, null, null);
    }
}
