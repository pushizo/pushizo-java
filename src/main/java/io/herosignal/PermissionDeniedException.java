package io.herosignal;

import java.util.Map;

/** 403: anahtarın kapsamı yetersiz, IP izin listesi dışı veya kaynak başka kiracıya ait. */
public class PermissionDeniedException extends HeroSignalException {
    private static final long serialVersionUID = 1L;

    public PermissionDeniedException(int status, String code, String message, String requestId, Map<String, Object> details) {
        super(status, code, message, requestId, details, null, null);
    }
}
