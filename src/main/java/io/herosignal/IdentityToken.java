package io.herosignal;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;

/**
 * SDK JWT identity verification belirteci (ES256; ADR-0023 §9). Belirteç {@code sub} = external_id,
 * {@code aud} = app_id taşır, ömrü en çok 24 saattir. Uygulamanız belirteci kendi sunucusundan alır ve istemci
 * SDK'sının {@code login(externalId, jwt)} çağrısına verir.
 */
public final class IdentityToken {
    /** En uzun belirteç ömrü. */
    public static final Duration MAX_LIFETIME = Duration.ofHours(24);

    private IdentityToken() {
    }

    /**
     * @param privateKeyPem PKCS#8 PEM ("BEGIN PRIVATE KEY") P-256 özel anahtarı
     * @param kid           panelde kayıtlı genel anahtar kimliği
     * @param ttl           ömür (1 sn … 24 saat)
     */
    public static String create(String privateKeyPem, String kid, String appId, String externalId, Duration ttl) {
        return create(privateKeyPem, kid, appId, externalId, ttl, Instant.now());
    }

    static String create(String privateKeyPem, String kid, String appId, String externalId, Duration ttl, Instant now) {
        if (ttl.isNegative() || ttl.isZero() || ttl.compareTo(MAX_LIFETIME) > 0) {
            throw new IllegalArgumentException("ttl 1 sn … 24 saat aralığında olmalı");
        }
        Base64.Encoder enc = Base64.getUrlEncoder().withoutPadding();
        long iat = now.getEpochSecond();
        String header = enc.encodeToString(("{\"alg\":\"ES256\",\"typ\":\"JWT\",\"kid\":" + quote(kid) + "}").getBytes(StandardCharsets.UTF_8));
        String payload = enc.encodeToString(("{\"sub\":" + quote(externalId) + ",\"aud\":" + quote(appId) + ",\"iat\":" + iat
                + ",\"exp\":" + (iat + ttl.getSeconds()) + "}").getBytes(StandardCharsets.UTF_8));
        String signingInput = header + "." + payload;
        try {
            PrivateKey key = parse(privateKeyPem);
            // JWS ES256 imzası DER değil r||s (IEEE P1363) biçimindedir.
            Signature signer = Signature.getInstance("SHA256withECDSAinP1363Format");
            signer.initSign(key);
            signer.update(signingInput.getBytes(StandardCharsets.US_ASCII));
            return signingInput + "." + enc.encodeToString(signer.sign());
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("ES256 belirteci imzalanamadı: " + e.getMessage(), e);
        }
    }

    private static PrivateKey parse(String pem) throws GeneralSecurityException {
        String body = pem.replaceAll("-----(BEGIN|END) [A-Z ]*PRIVATE KEY-----", "").replaceAll("\\s", "");
        PrivateKey key = KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder().decode(body)));
        if (!(key instanceof ECPrivateKey ec) || ec.getParams().getCurve().getField().getFieldSize() != 256) {
            throw new GeneralSecurityException("ES256 için P-256 EC özel anahtarı (PKCS#8) gerekli");
        }
        return key;
    }

    /** Minimal JSON dize kaçışı (kimlikler kullanıcı girdisidir). */
    private static String quote(String value) {
        StringBuilder sb = new StringBuilder("\"");
        for (char c : value.toCharArray()) {
            switch (c) {
                case '"' -> sb.append("\\\"");
                case '\\' -> sb.append("\\\\");
                case '\n' -> sb.append("\\n");
                case '\r' -> sb.append("\\r");
                case '\t' -> sb.append("\\t");
                default -> {
                    if (c < 0x20) sb.append(String.format("\\u%04x", (int) c));
                    else sb.append(c);
                }
            }
        }
        return sb.append('"').toString();
    }
}
