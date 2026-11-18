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
 * Abonelik (cihaz/e-posta/SMS) okuma, güncelleme, silme ve sahip atama.
 */
public final class SubscriptionsResource {
    private final Pushizo client;

    public SubscriptionsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SubscriptionList> TYPE_0 = new TypeReference<SubscriptionList>() {};

    /**
     * Abonelik listesi (kanal/durum/test cihazı filtreleri; token yalnızca son 8 karakter)
     *
     * {@code GET /v1/apps/{appId}/subscriptions}
     */
    public SubscriptionList listSubscriptions() {
        return listSubscriptions(null, null);
    }

    /**
     * Abonelik listesi (kanal/durum/test cihazı filtreleri; token yalnızca son 8 karakter)
     *
     * {@code GET /v1/apps/{appId}/subscriptions}
     */
    public SubscriptionList listSubscriptions(SubscriptionsListSubscriptionsParams params) {
        return listSubscriptions(params, null);
    }

    /**
     * Abonelik listesi (kanal/durum/test cihazı filtreleri; token yalnızca son 8 karakter)
     *
     * {@code GET /v1/apps/{appId}/subscriptions}
     *
     * Parametreler: channel — Değerler: "ios_push", "android_push", "hms_push", "adm_push", "wns_push", "web_push", "email", "sms", "whatsapp", "rcs", "telegram", "viber".; status — Değerler: "subscribed", "unsubscribed", "invalid", "pending".; test_device — Değerler: "true", "false".
     */
    public SubscriptionList listSubscriptions(SubscriptionsListSubscriptionsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/subscriptions");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * listSubscriptions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Subscription> listSubscriptionsAll() {
        return listSubscriptionsAll(null, null);
    }

    /**
     * listSubscriptions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Subscription> listSubscriptionsAll(SubscriptionsListSubscriptionsParams params) {
        return listSubscriptionsAll(params, null);
    }

    /**
     * listSubscriptions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Subscription> listSubscriptionsAll(SubscriptionsListSubscriptionsParams params, RequestOptions options) {
        SubscriptionsListSubscriptionsParams base = params == null ? new SubscriptionsListSubscriptionsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SubscriptionsListSubscriptionsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SubscriptionList page = listSubscriptions(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<CleanupResult> TYPE_1 = new TypeReference<CleanupResult>() {};

    /**
     * Toplu temizlik: geçersiz (veya abonelikten çıkmış) kayıtları sil
     *
     * {@code POST /v1/apps/{appId}/subscriptions/cleanup}
     */
    public CleanupResult cleanupSubscriptions(PublicCleanupSubscriptionsDto body) {
        return cleanupSubscriptions(body, null);
    }

    /**
     * Toplu temizlik: geçersiz (veya abonelikten çıkmış) kayıtları sil
     *
     * {@code POST /v1/apps/{appId}/subscriptions/cleanup}
     */
    public CleanupResult cleanupSubscriptions(PublicCleanupSubscriptionsDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/subscriptions/cleanup");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Subscription> TYPE_2 = new TypeReference<Subscription>() {};

    /**
     * Abonelik detayı
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription get(String subscriptionId) {
        return get(subscriptionId, null);
    }

    /**
     * Abonelik detayı
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription get(String subscriptionId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        op.pathParam("subscriptionId", subscriptionId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Subscription> TYPE_3 = new TypeReference<Subscription>() {};

    /**
     * Abonelik güncelle
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription update(String subscriptionId, PatchSubscriptionDto body) {
        return update(subscriptionId, body, null);
    }

    /**
     * Abonelik güncelle
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription update(String subscriptionId, PatchSubscriptionDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        op.pathParam("subscriptionId", subscriptionId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Aboneliği sil
     *
     * {@code DELETE /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Ok delete(String subscriptionId) {
        return delete(subscriptionId, null);
    }

    /**
     * Aboneliği sil
     *
     * {@code DELETE /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Ok delete(String subscriptionId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        op.pathParam("subscriptionId", subscriptionId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<UserIdentity> TYPE_5 = new TypeReference<UserIdentity>() {};

    /**
     * Aboneliğin sahibi kullanıcının kimlikleri
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity}
     */
    public UserIdentity getUserIdentity(String subscriptionId) {
        return getUserIdentity(subscriptionId, null);
    }

    /**
     * Aboneliğin sahibi kullanıcının kimlikleri
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity}
     */
    public UserIdentity getUserIdentity(String subscriptionId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity");
        op.pathParam("subscriptionId", subscriptionId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<Subscription> TYPE_6 = new TypeReference<Subscription>() {};

    /**
     * Token ile abonelik güncelle (token_type: ios_push, android_push, hms_push, web_push, email, sms veya eski sağlayıcı adları iOSPush, AndroidPush, HuaweiPush, ChromePush, FirefoxPush, SafariPush, Email, SMS)
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions_by_token/{tokenType}/{token}}
     */
    public Subscription updateByToken(String tokenType, String token, PatchSubscriptionDto body) {
        return updateByToken(tokenType, token, body, null);
    }

    /**
     * Token ile abonelik güncelle (token_type: ios_push, android_push, hms_push, web_push, email, sms veya eski sağlayıcı adları iOSPush, AndroidPush, HuaweiPush, ChromePush, FirefoxPush, SafariPush, Email, SMS)
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions_by_token/{tokenType}/{token}}
     */
    public Subscription updateByToken(String tokenType, String token, PatchSubscriptionDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/subscriptions_by_token/{tokenType}/{token}");
        op.pathParam("tokenType", tokenType);
        op.pathParam("token", token);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<Subscription> TYPE_7 = new TypeReference<Subscription>() {};

    /**
     * Aboneliği external_id ile kullanıcıya bağla
     *
     * {@code POST /v1/apps/{appId}/subscriptions/{subscriptionId}/owner}
     */
    public Subscription setOwner(String subscriptionId, SetOwnerDto body) {
        return setOwner(subscriptionId, body, null);
    }

    /**
     * Aboneliği external_id ile kullanıcıya bağla
     *
     * {@code POST /v1/apps/{appId}/subscriptions/{subscriptionId}/owner}
     */
    public Subscription setOwner(String subscriptionId, SetOwnerDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/subscriptions/{subscriptionId}/owner");
        op.pathParam("subscriptionId", subscriptionId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_7);
    }
}
