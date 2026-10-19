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
 * liveActivities kaynağı.
 */
public final class LiveActivitiesResource {
    private final Pushizo client;

    public LiveActivitiesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<LiveActivityTypeList> TYPE_0 = new TypeReference<LiveActivityTypeList>() {};

    /**
     * Live Activity türleri
     *
     * {@code GET /v1/apps/{appId}/live-activities/types}
     */
    public LiveActivityTypeList listTypes() {
        return listTypes(null);
    }

    /**
     * Live Activity türleri
     *
     * {@code GET /v1/apps/{appId}/live-activities/types}
     */
    public LiveActivityTypeList listTypes(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/live-activities/types");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<LiveActivityType> TYPE_1 = new TypeReference<LiveActivityType>() {};

    /**
     * Live Activity türü oluştur
     *
     * {@code POST /v1/apps/{appId}/live-activities/types}
     */
    public LiveActivityType createType(CreateLiveActivityTypeDto body) {
        return createType(body, null);
    }

    /**
     * Live Activity türü oluştur
     *
     * {@code POST /v1/apps/{appId}/live-activities/types}
     */
    public LiveActivityType createType(CreateLiveActivityTypeDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/live-activities/types");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<LiveActivityType> TYPE_2 = new TypeReference<LiveActivityType>() {};

    /**
     * Live Activity türünü güncelle
     *
     * {@code PATCH /v1/apps/{appId}/live-activities/types/{activityType}}
     */
    public LiveActivityType updateType(String activityType, UpdateLiveActivityTypeDto body) {
        return updateType(activityType, body, null);
    }

    /**
     * Live Activity türünü güncelle
     *
     * {@code PATCH /v1/apps/{appId}/live-activities/types/{activityType}}
     */
    public LiveActivityType updateType(String activityType, UpdateLiveActivityTypeDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/live-activities/types/{activityType}");
        op.pathParam("activityType", activityType);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<LiveActivityTokenResult> TYPE_3 = new TypeReference<LiveActivityTokenResult>() {};

    /**
     * Live Activity türünü sil
     *
     * {@code DELETE /v1/apps/{appId}/live-activities/types/{activityType}}
     */
    public LiveActivityTokenResult deleteType(String activityType) {
        return deleteType(activityType, null);
    }

    /**
     * Live Activity türünü sil
     *
     * {@code DELETE /v1/apps/{appId}/live-activities/types/{activityType}}
     */
    public LiveActivityTokenResult deleteType(String activityType, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/live-activities/types/{activityType}");
        op.pathParam("activityType", activityType);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<LiveActivitySendResult> TYPE_4 = new TypeReference<LiveActivitySendResult>() {};

    /**
     * Live Activity başlat (push-to-start)
     *
     * {@code POST /v1/apps/{appId}/live-activities/{activityType}/start}
     *
     * Hedefteki iOS aboneliklerinin push-to-start belirteçleriyle etkinliği uzaktan başlatır (iOS 17.2+). `attributes` ve `content_state` türün şemasına uymalıdır. Dönen `activity_id` ile sonraki update/end yapılır.
     */
    public LiveActivitySendResult start(String activityType, StartLiveActivityDto body) {
        return start(activityType, body, null);
    }

    /**
     * Live Activity başlat (push-to-start)
     *
     * {@code POST /v1/apps/{appId}/live-activities/{activityType}/start}
     *
     * Hedefteki iOS aboneliklerinin push-to-start belirteçleriyle etkinliği uzaktan başlatır (iOS 17.2+). `attributes` ve `content_state` türün şemasına uymalıdır. Dönen `activity_id` ile sonraki update/end yapılır.
     */
    public LiveActivitySendResult start(String activityType, StartLiveActivityDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/live-activities/{activityType}/start");
        op.pathParam("activityType", activityType);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<LiveActivitySendResult> TYPE_5 = new TypeReference<LiveActivitySendResult>() {};

    /**
     * Live Activity güncelle
     *
     * {@code POST /v1/apps/{appId}/live-activities/{activityType}/update}
     *
     * Etkinliğin cihazlardan bildirilen güncelleme belirteçlerine yeni içerik durumu gönderir. Sessiz saat ve frekans sınırı uygulanmaz; priority 5 Apple bütçesini korur.
     */
    public LiveActivitySendResult update(String activityType, UpdateLiveActivityDto body) {
        return update(activityType, body, null);
    }

    /**
     * Live Activity güncelle
     *
     * {@code POST /v1/apps/{appId}/live-activities/{activityType}/update}
     *
     * Etkinliğin cihazlardan bildirilen güncelleme belirteçlerine yeni içerik durumu gönderir. Sessiz saat ve frekans sınırı uygulanmaz; priority 5 Apple bütçesini korur.
     */
    public LiveActivitySendResult update(String activityType, UpdateLiveActivityDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/live-activities/{activityType}/update");
        op.pathParam("activityType", activityType);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<LiveActivitySendResult> TYPE_6 = new TypeReference<LiveActivitySendResult>() {};

    /**
     * Live Activity bitir
     *
     * {@code POST /v1/apps/{appId}/live-activities/{activityType}/end}
     */
    public LiveActivitySendResult end(String activityType, EndLiveActivityDto body) {
        return end(activityType, body, null);
    }

    /**
     * Live Activity bitir
     *
     * {@code POST /v1/apps/{appId}/live-activities/{activityType}/end}
     */
    public LiveActivitySendResult end(String activityType, EndLiveActivityDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/live-activities/{activityType}/end");
        op.pathParam("activityType", activityType);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }
}
