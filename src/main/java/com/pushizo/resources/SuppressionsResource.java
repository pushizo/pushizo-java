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
 * E-posta/SMS gönderim engeli (suppression) listesi.
 */
public final class SuppressionsResource {
    private final Pushizo client;

    public SuppressionsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SuppressionPage> TYPE_0 = new TypeReference<SuppressionPage>() {};

    /**
     * Suppression list (e-posta/SMS gönderilmeyecek adresler; kanal/neden/değer filtresi)
     *
     * {@code GET /v1/apps/{appId}/suppressions}
     */
    public SuppressionPage list() {
        return list(null, null);
    }

    /**
     * Suppression list (e-posta/SMS gönderilmeyecek adresler; kanal/neden/değer filtresi)
     *
     * {@code GET /v1/apps/{appId}/suppressions}
     */
    public SuppressionPage list(SuppressionsListParams params) {
        return list(params, null);
    }

    /**
     * Suppression list (e-posta/SMS gönderilmeyecek adresler; kanal/neden/değer filtresi)
     *
     * {@code GET /v1/apps/{appId}/suppressions}
     *
     * Parametreler: channel — Değerler: "email", "sms", "whatsapp", "rcs", "telegram", "viber".; reason — Değerler: "bounce", "complaint", "manual", "unsubscribe_link", "stop".
     */
    public SuppressionPage list(SuppressionsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/suppressions");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Suppression> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Suppression> listAll(SuppressionsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Suppression> listAll(SuppressionsListParams params, RequestOptions options) {
        SuppressionsListParams base = params == null ? new SuppressionsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SuppressionsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SuppressionPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Suppression> TYPE_1 = new TypeReference<Suppression>() {};

    /**
     * Adres ekle (manuel engel; değer saklanmaz, özet + maskeli gösterim)
     *
     * {@code POST /v1/apps/{appId}/suppressions}
     */
    public Suppression create(CreateSuppressionDto body) {
        return create(body, null);
    }

    /**
     * Adres ekle (manuel engel; değer saklanmaz, özet + maskeli gösterim)
     *
     * {@code POST /v1/apps/{appId}/suppressions}
     */
    public Suppression create(CreateSuppressionDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/suppressions");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Ok> TYPE_2 = new TypeReference<Ok>() {};

    /**
     * Kaydı kaldır (adres yeniden gönderim alabilir)
     *
     * {@code DELETE /v1/apps/{appId}/suppressions/{suppressionId}}
     */
    public Ok delete(String suppressionId) {
        return delete(suppressionId, null);
    }

    /**
     * Kaydı kaldır (adres yeniden gönderim alabilir)
     *
     * {@code DELETE /v1/apps/{appId}/suppressions/{suppressionId}}
     */
    public Ok delete(String suppressionId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/suppressions/{suppressionId}");
        op.pathParam("suppressionId", suppressionId);
        return client.execute(op, options, TYPE_2);
    }
}
