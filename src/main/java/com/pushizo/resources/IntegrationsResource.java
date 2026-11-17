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
 * integrations kaynağı.
 */
public final class IntegrationsResource {
    private final Pushizo client;

    public IntegrationsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<ZapierMe> TYPE_0 = new TypeReference<ZapierMe>() {};

    /**
     * Zapier bağlantı testi: anahtarın app’i ve kapsamları
     *
     * {@code GET /v1/apps/{appId}/integrations/zapier/me}
     */
    public ZapierMe me() {
        return me(null);
    }

    /**
     * Zapier bağlantı testi: anahtarın app’i ve kapsamları
     *
     * {@code GET /v1/apps/{appId}/integrations/zapier/me}
     */
    public ZapierMe me(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/integrations/zapier/me");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<ZapierHook> TYPE_1 = new TypeReference<ZapierHook>() {};

    /**
     * REST Hook aboneliği (Zap açıldı)
     *
     * {@code POST /v1/apps/{appId}/integrations/zapier/hooks}
     */
    public ZapierHook subscribe(ZapierSubscribeDto body) {
        return subscribe(body, null);
    }

    /**
     * REST Hook aboneliği (Zap açıldı)
     *
     * {@code POST /v1/apps/{appId}/integrations/zapier/hooks}
     */
    public ZapierHook subscribe(ZapierSubscribeDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/integrations/zapier/hooks");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<ZapierHookList> TYPE_2 = new TypeReference<ZapierHookList>() {};

    /**
     * Zapier REST Hook abonelikleri
     *
     * {@code GET /v1/apps/{appId}/integrations/zapier/hooks}
     */
    public ZapierHookList hooks() {
        return hooks(null);
    }

    /**
     * Zapier REST Hook abonelikleri
     *
     * {@code GET /v1/apps/{appId}/integrations/zapier/hooks}
     */
    public ZapierHookList hooks(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/integrations/zapier/hooks");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<IntegrationOk> TYPE_3 = new TypeReference<IntegrationOk>() {};

    /**
     * REST Hook aboneliğini sil (Zap kapatıldı)
     *
     * {@code DELETE /v1/apps/{appId}/integrations/zapier/hooks/{hookId}}
     */
    public IntegrationOk unsubscribe(String hookId) {
        return unsubscribe(hookId, null);
    }

    /**
     * REST Hook aboneliğini sil (Zap kapatıldı)
     *
     * {@code DELETE /v1/apps/{appId}/integrations/zapier/hooks/{hookId}}
     */
    public IntegrationOk unsubscribe(String hookId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/integrations/zapier/hooks/{hookId}");
        op.pathParam("hookId", hookId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<java.util.List<ZapierSamplesItem>> TYPE_4 = new TypeReference<java.util.List<ZapierSamplesItem>>() {};

    /**
     * Tetik örnekleri (performList): son kayıtlar, abonelik gövdesiyle aynı biçim
     *
     * {@code GET /v1/apps/{appId}/integrations/zapier/samples}
     */
    public java.util.List<ZapierSamplesItem> samples(String event) {
        return samples(event, null, null);
    }

    /**
     * Tetik örnekleri (performList): son kayıtlar, abonelik gövdesiyle aynı biçim
     *
     * {@code GET /v1/apps/{appId}/integrations/zapier/samples}
     */
    public java.util.List<ZapierSamplesItem> samples(String event, IntegrationsSamplesParams params) {
        return samples(event, params, null);
    }

    /**
     * Tetik örnekleri (performList): son kayıtlar, abonelik gövdesiyle aynı biçim
     *
     * {@code GET /v1/apps/{appId}/integrations/zapier/samples}
     *
     * Parametreler: event — Değerler: "subscription.created", "subscription.unsubscribed", "event.received", "delivery.delivered", "delivery.opened", "delivery.clicked", "user.created", "user.updated", "conversion.created", "campaign.completed".
     */
    public java.util.List<ZapierSamplesItem> samples(String event, IntegrationsSamplesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/integrations/zapier/samples");
        op.query("event", event);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<IntegrationList> TYPE_5 = new TypeReference<IntegrationList>() {};

    /**
     * Bağlı entegrasyonlar ve katalog
     *
     * {@code GET /v1/apps/{appId}/integrations}
     */
    public IntegrationList list() {
        return list(null);
    }

    /**
     * Bağlı entegrasyonlar ve katalog
     *
     * {@code GET /v1/apps/{appId}/integrations}
     */
    public IntegrationList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/integrations");
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<Integration> TYPE_6 = new TypeReference<Integration>() {};

    /**
     * Entegrasyon ayrıntısı (kimlik bilgisi maskeli)
     *
     * {@code GET /v1/apps/{appId}/integrations/{type}}
     */
    public Integration get(String type) {
        return get(type, null);
    }

    /**
     * Entegrasyon ayrıntısı (kimlik bilgisi maskeli)
     *
     * {@code GET /v1/apps/{appId}/integrations/{type}}
     */
    public Integration get(String type, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/integrations/{type}");
        op.pathParam("type", type);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<IntegrationRunList> TYPE_7 = new TypeReference<IntegrationRunList>() {};

    /**
     * Son çalışmalar (senkron, olay gönderimi, gelen istekler, test)
     *
     * {@code GET /v1/apps/{appId}/integrations/{type}/runs}
     */
    public IntegrationRunList runs(String type) {
        return runs(type, null, null);
    }

    /**
     * Son çalışmalar (senkron, olay gönderimi, gelen istekler, test)
     *
     * {@code GET /v1/apps/{appId}/integrations/{type}/runs}
     */
    public IntegrationRunList runs(String type, IntegrationsRunsParams params) {
        return runs(type, params, null);
    }

    /**
     * Son çalışmalar (senkron, olay gönderimi, gelen istekler, test)
     *
     * {@code GET /v1/apps/{appId}/integrations/{type}/runs}
     */
    public IntegrationRunList runs(String type, IntegrationsRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/integrations/{type}/runs");
        op.pathParam("type", type);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<IntegrationTestResult> TYPE_8 = new TypeReference<IntegrationTestResult>() {};

    /**
     * Bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/integrations/{type}/test}
     */
    public IntegrationTestResult test(String type) {
        return test(type, null);
    }

    /**
     * Bağlantı testi
     *
     * {@code POST /v1/apps/{appId}/integrations/{type}/test}
     */
    public IntegrationTestResult test(String type, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/integrations/{type}/test");
        op.pathParam("type", type);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<IntegrationSyncResult> TYPE_9 = new TypeReference<IntegrationSyncResult>() {};

    /**
     * Cohort senkronunu şimdi çalıştır (worker en geç 1 dk içinde)
     *
     * {@code POST /v1/apps/{appId}/integrations/{type}/sync}
     */
    public IntegrationSyncResult sync(String type) {
        return sync(type, null);
    }

    /**
     * Cohort senkronunu şimdi çalıştır (worker en geç 1 dk içinde)
     *
     * {@code POST /v1/apps/{appId}/integrations/{type}/sync}
     */
    public IntegrationSyncResult sync(String type, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/integrations/{type}/sync");
        op.pathParam("type", type);
        return client.execute(op, options, TYPE_9);
    }
}
