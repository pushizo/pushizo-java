package com.pushizo.core;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/** {@code java.net.http.HttpClient} tabanlı varsayılan taşıma. */
public final class JdkHttpTransport implements HttpTransport {
    private static final java.util.Set<String> RESTRICTED = java.util.Set.of("connection", "content-length", "host", "expect", "upgrade");
    private final HttpClient client;

    public JdkHttpTransport() {
        this(HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).followRedirects(HttpClient.Redirect.NEVER).build());
    }

    public JdkHttpTransport(HttpClient client) {
        this.client = client;
    }

    @Override
    public Response send(Request request) throws IOException, InterruptedException {
        HttpRequest.Builder b = HttpRequest.newBuilder(URI.create(request.url()));
        if (request.timeout() != null) {
            b.timeout(request.timeout());
        }
        for (Map.Entry<String, String> h : request.headers().entrySet()) {
            if (!RESTRICTED.contains(h.getKey().toLowerCase(Locale.ROOT))) {
                b.header(h.getKey(), h.getValue());
            }
        }
        HttpRequest.BodyPublisher publisher = request.body() == null
                ? HttpRequest.BodyPublishers.noBody()
                : HttpRequest.BodyPublishers.ofByteArray(request.body());
        b.method(request.method(), publisher);
        HttpResponse<byte[]> res = client.send(b.build(), HttpResponse.BodyHandlers.ofByteArray());
        Map<String, List<String>> headers = new TreeMap<>();
        res.headers().map().forEach((k, v) -> headers.put(k.toLowerCase(Locale.ROOT), v));
        return new Response(res.statusCode(), headers, res.body());
    }
}
