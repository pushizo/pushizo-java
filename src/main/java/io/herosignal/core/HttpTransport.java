package io.herosignal.core;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

/** HTTP taşıma katmanı (varsayılan: {@link JdkHttpTransport}); testlerde veya özel istemcilerle değiştirilebilir. */
public interface HttpTransport {
    /** Gönderilecek istek. {@code body} null olabilir. */
    record Request(String method, String url, Map<String, String> headers, byte[] body, Duration timeout) {
    }

    /** Yanıt; başlık adları küçük harflidir. */
    record Response(int status, Map<String, List<String>> headers, byte[] body) {
        public String header(String name) {
            List<String> values = headers.get(name.toLowerCase(java.util.Locale.ROOT));
            return values == null || values.isEmpty() ? null : values.get(0);
        }
    }

    /** Ağ hatasında {@link IOException} fırlatır (yeniden denenir). */
    Response send(Request request) throws IOException, InterruptedException;
}
