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
 * featureFlags kaynağı.
 */
public final class FeatureFlagsResource {
    private final Pushizo client;

    public FeatureFlagsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<AppFlagList> TYPE_0 = new TypeReference<AppFlagList>() {};

    /**
     * Özellik bayrakları
     *
     * {@code GET /v1/apps/{appId}/feature-flags}
     */
    public AppFlagList list() {
        return list(null);
    }

    /**
     * Özellik bayrakları
     *
     * {@code GET /v1/apps/{appId}/feature-flags}
     */
    public AppFlagList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/feature-flags");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<AppFlag> TYPE_1 = new TypeReference<AppFlag>() {};

    /**
     * Bayrak oluştur
     *
     * {@code POST /v1/apps/{appId}/feature-flags}
     *
     * Değerler uygulama kimliğini bilen herkesçe okunabilir; gizli bilgi yazmayın.
     */
    public AppFlag create(CreateAppFlagDto body) {
        return create(body, null);
    }

    /**
     * Bayrak oluştur
     *
     * {@code POST /v1/apps/{appId}/feature-flags}
     *
     * Değerler uygulama kimliğini bilen herkesçe okunabilir; gizli bilgi yazmayın.
     */
    public AppFlag create(CreateAppFlagDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/feature-flags");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<AppFlagEvaluation> TYPE_2 = new TypeReference<AppFlagEvaluation>() {};

    /**
     * Bayrakları bir kullanıcı için değerlendir
     *
     * {@code POST /v1/apps/{appId}/feature-flags/evaluate}
     */
    public AppFlagEvaluation evaluate(EvaluateAppFlagsDto body) {
        return evaluate(body, null);
    }

    /**
     * Bayrakları bir kullanıcı için değerlendir
     *
     * {@code POST /v1/apps/{appId}/feature-flags/evaluate}
     */
    public AppFlagEvaluation evaluate(EvaluateAppFlagsDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/feature-flags/evaluate");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<AppFlag> TYPE_3 = new TypeReference<AppFlag>() {};

    /**
     * Bayrak ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/feature-flags/{flagId}}
     */
    public AppFlag get(String flagId) {
        return get(flagId, null);
    }

    /**
     * Bayrak ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/feature-flags/{flagId}}
     */
    public AppFlag get(String flagId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/feature-flags/{flagId}");
        op.pathParam("flagId", flagId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<AppFlag> TYPE_4 = new TypeReference<AppFlag>() {};

    /**
     * Bayrağı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/feature-flags/{flagId}}
     */
    public AppFlag update(String flagId, UpdateAppFlagDto body) {
        return update(flagId, body, null);
    }

    /**
     * Bayrağı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/feature-flags/{flagId}}
     */
    public AppFlag update(String flagId, UpdateAppFlagDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/feature-flags/{flagId}");
        op.pathParam("flagId", flagId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * Bayrağı sil
     *
     * {@code DELETE /v1/apps/{appId}/feature-flags/{flagId}}
     */
    public Ok delete(String flagId) {
        return delete(flagId, null);
    }

    /**
     * Bayrağı sil
     *
     * {@code DELETE /v1/apps/{appId}/feature-flags/{flagId}}
     */
    public Ok delete(String flagId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/feature-flags/{flagId}");
        op.pathParam("flagId", flagId);
        return client.execute(op, options, TYPE_5);
    }
}
