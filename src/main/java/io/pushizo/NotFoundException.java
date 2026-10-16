package io.pushizo;

import java.util.Map;

/** 404: kaynak bulunamadı. */
public class NotFoundException extends PushizoException {
    private static final long serialVersionUID = 1L;

    public NotFoundException(int status, String code, String message, String requestId, Map<String, Object> details) {
        super(status, code, message, requestId, details, null, null);
    }
}
