package io.herosignal;

import java.util.Map;

/** 401: API anahtarı eksik veya geçersiz. */
public class AuthenticationException extends HeroSignalException {
    private static final long serialVersionUID = 1L;

    public AuthenticationException(int status, String code, String message, String requestId, Map<String, Object> details) {
        super(status, code, message, requestId, details, null, null);
    }
}
