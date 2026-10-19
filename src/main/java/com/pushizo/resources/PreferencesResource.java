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
 * preferences kaynağı.
 */
public final class PreferencesResource {
    private final Pushizo client;

    public PreferencesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<UserPreferences> TYPE_0 = new TypeReference<UserPreferences>() {};

    /**
     * Kullanıcının tercihleri (alias ile)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/preferences}
     */
    public UserPreferences get(String label, String value) {
        return get(label, value, null);
    }

    /**
     * Kullanıcının tercihleri (alias ile)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/preferences}
     */
    public UserPreferences get(String label, String value, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/users/by/{label}/{value}/preferences");
        op.pathParam("label", label);
        op.pathParam("value", value);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<UserPreferences> TYPE_1 = new TypeReference<UserPreferences>() {};

    /**
     * Kullanıcı tercihlerini yaz (alias ile)
     *
     * {@code PUT /v1/apps/{appId}/users/by/{label}/{value}/preferences}
     */
    public UserPreferences set(String label, String value, SetPreferencesDto body) {
        return set(label, value, body, null);
    }

    /**
     * Kullanıcı tercihlerini yaz (alias ile)
     *
     * {@code PUT /v1/apps/{appId}/users/by/{label}/{value}/preferences}
     */
    public UserPreferences set(String label, String value, SetPreferencesDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/users/by/{label}/{value}/preferences");
        op.pathParam("label", label);
        op.pathParam("value", value);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }
}
