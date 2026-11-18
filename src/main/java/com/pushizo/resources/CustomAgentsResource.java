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
 * customAgents kaynağı.
 */
public final class CustomAgentsResource {
    private final Pushizo client;

    public CustomAgentsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<CustomAgentList> TYPE_0 = new TypeReference<CustomAgentList>() {};

    /**
     * Özel AI ajanları
     *
     * {@code GET /v1/apps/{appId}/custom-agents}
     */
    public CustomAgentList list() {
        return list(null);
    }

    /**
     * Özel AI ajanları
     *
     * {@code GET /v1/apps/{appId}/custom-agents}
     */
    public CustomAgentList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/custom-agents");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<CustomAgent> TYPE_1 = new TypeReference<CustomAgent>() {};

    /**
     * Özel AI ajanı oluştur
     *
     * {@code POST /v1/apps/{appId}/custom-agents}
     */
    public CustomAgent create(CreateCustomAgentDto body) {
        return create(body, null);
    }

    /**
     * Özel AI ajanı oluştur
     *
     * {@code POST /v1/apps/{appId}/custom-agents}
     */
    public CustomAgent create(CreateCustomAgentDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/custom-agents");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<CustomAgentRunList> TYPE_2 = new TypeReference<CustomAgentRunList>() {};

    /**
     * Özel AI ajanı çalışma kayıtları
     *
     * {@code GET /v1/apps/{appId}/custom-agents/runs}
     */
    public CustomAgentRunList runs() {
        return runs(null, null);
    }

    /**
     * Özel AI ajanı çalışma kayıtları
     *
     * {@code GET /v1/apps/{appId}/custom-agents/runs}
     */
    public CustomAgentRunList runs(CustomAgentsRunsParams params) {
        return runs(params, null);
    }

    /**
     * Özel AI ajanı çalışma kayıtları
     *
     * {@code GET /v1/apps/{appId}/custom-agents/runs}
     *
     * Parametreler: status — Değerler: "pending", "running", "succeeded", "failed", "skipped".
     */
    public CustomAgentRunList runs(CustomAgentsRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/custom-agents/runs");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_2);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CustomAgentRun> runsAll() {
        return runsAll(null, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CustomAgentRun> runsAll(CustomAgentsRunsParams params) {
        return runsAll(params, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CustomAgentRun> runsAll(CustomAgentsRunsParams params, RequestOptions options) {
        CustomAgentsRunsParams base = params == null ? new CustomAgentsRunsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            CustomAgentsRunsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            CustomAgentRunList page = runs(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<CustomAgentDraftList> TYPE_3 = new TypeReference<CustomAgentDraftList>() {};

    /**
     * Özel AI ajanı taslakları
     *
     * {@code GET /v1/apps/{appId}/custom-agents/drafts}
     */
    public CustomAgentDraftList drafts() {
        return drafts(null, null);
    }

    /**
     * Özel AI ajanı taslakları
     *
     * {@code GET /v1/apps/{appId}/custom-agents/drafts}
     */
    public CustomAgentDraftList drafts(CustomAgentsDraftsParams params) {
        return drafts(params, null);
    }

    /**
     * Özel AI ajanı taslakları
     *
     * {@code GET /v1/apps/{appId}/custom-agents/drafts}
     *
     * Parametreler: status — Değerler: "pending", "applied", "dismissed".
     */
    public CustomAgentDraftList drafts(CustomAgentsDraftsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/custom-agents/drafts");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_3);
    }

    /**
     * drafts sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CustomAgentDraft> draftsAll() {
        return draftsAll(null, null);
    }

    /**
     * drafts sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CustomAgentDraft> draftsAll(CustomAgentsDraftsParams params) {
        return draftsAll(params, null);
    }

    /**
     * drafts sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<CustomAgentDraft> draftsAll(CustomAgentsDraftsParams params, RequestOptions options) {
        CustomAgentsDraftsParams base = params == null ? new CustomAgentsDraftsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            CustomAgentsDraftsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            CustomAgentDraftList page = drafts(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<CustomAgent> TYPE_4 = new TypeReference<CustomAgent>() {};

    /**
     * Özel AI ajanı
     *
     * {@code GET /v1/apps/{appId}/custom-agents/{agentId}}
     */
    public CustomAgent get(String agentId) {
        return get(agentId, null);
    }

    /**
     * Özel AI ajanı
     *
     * {@code GET /v1/apps/{appId}/custom-agents/{agentId}}
     */
    public CustomAgent get(String agentId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/custom-agents/{agentId}");
        op.pathParam("agentId", agentId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<CustomAgent> TYPE_5 = new TypeReference<CustomAgent>() {};

    /**
     * Özel AI ajanını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/custom-agents/{agentId}}
     */
    public CustomAgent update(String agentId, UpdateCustomAgentDto body) {
        return update(agentId, body, null);
    }

    /**
     * Özel AI ajanını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/custom-agents/{agentId}}
     */
    public CustomAgent update(String agentId, UpdateCustomAgentDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/custom-agents/{agentId}");
        op.pathParam("agentId", agentId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    /**
     * Özel AI ajanını sil
     *
     * {@code DELETE /v1/apps/{appId}/custom-agents/{agentId}}
     */
    public void delete(String agentId) {
        delete(agentId, null);
    }

    /**
     * Özel AI ajanını sil
     *
     * {@code DELETE /v1/apps/{appId}/custom-agents/{agentId}}
     */
    public void delete(String agentId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/custom-agents/{agentId}");
        op.pathParam("agentId", agentId);
        client.execute(op, options, null);
    }

    private static final TypeReference<CustomAgentRun> TYPE_6 = new TypeReference<CustomAgentRun>() {};

    /**
     * Özel AI ajanını şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/custom-agents/{agentId}/run}
     */
    public CustomAgentRun run(String agentId) {
        return run(agentId, null);
    }

    /**
     * Özel AI ajanını şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/custom-agents/{agentId}/run}
     */
    public CustomAgentRun run(String agentId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/custom-agents/{agentId}/run");
        op.pathParam("agentId", agentId);
        return client.execute(op, options, TYPE_6);
    }
}
