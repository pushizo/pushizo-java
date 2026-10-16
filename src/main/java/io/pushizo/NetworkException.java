package io.pushizo;

/** Bağlantı kurulamadı veya zaman aşımı (status 0). */
public class NetworkException extends PushizoException {
    private static final long serialVersionUID = 1L;

    public NetworkException(String message, Throwable cause) {
        super(0, ErrorCodes.NETWORK, message, null, null, null, cause);
    }
}
