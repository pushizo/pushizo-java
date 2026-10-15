// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.HeroSignal;
import io.herosignal.RequestOptions;
import io.herosignal.core.Operation;
import io.herosignal.core.PageIterable;
import io.herosignal.models.*;
import io.herosignal.params.*;

/**
 * integrations kaynağı.
 */
public final class IntegrationsResource {
    private final HeroSignal client;

    public IntegrationsResource(HeroSignal client) {
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
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<IntegrationOk> TYPE_2 = new TypeReference<IntegrationOk>() {};

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
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<java.util.List<ZapierSamplesItem>> TYPE_3 = new TypeReference<java.util.List<ZapierSamplesItem>>() {};

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
        return client.execute(op, options, TYPE_3);
    }
}
