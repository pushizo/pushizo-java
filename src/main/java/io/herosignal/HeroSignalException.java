package io.herosignal;

import java.util.Collections;
import java.util.Map;

/**
 * API hata zarfından ({@code {"error": {"code", "message", "request_id", "details"}}}) türetilen istisna.
 *
 * <p>Ağ hatalarında (bağlantı, zaman aşımı) {@link #getStatus()} 0 ve {@link #getCode()} {@code "NETWORK"} olur.
 */
public class HeroSignalException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final int status;
    private final String code;
    private final String requestId;
    private final transient Map<String, Object> details;

    /**
     * @param status HTTP durum kodu (ağ hatasında 0)
     * @param code hata kodu
     * @param message açıklama
     * @param requestId istek kimliği (null olabilir)
     * @param details ek ayrıntılar (null olabilir)
     * @param cause alttaki hata (null olabilir)
     */
    public HeroSignalException(int status, String code, String message, String requestId, Map<String, Object> details, Throwable cause) {
        super(message, cause);
        this.status = status;
        this.code = code;
        this.requestId = requestId;
        this.details = details == null ? null : Collections.unmodifiableMap(details);
    }

    /** @return HTTP durum kodu (ağ hatasında 0) */
    public int getStatus() {
        return status;
    }

    /** @return makine tarafından okunur hata kodu (ör. {@code VALIDATION_FAILED}, {@code NETWORK}) */
    public String getCode() {
        return code;
    }

    /** @return destek taleplerinde kullanılacak istek kimliği (null olabilir) */
    public String getRequestId() {
        return requestId;
    }

    /** @return alan bazlı ek bilgiler (null olabilir) */
    public Map<String, Object> getDetails() {
        return details;
    }

    /** @return 429, 5xx veya ağ hatası ise true */
    public boolean isRetryable() {
        return status == 0 || status == 429 || status >= 500;
    }

    @Override
    public String toString() {
        return "HeroSignalException[" + status + " " + code + "] " + getMessage()
                + (requestId != null ? " (request_id=" + requestId + ")" : "");
    }
}
