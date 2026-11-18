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
 * rfm kaynağı.
 */
public final class RfmResource {
    private final Pushizo client;

    public RfmResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<RfmConfig> TYPE_0 = new TypeReference<RfmConfig>() {};

    /**
     * RFM modeli
     *
     * {@code GET /v1/apps/{appId}/rfm/config}
     */
    public RfmConfig config() {
        return config(null);
    }

    /**
     * RFM modeli
     *
     * {@code GET /v1/apps/{appId}/rfm/config}
     */
    public RfmConfig config(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/rfm/config");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<RfmConfig> TYPE_1 = new TypeReference<RfmConfig>() {};

    /**
     * RFM modelini ayarla
     *
     * {@code PUT /v1/apps/{appId}/rfm/config}
     *
     * Model açıksa skorlar kayıttan sonra yeniden hesaplanır.
     */
    public RfmConfig update(UpdateRfmConfigDto body) {
        return update(body, null);
    }

    /**
     * RFM modelini ayarla
     *
     * {@code PUT /v1/apps/{appId}/rfm/config}
     *
     * Model açıksa skorlar kayıttan sonra yeniden hesaplanır.
     */
    public RfmConfig update(UpdateRfmConfigDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/rfm/config");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<RfmConfig> TYPE_2 = new TypeReference<RfmConfig>() {};

    /**
     * Skorları yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/rfm/compute}
     *
     * İş kuyruğa alınır; ilerleme `status` alanından izlenir.
     */
    public RfmConfig compute() {
        return compute(null);
    }

    /**
     * Skorları yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/rfm/compute}
     *
     * İş kuyruğa alınır; ilerleme `status` alanından izlenir.
     */
    public RfmConfig compute(RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/rfm/compute");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<RfmOverview> TYPE_3 = new TypeReference<RfmOverview>() {};

    /**
     * Segment dağılımı
     *
     * {@code GET /v1/apps/{appId}/rfm/overview}
     */
    public RfmOverview overview() {
        return overview(null);
    }

    /**
     * Segment dağılımı
     *
     * {@code GET /v1/apps/{appId}/rfm/overview}
     */
    public RfmOverview overview(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/rfm/overview");
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<RfmTransitions> TYPE_4 = new TypeReference<RfmTransitions>() {};

    /**
     * İki tarih arası segment geçişleri
     *
     * {@code GET /v1/apps/{appId}/rfm/transitions}
     */
    public RfmTransitions transitions() {
        return transitions(null, null);
    }

    /**
     * İki tarih arası segment geçişleri
     *
     * {@code GET /v1/apps/{appId}/rfm/transitions}
     */
    public RfmTransitions transitions(RfmTransitionsParams params) {
        return transitions(params, null);
    }

    /**
     * İki tarih arası segment geçişleri
     *
     * {@code GET /v1/apps/{appId}/rfm/transitions}
     */
    public RfmTransitions transitions(RfmTransitionsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/rfm/transitions");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<RfmUsersPage> TYPE_5 = new TypeReference<RfmUsersPage>() {};

    /**
     * Skoru olan kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/rfm/users}
     */
    public RfmUsersPage users() {
        return users(null, null);
    }

    /**
     * Skoru olan kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/rfm/users}
     */
    public RfmUsersPage users(RfmUsersParams params) {
        return users(params, null);
    }

    /**
     * Skoru olan kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/rfm/users}
     *
     * Parametreler: segment — Değerler: "champions", "loyal", "potential", "new", "promising", "need_attention", "about_to_sleep", "at_risk", "cant_lose", "hibernating", "lost".
     */
    public RfmUsersPage users(RfmUsersParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/rfm/users");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }
}
