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
 * aiAgents kaynağı.
 */
public final class AiAgentsResource {
    private final Pushizo client;

    public AiAgentsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<AiAgentList> TYPE_0 = new TypeReference<AiAgentList>() {};

    /**
     * AI ajanları
     *
     * {@code GET /v1/apps/{appId}/ai-agents}
     */
    public AiAgentList list() {
        return list(null);
    }

    /**
     * AI ajanları
     *
     * {@code GET /v1/apps/{appId}/ai-agents}
     */
    public AiAgentList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ai-agents");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<AiAgentWithSecret> TYPE_1 = new TypeReference<AiAgentWithSecret>() {};

    /**
     * AI ajanı oluştur
     *
     * {@code POST /v1/apps/{appId}/ai-agents}
     */
    public AiAgentWithSecret create(CreateAiAgentDto body) {
        return create(body, null);
    }

    /**
     * AI ajanı oluştur
     *
     * {@code POST /v1/apps/{appId}/ai-agents}
     */
    public AiAgentWithSecret create(CreateAiAgentDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ai-agents");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<AiAgentRunList> TYPE_2 = new TypeReference<AiAgentRunList>() {};

    /**
     * AI ajanı çalışma kayıtları
     *
     * {@code GET /v1/apps/{appId}/ai-agents/runs}
     */
    public AiAgentRunList runs() {
        return runs(null, null);
    }

    /**
     * AI ajanı çalışma kayıtları
     *
     * {@code GET /v1/apps/{appId}/ai-agents/runs}
     */
    public AiAgentRunList runs(AiAgentsRunsParams params) {
        return runs(params, null);
    }

    /**
     * AI ajanı çalışma kayıtları
     *
     * {@code GET /v1/apps/{appId}/ai-agents/runs}
     *
     * Parametreler: status — Değerler: "pending", "replied", "handed_off", "skipped_cap", "failed".
     */
    public AiAgentRunList runs(AiAgentsRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ai-agents/runs");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_2);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<AiAgentRunListDataItem> runsAll() {
        return runsAll(null, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<AiAgentRunListDataItem> runsAll(AiAgentsRunsParams params) {
        return runsAll(params, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<AiAgentRunListDataItem> runsAll(AiAgentsRunsParams params, RequestOptions options) {
        AiAgentsRunsParams base = params == null ? new AiAgentsRunsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            AiAgentsRunsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            AiAgentRunList page = runs(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<AiAgent> TYPE_3 = new TypeReference<AiAgent>() {};

    /**
     * AI ajanı
     *
     * {@code GET /v1/apps/{appId}/ai-agents/{agentId}}
     */
    public AiAgent get(String agentId) {
        return get(agentId, null);
    }

    /**
     * AI ajanı
     *
     * {@code GET /v1/apps/{appId}/ai-agents/{agentId}}
     */
    public AiAgent get(String agentId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ai-agents/{agentId}");
        op.pathParam("agentId", agentId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<AiAgent> TYPE_4 = new TypeReference<AiAgent>() {};

    /**
     * AI ajanını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ai-agents/{agentId}}
     */
    public AiAgent update(String agentId, UpdateAiAgentDto body) {
        return update(agentId, body, null);
    }

    /**
     * AI ajanını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ai-agents/{agentId}}
     */
    public AiAgent update(String agentId, UpdateAiAgentDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/ai-agents/{agentId}");
        op.pathParam("agentId", agentId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    /**
     * AI ajanını sil
     *
     * {@code DELETE /v1/apps/{appId}/ai-agents/{agentId}}
     */
    public void delete(String agentId) {
        delete(agentId, null);
    }

    /**
     * AI ajanını sil
     *
     * {@code DELETE /v1/apps/{appId}/ai-agents/{agentId}}
     */
    public void delete(String agentId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/ai-agents/{agentId}");
        op.pathParam("agentId", agentId);
        client.execute(op, options, null);
    }

    private static final TypeReference<AiAgentWithSecret> TYPE_5 = new TypeReference<AiAgentWithSecret>() {};

    /**
     * Araç imza anahtarını yenile
     *
     * {@code POST /v1/apps/{appId}/ai-agents/{agentId}/rotate-secret}
     */
    public AiAgentWithSecret rotate(String agentId) {
        return rotate(agentId, null);
    }

    /**
     * Araç imza anahtarını yenile
     *
     * {@code POST /v1/apps/{appId}/ai-agents/{agentId}/rotate-secret}
     */
    public AiAgentWithSecret rotate(String agentId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ai-agents/{agentId}/rotate-secret");
        op.pathParam("agentId", agentId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<AiAgentMetrics> TYPE_6 = new TypeReference<AiAgentMetrics>() {};

    /**
     * AI ajanı ölçümleri (son 30 gün)
     *
     * {@code GET /v1/apps/{appId}/ai-agents/{agentId}/metrics}
     */
    public AiAgentMetrics metrics(String agentId) {
        return metrics(agentId, null);
    }

    /**
     * AI ajanı ölçümleri (son 30 gün)
     *
     * {@code GET /v1/apps/{appId}/ai-agents/{agentId}/metrics}
     */
    public AiAgentMetrics metrics(String agentId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ai-agents/{agentId}/metrics");
        op.pathParam("agentId", agentId);
        return client.execute(op, options, TYPE_6);
    }
}
