package io.herosignal;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/** JDK HttpServer üzerinde sıradaki yanıtları dönen ve istekleri kaydeden sahte API. */
final class FakeServer implements AutoCloseable {
    static final class Reply {
        final int status;
        final String body;
        final String contentType;
        final Map<String, String> headers;
        final long hangMillis;

        Reply(int status, String body, String contentType, Map<String, String> headers, long hangMillis) {
            this.status = status;
            this.body = body;
            this.contentType = contentType;
            this.headers = headers;
            this.hangMillis = hangMillis;
        }
    }

    static final class Recorded {
        final String method;
        final URI uri;
        final Map<String, List<String>> headers;
        final byte[] body;

        Recorded(String method, URI uri, Map<String, List<String>> headers, byte[] body) {
            this.method = method;
            this.uri = uri;
            this.headers = headers;
            this.body = body;
        }

        String header(String name) {
            for (Map.Entry<String, List<String>> e : headers.entrySet()) {
                if (e.getKey().equalsIgnoreCase(name)) return e.getValue().get(0);
            }
            return null;
        }

        String bodyText() {
            return new String(body, StandardCharsets.UTF_8);
        }

        Map<String, List<String>> query() {
            Map<String, List<String>> out = new LinkedHashMap<>();
            String raw = uri.getRawQuery();
            if (raw == null || raw.isEmpty()) return out;
            for (String pair : raw.split("&")) {
                int i = pair.indexOf('=');
                String k = java.net.URLDecoder.decode(i < 0 ? pair : pair.substring(0, i), StandardCharsets.UTF_8);
                String v = i < 0 ? "" : java.net.URLDecoder.decode(pair.substring(i + 1), StandardCharsets.UTF_8);
                out.computeIfAbsent(k, x -> new ArrayList<>()).add(v);
            }
            return out;
        }
    }

    private final HttpServer server;
    private final ConcurrentLinkedQueue<Reply> replies = new ConcurrentLinkedQueue<>();
    final List<Recorded> requests = new CopyOnWriteArrayList<>();
    final List<Duration> sleeps = new CopyOnWriteArrayList<>();

    FakeServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", exchange -> {
            byte[] body = exchange.getRequestBody().readAllBytes();
            requests.add(new Recorded(exchange.getRequestMethod(), exchange.getRequestURI(), new LinkedHashMap<>(exchange.getRequestHeaders()), body));
            Reply r = replies.poll();
            if (r == null) {
                exchange.sendResponseHeaders(599, -1);
                exchange.close();
                return;
            }
            if (r.hangMillis > 0) {
                try {
                    Thread.sleep(r.hangMillis);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            byte[] out = r.body.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", r.contentType);
            r.headers.forEach((k, v) -> exchange.getResponseHeaders().set(k, v));
            exchange.sendResponseHeaders(r.status, out.length == 0 ? -1 : out.length);
            if (out.length > 0) {
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(out);
                }
            }
            exchange.close();
        });
        server.setExecutor(java.util.concurrent.Executors.newCachedThreadPool());
        server.start();
    }

    FakeServer json(int status, String body, String... headerPairs) {
        Map<String, String> headers = new LinkedHashMap<>();
        for (int i = 0; i + 1 < headerPairs.length; i += 2) headers.put(headerPairs[i], headerPairs[i + 1]);
        replies.add(new Reply(status, body, "application/json", headers, 0));
        return this;
    }

    FakeServer raw(int status, String body, String contentType, String... headerPairs) {
        Map<String, String> headers = new LinkedHashMap<>();
        for (int i = 0; i + 1 < headerPairs.length; i += 2) headers.put(headerPairs[i], headerPairs[i + 1]);
        replies.add(new Reply(status, body, contentType, headers, 0));
        return this;
    }

    FakeServer hang(long millis) {
        replies.add(new Reply(200, "{}", "application/json", Collections.emptyMap(), millis));
        return this;
    }

    String url() {
        return "http://127.0.0.1:" + server.getAddress().getPort();
    }

    HeroSignal.Builder builder() {
        return HeroSignal.builder()
                .apiKey("hs_live_test")
                .appId("app_default")
                .baseUrl(url())
                .sleeper(sleeps::add)
                .clock(Clock.fixed(Instant.parse("2030-01-01T00:00:00Z"), ZoneOffset.UTC));
    }

    HeroSignal client() {
        return builder().build();
    }

    @Override
    public void close() {
        server.stop(0);
    }
}
