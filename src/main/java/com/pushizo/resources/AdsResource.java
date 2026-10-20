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
 * ads kaynağı.
 */
public final class AdsResource {
    private final Pushizo client;

    public AdsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<AdAccountList> TYPE_0 = new TypeReference<AdAccountList>() {};

    /**
     * Bağlı reklam hesapları
     *
     * {@code GET /v1/apps/{appId}/ads/accounts}
     */
    public AdAccountList listAccounts() {
        return listAccounts(null);
    }

    /**
     * Bağlı reklam hesapları
     *
     * {@code GET /v1/apps/{appId}/ads/accounts}
     */
    public AdAccountList listAccounts(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/accounts");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<AdAudienceList> TYPE_1 = new TypeReference<AdAudienceList>() {};

    /**
     * Reklam kitleleri
     *
     * {@code GET /v1/apps/{appId}/ads/audiences}
     */
    public AdAudienceList listAudiences() {
        return listAudiences(null, null);
    }

    /**
     * Reklam kitleleri
     *
     * {@code GET /v1/apps/{appId}/ads/audiences}
     */
    public AdAudienceList listAudiences(AdsListAudiencesParams params) {
        return listAudiences(params, null);
    }

    /**
     * Reklam kitleleri
     *
     * {@code GET /v1/apps/{appId}/ads/audiences}
     */
    public AdAudienceList listAudiences(AdsListAudiencesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/audiences");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<AdAudience> TYPE_2 = new TypeReference<AdAudience>() {};

    /**
     * Reklam kitlesi oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences}
     */
    public AdAudience createAudience(CreateAdAudienceDto body) {
        return createAudience(body, null);
    }

    /**
     * Reklam kitlesi oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences}
     */
    public AdAudience createAudience(CreateAdAudienceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/audiences");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<AdAudience> TYPE_3 = new TypeReference<AdAudience>() {};

    /**
     * Reklam kitlesi ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience getAudience(String audienceId) {
        return getAudience(audienceId, null);
    }

    /**
     * Reklam kitlesi ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience getAudience(String audienceId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/audiences/{audienceId}");
        op.pathParam("audienceId", audienceId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<AdAudience> TYPE_4 = new TypeReference<AdAudience>() {};

    /**
     * Reklam kitlesini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience updateAudience(String audienceId, UpdateAdAudienceDto body) {
        return updateAudience(audienceId, body, null);
    }

    /**
     * Reklam kitlesini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience updateAudience(String audienceId, UpdateAdAudienceDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/ads/audiences/{audienceId}");
        op.pathParam("audienceId", audienceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<AdOk> TYPE_5 = new TypeReference<AdOk>() {};

    /**
     * Reklam kitlesini sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdOk removeAudience(String audienceId) {
        return removeAudience(audienceId, null, null);
    }

    /**
     * Reklam kitlesini sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdOk removeAudience(String audienceId, AdsRemoveAudienceParams params) {
        return removeAudience(audienceId, params, null);
    }

    /**
     * Reklam kitlesini sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/audiences/{audienceId}}
     *
     * Parametreler: delete_on_platform — Değerler: "true", "false".
     */
    public AdOk removeAudience(String audienceId, AdsRemoveAudienceParams params, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/ads/audiences/{audienceId}");
        op.pathParam("audienceId", audienceId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<AdAudienceSyncQueued> TYPE_6 = new TypeReference<AdAudienceSyncQueued>() {};

    /**
     * Senkronu şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/sync}
     */
    public AdAudienceSyncQueued sync(String audienceId, SyncAdAudienceDto body) {
        return sync(audienceId, body, null);
    }

    /**
     * Senkronu şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/sync}
     */
    public AdAudienceSyncQueued sync(String audienceId, SyncAdAudienceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/audiences/{audienceId}/sync");
        op.pathParam("audienceId", audienceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<AdAudienceSyncList> TYPE_7 = new TypeReference<AdAudienceSyncList>() {};

    /**
     * Senkron geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}/syncs}
     */
    public AdAudienceSyncList syncs(String audienceId) {
        return syncs(audienceId, null, null);
    }

    /**
     * Senkron geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}/syncs}
     */
    public AdAudienceSyncList syncs(String audienceId, AdsSyncsParams params) {
        return syncs(audienceId, params, null);
    }

    /**
     * Senkron geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}/syncs}
     */
    public AdAudienceSyncList syncs(String audienceId, AdsSyncsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/audiences/{audienceId}/syncs");
        op.pathParam("audienceId", audienceId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<AdAudience> TYPE_8 = new TypeReference<AdAudience>() {};

    /**
     * Benzer kitle (lookalike) oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/lookalikes}
     */
    public AdAudience lookalike(String audienceId, CreateLookalikeDto body) {
        return lookalike(audienceId, body, null);
    }

    /**
     * Benzer kitle (lookalike) oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/lookalikes}
     */
    public AdAudience lookalike(String audienceId, CreateLookalikeDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/audiences/{audienceId}/lookalikes");
        op.pathParam("audienceId", audienceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }
}
