// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.pushizo.Pushizo;
import io.pushizo.RequestOptions;
import io.pushizo.core.Operation;
import io.pushizo.core.PageIterable;
import io.pushizo.models.*;
import io.pushizo.params.*;

/**
 * journeys kaynağı.
 */
public final class JourneysResource {
    private final Pushizo client;

    public JourneysResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<JourneyPage> TYPE_0 = new TypeReference<JourneyPage>() {};

    /**
     * Journey listesi
     *
     * {@code GET /v1/apps/{appId}/journeys}
     */
    public JourneyPage list() {
        return list(null, null);
    }

    /**
     * Journey listesi
     *
     * {@code GET /v1/apps/{appId}/journeys}
     */
    public JourneyPage list(JourneysListParams params) {
        return list(params, null);
    }

    /**
     * Journey listesi
     *
     * {@code GET /v1/apps/{appId}/journeys}
     *
     * Parametreler: status — Değerler: "draft", "active", "paused", "archived".
     */
    public JourneyPage list(JourneysListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/journeys");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Journey> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Journey> listAll(JourneysListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Journey> listAll(JourneysListParams params, RequestOptions options) {
        JourneysListParams base = params == null ? new JourneysListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            JourneysListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            JourneyPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<JourneyDetail> TYPE_1 = new TypeReference<JourneyDetail>() {};

    /**
     * Journey oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/journeys}
     */
    public JourneyDetail create(JourneysCreateBody body) {
        return create(body, null);
    }

    /**
     * Journey oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/journeys}
     */
    public JourneyDetail create(JourneysCreateBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/journeys");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<JourneyDetail> TYPE_2 = new TypeReference<JourneyDetail>() {};

    /**
     * Journey detayı
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}}
     */
    public JourneyDetail get(String journeyId) {
        return get(journeyId, null);
    }

    /**
     * Journey detayı
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}}
     */
    public JourneyDetail get(String journeyId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/journeys/{journeyId}");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<JourneyDetail> TYPE_3 = new TypeReference<JourneyDetail>() {};

    /**
     * Ad / açıklama
     *
     * {@code PATCH /v1/apps/{appId}/journeys/{journeyId}}
     */
    public JourneyDetail update(String journeyId, UpdateJourneyDto body) {
        return update(journeyId, body, null);
    }

    /**
     * Ad / açıklama
     *
     * {@code PATCH /v1/apps/{appId}/journeys/{journeyId}}
     */
    public JourneyDetail update(String journeyId, UpdateJourneyDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/journeys/{journeyId}");
        op.pathParam("journeyId", journeyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Hiç yayınlanmamış journey'i sil
     *
     * {@code DELETE /v1/apps/{appId}/journeys/{journeyId}}
     */
    public Ok delete(String journeyId) {
        return delete(journeyId, null);
    }

    /**
     * Hiç yayınlanmamış journey'i sil
     *
     * {@code DELETE /v1/apps/{appId}/journeys/{journeyId}}
     */
    public Ok delete(String journeyId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/journeys/{journeyId}");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<JourneyDetail> TYPE_5 = new TypeReference<JourneyDetail>() {};

    /**
     * Taslağı kaydet
     *
     * {@code PUT /v1/apps/{appId}/journeys/{journeyId}/draft}
     */
    public JourneyDetail saveDraft(String journeyId, JourneysSaveDraftBody body) {
        return saveDraft(journeyId, body, null);
    }

    /**
     * Taslağı kaydet
     *
     * {@code PUT /v1/apps/{appId}/journeys/{journeyId}/draft}
     */
    public JourneyDetail saveDraft(String journeyId, JourneysSaveDraftBody body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/journeys/{journeyId}/draft");
        op.pathParam("journeyId", journeyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<JourneyDetail> TYPE_6 = new TypeReference<JourneyDetail>() {};

    /**
     * Taslaktaki düğümü güncelle
     *
     * {@code PATCH /v1/apps/{appId}/journeys/{journeyId}/nodes/{nodeId}}
     */
    public JourneyDetail updateNode(String journeyId, String nodeId, UpdateNodeDto body) {
        return updateNode(journeyId, nodeId, body, null);
    }

    /**
     * Taslaktaki düğümü güncelle
     *
     * {@code PATCH /v1/apps/{appId}/journeys/{journeyId}/nodes/{nodeId}}
     */
    public JourneyDetail updateNode(String journeyId, String nodeId, UpdateNodeDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/journeys/{journeyId}/nodes/{nodeId}");
        op.pathParam("journeyId", journeyId);
        op.pathParam("nodeId", nodeId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<JourneyVersionList> TYPE_7 = new TypeReference<JourneyVersionList>() {};

    /**
     * Sürümler
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/versions}
     */
    public JourneyVersionList versions(String journeyId) {
        return versions(journeyId, null);
    }

    /**
     * Sürümler
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/versions}
     */
    public JourneyVersionList versions(String journeyId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/journeys/{journeyId}/versions");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<JourneyPublishResult> TYPE_8 = new TypeReference<JourneyPublishResult>() {};

    /**
     * Yayınla
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/publish}
     */
    public JourneyPublishResult publish(String journeyId) {
        return publish(journeyId, null);
    }

    /**
     * Yayınla
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/publish}
     */
    public JourneyPublishResult publish(String journeyId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/journeys/{journeyId}/publish");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<JourneyDetail> TYPE_9 = new TypeReference<JourneyDetail>() {};

    /**
     * Duraklat
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/pause}
     */
    public JourneyDetail pause(String journeyId) {
        return pause(journeyId, null);
    }

    /**
     * Duraklat
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/pause}
     */
    public JourneyDetail pause(String journeyId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/journeys/{journeyId}/pause");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<JourneyDetail> TYPE_10 = new TypeReference<JourneyDetail>() {};

    /**
     * Devam ettir
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/resume}
     */
    public JourneyDetail resume(String journeyId) {
        return resume(journeyId, null);
    }

    /**
     * Devam ettir
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/resume}
     */
    public JourneyDetail resume(String journeyId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/journeys/{journeyId}/resume");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<JourneyDetail> TYPE_11 = new TypeReference<JourneyDetail>() {};

    /**
     * Arşivle
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/archive}
     */
    public JourneyDetail archive(String journeyId) {
        return archive(journeyId, null);
    }

    /**
     * Arşivle
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/archive}
     */
    public JourneyDetail archive(String journeyId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/journeys/{journeyId}/archive");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_11);
    }

    private static final TypeReference<JourneyDetail> TYPE_12 = new TypeReference<JourneyDetail>() {};

    /**
     * Kopyala
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/duplicate}
     */
    public JourneyDetail duplicate(String journeyId) {
        return duplicate(journeyId, null);
    }

    /**
     * Kopyala
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/duplicate}
     */
    public JourneyDetail duplicate(String journeyId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/journeys/{journeyId}/duplicate");
        op.pathParam("journeyId", journeyId);
        return client.execute(op, options, TYPE_12);
    }

    private static final TypeReference<JourneyStats> TYPE_13 = new TypeReference<JourneyStats>() {};

    /**
     * Düğüm bazlı istatistik
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/stats}
     */
    public JourneyStats stats(String journeyId) {
        return stats(journeyId, null, null);
    }

    /**
     * Düğüm bazlı istatistik
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/stats}
     */
    public JourneyStats stats(String journeyId, JourneysStatsParams params) {
        return stats(journeyId, params, null);
    }

    /**
     * Düğüm bazlı istatistik
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/stats}
     *
     * Parametreler: all_versions — Değerler: "true", "false".
     */
    public JourneyStats stats(String journeyId, JourneysStatsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/journeys/{journeyId}/stats");
        op.pathParam("journeyId", journeyId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_13);
    }

    private static final TypeReference<JourneyRunPage> TYPE_14 = new TypeReference<JourneyRunPage>() {};

    /**
     * Run listesi
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/runs}
     */
    public JourneyRunPage runs(String journeyId) {
        return runs(journeyId, null, null);
    }

    /**
     * Run listesi
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/runs}
     */
    public JourneyRunPage runs(String journeyId, JourneysRunsParams params) {
        return runs(journeyId, params, null);
    }

    /**
     * Run listesi
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/runs}
     *
     * Parametreler: status — Değerler: "active", "waiting", "completed", "exited", "failed".
     */
    public JourneyRunPage runs(String journeyId, JourneysRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/journeys/{journeyId}/runs");
        op.pathParam("journeyId", journeyId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_14);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<JourneyRun> runsAll(String journeyId) {
        return runsAll(journeyId, null, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<JourneyRun> runsAll(String journeyId, JourneysRunsParams params) {
        return runsAll(journeyId, params, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<JourneyRun> runsAll(String journeyId, JourneysRunsParams params, RequestOptions options) {
        JourneysRunsParams base = params == null ? new JourneysRunsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            JourneysRunsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            JourneyRunPage page = runs(journeyId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<JourneyTriggerResult> TYPE_15 = new TypeReference<JourneyTriggerResult>() {};

    /**
     * Kullanıcıyı journey'e sok (external_id, user_id veya alias; context Liquid custom_data)
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/runs}
     */
    public JourneyTriggerResult trigger(String journeyId, TriggerRunDto body) {
        return trigger(journeyId, body, null);
    }

    /**
     * Kullanıcıyı journey'e sok (external_id, user_id veya alias; context Liquid custom_data)
     *
     * {@code POST /v1/apps/{appId}/journeys/{journeyId}/runs}
     */
    public JourneyTriggerResult trigger(String journeyId, TriggerRunDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/journeys/{journeyId}/runs");
        op.pathParam("journeyId", journeyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_15);
    }

    private static final TypeReference<JourneyRunDetail> TYPE_16 = new TypeReference<JourneyRunDetail>() {};

    /**
     * Run detayı ve adımlar
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/runs/{runId}}
     */
    public JourneyRunDetail run(String journeyId, String runId) {
        return run(journeyId, runId, null);
    }

    /**
     * Run detayı ve adımlar
     *
     * {@code GET /v1/apps/{appId}/journeys/{journeyId}/runs/{runId}}
     */
    public JourneyRunDetail run(String journeyId, String runId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/journeys/{journeyId}/runs/{runId}");
        op.pathParam("journeyId", journeyId);
        op.pathParam("runId", runId);
        return client.execute(op, options, TYPE_16);
    }

    private static final TypeReference<JourneyRunDetail> TYPE_17 = new TypeReference<JourneyRunDetail>() {};

    /**
     * Run'ı sonlandır
     *
     * {@code DELETE /v1/apps/{appId}/journeys/{journeyId}/runs/{runId}}
     */
    public JourneyRunDetail exitRun(String journeyId, String runId) {
        return exitRun(journeyId, runId, null);
    }

    /**
     * Run'ı sonlandır
     *
     * {@code DELETE /v1/apps/{appId}/journeys/{journeyId}/runs/{runId}}
     */
    public JourneyRunDetail exitRun(String journeyId, String runId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/journeys/{journeyId}/runs/{runId}");
        op.pathParam("journeyId", journeyId);
        op.pathParam("runId", runId);
        return client.execute(op, options, TYPE_17);
    }

    private static final TypeReference<UserJourneyRuns> TYPE_18 = new TypeReference<UserJourneyRuns>() {};

    /**
     * Kullanıcının journey run'ları
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/journeys}
     */
    public UserJourneyRuns listForUser(String label, String value) {
        return listForUser(label, value, null);
    }

    /**
     * Kullanıcının journey run'ları
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/journeys}
     */
    public UserJourneyRuns listForUser(String label, String value, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/users/by/{label}/{value}/journeys");
        op.pathParam("label", label);
        op.pathParam("value", value);
        return client.execute(op, options, TYPE_18);
    }
}
