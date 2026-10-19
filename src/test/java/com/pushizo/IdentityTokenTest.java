package com.pushizo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import org.junit.jupiter.api.Test;

class IdentityTokenTest {
    private static KeyPair keyPair() throws Exception {
        KeyPairGenerator gen = KeyPairGenerator.getInstance("EC");
        gen.initialize(new ECGenParameterSpec("secp256r1"));
        return gen.generateKeyPair();
    }

    private static String pem(KeyPair pair) {
        return "-----BEGIN PRIVATE KEY-----\n" + Base64.getMimeEncoder().encodeToString(pair.getPrivate().getEncoded()) + "\n-----END PRIVATE KEY-----\n";
    }

    @Test
    void basliktaleplerVeImzaDogrulanir() throws Exception {
        KeyPair pair = keyPair();
        String token = IdentityToken.create(pem(pair), "main", "app_1", "kullanici-1", Duration.ofMinutes(10), Instant.ofEpochSecond(1_800_000_000L));
        String[] parts = token.split("\\.");
        assertEquals(3, parts.length);
        Base64.Decoder dec = Base64.getUrlDecoder();
        assertEquals("{\"alg\":\"ES256\",\"typ\":\"JWT\",\"kid\":\"main\"}", new String(dec.decode(parts[0]), StandardCharsets.UTF_8));
        assertEquals("{\"sub\":\"kullanici-1\",\"aud\":\"app_1\",\"iat\":1800000000,\"exp\":1800000600}", new String(dec.decode(parts[1]), StandardCharsets.UTF_8));
        byte[] sig = dec.decode(parts[2]);
        assertEquals(64, sig.length);
        Signature verifier = Signature.getInstance("SHA256withECDSAinP1363Format");
        verifier.initVerify(pair.getPublic());
        verifier.update((parts[0] + "." + parts[1]).getBytes(StandardCharsets.US_ASCII));
        assertTrue(verifier.verify(sig));
    }

    @Test
    void omurSiniriVeJsonKacisi() throws Exception {
        KeyPair pair = keyPair();
        assertThrows(IllegalArgumentException.class, () -> IdentityToken.create(pem(pair), "k", "a", "e", Duration.ofHours(25)));
        String token = IdentityToken.create(pem(pair), "k", "a", "tırnak\"lı", Duration.ofMinutes(1));
        String payload = new String(Base64.getUrlDecoder().decode(token.split("\\.")[1]), StandardCharsets.UTF_8);
        assertTrue(payload.contains("\"sub\":\"tırnak\\\"lı\""));
    }
}
