package io.herosignal.webhooks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import io.herosignal.HeroSignal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** sdk/testdata/webhook-signature-vectors.json ortak vektörleri (Node/PHP/Python/Go/.NET/Ruby ile aynı). */
class WebhooksTest {
    static Stream<Arguments> cases() throws Exception {
        Path path = Paths.get(System.getProperty("herosignal.testdata", "../testdata"), "webhook-signature-vectors.json");
        JsonNode root = HeroSignal.objectMapper().readTree(Files.readAllBytes(path));
        List<Arguments> out = new ArrayList<>();
        for (JsonNode c : root.get("cases")) out.add(Arguments.of(c.get("name").asText(), c));
        assertFalse(out.isEmpty());
        return out.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("cases")
    void sharedVector(String name, JsonNode c) {
        byte[] payload = c.get("payload").asText().getBytes(StandardCharsets.UTF_8);
        String header = c.get("header").isNull() ? null : c.get("header").asText();
        List<String> secrets = new ArrayList<>();
        c.get("secrets").forEach(s -> secrets.add(s.asText()));
        Duration tolerance = Duration.ofSeconds(c.get("toleranceSeconds").asLong());
        Instant now = Instant.ofEpochSecond(c.get("now").asLong());
        JsonNode expected = c.get("expected");

        WebhookVerifyResult result = Webhooks.verifySignature(payload, header, secrets, tolerance, now);
        assertEquals(expected.get("ok").asBoolean(), result.isOk(), name);
        if (result.isOk()) {
            assertEquals(expected.get("timestamp").asLong(), result.getTimestamp());
            if (c.has("events")) {
                List<WebhookEvent> events = Webhooks.constructEvents(payload, header, secrets, tolerance, now);
                assertEquals(c.get("events").asInt(), events.size());
                for (WebhookEvent e : events) {
                    assertNotNull(e.getType());
                    assertNotNull(e.getId());
                }
            }
        } else {
            assertEquals(expected.get("reason").asText(), result.getReason().code());
            WebhookSignatureException e = assertThrows(WebhookSignatureException.class,
                    () -> Webhooks.constructEvents(payload, header, secrets, tolerance, now));
            assertEquals(expected.get("reason").asText(), e.getReason().code());
        }
    }

    @Test
    void malformedBodyAfterValidSignature() throws Exception {
        byte[] body = "not json".getBytes(StandardCharsets.UTF_8);
        String header = "t=1800000000,v1=" + sign("s", "1800000000.not json");
        WebhookSignatureException e = assertThrows(WebhookSignatureException.class,
                () -> Webhooks.constructEvents(body, header, List.of("s"), null, Instant.ofEpochSecond(1800000000L)));
        assertEquals(WebhookVerifyFailure.MALFORMED_BODY, e.getReason());
    }

    @Test
    void defaultToleranceUsesCurrentTime() throws Exception {
        long ts = Instant.now().getEpochSecond();
        String payload = "{\"id\":\"whe_1\",\"type\":\"x\"}";
        byte[] bytes = payload.getBytes(StandardCharsets.UTF_8);
        assertTrue(Webhooks.verifySignature(bytes, "t=" + ts + ",v1=" + sign("s", ts + "." + payload), List.of("s")).isOk());
        long old = ts - 400;
        assertEquals(WebhookVerifyFailure.TIMESTAMP_OUT_OF_TOLERANCE,
                Webhooks.verifySignature(bytes, "t=" + old + ",v1=" + sign("s", old + "." + payload), List.of("s")).getReason());
    }

    private static String sign(String secret, String data) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        StringBuilder sb = new StringBuilder();
        for (byte b : mac.doFinal(data.getBytes(StandardCharsets.UTF_8))) sb.append(String.format("%02x", b));
        return sb.toString();
    }
}
