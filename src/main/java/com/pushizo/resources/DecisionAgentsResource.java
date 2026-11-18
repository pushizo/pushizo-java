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
 * decisionAgents kaynağı.
 */
public final class DecisionAgentsResource {
    private final Pushizo client;

    public DecisionAgentsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<DecisionAgentList> TYPE_0 = new TypeReference<DecisionAgentList>() {};

    /**
     * Karar ajanları
     *
     * {@code GET /v1/apps/{appId}/decision-agents}
     */
    public DecisionAgentList list() {
        return list(null);
    }

    /**
     * Karar ajanları
     *
     * {@code GET /v1/apps/{appId}/decision-agents}
     */
    public DecisionAgentList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/decision-agents");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<DecisionAgent> TYPE_1 = new TypeReference<DecisionAgent>() {};

    /**
     * Karar ajanı oluştur
     *
     * {@code POST /v1/apps/{appId}/decision-agents}
     */
    public DecisionAgent create(CreateDecisionAgentDto body) {
        return create(body, null);
    }

    /**
     * Karar ajanı oluştur
     *
     * {@code POST /v1/apps/{appId}/decision-agents}
     */
    public DecisionAgent create(CreateDecisionAgentDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/decision-agents");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<DecisionAgent> TYPE_2 = new TypeReference<DecisionAgent>() {};

    /**
     * Karar ajanı
     *
     * {@code GET /v1/apps/{appId}/decision-agents/{id}}
     */
    public DecisionAgent get(String id) {
        return get(id, null);
    }

    /**
     * Karar ajanı
     *
     * {@code GET /v1/apps/{appId}/decision-agents/{id}}
     */
    public DecisionAgent get(String id, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/decision-agents/{id}");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<DecisionAgent> TYPE_3 = new TypeReference<DecisionAgent>() {};

    /**
     * Karar ajanını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/decision-agents/{id}}
     *
     * Seçenekler değiştirilemez: geçmiş öğrenme onlara bağlıdır. Yeni seçenekler için yeni ajan oluşturun.
     */
    public DecisionAgent update(String id, UpdateDecisionAgentDto body) {
        return update(id, body, null);
    }

    /**
     * Karar ajanını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/decision-agents/{id}}
     *
     * Seçenekler değiştirilemez: geçmiş öğrenme onlara bağlıdır. Yeni seçenekler için yeni ajan oluşturun.
     */
    public DecisionAgent update(String id, UpdateDecisionAgentDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/decision-agents/{id}");
        op.pathParam("id", id);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    /**
     * Karar ajanını sil
     *
     * {@code DELETE /v1/apps/{appId}/decision-agents/{id}}
     */
    public void delete(String id) {
        delete(id, null);
    }

    /**
     * Karar ajanını sil
     *
     * {@code DELETE /v1/apps/{appId}/decision-agents/{id}}
     */
    public void delete(String id, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/decision-agents/{id}");
        op.pathParam("id", id);
        client.execute(op, options, null);
    }

    private static final TypeReference<DecisionReport> TYPE_4 = new TypeReference<DecisionReport>() {};

    /**
     * Kazanç raporu
     *
     * {@code GET /v1/apps/{appId}/decision-agents/{id}/report}
     *
     * Öğrenen politika ve kontrol grubu karşılaştırması.
     */
    public DecisionReport report(String id) {
        return report(id, null);
    }

    /**
     * Kazanç raporu
     *
     * {@code GET /v1/apps/{appId}/decision-agents/{id}/report}
     *
     * Öğrenen politika ve kontrol grubu karşılaştırması.
     */
    public DecisionReport report(String id, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/decision-agents/{id}/report");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<DecisionResult> TYPE_5 = new TypeReference<DecisionResult>() {};

    /**
     * Kullanıcı için karar al
     *
     * {@code POST /v1/apps/{appId}/decision-agents/{id}/decide}
     *
     * Karar kaydedilir, ödül olayı geldikçe ajan öğrenir.
     */
    public DecisionResult decide(String id, DecideDto body) {
        return decide(id, body, null);
    }

    /**
     * Kullanıcı için karar al
     *
     * {@code POST /v1/apps/{appId}/decision-agents/{id}/decide}
     *
     * Karar kaydedilir, ödül olayı geldikçe ajan öğrenir.
     */
    public DecisionResult decide(String id, DecideDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/decision-agents/{id}/decide");
        op.pathParam("id", id);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }
}
