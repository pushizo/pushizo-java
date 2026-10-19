// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pushizo.Pushizo;
import com.pushizo.RequestOptions;
import com.pushizo.core.Operation;
import com.pushizo.core.PageIterable;
import com.pushizo.models.*;
import com.pushizo.params.*;

/**
 * identityKeys kaynağı.
 */
public final class IdentityKeysResource {
    private final Pushizo client;

    public IdentityKeysResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<IdentityKeyList> TYPE_0 = new TypeReference<IdentityKeyList>() {};

    /**
     * SDK kimlik doğrulama (JWT) genel anahtarları
     *
     * {@code GET /v1/apps/{appId}/identity-keys}
     */
    public IdentityKeyList list() {
        return list(null);
    }

    /**
     * SDK kimlik doğrulama (JWT) genel anahtarları
     *
     * {@code GET /v1/apps/{appId}/identity-keys}
     */
    public IdentityKeyList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/identity-keys");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<IdentityKey> TYPE_1 = new TypeReference<IdentityKey>() {};

    /**
     * Genel anahtar ekle (ES256)
     *
     * {@code POST /v1/apps/{appId}/identity-keys}
     *
     * SDK JWT identity verification için ES256 (EC P-256) genel anahtarı ekler; özel anahtar gönderilmez. Belirteç sunucunuzda imzalanır (`sub` = external_id, `aud` = app_id, `exp` ≤ 24 saat) ve SDK isteklerinde `Authorization: Bearer &lt;jwt&gt;` başlığıyla taşınır. Kip app ayarında `identity_verification_mode` ile seçilir.
     */
    public IdentityKey create(CreateIdentityKeyDto body) {
        return create(body, null);
    }

    /**
     * Genel anahtar ekle (ES256)
     *
     * {@code POST /v1/apps/{appId}/identity-keys}
     *
     * SDK JWT identity verification için ES256 (EC P-256) genel anahtarı ekler; özel anahtar gönderilmez. Belirteç sunucunuzda imzalanır (`sub` = external_id, `aud` = app_id, `exp` ≤ 24 saat) ve SDK isteklerinde `Authorization: Bearer &lt;jwt&gt;` başlığıyla taşınır. Kip app ayarında `identity_verification_mode` ile seçilir.
     */
    public IdentityKey create(CreateIdentityKeyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/identity-keys");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<IdentityKey> TYPE_2 = new TypeReference<IdentityKey>() {};

    /**
     * Genel anahtarı iptal et
     *
     * {@code DELETE /v1/apps/{appId}/identity-keys/{keyId}}
     */
    public IdentityKey revoke(String keyId) {
        return revoke(keyId, null);
    }

    /**
     * Genel anahtarı iptal et
     *
     * {@code DELETE /v1/apps/{appId}/identity-keys/{keyId}}
     */
    public IdentityKey revoke(String keyId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/identity-keys/{keyId}");
        op.pathParam("keyId", keyId);
        return client.execute(op, options, TYPE_2);
    }
}
