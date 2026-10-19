package com.pushizo;

import java.time.Duration;
import java.util.Map;

/** 5xx: sunucu veya sağlayıcı geçici olarak kullanılamıyor. */
public class ServerException extends PushizoException {
    private static final long serialVersionUID = 1L;

    public ServerException(int status, String code, String message, String requestId, Map<String, Object> details, Duration retryAfter) {
        super(status, code, message, requestId, details, retryAfter, null);
    }
}
