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
 * predictions kaynağı.
 */
public final class PredictionsResource {
    private final Pushizo client;

    public PredictionsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<PredictionModelList> TYPE_0 = new TypeReference<PredictionModelList>() {};

    /**
     * Öngörü modelleri
     *
     * {@code GET /v1/apps/{appId}/predictions}
     */
    public PredictionModelList list() {
        return list(null);
    }

    /**
     * Öngörü modelleri
     *
     * {@code GET /v1/apps/{appId}/predictions}
     */
    public PredictionModelList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/predictions");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<PredictionModel> TYPE_1 = new TypeReference<PredictionModel>() {};

    /**
     * Öngörü modeli oluştur
     *
     * {@code POST /v1/apps/{appId}/predictions}
     *
     * Eğitim kuyruğa alınır; sonuç `outcome` alanından izlenir.
     */
    public PredictionModel create(CreatePredictionDto body) {
        return create(body, null);
    }

    /**
     * Öngörü modeli oluştur
     *
     * {@code POST /v1/apps/{appId}/predictions}
     *
     * Eğitim kuyruğa alınır; sonuç `outcome` alanından izlenir.
     */
    public PredictionModel create(CreatePredictionDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/predictions");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<PredictionModel> TYPE_2 = new TypeReference<PredictionModel>() {};

    /**
     * Öngörü modeli
     *
     * {@code GET /v1/apps/{appId}/predictions/{id}}
     */
    public PredictionModel get(String id) {
        return get(id, null);
    }

    /**
     * Öngörü modeli
     *
     * {@code GET /v1/apps/{appId}/predictions/{id}}
     */
    public PredictionModel get(String id, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/predictions/{id}");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<PredictionModel> TYPE_3 = new TypeReference<PredictionModel>() {};

    /**
     * Öngörü modelini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/predictions/{id}}
     *
     * Olay veya ufuk değişirse yeniden eğitilir; kapatınca skorlar silinir.
     */
    public PredictionModel update(String id, UpdatePredictionDto body) {
        return update(id, body, null);
    }

    /**
     * Öngörü modelini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/predictions/{id}}
     *
     * Olay veya ufuk değişirse yeniden eğitilir; kapatınca skorlar silinir.
     */
    public PredictionModel update(String id, UpdatePredictionDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/predictions/{id}");
        op.pathParam("id", id);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    /**
     * Öngörü modelini sil
     *
     * {@code DELETE /v1/apps/{appId}/predictions/{id}}
     */
    public void delete(String id) {
        delete(id, null);
    }

    /**
     * Öngörü modelini sil
     *
     * {@code DELETE /v1/apps/{appId}/predictions/{id}}
     */
    public void delete(String id, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/predictions/{id}");
        op.pathParam("id", id);
        client.execute(op, options, null);
    }

    private static final TypeReference<PredictionModel> TYPE_4 = new TypeReference<PredictionModel>() {};

    /**
     * Modeli yeniden eğit
     *
     * {@code POST /v1/apps/{appId}/predictions/{id}/compute}
     */
    public PredictionModel compute(String id) {
        return compute(id, null);
    }

    /**
     * Modeli yeniden eğit
     *
     * {@code POST /v1/apps/{appId}/predictions/{id}/compute}
     */
    public PredictionModel compute(String id, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/predictions/{id}/compute");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<PredictionUsersPage> TYPE_5 = new TypeReference<PredictionUsersPage>() {};

    /**
     * Skoru olan kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/predictions/{id}/users}
     */
    public PredictionUsersPage users(String id) {
        return users(id, null, null);
    }

    /**
     * Skoru olan kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/predictions/{id}/users}
     */
    public PredictionUsersPage users(String id, PredictionsUsersParams params) {
        return users(id, params, null);
    }

    /**
     * Skoru olan kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/predictions/{id}/users}
     *
     * Parametreler: bucket — Değerler: "low", "medium", "high".
     */
    public PredictionUsersPage users(String id, PredictionsUsersParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/predictions/{id}/users");
        op.pathParam("id", id);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }
}
