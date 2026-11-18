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
 * trace kaynağı.
 */
public final class TraceResource {
    private final Pushizo client;

    public TraceResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<TraceResult> TYPE_0 = new TypeReference<TraceResult>() {};

    /**
     * Mesaj izleme: msg_/dlv_/sub_ ID, external_id veya token son 8 karakteri
     *
     * {@code GET /v1/apps/{appId}/trace}
     */
    public TraceResult trace(String q) {
        return trace(q, null);
    }

    /**
     * Mesaj izleme: msg_/dlv_/sub_ ID, external_id veya token son 8 karakteri
     *
     * {@code GET /v1/apps/{appId}/trace}
     */
    public TraceResult trace(String q, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/trace");
        op.query("q", q);
        return client.execute(op, options, TYPE_0);
    }
}
