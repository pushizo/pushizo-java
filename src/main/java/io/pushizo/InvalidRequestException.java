package io.pushizo;

import java.util.Map;

/** 400 / 422: istek doğrulanamadı veya işlenemedi (details alan hatalarını içerir). */
public class InvalidRequestException extends PushizoException {
    private static final long serialVersionUID = 1L;

    public InvalidRequestException(int status, String code, String message, String requestId, Map<String, Object> details) {
        super(status, code, message, requestId, details, null, null);
    }
}
