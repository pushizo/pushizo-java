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
 * geofences kaynağı.
 */
public final class GeofencesResource {
    private final Pushizo client;

    public GeofencesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<GeofenceList> TYPE_0 = new TypeReference<GeofenceList>() {};

    /**
     * Bölgeler
     *
     * {@code GET /v1/apps/{appId}/geofences}
     */
    public GeofenceList list() {
        return list(null);
    }

    /**
     * Bölgeler
     *
     * {@code GET /v1/apps/{appId}/geofences}
     */
    public GeofenceList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/geofences");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<Geofence> TYPE_1 = new TypeReference<Geofence>() {};

    /**
     * Bölge oluştur
     *
     * {@code POST /v1/apps/{appId}/geofences}
     *
     * Konum paylaşan abonelik bölgeye girip çıktığında `geofence_enter` ve `geofence_exit` olayları oluşur.
     */
    public Geofence create(CreateGeofenceDto body) {
        return create(body, null);
    }

    /**
     * Bölge oluştur
     *
     * {@code POST /v1/apps/{appId}/geofences}
     *
     * Konum paylaşan abonelik bölgeye girip çıktığında `geofence_enter` ve `geofence_exit` olayları oluşur.
     */
    public Geofence create(CreateGeofenceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/geofences");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Geofence> TYPE_2 = new TypeReference<Geofence>() {};

    /**
     * Bölge ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/geofences/{geofenceId}}
     */
    public Geofence get(String geofenceId) {
        return get(geofenceId, null);
    }

    /**
     * Bölge ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/geofences/{geofenceId}}
     */
    public Geofence get(String geofenceId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/geofences/{geofenceId}");
        op.pathParam("geofenceId", geofenceId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Geofence> TYPE_3 = new TypeReference<Geofence>() {};

    /**
     * Bölgeyi güncelle
     *
     * {@code PATCH /v1/apps/{appId}/geofences/{geofenceId}}
     */
    public Geofence update(String geofenceId, UpdateGeofenceDto body) {
        return update(geofenceId, body, null);
    }

    /**
     * Bölgeyi güncelle
     *
     * {@code PATCH /v1/apps/{appId}/geofences/{geofenceId}}
     */
    public Geofence update(String geofenceId, UpdateGeofenceDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/geofences/{geofenceId}");
        op.pathParam("geofenceId", geofenceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Bölgeyi sil
     *
     * {@code DELETE /v1/apps/{appId}/geofences/{geofenceId}}
     */
    public Ok delete(String geofenceId) {
        return delete(geofenceId, null);
    }

    /**
     * Bölgeyi sil
     *
     * {@code DELETE /v1/apps/{appId}/geofences/{geofenceId}}
     */
    public Ok delete(String geofenceId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/geofences/{geofenceId}");
        op.pathParam("geofenceId", geofenceId);
        return client.execute(op, options, TYPE_4);
    }
}
