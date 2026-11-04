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
 * wallet kaynağı.
 */
public final class WalletResource {
    private final Pushizo client;

    public WalletResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<WalletConfig> TYPE_0 = new TypeReference<WalletConfig>() {};

    /**
     * Wallet yapılandırması
     *
     * {@code GET /v1/apps/{appId}/wallet/config}
     *
     * Kimlik bilgisi geri okunamaz, yalnızca durum döner.
     */
    public WalletConfig config() {
        return config(null);
    }

    /**
     * Wallet yapılandırması
     *
     * {@code GET /v1/apps/{appId}/wallet/config}
     *
     * Kimlik bilgisi geri okunamaz, yalnızca durum döner.
     */
    public WalletConfig config(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/wallet/config");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<WalletConfig> TYPE_1 = new TypeReference<WalletConfig>() {};

    /**
     * Wallet kimlik bilgilerini ayarla
     *
     * {@code PUT /v1/apps/{appId}/wallet/config}
     */
    public WalletConfig updateConfig(UpdateWalletConfigDto body) {
        return updateConfig(body, null);
    }

    /**
     * Wallet kimlik bilgilerini ayarla
     *
     * {@code PUT /v1/apps/{appId}/wallet/config}
     */
    public WalletConfig updateConfig(UpdateWalletConfigDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/wallet/config");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<WalletTemplateList> TYPE_2 = new TypeReference<WalletTemplateList>() {};

    /**
     * Wallet şablonları
     *
     * {@code GET /v1/apps/{appId}/wallet/templates}
     */
    public WalletTemplateList templates() {
        return templates(null);
    }

    /**
     * Wallet şablonları
     *
     * {@code GET /v1/apps/{appId}/wallet/templates}
     */
    public WalletTemplateList templates(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/wallet/templates");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<WalletTemplate> TYPE_3 = new TypeReference<WalletTemplate>() {};

    /**
     * Wallet şablonu oluştur
     *
     * {@code POST /v1/apps/{appId}/wallet/templates}
     */
    public WalletTemplate createTemplate(CreateWalletTemplateDto body) {
        return createTemplate(body, null);
    }

    /**
     * Wallet şablonu oluştur
     *
     * {@code POST /v1/apps/{appId}/wallet/templates}
     */
    public WalletTemplate createTemplate(CreateWalletTemplateDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/wallet/templates");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<WalletTemplate> TYPE_4 = new TypeReference<WalletTemplate>() {};

    /**
     * Wallet şablonu
     *
     * {@code GET /v1/apps/{appId}/wallet/templates/{id}}
     */
    public WalletTemplate template(String id) {
        return template(id, null);
    }

    /**
     * Wallet şablonu
     *
     * {@code GET /v1/apps/{appId}/wallet/templates/{id}}
     */
    public WalletTemplate template(String id, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/wallet/templates/{id}");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<WalletTemplate> TYPE_5 = new TypeReference<WalletTemplate>() {};

    /**
     * Wallet şablonunu güncelle
     *
     * {@code PATCH /v1/apps/{appId}/wallet/templates/{id}}
     *
     * Tasarım değişirse verilmiş kartlar da güncellenir.
     */
    public WalletTemplate updateTemplate(String id, UpdateWalletTemplateDto body) {
        return updateTemplate(id, body, null);
    }

    /**
     * Wallet şablonunu güncelle
     *
     * {@code PATCH /v1/apps/{appId}/wallet/templates/{id}}
     *
     * Tasarım değişirse verilmiş kartlar da güncellenir.
     */
    public WalletTemplate updateTemplate(String id, UpdateWalletTemplateDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/wallet/templates/{id}");
        op.pathParam("id", id);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    /**
     * Wallet şablonunu sil
     *
     * {@code DELETE /v1/apps/{appId}/wallet/templates/{id}}
     *
     * Verilmiş kartı olan şablon silinemez, arşivlenir.
     */
    public void removeTemplate(String id) {
        removeTemplate(id, null);
    }

    /**
     * Wallet şablonunu sil
     *
     * {@code DELETE /v1/apps/{appId}/wallet/templates/{id}}
     *
     * Verilmiş kartı olan şablon silinemez, arşivlenir.
     */
    public void removeTemplate(String id, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/wallet/templates/{id}");
        op.pathParam("id", id);
        client.execute(op, options, null);
    }

    private static final TypeReference<WalletPassPage> TYPE_6 = new TypeReference<WalletPassPage>() {};

    /**
     * Verilmiş kartlar
     *
     * {@code GET /v1/apps/{appId}/wallet/passes}
     */
    public WalletPassPage passes() {
        return passes(null, null);
    }

    /**
     * Verilmiş kartlar
     *
     * {@code GET /v1/apps/{appId}/wallet/passes}
     */
    public WalletPassPage passes(WalletPassesParams params) {
        return passes(params, null);
    }

    /**
     * Verilmiş kartlar
     *
     * {@code GET /v1/apps/{appId}/wallet/passes}
     */
    public WalletPassPage passes(WalletPassesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/wallet/passes");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<WalletPass> TYPE_7 = new TypeReference<WalletPass>() {};

    /**
     * Kart ver
     *
     * {@code POST /v1/apps/{appId}/wallet/passes}
     *
     * Kullanıcılı kart şablon başına tektir; tekrar istek aynı kartı döndürür.
     */
    public WalletPass issue(IssueWalletPassDto body) {
        return issue(body, null);
    }

    /**
     * Kart ver
     *
     * {@code POST /v1/apps/{appId}/wallet/passes}
     *
     * Kullanıcılı kart şablon başına tektir; tekrar istek aynı kartı döndürür.
     */
    public WalletPass issue(IssueWalletPassDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/wallet/passes");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<WalletPass> TYPE_8 = new TypeReference<WalletPass>() {};

    /**
     * Kart
     *
     * {@code GET /v1/apps/{appId}/wallet/passes/{id}}
     */
    public WalletPass pass(String id) {
        return pass(id, null);
    }

    /**
     * Kart
     *
     * {@code GET /v1/apps/{appId}/wallet/passes/{id}}
     */
    public WalletPass pass(String id, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/wallet/passes/{id}");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<WalletPass> TYPE_9 = new TypeReference<WalletPass>() {};

    /**
     * Kartı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/wallet/passes/{id}}
     *
     * Cihazdaki kart arka planda yenilenir.
     */
    public WalletPass updatePass(String id, UpdateWalletPassDto body) {
        return updatePass(id, body, null);
    }

    /**
     * Kartı güncelle
     *
     * {@code PATCH /v1/apps/{appId}/wallet/passes/{id}}
     *
     * Cihazdaki kart arka planda yenilenir.
     */
    public WalletPass updatePass(String id, UpdateWalletPassDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/wallet/passes/{id}");
        op.pathParam("id", id);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<WalletPass> TYPE_10 = new TypeReference<WalletPass>() {};

    /**
     * Kartı iptal et
     *
     * {@code POST /v1/apps/{appId}/wallet/passes/{id}/void}
     *
     * Geri alınmaz; cihazdaki kart geçersiz görünür.
     */
    public WalletPass voidPass(String id) {
        return voidPass(id, null);
    }

    /**
     * Kartı iptal et
     *
     * {@code POST /v1/apps/{appId}/wallet/passes/{id}/void}
     *
     * Geri alınmaz; cihazdaki kart geçersiz görünür.
     */
    public WalletPass voidPass(String id, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/wallet/passes/{id}/void");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_10);
    }
}
