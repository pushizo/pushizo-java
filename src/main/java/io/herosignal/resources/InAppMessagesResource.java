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
 * Uygulama içi (in-app) mesaj yönetimi ve durum değişiklikleri.
 */
public final class InAppMessagesResource {
    private final HeroSignal client;

    public InAppMessagesResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<InAppMessagePage> TYPE_0 = new TypeReference<InAppMessagePage>() {};

    /**
     * In-app mesajlar (durum filtresi; istatistik dahil)
     *
     * {@code GET /v1/apps/{appId}/in-app-messages}
     */
    public InAppMessagePage list() {
        return list(null, null);
    }

    /**
     * In-app mesajlar (durum filtresi; istatistik dahil)
     *
     * {@code GET /v1/apps/{appId}/in-app-messages}
     */
    public InAppMessagePage list(InAppMessagesListParams params) {
        return list(params, null);
    }

    /**
     * In-app mesajlar (durum filtresi; istatistik dahil)
     *
     * {@code GET /v1/apps/{appId}/in-app-messages}
     *
     * Parametreler: status — Değerler: "draft", "active", "paused", "archived".
     */
    public InAppMessagePage list(InAppMessagesListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/in-app-messages");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<InAppMessage> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<InAppMessage> listAll(InAppMessagesListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<InAppMessage> listAll(InAppMessagesListParams params, RequestOptions options) {
        InAppMessagesListParams base = params == null ? new InAppMessagesListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            InAppMessagesListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            InAppMessagePage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<InAppMessage> TYPE_1 = new TypeReference<InAppMessage>() {};

    /**
     * In-app mesaj oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/in-app-messages}
     */
    public InAppMessage create(CreateInAppDto body) {
        return create(body, null);
    }

    /**
     * In-app mesaj oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/in-app-messages}
     */
    public InAppMessage create(CreateInAppDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/in-app-messages");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<InAppMessage> TYPE_2 = new TypeReference<InAppMessage>() {};

    /**
     * In-app mesaj detayı ve istatistikleri
     *
     * {@code GET /v1/apps/{appId}/in-app-messages/{messageId}}
     */
    public InAppMessage get(String messageId) {
        return get(messageId, null);
    }

    /**
     * In-app mesaj detayı ve istatistikleri
     *
     * {@code GET /v1/apps/{appId}/in-app-messages/{messageId}}
     */
    public InAppMessage get(String messageId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/in-app-messages/{messageId}");
        op.pathParam("messageId", messageId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<InAppMessage> TYPE_3 = new TypeReference<InAppMessage>() {};

    /**
     * In-app mesajı düzenle
     *
     * {@code PATCH /v1/apps/{appId}/in-app-messages/{messageId}}
     */
    public InAppMessage update(String messageId, UpdateInAppDto body) {
        return update(messageId, body, null);
    }

    /**
     * In-app mesajı düzenle
     *
     * {@code PATCH /v1/apps/{appId}/in-app-messages/{messageId}}
     */
    public InAppMessage update(String messageId, UpdateInAppDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/in-app-messages/{messageId}");
        op.pathParam("messageId", messageId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * In-app mesajı sil
     *
     * {@code DELETE /v1/apps/{appId}/in-app-messages/{messageId}}
     */
    public Ok delete(String messageId) {
        return delete(messageId, null);
    }

    /**
     * In-app mesajı sil
     *
     * {@code DELETE /v1/apps/{appId}/in-app-messages/{messageId}}
     */
    public Ok delete(String messageId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/in-app-messages/{messageId}");
        op.pathParam("messageId", messageId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<InAppMessage> TYPE_5 = new TypeReference<InAppMessage>() {};

    /**
     * Yayınla / duraklat / arşivle
     *
     * {@code POST /v1/apps/{appId}/in-app-messages/{messageId}/status}
     */
    public InAppMessage status(String messageId, InAppStatusDto body) {
        return status(messageId, body, null);
    }

    /**
     * Yayınla / duraklat / arşivle
     *
     * {@code POST /v1/apps/{appId}/in-app-messages/{messageId}/status}
     */
    public InAppMessage status(String messageId, InAppStatusDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/in-app-messages/{messageId}/status");
        op.pathParam("messageId", messageId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<InAppMessage> TYPE_6 = new TypeReference<InAppMessage>() {};

    /**
     * A/B kazananını elle seç
     *
     * {@code POST /v1/apps/{appId}/in-app-messages/{messageId}/winner}
     */
    public InAppMessage winner(String messageId, InAppWinnerDto body) {
        return winner(messageId, body, null);
    }

    /**
     * A/B kazananını elle seç
     *
     * {@code POST /v1/apps/{appId}/in-app-messages/{messageId}/winner}
     */
    public InAppMessage winner(String messageId, InAppWinnerDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/in-app-messages/{messageId}/winner");
        op.pathParam("messageId", messageId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }
}
