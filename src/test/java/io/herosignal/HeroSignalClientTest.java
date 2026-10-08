package io.herosignal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import io.herosignal.models.CreateNotificationDto;
import io.herosignal.models.CreateNotificationDtoTarget;
import io.herosignal.models.CreateNotificationResult;
import io.herosignal.models.CreateSuppressionDto;
import io.herosignal.models.Segment;
import io.herosignal.resources.ImportsCreateParams;
import io.herosignal.resources.NotificationsListParams;
import io.herosignal.resources.SegmentsListParams;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;

/** İstemci davranışı: kimlik doğrulama, app kapsamı, idempotency, yeniden deneme, hata eşleme, sayfalama. */
class HeroSignalClientTest {
    private static CreateNotificationDto notification() {
        return new CreateNotificationDto()
                .setTarget(new CreateNotificationDtoTarget().setIncludeAliases(Map.of("external_id", List.of("u1"))))
                .setContents(Map.of("en", "Hi"));
    }

    @Test
    void requiresApiKey() {
        assertThrows(IllegalArgumentException.class, () -> HeroSignal.builder().build());
    }

    @Test
    void createNotificationHeadersBodyAndIdempotencyReuse() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(503, "{\"error\":{\"code\":\"UNAVAILABLE\",\"message\":\"x\"}}").json(202, "{\"id\":\"msg_1\",\"status\":\"queued\"}");
            CreateNotificationResult res = s.client().notifications().create(notification());
            assertEquals("msg_1", res.getId());
            assertEquals(2, s.requests.size());
            FakeServer.Recorded r = s.requests.get(0);
            assertEquals("POST", r.method);
            assertEquals("/v1/notifications", r.uri.getPath());
            assertEquals("Bearer hs_live_test", r.header("Authorization"));
            assertTrue(r.header("User-Agent").startsWith("herosignal-java/"));
            assertEquals("application/json", r.header("Content-Type"));
            JsonNode body = HeroSignal.objectMapper().readTree(r.body);
            assertEquals("app_default", body.get("app_id").asText());
            assertFalse(body.has("headings"), "null alanlar yazılmamalı");
            String key = r.header("Idempotency-Key");
            UUID.fromString(key);
            assertEquals(key, s.requests.get(1).header("Idempotency-Key"));
            assertEquals(List.of(Duration.ofMillis(300)), s.sleeps);
        }
    }

    @Test
    void idempotencyExplicitBodyDisabledAndNonIdempotent() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(202, "{}").json(202, "{}").json(202, "{}").json(201, "{}");
            HeroSignal hs = s.client();
            hs.notifications().create(notification(), RequestOptions.builder().idempotencyKey("order-1").build());
            hs.notifications().create(notification().setIdempotencyKey("order-2"));
            s.builder().autoIdempotencyKey(false).build().notifications().create(notification());
            hs.suppressions().create(new CreateSuppressionDto().setChannel("email").setValue("a@b.c"));
            assertEquals("order-1", s.requests.get(0).header("Idempotency-Key"));
            assertEquals("order-2", s.requests.get(1).header("Idempotency-Key"));
            assertNull(s.requests.get(2).header("Idempotency-Key"));
            assertNull(s.requests.get(3).header("Idempotency-Key"));
        }
    }

    @Test
    void appIdPathQueryAndOverride() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(200, "{\"id\":\"seg_1\"}").json(200, "{\"data\":[],\"has_more\":false}");
            HeroSignal hs = s.client();
            hs.segments().get("seg/1", RequestOptions.builder().appId("app_other").build());
            assertEquals("/v1/apps/app_other/segments/seg%2F1", s.requests.get(0).uri.getRawPath());
            hs.notifications().list(new NotificationsListParams().setLimit(10L).setStatus("completed"));
            Map<String, List<String>> q = s.requests.get(1).query();
            assertEquals(List.of("app_default"), q.get("app_id"));
            assertEquals(List.of("10"), q.get("limit"));
            assertEquals(List.of("completed"), q.get("status"));
            assertFalse(q.containsKey("cursor"));
        }
    }

    @Test
    void missingAppIdAndEmptyPathParam() throws Exception {
        try (FakeServer s = new FakeServer()) {
            HeroSignal noApp = s.builder().appId(null).build();
            assertThrows(IllegalArgumentException.class, () -> noApp.segments().list());
            assertThrows(IllegalArgumentException.class, () -> s.client().segments().get(""));
            assertTrue(s.requests.isEmpty());
        }
    }

    @Test
    void retryBackoffAndRetryAfter() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(500, "{}").json(429, "{}", "Retry-After", "2").json(502, "{}").json(200, "{\"data\":[]}");
            s.client().apps().list();
            assertEquals(List.of(Duration.ofMillis(300), Duration.ofSeconds(2), Duration.ofSeconds(3)), s.sleeps);
        }
    }

    @Test
    void retryAfterHttpDate() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(429, "{}", "Retry-After", "Tue, 1 Jan 2030 00:00:10 GMT").json(200, "{}");
            s.client().apps().list();
            assertEquals(List.of(Duration.ofSeconds(10)), s.sleeps);
        }
    }

    @Test
    void retriesExhausted() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(503, "{\"error\":{\"code\":\"UNAVAILABLE\",\"message\":\"down\",\"request_id\":\"req_1\"}}")
                    .json(503, "{\"error\":{\"code\":\"UNAVAILABLE\",\"message\":\"down\",\"request_id\":\"req_2\"}}");
            HeroSignal hs = s.builder().maxRetries(1).build();
            HeroSignalException e = assertThrows(HeroSignalException.class, () -> hs.apps().list());
            assertEquals(503, e.getStatus());
            assertEquals("UNAVAILABLE", e.getCode());
            assertEquals("req_2", e.getRequestId());
            assertTrue(e.isRetryable());
            assertEquals(2, s.requests.size());
            assertEquals(1, s.sleeps.size());
        }
    }

    @Test
    void clientErrorMappedAndNotRetried() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(422, "{\"error\":{\"code\":\"VALIDATION_FAILED\",\"message\":\"bad\",\"request_id\":\"req_1\",\"details\":{\"field\":\"x\"}}}")
                    .raw(404, "not found", "text/plain", "X-Request-Id", "req_h");
            HeroSignal hs = s.client();
            HeroSignalException e = assertThrows(HeroSignalException.class, () -> hs.apps().list());
            assertEquals(422, e.getStatus());
            assertEquals("VALIDATION_FAILED", e.getCode());
            assertEquals("bad", e.getMessage());
            assertEquals("req_1", e.getRequestId());
            assertEquals("x", e.getDetails().get("field"));
            assertFalse(e.isRetryable());
            assertTrue(e.toString().contains("req_1"));
            HeroSignalException e2 = assertThrows(HeroSignalException.class, () -> hs.apps().get());
            assertEquals("HTTP_404", e2.getCode());
            assertEquals("req_h", e2.getRequestId());
            assertEquals(2, s.requests.size());
        }
    }

    @Test
    void networkErrorRetriedThenFails() {
        List<Duration> sleeps = new ArrayList<>();
        HeroSignal hs = HeroSignal.builder().apiKey("k").appId("a").baseUrl("http://127.0.0.1:1").maxRetries(2).sleeper(sleeps::add).build();
        HeroSignalException e = assertThrows(HeroSignalException.class, () -> hs.apps().list());
        assertEquals(0, e.getStatus());
        assertEquals("NETWORK", e.getCode());
        assertNotNull(e.getCause());
        assertEquals(2, sleeps.size());
    }

    @Test
    void timeoutIsRetried() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.hang(1500).json(200, "{\"data\":[]}");
            s.builder().timeout(Duration.ofMillis(200)).build().apps().list();
            assertEquals(List.of(Duration.ofMillis(300)), s.sleeps);
        }
    }

    @Test
    void requestOptionsOverrideRetriesAndHeaders() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(500, "{}");
            HeroSignal hs = s.client();
            assertThrows(HeroSignalException.class,
                    () -> hs.apps().list(RequestOptions.builder().maxRetries(0).header("X-Trace", "t1").build()));
            assertEquals(1, s.requests.size());
            assertEquals("t1", s.requests.get(0).header("X-Trace"));
        }
    }

    @Test
    void autoPaging() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(200, "{\"data\":[{\"id\":\"s1\"},{\"id\":\"s2\"}],\"next_cursor\":\"c2\",\"has_more\":true}")
                    .json(200, "{\"data\":[{\"id\":\"s3\"}],\"next_cursor\":null,\"has_more\":false}");
            List<String> ids = new ArrayList<>();
            for (Segment seg : s.client().segments().listAutoPaging(new SegmentsListParams().setLimit(2L))) ids.add(seg.getId());
            assertEquals(List.of("s1", "s2", "s3"), ids);
            assertFalse(s.requests.get(0).query().containsKey("cursor"));
            assertEquals(List.of("c2"), s.requests.get(1).query().get("cursor"));
            assertEquals(List.of("2"), s.requests.get(1).query().get("limit"));
        }
    }

    @Test
    void multipartUpload() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.json(201, "{\"id\":\"imp_1\"}");
            s.client().imports().create(new ImportsCreateParams()
                    .setType("csv_users")
                    .setFile(FileUpload.of("users.csv", "text/csv", "external_id\nu1\n".getBytes(StandardCharsets.UTF_8))));
            FakeServer.Recorded r = s.requests.get(0);
            assertEquals("/v1/apps/app_default/imports", r.uri.getPath());
            assertTrue(r.header("Content-Type").startsWith("multipart/form-data; boundary="));
            String text = r.bodyText();
            assertTrue(text.contains("name=\"type\""));
            assertTrue(text.contains("csv_users"));
            assertTrue(text.contains("filename=\"users.csv\""));
            assertTrue(text.contains("external_id"));
        }
    }

    @Test
    void rawRequestAndQueryEncoding() throws Exception {
        try (FakeServer s = new FakeServer()) {
            s.raw(200, "a,b\n1,2\n", "text/csv").json(200, "{\"ok\":true}").raw(204, "", "application/json");
            HeroSignal hs = s.client();
            Map<String, Object> q = new LinkedHashMap<>();
            q.put("format", "csv");
            q.put("b", List.of(1, 2));
            q.put("flag", true);
            q.put("skip", null);
            q.put("obj", Map.of("x", 1));
            JsonNode csv = hs.request("GET", "/v1/custom", q, null, null);
            assertEquals("a,b\n1,2\n", csv.asText());
            Map<String, List<String>> got = s.requests.get(0).query();
            assertEquals(List.of("1", "2"), got.get("b"));
            assertEquals(List.of("true"), got.get("flag"));
            assertEquals(List.of("{\"x\":1}"), got.get("obj"));
            assertFalse(got.containsKey("skip"));
            assertTrue(hs.request("GET", "/v1/other", null, null, null).get("ok").asBoolean());
            assertNull(hs.request("DELETE", "/v1/x", null, null, null));
        }
    }

    @Test
    void identityHashMatchesHmac() throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec("secret".getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        StringBuilder expected = new StringBuilder();
        for (byte b : mac.doFinal("user-1".getBytes(StandardCharsets.UTF_8))) expected.append(String.format("%02x", b));
        assertEquals(expected.toString(), HeroSignal.identityHash("secret", "user-1"));
    }
}
