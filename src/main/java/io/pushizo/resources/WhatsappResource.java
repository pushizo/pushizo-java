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
 * whatsapp kaynağı.
 */
public final class WhatsappResource {
    private final Pushizo client;

    public WhatsappResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<WhatsAppTemplateList> TYPE_0 = new TypeReference<WhatsAppTemplateList>() {};

    /**
     * WhatsApp şablonları (Meta onay durumu ile)
     *
     * {@code GET /v1/apps/{appId}/whatsapp/templates}
     */
    public WhatsAppTemplateList templates() {
        return templates(null, null);
    }

    /**
     * WhatsApp şablonları (Meta onay durumu ile)
     *
     * {@code GET /v1/apps/{appId}/whatsapp/templates}
     */
    public WhatsAppTemplateList templates(WhatsappTemplatesParams params) {
        return templates(params, null);
    }

    /**
     * WhatsApp şablonları (Meta onay durumu ile)
     *
     * {@code GET /v1/apps/{appId}/whatsapp/templates}
     */
    public WhatsAppTemplateList templates(WhatsappTemplatesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/whatsapp/templates");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<WhatsAppTemplateSync> TYPE_1 = new TypeReference<WhatsAppTemplateSync>() {};

    /**
     * WhatsApp şablonlarını Meta Graph API’den senkronla
     *
     * {@code POST /v1/apps/{appId}/whatsapp/templates/sync}
     */
    public WhatsAppTemplateSync sync() {
        return sync(null);
    }

    /**
     * WhatsApp şablonlarını Meta Graph API’den senkronla
     *
     * {@code POST /v1/apps/{appId}/whatsapp/templates/sync}
     */
    public WhatsAppTemplateSync sync(RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/whatsapp/templates/sync");
        return client.execute(op, options, TYPE_1);
    }
}
