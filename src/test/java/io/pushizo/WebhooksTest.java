package io.pushizo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import io.pushizo.core.Json;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

/** Ortak vektörler: sdk/testdata/webhook-signature-vectors.json (Node, PHP, Python, Go, .NET, Ruby ile aynı). */
class WebhooksTest {
    @TestFactory
    Stream<DynamicTest> sharedVectors() throws Exception {
        JsonNode root = Json.mapper().readTree(Files.readAllBytes(Path.of("..", "testdata", "webhook-signature-vectors.json")));
        List<DynamicTest> tests = new ArrayList<>();
        for (JsonNode c : root.get("cases")) {
            tests.add(DynamicTest.dynamicTest(c.get("name").asText(), () -> {
                byte[] payload = c.get("payload").asText().getBytes(StandardCharsets.UTF_8);
                String header = c.get("header").isNull() ? null : c.get("header").asText();
                List<String> secrets = new ArrayList<>();
                c.get("secrets").forEach(s -> secrets.add(s.asText()));
                Duration tolerance = Duration.ofSeconds(c.get("toleranceSeconds").asLong());
                Instant now = Instant.ofEpochSecond(c.get("now").asLong());
                JsonNode expected = c.get("expected");
                WebhookVerifyResult result = Webhooks.verifySignature(payload, header, secrets, tolerance, now);
                assertEquals(expected.get("ok").asBoolean(), result.ok());
                if (result.ok()) {
                    assertEquals(expected.get("timestamp").asLong(), result.timestamp());
                    List<WebhookEvent> events = Webhooks.constructEvents(payload, header, secrets, tolerance, now);
                    if (c.has("events")) {
                        assertEquals(c.get("events").asInt(), events.size());
                    }
                } else {
                    assertEquals(expected.get("reason").asText(), result.reason());
                    WebhookSignatureException e = assertThrows(WebhookSignatureException.class,
                            () -> Webhooks.constructEvents(payload, header, secrets, tolerance, now));
                    assertEquals(expected.get("reason").asText(), e.getReason());
                }
            }));
        }
        assertFalse(tests.isEmpty());
        return tests.stream();
    }

    @Test
    void batchEventsExposeFields() {
        String payload = "{\"events\":[{\"id\":\"whe_1\",\"type\":\"user.created\",\"created_at\":\"2026-10-07T00:00:00Z\",\"app_id\":\"app_1\",\"data\":{\"x\":1}}]}";
        long t = Instant.now().getEpochSecond();
        String sig = sign("whsec_x", t + "." + payload);
        List<WebhookEvent> events = Webhooks.constructEvents(payload.getBytes(StandardCharsets.UTF_8), "t=" + t + ",v1=" + sig, List.of("whsec_x"));
        assertEquals(1, events.size());
        assertEquals("whe_1", events.get(0).getId());
        assertEquals("app_1", events.get(0).getAppId());
        assertEquals(1, events.get(0).getData().get("x").asInt());
        assertTrue(Webhooks.verifySignature(payload, "t=" + t + ",v1=" + sig, List.of("whsec_x")).ok());
    }

    private static String sign(String secret, String data) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(new javax.crypto.spec.SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return java.util.HexFormat.of().formatHex(mac.doFinal(data.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
