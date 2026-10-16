package io.pushizo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.net.httpserver.HttpServer;
import io.pushizo.core.HttpTransport;
import io.pushizo.core.Json;
import io.pushizo.models.ApiEventsDto;
import io.pushizo.models.CreateNotificationDto;
import io.pushizo.models.CreateNotificationDtoTarget;
import io.pushizo.models.CreateNotificationResult;
import io.pushizo.models.InAppWinnerDto;
import io.pushizo.models.Segment;
import io.pushizo.models.UserDetail;
import io.pushizo.params.ImportsCreateForm;
import io.pushizo.params.NotificationsListParams;
import io.pushizo.params.SegmentsListParams;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;

class PushizoTest {
    /** Sıralı yanıtlar döndüren ve istekleri kaydeden sahte taşıma; {@code null} yanıt ağ hatasıdır. */
    static final class FakeTransport implements HttpTransport {
        final List<Request> requests = new ArrayList<>();
        final Deque<Response> responses = new ArrayDeque<>();
        final Deque<Boolean> network = new ArrayDeque<>();
        final Deque<Boolean> refused = new ArrayDeque<>();

        FakeTransport add(int status, String body, String... headers) {
            Map<String, List<String>> h = new TreeMap<>();
            for (int i = 0; i < headers.length; i += 2) {
                h.put(headers[i].toLowerCase(), List.of(headers[i + 1]));
            }
            responses.add(new Response(status, h, body.getBytes(StandardCharsets.UTF_8)));
            network.add(false);
            refused.add(false);
            return this;
        }

        FakeTransport networkError() {
            responses.add(new Response(0, Map.of(), new byte[0]));
            network.add(true);
            refused.add(false);
            return this;
        }

        /** Bağlantı reddi: istek sunucuya hiç gitmedi. */
        FakeTransport connectionRefused() {
            responses.add(new Response(0, Map.of(), new byte[0]));
            network.add(false);
            refused.add(true);
            return this;
        }

        @Override
        public Response send(Request request) throws IOException {
            requests.add(request);
            Response r = responses.poll();
            if (r == null) {
                throw new IOException("yanıt yok");
            }
            if (network.poll()) {
                throw new IOException("bağlantı koptu");
            }
            if (refused.poll()) {
                throw new java.net.ConnectException("Connection refused");
            }
            return r;
        }

        JsonNode body(int i) throws IOException {
            return Json.mapper().readTree(requests.get(i).body());
        }
    }

    final List<Long> slept = new ArrayList<>();

    Pushizo client(FakeTransport t) {
        return Pushizo.builder().apiKey("hs_live_test").appId("app_1").baseUrl("https://api.test/").transport(t).sleeper(slept::add).build();
    }

    @Test
    void createNotificationSendsAuthAppAndIdempotencyKey() throws Exception {
        FakeTransport t = new FakeTransport().add(202, "{\"id\":\"msg_1\",\"status\":\"queued\"}");
        CreateNotificationResult res = client(t).notifications().create(new CreateNotificationDto()
                .target(new CreateNotificationDtoTarget().includeAliases(Map.of("external_id", List.of("u1"))))
                .contents(Map.of("tr", "Merhaba")));
        assertEquals("msg_1", res.getId());
        HttpTransport.Request r = t.requests.get(0);
        assertEquals("POST", r.method());
        assertEquals("https://api.test/v1/notifications", r.url());
        assertEquals("Bearer hs_live_test", r.headers().get("Authorization"));
        assertTrue(r.headers().get("User-Agent").startsWith("pushizo-java/"));
        assertTrue(r.headers().get("Idempotency-Key").matches("[0-9a-f-]{36}"));
        JsonNode body = t.body(0);
        assertEquals("app_1", body.get("app_id").asText());
        assertEquals("Merhaba", body.get("contents").get("tr").asText());
        assertEquals("u1", body.get("target").get("include_aliases").get("external_id").get(0).asText());
        assertFalse(body.has("idempotency_key"), "null alanlar gönderilmez");
    }

    @Test
    void explicitAndBodyIdempotencyKeyAndPerCallApp() throws Exception {
        FakeTransport t = new FakeTransport().add(202, "{\"id\":\"m\"}").add(202, "{\"id\":\"m\"}");
        Pushizo hs = client(t);
        CreateNotificationDto body = new CreateNotificationDto().contents(Map.of("en", "x"));
        hs.notifications().create(body, RequestOptions.builder().idempotencyKey("order-1").build());
        assertNull(body.getAppId(), "çağıranın nesnesi değiştirilmez");
        hs.notifications().create(new CreateNotificationDto().contents(Map.of("en", "x")).idempotencyKey("order-2"), RequestOptions.forApp("app_2"));
        assertEquals("order-1", t.requests.get(0).headers().get("Idempotency-Key"));
        assertEquals("order-2", t.requests.get(1).headers().get("Idempotency-Key"));
        assertEquals("app_2", t.body(1).get("app_id").asText());
    }

    @Test
    void noIdempotencyKeyWhenDisabledOrUnsupported() {
        FakeTransport t = new FakeTransport().add(202, "{\"id\":\"m\"}").add(200, "{\"accepted\":1}");
        Pushizo hs = Pushizo.builder().apiKey("k").appId("app_1").transport(t).autoIdempotencyKey(false).build();
        hs.notifications().create(new CreateNotificationDto().contents(Map.of("en", "x")));
        hs.events().send(new io.pushizo.models.ApiEventsDto().events(List.of(new io.pushizo.models.ApiEventsDtoEventsItem().name("purchase"))));
        assertNull(t.requests.get(0).headers().get("Idempotency-Key"));
        assertNull(t.requests.get(1).headers().get("Idempotency-Key"));
    }

    @Test
    void queryAndPathEncoding() {
        FakeTransport t = new FakeTransport().add(200, "{\"data\":[]}").add(200, "{\"id\":\"usr_1\"}");
        Pushizo hs = client(t);
        hs.notifications().list(new NotificationsListParams().limit(10L).status("completed"));
        assertEquals("https://api.test/v1/notifications?app_id=app_1&limit=10&status=completed", t.requests.get(0).url());
        UserDetail user = hs.users().getByAlias("crm id", "a/b", RequestOptions.forApp("app 2"));
        assertEquals("https://api.test/v1/apps/app%202/users/by/crm%20id/a%2Fb", t.requests.get(1).url());
        assertEquals("usr_1", user.getId());
    }

    @Test
    void missingAppIdThrows() {
        Pushizo hs = Pushizo.builder().apiKey("k").transport(new FakeTransport()).build();
        assertThrows(IllegalArgumentException.class, () -> hs.apps().get());
        assertThrows(IllegalArgumentException.class, () -> Pushizo.builder().build());
    }

    @Test
    void retryAfterBackoffAndStableIdempotencyKey() {
        FakeTransport t = new FakeTransport()
                .add(429, "{\"error\":{\"code\":\"HS_RATE_LIMITED\",\"message\":\"yavaş\"}}", "Retry-After", "2")
                .add(503, "{\"error\":{\"code\":\"HS_SERVICE_UNAVAILABLE\",\"message\":\"x\"}}")
                .networkError()
                .add(202, "{\"id\":\"msg_1\"}");
        CreateNotificationResult res = client(t).notifications().create(new CreateNotificationDto().contents(Map.of("en", "x")));
        assertEquals("msg_1", res.getId());
        assertEquals(List.of(2000L, 1000L, 3000L), slept);
        Set<String> keys = new HashSet<>();
        t.requests.forEach(r -> keys.add(r.headers().get("Idempotency-Key")));
        assertEquals(1, keys.size());
    }

    @Test
    void typedErrorsAndNoRetryOn4xx() {
        FakeTransport t = new FakeTransport()
                .add(404, "{\"error\":{\"code\":\"HS_NOT_FOUND\",\"message\":\"yok\",\"request_id\":\"req_1\",\"details\":{\"id\":\"x\"}}}")
                .add(422, "{\"error\":{\"code\":\"HS_NO_RECIPIENTS\",\"message\":\"boş\"}}")
                .add(401, "{\"error\":{\"code\":\"HS_UNAUTHENTICATED\",\"message\":\"anahtar\"}}")
                .add(409, "{\"error\":{\"code\":\"HS_IDEMPOTENCY_CONFLICT\",\"message\":\"x\"}}");
        Pushizo hs = client(t);
        NotFoundException nf = assertThrows(NotFoundException.class, () -> hs.notifications().get("msg_x"));
        assertEquals(404, nf.getStatus());
        assertEquals(ErrorCodes.NOT_FOUND, nf.getCode());
        assertEquals("req_1", nf.getRequestId());
        assertEquals("x", nf.getDetails().get("id"));
        assertFalse(nf.isRetryable());
        InvalidRequestException ir = assertThrows(InvalidRequestException.class, () -> hs.segments().get("seg_1"));
        assertEquals(ErrorCodes.NO_RECIPIENTS, ir.getCode());
        assertThrows(AuthenticationException.class, () -> hs.apps().list());
        ConflictException ce = assertThrows(ConflictException.class, () -> hs.apps().list());
        assertEquals(ErrorCodes.IDEMPOTENCY_CONFLICT, ce.getCode());
        assertTrue(slept.isEmpty());
        assertEquals(4, t.requests.size());
    }

    @Test
    void retriesExhausted() {
        FakeTransport t = new FakeTransport().add(500, "{}").add(500, "{}").add(500, "{}").add(500, "{}");
        ServerException e = assertThrows(ServerException.class, () -> client(t).apps().list());
        assertEquals("HTTP_500", e.getCode());
        assertEquals(4, t.requests.size());
        assertEquals(List.of(300L, 1000L, 3000L), slept);

        FakeTransport t2 = new FakeTransport().networkError().networkError();
        Pushizo hs2 = Pushizo.builder().apiKey("k").transport(t2).maxRetries(1).sleeper(ms -> { }).build();
        NetworkException ne = assertThrows(NetworkException.class, () -> hs2.apps().list());
        assertEquals(0, ne.getStatus());
        assertEquals(ErrorCodes.NETWORK, ne.getCode());

        FakeTransport t3 = new FakeTransport().add(429, "{}");
        assertThrows(RateLimitException.class, () -> client(t3).apps().list(RequestOptions.builder().maxRetries(0).build()));
    }

    static final String UNAVAILABLE = "{\"error\":{\"code\":\"HS_SERVICE_UNAVAILABLE\",\"message\":\"x\"}}";

    @Test
    void postWithoutIdempotencyKeyIsNotRetriedOn5xx() {
        FakeTransport t = new FakeTransport().add(503, UNAVAILABLE).add(200, "{\"accepted\":1}");
        assertThrows(ServerException.class, () -> client(t).events().send(new ApiEventsDto().events(List.of())));
        assertEquals(1, t.requests.size());
        assertTrue(slept.isEmpty());

        // Otomatik anahtar kapalıyken notifications.create de anahtarsız POST'tur.
        FakeTransport t2 = new FakeTransport().add(503, UNAVAILABLE).add(202, "{\"id\":\"m\"}");
        Pushizo noAuto = Pushizo.builder().apiKey("k").appId("app_1").transport(t2).sleeper(slept::add).autoIdempotencyKey(false).build();
        assertThrows(ServerException.class, () -> noAuto.notifications().create(new CreateNotificationDto().contents(Map.of("en", "x"))));
        assertEquals(1, t2.requests.size());

        // Gönderildikten sonra kopan bağlantı: sunucu isteği işlemiş olabilir, tekrarlanmaz.
        FakeTransport t3 = new FakeTransport().networkError().add(200, "{}");
        assertThrows(NetworkException.class, () -> client(t3).events().send(new ApiEventsDto()));
        assertEquals(1, t3.requests.size());
    }

    @Test
    void postWithIdempotencyKeyIsRetriedOn5xx() {
        FakeTransport t = new FakeTransport().add(503, UNAVAILABLE).add(200, "{\"accepted\":1}");
        client(t).events().send(new ApiEventsDto(), RequestOptions.builder().idempotencyKey("evt-1").build());
        assertEquals(2, t.requests.size());
        t.requests.forEach(r -> assertEquals("evt-1", r.headers().get("Idempotency-Key")));

        // Başlıkla verilen anahtar da sayılır; PATCH aynı kurala uyar.
        FakeTransport t2 = new FakeTransport().add(503, UNAVAILABLE).add(200, "{}");
        client(t2).request("PATCH", "/v1/apps/{appId}", null, Map.of("name", "x"), RequestOptions.builder().header("Idempotency-Key", "upd-1").build());
        assertEquals(List.of("PATCH", "PATCH"), t2.requests.stream().map(HttpTransport.Request::method).toList());
    }

    @Test
    void idempotentMethodsAreRetriedOn5xx() {
        FakeTransport t = new FakeTransport().add(503, UNAVAILABLE).add(200, "{\"id\":\"msg_1\"}").add(503, UNAVAILABLE).add(200, "{\"ok\":true}");
        Pushizo hs = client(t);
        hs.notifications().get("msg_1");
        hs.webhooks().delete("whk_1");
        assertEquals(List.of("GET", "GET", "DELETE", "DELETE"), t.requests.stream().map(HttpTransport.Request::method).toList());
    }

    @Test
    void rateLimitedPostIsRetriedWithoutKey() {
        FakeTransport t = new FakeTransport()
                .add(429, "{\"error\":{\"code\":\"HS_RATE_LIMITED\",\"message\":\"x\"}}", "Retry-After", "1")
                .add(200, "{\"accepted\":1}");
        client(t).events().send(new ApiEventsDto());
        assertEquals(2, t.requests.size());
        assertEquals(List.of(1000L), slept);
        assertNull(t.requests.get(0).headers().get("Idempotency-Key"));
    }

    @Test
    void postIsRetriedWhenRequestWasNeverSent() {
        FakeTransport t = new FakeTransport().connectionRefused().add(200, "{\"accepted\":1}");
        client(t).events().send(new ApiEventsDto());
        assertEquals(2, t.requests.size());
    }

    @Test
    void postIsRetriedOnRealConnectionRefused() throws Exception {
        int port;
        try (java.net.ServerSocket socket = new java.net.ServerSocket(0, 1, java.net.InetAddress.getLoopbackAddress())) {
            port = socket.getLocalPort();
        }
        Pushizo hs = Pushizo.builder().apiKey("k").appId("app_1").baseUrl("http://127.0.0.1:" + port).maxRetries(1).sleeper(slept::add).build();
        assertThrows(NetworkException.class, () -> hs.events().send(new ApiEventsDto()));
        assertEquals(List.of(300L), slept);
    }

    @Test
    @SuppressWarnings("deprecation")
    void inAppSelectWinnerAndDeprecatedAlias() throws Exception {
        FakeTransport t = new FakeTransport().add(200, "{\"id\":\"iam_1\"}").add(200, "{\"id\":\"iam_1\"}");
        Pushizo hs = client(t);
        hs.inAppMessages().selectWinner("iam_1", new InAppWinnerDto().variantId("b"));
        hs.inAppMessages().winner("iam_1", new InAppWinnerDto().variantId("b"));
        assertEquals(2, t.requests.size());
        for (int i = 0; i < 2; i++) {
            assertEquals("POST", t.requests.get(i).method());
            assertEquals("https://api.test/v1/apps/app_1/in-app-messages/iam_1/winner", t.requests.get(i).url());
            assertEquals("b", t.body(i).get("variant_id").asText());
        }
    }

    @Test
    void paginationIteratesAllPages() {
        FakeTransport t = new FakeTransport()
                .add(200, "{\"data\":[{\"id\":\"s1\"},{\"id\":\"s2\"}],\"next_cursor\":\"c2\",\"has_more\":true}")
                .add(200, "{\"data\":[{\"id\":\"s3\"}],\"next_cursor\":null,\"has_more\":false}");
        List<String> ids = new ArrayList<>();
        SegmentsListParams params = new SegmentsListParams().limit(2L);
        for (Segment s : client(t).segments().listAll(params)) {
            ids.add(s.getId());
        }
        assertEquals(List.of("s1", "s2", "s3"), ids);
        assertNull(params.getCursor(), "çağıranın parametreleri değiştirilmez");
        assertEquals("https://api.test/v1/apps/app_1/segments?limit=2", t.requests.get(0).url());
        assertEquals("https://api.test/v1/apps/app_1/segments?limit=2&cursor=c2", t.requests.get(1).url());
    }

    @Test
    void multipartImport() {
        FakeTransport t = new FakeTransport().add(202, "{\"id\":\"imp_1\"}");
        client(t).imports().create(new ImportsCreateForm().type("csv_users")
                .file(new FileUpload("users.csv", "external_id\nu1\n".getBytes(StandardCharsets.UTF_8), "text/csv")));
        HttpTransport.Request r = t.requests.get(0);
        assertTrue(r.headers().get("Content-Type").startsWith("multipart/form-data; boundary="));
        String body = new String(r.body(), StandardCharsets.UTF_8);
        assertTrue(body.contains("name=\"type\"\r\n\r\ncsv_users"));
        assertTrue(body.contains("filename=\"users.csv\""));
        assertTrue(body.contains("external_id\nu1\n"));
    }

    @Test
    void identityHashMatchesNode() {
        // Node: createHmac('sha256', 'secret').update('user-1').digest('hex')
        assertEquals("1d16fd7e96e8a9681f283b8a251822ffdc71e2a5bda0c5267a044874fa21b82b", Pushizo.identityHash("secret", "user-1"));
    }

    @Test
    void defaultTransportAgainstLocalServer() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        List<String> seen = new ArrayList<>();
        server.createContext("/", exchange -> {
            seen.add(exchange.getRequestMethod() + " " + exchange.getRequestURI().getRawPath() + " " + exchange.getRequestHeaders().getFirst("Authorization"));
            byte[] out = "{\"data\":[{\"id\":\"app_1\",\"name\":\"Demo\"}]}".getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, out.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(out);
            }
        });
        server.start();
        try {
            Pushizo hs = Pushizo.builder().apiKey("hs_live_x").baseUrl("http://127.0.0.1:" + server.getAddress().getPort()).build();
            assertEquals("Demo", hs.apps().list().getData().get(0).getName());
            String csv = hs.request("GET", "/v1/apps", null, null, null);
            assertTrue(csv.contains("Demo"));
            assertEquals("GET /v1/apps Bearer hs_live_x", seen.get(0));
        } finally {
            server.stop(0);
        }
    }
}
