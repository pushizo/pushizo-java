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
 * cannedResponses kaynağı.
 */
public final class CannedResponsesResource {
    private final Pushizo client;

    public CannedResponsesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<CannedResponseList> TYPE_0 = new TypeReference<CannedResponseList>() {};

    /**
     * Hazır yanıtlar
     *
     * {@code GET /v1/apps/{appId}/canned-responses}
     */
    public CannedResponseList canned() {
        return canned(null, null);
    }

    /**
     * Hazır yanıtlar
     *
     * {@code GET /v1/apps/{appId}/canned-responses}
     */
    public CannedResponseList canned(CannedResponsesCannedParams params) {
        return canned(params, null);
    }

    /**
     * Hazır yanıtlar
     *
     * {@code GET /v1/apps/{appId}/canned-responses}
     */
    public CannedResponseList canned(CannedResponsesCannedParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/canned-responses");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<CannedResponse> TYPE_1 = new TypeReference<CannedResponse>() {};

    /**
     * Hazır yanıt oluştur
     *
     * {@code POST /v1/apps/{appId}/canned-responses}
     */
    public CannedResponse createCanned(CannedInputDto body) {
        return createCanned(body, null);
    }

    /**
     * Hazır yanıt oluştur
     *
     * {@code POST /v1/apps/{appId}/canned-responses}
     */
    public CannedResponse createCanned(CannedInputDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/canned-responses");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<CannedResponse> TYPE_2 = new TypeReference<CannedResponse>() {};

    /**
     * Hazır yanıtı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/canned-responses/{cannedId}}
     */
    public CannedResponse updateCanned(String cannedId, CannedUpdateDto body) {
        return updateCanned(cannedId, body, null);
    }

    /**
     * Hazır yanıtı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/canned-responses/{cannedId}}
     */
    public CannedResponse updateCanned(String cannedId, CannedUpdateDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/canned-responses/{cannedId}");
        op.pathParam("cannedId", cannedId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Ok> TYPE_3 = new TypeReference<Ok>() {};

    /**
     * Hazır yanıtı sil
     *
     * {@code DELETE /v1/apps/{appId}/canned-responses/{cannedId}}
     */
    public Ok deleteCanned(String cannedId) {
        return deleteCanned(cannedId, null);
    }

    /**
     * Hazır yanıtı sil
     *
     * {@code DELETE /v1/apps/{appId}/canned-responses/{cannedId}}
     */
    public Ok deleteCanned(String cannedId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/canned-responses/{cannedId}");
        op.pathParam("cannedId", cannedId);
        return client.execute(op, options, TYPE_3);
    }
}
