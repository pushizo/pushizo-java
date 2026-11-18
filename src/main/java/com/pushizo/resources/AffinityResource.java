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
 * affinity kaynağı.
 */
public final class AffinityResource {
    private final Pushizo client;

    public AffinityResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<AffinityConfig> TYPE_0 = new TypeReference<AffinityConfig>() {};

    /**
     * İlgi modeli
     *
     * {@code GET /v1/apps/{appId}/affinity/config}
     */
    public AffinityConfig config() {
        return config(null);
    }

    /**
     * İlgi modeli
     *
     * {@code GET /v1/apps/{appId}/affinity/config}
     */
    public AffinityConfig config(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/affinity/config");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<AffinityConfig> TYPE_1 = new TypeReference<AffinityConfig>() {};

    /**
     * İlgi modelini ayarla
     *
     * {@code PUT /v1/apps/{appId}/affinity/config}
     *
     * Model açıksa ilgiler kayıttan sonra yeniden hesaplanır.
     */
    public AffinityConfig update(UpdateAffinityConfigDto body) {
        return update(body, null);
    }

    /**
     * İlgi modelini ayarla
     *
     * {@code PUT /v1/apps/{appId}/affinity/config}
     *
     * Model açıksa ilgiler kayıttan sonra yeniden hesaplanır.
     */
    public AffinityConfig update(UpdateAffinityConfigDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/affinity/config");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<AffinityConfig> TYPE_2 = new TypeReference<AffinityConfig>() {};

    /**
     * İlgileri yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/affinity/compute}
     */
    public AffinityConfig compute() {
        return compute(null);
    }

    /**
     * İlgileri yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/affinity/compute}
     */
    public AffinityConfig compute(RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/affinity/compute");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<AffinityOverview> TYPE_3 = new TypeReference<AffinityOverview>() {};

    /**
     * Özellik başına en yaygın ilgiler
     *
     * {@code GET /v1/apps/{appId}/affinity/overview}
     */
    public AffinityOverview overview() {
        return overview(null);
    }

    /**
     * Özellik başına en yaygın ilgiler
     *
     * {@code GET /v1/apps/{appId}/affinity/overview}
     */
    public AffinityOverview overview(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/affinity/overview");
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<UserAffinity> TYPE_4 = new TypeReference<UserAffinity>() {};

    /**
     * Kişinin ilgileri ve haftalık sıklık sınırı
     *
     * {@code GET /v1/apps/{appId}/affinity/users/{userId}}
     */
    public UserAffinity user(String userId) {
        return user(userId, null);
    }

    /**
     * Kişinin ilgileri ve haftalık sıklık sınırı
     *
     * {@code GET /v1/apps/{appId}/affinity/users/{userId}}
     */
    public UserAffinity user(String userId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/affinity/users/{userId}");
        op.pathParam("userId", userId);
        return client.execute(op, options, TYPE_4);
    }
}
