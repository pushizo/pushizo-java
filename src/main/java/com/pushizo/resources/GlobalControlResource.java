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
 * globalControl kaynağı.
 */
public final class GlobalControlResource {
    private final Pushizo client;

    public GlobalControlResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<GlobalControl> TYPE_0 = new TypeReference<GlobalControl>() {};

    /**
     * Genel kontrol grubu ayarı
     *
     * {@code GET /v1/apps/{appId}/global-control}
     */
    public GlobalControl get() {
        return get(null);
    }

    /**
     * Genel kontrol grubu ayarı
     *
     * {@code GET /v1/apps/{appId}/global-control}
     */
    public GlobalControl get(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/global-control");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<GlobalControl> TYPE_1 = new TypeReference<GlobalControl>() {};

    /**
     * Genel kontrol grubunu ayarla
     *
     * {@code PUT /v1/apps/{appId}/global-control}
     *
     * Gruptaki kullanıcılar kampanya, otomasyon ve uygulama içi mesajları almaz. API ve işlemsel gönderimler etkilenmez.
     */
    public GlobalControl update(UpdateGlobalControlDto body) {
        return update(body, null);
    }

    /**
     * Genel kontrol grubunu ayarla
     *
     * {@code PUT /v1/apps/{appId}/global-control}
     *
     * Gruptaki kullanıcılar kampanya, otomasyon ve uygulama içi mesajları almaz. API ve işlemsel gönderimler etkilenmez.
     */
    public GlobalControl update(UpdateGlobalControlDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/global-control");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<GlobalControl> TYPE_2 = new TypeReference<GlobalControl>() {};

    /**
     * Grubu yeniden kur (üyelik değişir, ölçüm baştan başlar)
     *
     * {@code POST /v1/apps/{appId}/global-control/reset}
     */
    public GlobalControl reset() {
        return reset(null);
    }

    /**
     * Grubu yeniden kur (üyelik değişir, ölçüm baştan başlar)
     *
     * {@code POST /v1/apps/{appId}/global-control/reset}
     */
    public GlobalControl reset(RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/global-control/reset");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<GlobalControlReport> TYPE_3 = new TypeReference<GlobalControlReport>() {};

    /**
     * Kontrol ve mesaj alan grubun dönüşüm karşılaştırması
     *
     * {@code GET /v1/apps/{appId}/global-control/report}
     */
    public GlobalControlReport report() {
        return report(null, null);
    }

    /**
     * Kontrol ve mesaj alan grubun dönüşüm karşılaştırması
     *
     * {@code GET /v1/apps/{appId}/global-control/report}
     */
    public GlobalControlReport report(GlobalControlReportParams params) {
        return report(params, null);
    }

    /**
     * Kontrol ve mesaj alan grubun dönüşüm karşılaştırması
     *
     * {@code GET /v1/apps/{appId}/global-control/report}
     */
    public GlobalControlReport report(GlobalControlReportParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/global-control/report");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_3);
    }
}
